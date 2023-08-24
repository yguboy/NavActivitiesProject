package br.edu.up.navactivities

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class TerceiraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terceira)
    }

    fun NextPagina(view: View){
        val intent = Intent(this, PrimeiraActivity::class.java)
        startActivity(intent)
    }
}