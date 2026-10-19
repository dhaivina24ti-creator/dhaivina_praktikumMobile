package com.example.dhaivina_3tib.Message

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.dhaivina_3tib.R
import com.example.dhaivina_3tib.databinding.ActivityMassageBinding

class MessageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMassageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMassageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val nama = intent.getStringExtra("SENDER")
        val pesan = intent.getStringExtra("PESAN")

        binding.txtNama.text = nama
        binding.txtPesan.text = pesan
    }
}