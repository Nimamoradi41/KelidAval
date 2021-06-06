package com.example.NewKlidaval.Frags

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.NewKlidaval.R
import kotlinx.android.synthetic.main.fragment_frag__sabt__melk.view.*
import kotlinx.android.synthetic.main.fragment_frag__sabt__melk.view.spinner_mojri
import kotlinx.android.synthetic.main.fragment_frag__sabt__melk.view.spinner_mojri_2
import kotlinx.android.synthetic.main.fragment_frag__sabt__melk.view.spinner_mojri_3
import kotlinx.android.synthetic.main.fragment_frag__sabt__moshtari.view.*

class Frag_Sabt_Moshtari : Fragment() {
    var VS:View ?=null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var V= inflater.inflate(R.layout.fragment_frag__sabt__moshtari, container, false)

        VS=V
        initSpinner();
        return V
    }
    private fun initSpinner() {
        var   provinceList = ArrayList<String>()
        provinceList.add("خرید و فروش")
        provinceList.add("رهن و اجاره")
        VS?.spinner_mojri?.setItems(provinceList)
        provinceList.clear()
        provinceList.add("آپارتمان اداری تجاری")
        provinceList.add("آپارتمان مسکونی")
        provinceList.add("پزشکی")
        provinceList.add("تجاری مغازه")
        provinceList.add("زمین و ویلایی")
        provinceList.add("مشارکت در ساخت")
        VS?.spinner_mojri_2?.setItems(provinceList)
        provinceList.clear()
        provinceList.add("زیتون کارمندی")
        provinceList.add("گلستان")
        provinceList.add("کوی علوی")
        provinceList.add("امانیه")
        VS?.spinner_mojri_3?.setItems(provinceList)
        provinceList.clear()
        provinceList.add("زیتون کارمندی")
        provinceList.add("گلستان")
        provinceList.add("کوی علوی")
        provinceList.add("امانیه")
        VS?.spinner4?.setItems(provinceList)
        provinceList.clear()
        provinceList.add("زیتون کارمندی")
        provinceList.add("گلستان")
        provinceList.add("کوی علوی")
        provinceList.add("امانیه")
        VS?.spinner5?.setItems(provinceList)
//        spinner.setItems(provinceList);
//        fffff.setItems(provinceList)
    }



}