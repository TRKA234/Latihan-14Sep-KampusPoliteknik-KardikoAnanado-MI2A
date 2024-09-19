package kardikoanando.mi2a.kampus_pnp

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kardikoanando.mi2a.kampus_pnp.Adapter.GalleryAdapter

class Galery : AppCompatActivity() {

        private val images = arrayOf(
            R.drawable.a1,
            R.drawable.b1,
            R.drawable.c1,
            R.drawable.d1,
            R.drawable.e1,
            R.drawable.f1,
            R.drawable.g1,
            R.drawable.h1,
            R.drawable.i1,
            R.drawable.j1,
            R.drawable.k1,
            R.drawable.download,
            R.drawable.logo_mi,
            R.drawable.logo_tekom,
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galery)

        // Set up the GridView for photos
        val gridView = findViewById<GridView>(R.id.gridView)
        val adapter = GalleryAdapter(this, images)
        gridView.adapter = adapter

        // Set up onClickListener for grid items
        gridView.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, Detail_photo::class.java)
            intent.putExtra("imageResId", images[position]) // Pass the selected image ID to detail activity
            startActivity(intent)
        }
    }

}