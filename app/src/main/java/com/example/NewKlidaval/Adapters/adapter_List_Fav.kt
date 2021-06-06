package com.example.NewKlidaval.Adapters

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.NewKlidaval.Models.news
import com.example.NewKlidaval.R
import kotlinx.android.synthetic.main.custome_list_fav.view.*


class adapter_List_Fav(var v:Context): RecyclerView.Adapter<adapter_List_Fav.view>() {

    var news :ArrayList<news>?=null

    init {

        news=ArrayList<news>()
    }
    public class  view(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): view {
         var V=LayoutInflater.from(parent.context).inflate(R.layout.custome_list_fav, parent, false)
        return view(V)
    }

    override fun onBindViewHolder(holder: view, position: Int) {
        var item=news?.get(position)

        if (!item?.title.isNullOrEmpty())
        {
            holder.itemView.textView55.setText(item?.title)
        }

        holder.itemView.setOnClickListener {
            if (!item?.link.isNullOrEmpty())
            {
                val i = Intent(Intent.ACTION_VIEW)
                i.data = Uri.parse(item?.link)
                v.startActivity(i)
            }

        }
    }

    override fun getItemCount(): Int {
       return news?.size!!
    }
}