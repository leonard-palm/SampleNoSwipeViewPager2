package de.sample.noswipeviewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

/**
 * @author Leonard Palm
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Im ViewPager2 den Adapter setzen
        vpMain.adapter = MyFragmentAdapter(supportFragmentManager, lifecycle)

        // Scrollen des Users verhindern
        vpMain.isUserInputEnabled = false

        bnvMain.setOnNavigationItemSelectedListener { item ->

            // Passendes Fragment zeigen
            when(item.itemId){
                R.id.mi_Start -> vpMain.show(0)
                R.id.mi_Search -> vpMain.show(1)
                R.id.mi_Playlists -> vpMain.show(2)
                else -> throw RuntimeException()
            }

            return@setOnNavigationItemSelectedListener true
        }
    }
}
