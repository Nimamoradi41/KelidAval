package com.example.NewKlidaval.Adapters

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnLongClickListener
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.NewKlidaval.Models.estate_2
import com.example.NewKlidaval.MultyActivity
import com.example.NewKlidaval.R
import kotlinx.android.synthetic.main.custome_padash.view.*
import java.text.DecimalFormat

class adapter_Padash(var C: Activity): RecyclerView.Adapter<adapter_Padash.view>() {

    interface  data{
        fun Click(S: String)
    }
    var sd:data ?=null

    fun clicl(s: data)
    {
        this.sd=s
    }
    var datas:ArrayList<estate_2> ?=null
    init {
        datas=ArrayList<estate_2>()
    }
    public class  view(itemView: View) : RecyclerView.ViewHolder(itemView)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): view {
         var V=LayoutInflater.from(parent.context).inflate(R.layout.custome_padash, parent, false)
        return view(V)
    }

    override fun onBindViewHolder(holder: view, position: Int) {


        var Item=datas?.get(position)
        if (!Item?.title.isNullOrEmpty())
        {
            holder.itemView.textView52.setText(Item?.title)
        }else{
            holder.itemView.textView52.setText("نامشخص")
        }


        if (!Item?.type.isNullOrEmpty())
        {
            holder.itemView.textView96.setText(Item?.type)
        }else{
            holder.itemView.textView96.setText("نامشخص")
        }



        if (!Item?.cod.isNullOrEmpty())
        {
            holder.itemView.textView97.setText(Item?.cod)
        }else{
            holder.itemView.textView97.setText("نامشخص")
        }



        if (!Item?.year.isNullOrEmpty())
        {
            holder.itemView.textView99.setText(Item?.year)
        }else{
            holder.itemView.textView99.setText("نامشخص")
        }


        if (!Item?.transaction.isNullOrEmpty())
        {
            holder.itemView.textView100.setText(Item?.transaction)
        }else{
            holder.itemView.textView100.setText("نامشخص")
        }




        if (!Item?.date.isNullOrEmpty())
        {
            holder.itemView.textView101.setText(Item?.date)
        }else{
            holder.itemView.textView101.setText("نامشخص")
        }




        if (Item?.transaction.equals("فروش"))
        {
            holder.itemView.imageView65.visibility=View.GONE
            holder.itemView.textView102.visibility=View.GONE
            holder.itemView.imageView66.visibility=View.GONE
            holder.itemView.textView111.visibility=View.GONE


            if (!Item?.price.isNullOrEmpty())
            {
                var d= DecimalFormat("#,###,###,###")
               var dds= d.format(Item?.price?.toFloat())
                holder.itemView.textView113.setText(dds)

            }else{
                holder.itemView.textView113.setText("نامشخص")
            }
        }else{
            holder.itemView.imageView67.visibility=View.GONE
            holder.itemView.textView113.visibility=View.GONE
            if (!Item?.mortgage.isNullOrEmpty())
            {
                var d= DecimalFormat("#,###,###,###")
                var dds= d.format(Item?.mortgage.toString().toFloat())
                holder.itemView.textView102.setText(dds)
            }else{
                holder.itemView.textView102.setText("نامشخص")
            }


            if (!Item?.rent.isNullOrEmpty())
            {
                var d= DecimalFormat("#,###,###,###")
                var dds= d.format(Item?.rent.toString().toFloat())
                holder.itemView.textView111.setText(dds)

            }else{
                holder.itemView.textView111.setText("نامشخص")
            }

        }

        if (!Item?.date.isNullOrEmpty())
        {
            holder.itemView.textView101.setText(Item?.date)
        }else{
            holder.itemView.textView101.setText("نامشخص")
        }



        holder.itemView.imageView71.setOnClickListener {
             sd?.Click(Item?.estateId.toString())
        }



        holder.itemView.imageView71.setOnClickListener {
//             Toast.makeText(C,"بر روی دکمه حذف نگه دارید",Toast.LENGTH_SHORT).show()
            sd?.Click(Item?.estateId.toString())
        }



        holder.itemView.imageView70.setOnClickListener {
//            Toast.makeText(C,"بر روی دکمه حذف نگه دارید",Toast.LENGTH_SHORT).show()
            sd?.Click(Item?.estateId.toString())
        }


//        holder.itemView.imageView70.setOnLongClickListener(OnLongClickListener {
//
//
//            false })
//
//        holder.itemView.imageView71.setOnLongClickListener(OnLongClickListener {
//
//
//
//            false })





        holder.itemView.setOnClickListener {
            var dds=Intent(C, MultyActivity::class.java)
            dds.putExtra("Type", "Edit_Melck")
            dds.putExtra("dddaata", Item)
            C.startActivityForResult(dds, 21)
        }









    }

    override fun getItemCount(): Int {
       return datas?.size!!
    }
}