package de.sample.noswipeviewpager2

import androidx.viewpager2.widget.ViewPager2

fun ViewPager2.show(position: Int){
    this.setCurrentItem(position, false)
}