package com.example.NewKlidaval.Adapters

import android.annotation.SuppressLint
import android.app.Activity
import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.NewKlidaval.R
import kotlinx.android.synthetic.main.customeaddress.view.*

class adapter_address(var c: Activity) : RecyclerView.Adapter<adapter_address.view>() {




    var DA: data_Type?=null

    var Selected=-1;


    fun  DATA(DA: data_Type)
    {
        this.DA=DA
    }

//    var list:ArrayList<ModelAddress> ?=null
    public  class view(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): view {
        var V= LayoutInflater.from(parent.context).inflate(R.layout.customeaddress,parent,false)
        return  view(V)
    }

    @SuppressLint("ResourceType")
    override fun onBindViewHolder(holder: view, position: Int) {

//        var item=list?.get(position)


        if (Selected!=-1)
        {
            if (Selected!=position)
            {
                Log.i("sdvkmamkdmkava","A")
                holder.itemView.tessst.setBackgroundColor(Color.WHITE)
            }
        }




        holder.itemView.tessst.setOnClickListener {
            if (Selected!=-1)
            {
                Log.i("sdvkmamkdmkava","B")
                notifyItemChanged(Selected)
            }
            Selected=position
            Log.i("sdvkmamkdmkava","C")
            holder.itemView.tessst.setBackgroundResource(R.drawable.shape_99)
        }











//        if (item?.fullLocation!=null)
//        {
//            holder.itemView.textView36.setText(item.fullLocation?.trim().toString())
//        }else{
//            holder.itemView.textView36.setText("نامشخص")
//        }
//
//
//        if (item?.home!=null)
//        {
//            holder.itemView.textView37.setText(item.home)
//        }else{
//            holder.itemView.textView37.setText("نامشخص")
//        }
//
//
//        if (item?.floor!=null)
//        {
//            holder.itemView.textView38.setText(item.floor)
//        }else{
//            holder.itemView.textView38.setText("نامشخص")
//        }
//
//
//        if (item?.unit!=null)
//        {
//            holder.itemView.textView39.setText(item.unit)
//        }else{
//            holder.itemView.textView39.setText("نامشخص")
//        }
//
//        if (item?.plaque!=null)
//        {
//            holder.itemView.textView40.setText(item.plaque)
//        }else{
//            holder.itemView.textView40.setText("نامشخص")
//        }
//
//
//        if (item?.peykInfo!=null)
//        {
//            holder.itemView.textView118.setText(item.peykInfo)
//        }else{
//            holder.itemView.textView118.setText("نامشخص")
//        }
//
//
//
//
//        if (item?.fullLocation!=null)
//        {
//            holder.itemView.textView36.setText(item.fullLocation?.trim().toString())
//        }else{
//            holder.itemView.textView36.setText("نامشخص")
//        }




        holder.itemView.imageView32.setOnClickListener {
            Toast.makeText(c,"برای حذف آدرس بر روی دکمه نگه دارید", Toast.LENGTH_SHORT).show()
        }



        holder.itemView.imageView32.setOnClickListener {
//            DA?.Del(item?.id.toString(),position)

        }






        holder.itemView.setOnClickListener {
//            DA?.Edit(item!!,position)
        }








    }

    override fun getItemCount(): Int {
//        if (list!=null)
//        {
//            return list?.size!!
//        }
        return   5
    }


    public interface data_Type{
        public fun Del(S:String,Pos:Int)
//        public fun Edit(S:ModelAddress,Pos:Int)
    }






}
