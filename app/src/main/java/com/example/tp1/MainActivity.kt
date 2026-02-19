package com.example.tp1

import android.content.Intent
import android.icu.text.SimpleDateFormat
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import java.util.Locale

class MainActivity : AppCompatActivity() {
    val myProfile = Profile(
        firstName = "Killian",
        lastName = "Cottrelle",
        birthday = SimpleDateFormat("yyyy-MM-dd", Locale.CANADA).parse("2003-11-14")!!,
        IDUL = "KICOT6"
    )

    val urlDepartment = "https://www.ulaval.ca/etudes/programmes/baccalaureat-en-genie-logiciel"
    val urlGoogleMaps = "https://www.openstreetmap.org/way/27736895"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnUniversiteLaval = findViewById<Button>(R.id.btnUniversiteLaval)
        val btnDepartement = findViewById<Button>(R.id.btnDepartement)
        val btnProfil = findViewById<Button>(R.id.btnProfil)

        btnUniversiteLaval.setOnClickListener {
            val intent = Intent(this, MapActivity::class.java)
            intent.putExtra("url", urlGoogleMaps)
            startActivity(intent)
        }

        btnDepartement.setOnClickListener {
            val intent = Intent(this, DepartmentActivity::class.java)
            intent.putExtra("url", urlDepartment)
            startActivity(intent)
        }

        btnProfil.setOnClickListener {
            val intent = Intent(this, ProfilActivity::class.java)
            intent.putExtra("profile", myProfile)
            startActivity(intent)
        }
    }
}
