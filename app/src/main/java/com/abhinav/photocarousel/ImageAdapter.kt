package com.abhinav.photocarousel

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter

class ImageAdapter(private val mContext : Context): PagerAdapter() {
    companion object {
        val photoArr = arrayOf(R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5)
    }
    override fun getCount(): Int {
        return  photoArr.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val photoView = ImageView(mContext)
        photoView.scaleType = ImageView.ScaleType.FIT_CENTER
        photoView.setImageResource(photoArr[position])
        container.addView(photoView, 0)
        return photoView
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View?)
    }
}