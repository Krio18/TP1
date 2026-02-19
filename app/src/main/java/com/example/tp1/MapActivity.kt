package com.example.tp1

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
        webView.webViewClient = WebViewClient()

        webView.loadUrl(url)

        val btnFermer = findViewById<Button>(R.id.btnFermerMap)
        btnFermer.setOnClickListener {
            finish()
        }
    }
}
