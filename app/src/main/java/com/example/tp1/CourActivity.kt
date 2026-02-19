package com.example.tp1

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CourActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cour)

        val webView = findViewById<WebView>(R.id.webViewCour)
        val link = "https://www.ulaval.ca/etudes/cours/gif-3101-informatique-mobile-et-applications"

        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        webView.webViewClient = WebViewClient()

        webView.loadUrl(link)

        val btnFermer = findViewById<Button>(R.id.btnFermerCour)
        btnFermer.setOnClickListener {
            finish()
        }
    }
}
