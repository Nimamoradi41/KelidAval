package com.example.NewKlidaval.Adapters

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.NewKlidaval.R

import kotlinx.android.synthetic.main.custome_special_4.view.*

//class Adapter_productBoxDtos_2(var C: Activity, var list: productBoxDtos, var W:Int) : RecyclerView.Adapter<Adapter_productBoxDtos_2.view>() {
class Adapter_productBoxDtos_2(var C: Activity, var W:Int) : RecyclerView.Adapter<Adapter_productBoxDtos_2.view>() {
    var interface_1: Data_BTO_2?=null
    public  class view(itemView: View) : RecyclerView.ViewHolder(itemView)


    fun click_2(da: Data_BTO_2)
    {
        this.interface_1=da
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): view {
        var V= LayoutInflater.from(parent.context).inflate(R.layout.custome_special_6, parent, false)
//         var V=LayoutInflater.from(parent.context).inflate(R.layout.custome_productboxdtos, parent, false)
//          var v=V.layoutParams as RecyclerView.LayoutParams
//          v.width=pxToDp(w.toFloat()).toInt()+20
//          v.height=pxToDp(w.toFloat()).toInt()*2
//           V.layoutParams= ViewGroup.LayoutParams(v)
//        V.requestLayout()
        return  view(V)
    }


    override fun onBindViewHolder(holder: view, position: Int) {
//        var Item=list.getProducts().get(position)



        var v=holder.itemView.layoutParams as RecyclerView.LayoutParams
        v.height=(W*1/3)
        holder.itemView.layoutParams= ViewGroup.LayoutParams(v)
        holder.itemView.requestLayout()

        holder.itemView.setOnClickListener {
            interface_1?.Data(1)
        }


        if (position==0)
        {
            holder.itemView.imageView11.setImageResource(R.drawable.cate_2)
        }
        if (position==1)
        {

            holder.itemView.imageView11.setImageResource(R.drawable.cate_3)
        }

        if (position==2)
        {

            holder.itemView.imageView11.setImageResource(R.drawable.cate_4)
        }


        if (position==3)
        {

            holder.itemView.imageView11.setImageResource(R.drawable.cate_5)
        }






//        if (Item.getCurrentReserved()>0)
//        {
//            holder.itemView.button.setText(Item.getCurrentReserved().toString()+" عدد ")
////            holder.itemView.button.animate().alpha(1f).setDuration(500).start()
//            holder.itemView.button.animate().scaleX(0f).scaleY(0f).setDuration(200).withEndAction {
//                holder.itemView.button.animate().scaleX(1f).scaleY(1f).setDuration(200)
//            }.start()
//        }else  {
//            holder.itemView.button.setText("افزودن به سبد خرید")
////            holder.itemView.button.animate().alpha(1f).setDuration(500).start()
//            holder.itemView.button.animate().scaleX(0f).scaleY(0f).setDuration(200).withEndAction {
//                holder.itemView.button.animate().scaleX(1f).scaleY(1f).setDuration(200)
//            }.start()
//        }






//        holder.itemView.imageView2.setImageResource(list.get(position).img!!)



    }

    override fun getItemCount(): Int {
        return  4
    }


    public interface  Data_BTO_2{
        public fun Data(Type:Int)
    }

}