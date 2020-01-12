package de.sample.noswipeviewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vpMain.adapter = MyFragmentAdapter(supportFragmentManager, lifecycle)
        vpMain.isUserInputEnabled = false

        bnvMain.setOnNavigationItemSelectedListener { item ->

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
