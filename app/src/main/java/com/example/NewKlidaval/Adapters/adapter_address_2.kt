package com.example.NewKlidaval.Adapters

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.NewKlidaval.Item_Detail
import com.example.NewKlidaval.MainActivity
import com.example.NewKlidaval.Models.estate
import com.example.NewKlidaval.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.customeaddress.view.*
import java.text.DecimalFormat

class adapter_address_2(var c: Activity) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {




    var DA: data_Type?=null
    var datas: ArrayList<estate>?=null

    var Selected=-1;

    init {
        datas=ArrayList<estate>()
    }

    fun  DATA(DA: data_Type)
    {
        this.DA=DA
    }



    public  class view_null(itemView: View) : RecyclerView.ViewHolder(itemView)
    {

    }
//    var list:ArrayList<ModelAddress> ?=null
    public  class view(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var V= LayoutInflater.from(parent.context).inflate(R.layout.customeaddress, parent, false)
        return  view(V)


    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {




            var item=datas?.get(position)


            Log.i("hbchbchbzchbvhsbvhbk","position"+position+item?.asansur.toString())


            holder.itemView.setOnClickListener {
                Log.i("advdsavasdvs",item.toString())
                var ssa=Intent(c,Item_Detail::class.java)
                ssa.putExtra("data",item)
                c.startActivity(ssa)
            }

//            holder.itemView.setOnClickListener {
//                var vv= Intent(c, Item_Detail::class.java)
//                c.startActivity(vv)
//            }


            if (MainActivity.Transaction.equals("3"))
            {
                holder.itemView.textView153.visibility=View.GONE
                holder.itemView.textView154.visibility=View.GONE
                holder.itemView.textView155.visibility=View.VISIBLE
                holder.itemView.textView156.visibility=View.VISIBLE
                holder.itemView.textView157.visibility=View.VISIBLE
                holder.itemView.textView158.visibility=View.VISIBLE
                Log.i("avmada", item?.mortgage.toString())
                if (!item?.mortgage.isNullOrEmpty())
                {
                    var format = DecimalFormat("#,###,###,###")
                    var newPrice: String = format.format(item?.mortgage?.toDouble())

                    holder.itemView.textView156.setText("${newPrice}")

                }
                if (!item?.rent.isNullOrEmpty())
                {
                    var format = DecimalFormat("#,###,###,###")
                    var newPrice: String = format.format(item?.rent?.toDouble())
                    holder.itemView.textView158.setText(newPrice)
                }

            }else{
                if (!item?.price.isNullOrEmpty())
                {
                    var format = DecimalFormat("#,###,###,###")
                    var newPrice: String = format.format(item?.price?.toDouble())
                    holder.itemView.textView154.setText(newPrice)
                }
                holder.itemView.textView155.visibility=View.GONE
                holder.itemView.textView156.visibility=View.GONE
                holder.itemView.textView157.visibility=View.GONE
                holder.itemView.textView158.visibility=View.GONE
                holder.itemView.textView153.visibility=View.VISIBLE
                holder.itemView.textView154.visibility=View.VISIBLE
            }
//        var item=list?.get(position)



            if (!item?.title.isNullOrEmpty())
            {
                holder.itemView.textView36.setText(item?.title)
            }

            if (!item?.area.isNullOrEmpty())
            {
                holder.itemView.textView37.setText(item?.area)
            }




            if (!item?.area.isNullOrEmpty())
            {
                 Picasso.get().load(item?.img).placeholder(R.drawable.ic_placeho).into(holder.itemView.roundedImageView)
            }







            if (item?.asansur.equals("1"))
            {
                Log.i("DSDVSFBSFBGNG","A"+position)
               holder.itemView.imageView33.visibility=View.VISIBLE
            }



            if (item?.parking.equals("1"))
            {

                holder.itemView.imageView32.visibility=View.VISIBLE
            }





            if (!item?.floor.isNullOrEmpty())
            {
                holder.itemView.textView38.setText(item?.floor)
            }else{
                holder.itemView.textView38.setText("")
            }


            if (!item?.date.isNullOrEmpty())
            {
                holder.itemView.textView71.setText(item?.date)
            }else{
                holder.itemView.textView71.setText("")
            }



            if (!item?.bedroom.isNullOrEmpty())
            {
                holder.itemView.textView152.setText(item?.bedroom)
            }else{
                holder.itemView.textView152.setText("")
            }


            if (!item?.year.isNullOrEmpty())
            {
                holder.itemView.textView160.setText(item?.year)
            }else{
                holder.itemView.textView160.setText("")
            }








    }

    override fun getItemCount(): Int {

        return datas?.size!!
    }


    public interface data_Type{
        public fun Del(S: String, Pos: Int)

    }






}
