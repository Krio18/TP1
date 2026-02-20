package com.example.tp1

import android.content.Intent
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MapActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        val webView = findViewById<WebView>(R.id.webViewMaps)
        val url = intent.getStringExtra("url") ?: ""

        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        webView.settings.setSupportZoom(true)
        webView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                request: android.webkit.WebResourceRequest?
            ): Boolean {
                val uri = request?.url ?: return false

                return when (uri.scheme) {
                    "http", "https" -> false
                    else -> true
                }
            }
        }

        webView.loadUrl(url)

        val btnFermer = findViewById<Button>(R.id.btnFermerMap)
        btnFermer.setOnClickListener {
            finish()
        }
    }
}
