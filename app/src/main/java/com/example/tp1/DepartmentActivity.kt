package com.example.tp1

import android.content.Intent
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DepartmentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_department)

        val webView = findViewById<WebView>(R.id.webViewDepartment)
        val url = intent.getStringExtra("url") ?: ""

        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        webView.webViewClient = WebViewClient()

        webView.loadUrl(url)

        val btnCours = findViewById<Button>(R.id.btnCours)
        btnCours.setOnClickListener {
            val intent = Intent(this, CourActivity::class.java)
            startActivity(intent)
        }

        val btnFermer = findViewById<Button>(R.id.btnFermerDepartment)
        btnFermer.setOnClickListener {
            finish()
        }
    }
}
