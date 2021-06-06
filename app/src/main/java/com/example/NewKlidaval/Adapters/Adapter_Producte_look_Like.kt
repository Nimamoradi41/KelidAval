package com.example.NewKlidaval.Adapters

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.NewKlidaval.ItemDetail
import com.example.NewKlidaval.R
import kotlinx.android.synthetic.main.custome_modal.view.*
import kotlinx.android.synthetic.main.custome_product.view.*

class Adapter_Producte_look_Like(var A:Context, var Wid:Int) : RecyclerView.Adapter<Adapter_Producte_look_Like.view>() {
    public  class view(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): view {
         var vv=LayoutInflater.from(parent.context).inflate(R.layout.custome_product,parent,false)
        return  view(vv)
    }

    override fun onBindViewHolder(holder: view, position: Int) {
        var v=holder.itemView.layoutParams as RecyclerView.LayoutParams
        v.height=(Wid/2)
        v.width=(Wid/3)
        holder.itemView.layoutParams= RecyclerView.LayoutParams(v)
        holder.itemView.requestLayout()
        if (position==0)
        {
            holder.itemView.imageView10.setImageResource(R.drawable.pro_1)
        }
        if (position==1)
        {
            holder.itemView.imageView10.setImageResource(R.drawable.pro_2)
        }

        if (position==2)
        {
            holder.itemView.imageView10.setImageResource(R.drawable.pro_3)
        }

        if (position==3)
        {
            holder.itemView.imageView10.setImageResource(R.drawable.pro_4)
        }

        if (position==4)
        {
            holder.itemView.imageView10.setImageResource(R.drawable.pro_5)
        }
        if (position==5)
        {
            holder.itemView.imageView10.setImageResource(R.drawable.pro_6)
        }


        holder.itemView.setOnClickListener {
            var vsc=Intent(A,ItemDetail::class.java)
            A.startActivity(vsc)
        }

        holder.itemView.textView19.setOnClickListener {
            val d= Dialog(A, R.style.CustomDialog)
            d.setCancelable(true)
            var v=LayoutInflater.from(A).inflate(R.layout.custome_modal, null, false)
            d.setContentView(v)
            var i_Count=ArrayList<String> ()

            var r = 5
            var i = 0
            while (i < r) {
                i++
                i_Count.add(i.toString())
            }
            i_Count.add(0,"0")
            var ad_=adapter_count_shop(i_Count,d,"")
            v.recy_itemmmms.adapter=ad_
            ad_.clicl(object : adapter_count_shop.data_i {
                override fun Data_d(I: Int, Id: String) {
                    if (I==0)
                    {
                        holder.itemView.textView19.setText("افزودن به سبد خرید")
                    }else{
                        holder.itemView.textView19.setText(I.toString()+" عدد ")
                    }

//                    if (Item.getCount()==0)
//                    {
//                        Toast.makeText(c,"عدم موجودی", Toast.LENGTH_SHORT).show()
//                        return
//                    }
//                    if (Item.getCurrentReserved()!=I)
//                    {
////
//                        interface_1?.Data(I,Id,position)
//                    }
                }

            })
            d.window?.setLayout(
                ConstraintLayout.LayoutParams.MATCH_PARENT,
                ConstraintLayout.LayoutParams.MATCH_PARENT
            )
            d.window?.setBackgroundDrawable(ColorDrawable((Color.TRANSPARENT)))
            v.imageView15.setOnClickListener {
                d.dismiss()
            }

            v.cccv.setOnClickListener {

            }
            v.close.setOnClickListener {
                d.dismiss()
            }
            d.show()
        }


    }

    override fun getItemCount(): Int {
        return 6
    }
}