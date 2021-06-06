package com.example.NewKlidaval.Adapters

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.NewKlidaval.Frags.custome_slider_2


//class adapter_slider_2(fm: FragmentManager, var Img:ArrayList<String>) : FragmentPagerAdapter(fm) {
class adapter_slider_2(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
//    return   list.size
//    return   Img.size
        return  1
    }

    override fun getItem(position: Int): Fragment {
        var v=Bundle()
//        v.putString("data",Img.get(position))
        v.putString("data", position.toString())
        var cv= custome_slider_2()
        cv.arguments=v
        return   cv
    }
}