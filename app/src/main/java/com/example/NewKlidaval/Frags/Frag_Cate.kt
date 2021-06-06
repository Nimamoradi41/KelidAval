package com.example.NewKlidaval.Frags

import android.os.Bundle
import android.util.DisplayMetrics
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.example.NewKlidaval.Adapters.Adapter_productBoxDtos_2
import com.example.NewKlidaval.R
import kotlinx.android.synthetic.main.fragment_frag__cate.*
import kotlinx.android.synthetic.main.fragment_frag__cate.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Frag_Cate.newInstance] factory method to
 * create an instance of this fragment.
 */
class Frag_Cate : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var V= inflater.inflate(R.layout.fragment_frag__cate, container, false)
        val dm = DisplayMetrics()
        V.animt_click.setOnClickListener {
            Toast.makeText(activity,"vmlsbmslb", Toast.LENGTH_LONG).show()
        }
        activity?.getWindowManager()?.getDefaultDisplay()?.getMetrics(dm)
        val width = dm.widthPixels
        val height = dm.widthPixels
        var cc=Adapter_productBoxDtos_2(activity!!,width)
        V.recy_cats.layoutManager=GridLayoutManager(requireActivity(),2,GridLayoutManager.VERTICAL,true)
        V.recy_cats.adapter=cc
        cc.click_2(object :Adapter_productBoxDtos_2.Data_BTO_2{
            override fun Data(Type: Int) {
                childFragmentManager.beginTransaction().add(R.id.container_2,Frag_Product()).addToBackStack(null).commit()
            }
        })
        return  V
    }


}