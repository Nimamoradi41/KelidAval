package com.example.NewKlidaval.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.NewKlidaval.R

class adapter_wallet: RecyclerView.Adapter<adapter_wallet.view>() {
    public class  view(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): view {
         var V=LayoutInflater.from(parent.context).inflate(R.layout.custome_wallet,parent,false)
        return view(V)
    }

    override fun onBindViewHolder(holder: view, position: Int) {

    }

    override fun getItemCount(): Int {
       return  8
    }
}