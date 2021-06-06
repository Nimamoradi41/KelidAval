package com.example.NewKlidaval.Frags

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.NewKlidaval.R
import kotlinx.android.synthetic.main.fragment_custome_slider.view.*


class custome_slider_2 : Fragment() {
   var i: String ?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            i= arguments?.getString("data", null)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var V= inflater.inflate(R.layout.fragment_custome_slider, container, false)


        if(i!=null)
        {
            if (i.equals("0"))
            {
                V.img_.setImageResource(R.drawable.pro_1)
            }
            if (i.equals("1"))
            {
                V.img_.setImageResource(R.drawable.pro_1)
            }
            if (i.equals("2"))
            {
                V.img_.setImageResource(R.drawable.pro_1)
            }

//            Log.i("kfnvslkfbzdfnbjzfb", "" + Constants.BASE_URL + "/Sliders/" + i)
////            Glide.with(this).load(Constants.BASE_URL+"/Sliders/"+i).into(V.img_);
////            Glide.with(this).load(Constants.BASE_URL+"/Images/"+i).into(V.img_);
//            Picasso.get().load(Constants.BASE_URL + "/Images/" + i).placeholder(R.drawable.holder).into(
//                V.img_
//            )
        }



//        V.img_.setOnClickListener {
//            val fullImageIntent = Intent(activity, FullScreenImageViewActivity::class.java)
//            var d=ArrayList<String>()
//            d.add(Constants.BASE_URL + "/Images/" + i)
//            fullImageIntent.putExtra(FullScreenImageViewActivity.URI_LIST_DATA, d)
//
//            fullImageIntent.putExtra(FullScreenImageViewActivity.IMAGE_FULL_SCREEN_CURRENT_POS, 0)
//            startActivity(fullImageIntent)
//        }
        // Inflate the layout for this fragment
//        V.img_.setImageResource(i)
        return V;
    }


}