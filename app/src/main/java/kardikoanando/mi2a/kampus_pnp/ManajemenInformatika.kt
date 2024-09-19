package kardikoanando.mi2a.kampus_pnp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ManajemenInformatika : AppCompatActivity() {

    private lateinit var btnKembali : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_manajemen_informatika)

        btnKembali = findViewById(R.id.btnKembali)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnKembali.setOnClickListener(){
            val intent = Intent(this@ManajemenInformatika, MainActivity::class.java)
            startActivity(intent)
        }
    }
}