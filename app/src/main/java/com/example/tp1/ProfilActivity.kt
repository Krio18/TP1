package com.example.tp1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.Locale

class ProfilActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        val profile = intent.getParcelableExtra("profile", Profile::class.java)

        val tvPrenom = findViewById<TextView>(R.id.tvPrenom)
        val tvNom = findViewById<TextView>(R.id.tvNom)
        val tvDateNaissance = findViewById<TextView>(R.id.tvDateNaissance)
        val tvIDUL = findViewById<TextView>(R.id.tvIDUL)
        val btnFermer = findViewById<Button>(R.id.btnFermerProfil)

        if (profile != null) {
            val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.CANADA)
            tvPrenom.text = "Votre prénom : ${profile.firstName}"
            tvNom.text = "Votre nom : ${profile.lastName}"
            tvDateNaissance.text = "Votre date de naissance : ${dateFormat.format(profile.birthday)}"
            tvIDUL.text = "Votre IDUL : ${profile.IDUL}"
        } else {
            tvPrenom.text = "Erreur: profil non reçu"
        }

        btnFermer.setOnClickListener {
            finish()
        }
    }
}
