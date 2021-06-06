package com.example.NewKlidaval.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.NewKlidaval.MainActivity
import com.example.NewKlidaval.Models.places
import com.example.NewKlidaval.R
import kotlinx.android.synthetic.main.custome_p_gari.view.*

class adapter_P_Gari: RecyclerView.Adapter<adapter_P_Gari.view>() {

    var da:datas ?=null


    fun clicl(c:datas)
    {
        this.da=c
    }

    var data:ArrayList<places>?=null
    init {
        data=ArrayList<places>()
    }
    public class  view(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): view {
         var V=LayoutInflater.from(parent.context).inflate(R.layout.custome_p_gari,parent,false)
        return view(V)
    }

    override fun onBindViewHolder(holder: view, position: Int) {

        var item=data?.get(position)
        holder.itemView.imageView34.setText(item?.area_name)
        holder.itemView.setOnClickListener {
            MainActivity.Aria= item?.area_id!!
            da?.id(item.area_name.toString())
        }

    }

    public  interface  datas{
        public fun id(S:String)
    }

    override fun getItemCount(): Int {
       return data?.size!!
    }
}