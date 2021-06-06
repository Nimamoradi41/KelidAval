package com.example.NewKlidaval.Adapters

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.NewKlidaval.R
import kotlinx.android.synthetic.main.custome_productboxdtos.view.*

//class Adapter_productBoxDtos(var C: Activity, var list: ArrayList<productBoxDtos>, var W:Int) : RecyclerView.Adapter<Adapter_productBoxDtos.view>() {
class Adapter_productBoxDtos(var C: Activity, var W: Int) : RecyclerView.Adapter<Adapter_productBoxDtos.view>() {
    var interface_1: Adapter_productBoxDtos_2.Data_BTO_2?=null
    var   vv: Adapter_productBoxDtos_2?=null
    var   vv_2: ArrayList<Adapter_productBoxDtos_2>?=null
    public  class view(itemView: View) : RecyclerView.ViewHolder(itemView)
    fun click_2(da: Adapter_productBoxDtos_2.Data_BTO_2)
    {
        this.interface_1=da
    }
    init {
        vv_2=ArrayList<Adapter_productBoxDtos_2>()
        for (i in 0..3) {
            vv= Adapter_productBoxDtos_2(C,W)
            vv_2?.add(vv!!)
        }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): view {
//         var V=LayoutInflater.from(parent.context).inflate(R.layout.custome_special, parent, false)
        var V= LayoutInflater.from(parent.context).inflate(
            R.layout.custome_productboxdtos,
            parent,
            false
        )
//          var v=V.layoutParams as RecyclerView.LayoutParams
//          v.width=pxToDp(w.toFloat()).toInt()+20
//          v.height=pxToDp(w.toFloat()).toInt()*2
//           V.layoutParams= ViewGroup.LayoutParams(v)
//        V.requestLayout()
        return  view(V)
    }
    override fun onBindViewHolder(holder: view, position: Int) {
        var v=holder.itemView.img_sli.layoutParams as FrameLayout.LayoutParams
        v.height=(W*1/3)
        holder.itemView.img_sli.layoutParams= FrameLayout.LayoutParams(v)
        holder.itemView.img_sli.requestLayout()
//        holder.itemView.imageView2.setImageResource(list.get(position).img!!)
//        holder.itemView.bto_more.setOnClickListener {
////            Log.i("dknadnkvnda","BS")
////            Log.i("dkmcmksdvmkdsmkv",MainActivity.Count_Bascekt.toString())
////            var I= Intent(C, MultyActivity_2::class.java)
////            I.putExtra("Type", "main_all_2")
////            I.putExtra("Type_Filter", "4")
////            I.putExtra("IdProduct", list.get(position).category.id)
//////            I.putExtra("Count", Mainfrag.modelmain?.count?.value.toString())
////            I.putExtra("Count", MainActivity.Count_Bascekt.toString())
////            I.putExtra("data_products_get", list.get(position).products)
//////            I.putExtra("data_products_get", ad_dis?.list?.products)
//////            I.putExtra("t", 3)
////            C?.startActivityForResult(I, 25)
//        }


        if (position==0)
        {
            holder.itemView.img_sli.setImageResource(R.drawable.page_1)
        }
        if (position==1)
        {
            holder.itemView.img_sli.setImageResource(R.drawable.page_2)
        }
        if (position==2)
        {
            holder.itemView.img_sli.setImageResource(R.drawable.page_3)
        }
        if (position==3)
        {
            holder.itemView.img_sli.setImageResource(R.drawable.page_44)
        }




        holder.itemView.img_sli.setOnClickListener {
            interface_1?.Data(2)
        }



        vv=vv_2?.get(position)


        vv=Adapter_productBoxDtos_2(C, W)
        vv?.click_2(object : Adapter_productBoxDtos_2.Data_BTO_2 {
            override fun Data(I: Int) {
                interface_1?.Data(I)
            }
        })
        holder.itemView.recy_itemsss.layoutManager=GridLayoutManager(
            C,
            2,
            GridLayoutManager.VERTICAL,
            true
        )
        holder.itemView.recy_itemsss.adapter=vv

//        Log.i("dvmlkdnvksfbnvvxzcv",list.get(position).getCategory().getTitle())
//        holder.itemView.titile_discounts.setText(list.get(position).category)
        vv=Adapter_productBoxDtos_2(C,W)
        vv?.click_2(object : Adapter_productBoxDtos_2.Data_BTO_2{
            override fun Data(I: Int) {
                interface_1?.Data(I)
            }

        })

//        holder.itemView.bto_more.setOnClickListener {
//
//                var I=Intent(C,MultyActivity_2::class.java)
//                I.putExtra("Type","X")
//                I.putExtra("data",list.get(position).getProducts())
//                I.putExtra("cateid",list.get(position).getCategory().id)
//                I.putExtra("t",1)
//                C.startActivityForResult(I,26)
//        }
//        holder.itemView.recy_itemsss.layoutManager=
//            LinearLayoutManager(C, LinearLayoutManager.HORIZONTAL,true)
//        holder.itemView.recy_itemsss.adapter=vv
    }
    override fun getItemCount(): Int {
//        return  list.size
        return  4
    }






}