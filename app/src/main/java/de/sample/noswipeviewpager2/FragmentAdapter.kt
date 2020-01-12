package de.sample.noswipeviewpager2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

private const val COUNT = 3

class MyFragmentAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager, lifecycle) {

    init {

        for( i in 0 until COUNT){
            createFragment(i)
        }
    }


    override fun getItemCount(): Int {
        return COUNT
    }

    override fun createFragment(position: Int): Fragment {

        return when(position){
            0 ->    FragmentStart.newInstance()
            1 ->    FragmentSearch.newInstance()
            2 ->    FragmentPlaylists.newInstance()
            else -> throw RuntimeException("$position")
        }
    }
}