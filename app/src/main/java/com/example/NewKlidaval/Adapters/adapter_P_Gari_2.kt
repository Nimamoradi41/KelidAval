package com.example.NewKlidaval.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.NewKlidaval.MainActivity
import com.example.NewKlidaval.R
import kotlinx.android.synthetic.main.custome_p_gari.view.*

class adapter_P_Gari_2: RecyclerView.Adapter<adapter_P_Gari_2.view>() {
    public class  view(itemView: View) : RecyclerView.ViewHolder(itemView)

    var da: adapter_P_Gari_2.title?=null

    var Type_melc:ArrayList<String> ?=null

    fun clicl(c: adapter_P_Gari_2.title)
    {
        this.da=c
    }
    init {
        Type_melc=ArrayList<String>()
        Type_melc?.add("همه")
        Type_melc?.add("آپارتمان اداری")
        Type_melc?.add("آپارتمان مسکونی")
        Type_melc?.add("پزشکی")
        Type_melc?.add("مغازه")
        Type_melc?.add("ویلایی")
        Type_melc?.add("زمین و مشارکت")
    }
    interface title {
        fun  TITLE(S:String)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): view {
         var V=LayoutInflater.from(parent.context).inflate(R.layout.custome_p_gari,parent,false)
        return view(V)
    }

    override fun onBindViewHolder(holder: view, position: Int) {
        holder.itemView.imageView34.setText(Type_melc?.get(position))


        holder.itemView.setOnClickListener {
            if (position==0)
            {
                da?.TITLE("همه")
                MainActivity.Type= "0"
            }else{
                da?.TITLE(Type_melc?.get(position).toString())
                MainActivity.Type= (position).toString()
            }

        }


    }

    override fun getItemCount(): Int {
       return Type_melc?.size!!
    }
}