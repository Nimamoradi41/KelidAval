package com.example.NewKlidaval

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class Adapter_second_bascket_marsole_22( var C: Context)
    : RecyclerView.Adapter<Adapter_second_bascket_marsole_22.view>() {


//    fun Onclick(data: Data?) {
//
//    }




    class view(itemView: View) : RecyclerView.ViewHolder(itemView) {



    }
//    interface Data {
//        fun Setdata(item: MODEL_ITEM?)
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): view {

//         View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_cate,parent,false);
        val view = LayoutInflater.from(parent.context).inflate(R.layout.custome_second_address_marsole, parent, false)
        return view(view)
    }

    override fun onBindViewHolder(holder: view, position: Int) {
//        var Item=items_2.get(position)
//        if(Item?.productFirstImage!=null)
//        {
//            Log.i("sfkmsmlbab",""+ Constants.BASE_URL+"/Sliders/"+Item.productFirstImage)
//            Glide.with(C).load(Constants.BASE_URL+"/Images/"+Item?.productFirstImage).into(holder.itemView.imageView46);
//        }
//
//
//
//
//        if (position+1==items_2.size)
//        {
//
//            Log.i("skvnkasndkv","AD")
//            holder.itemView.view_eer.visibility= View.GONE
//        }
//        holder.itemView.txt_item.setText(Item.productTitle  )

    }

    override fun getItemCount(): Int {
//        return    items_2.size
        return    4
    }
}
