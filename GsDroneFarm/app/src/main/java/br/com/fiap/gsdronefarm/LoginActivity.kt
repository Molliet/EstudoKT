package br.com.fiap.gsdronefarm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import br.com.fiap.gsdronefarm.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(Registros())

        binding.bottomNavigationView.setOnItemReselectedListener {
            when(it.itemId){
                R.id.analytics-> replaceFragment(Analytics())
                R.id.registros -> replaceFragment(Registros())
                R.id.graficos -> replaceFragment(Graficos())

                else ->{

                }
            }
            true
        }
    }

    private fun replaceFragment(homeFragment : Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,homeFragment)
        fragmentTransaction.commit()
    }
}