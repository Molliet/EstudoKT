package br.com.fiap.gsdronefarm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val user = findViewById<EditText>(R.id.etUser)
        button.setOnClickListener{
            val userInput = user.text.toString()
            if (userInput.isEmpty());

            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

    }
}