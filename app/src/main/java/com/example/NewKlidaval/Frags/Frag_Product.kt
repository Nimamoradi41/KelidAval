package com.example.NewKlidaval.Frags

import android.os.Bundle
import android.util.DisplayMetrics
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.NewKlidaval.Adapters.Adapter_Producte
import com.example.NewKlidaval.R
import kotlinx.android.synthetic.main.fragment_frag__product.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Frag_Product.newInstance] factory method to
 * create an instance of this fragment.
 */
class Frag_Product : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var V= inflater.inflate(R.layout.fragment_frag__product, container, false)
        V.recy_product.layoutManager=GridLayoutManager(requireActivity(),3,GridLayoutManager.VERTICAL,true)
        V.anti_click_2.setOnClickListener {

        }
        val dm = DisplayMetrics()
        activity?.getWindowManager()?.getDefaultDisplay()?.getMetrics(dm)
        val width = dm.widthPixels
        val height = dm.widthPixels
        var vad=Adapter_Producte(context!!,width)
        V.recy_product.adapter=vad
        return  V
    }


}