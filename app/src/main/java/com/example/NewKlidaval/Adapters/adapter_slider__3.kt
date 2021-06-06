package com.example.NewKlidaval.Adapters

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.NewKlidaval.Frags.custome_slider_3


class adapter_slider__3(fm: FragmentManager,var S:String) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
//    return   list.size
    return   1
    }

    override fun getItem(position: Int): Fragment {

        var cv= custome_slider_3(S)

        return   cv
    }
}