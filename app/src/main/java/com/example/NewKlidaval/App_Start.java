package com.example.NewKlidaval;

import android.app.Application;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import io.github.inflationx.calligraphy3.CalligraphyInterceptor;
import io.github.inflationx.viewpump.ViewPump;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class App_Start extends Application {
    public static Typeface danaTypeface;
    private static Api api;
    Retrofit retrofit=null;



    public void Retrofit_server() {
        if (retrofit==null)
        {
            retrofit=new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
                    .baseUrl("http://www.kelidaval.ir/")
                    .build();
        }
    }
    public static Api getApi() {


        if (api == null) {
            OkHttpClient client = new OkHttpClient.Builder()

                    .connectTimeout(60, TimeUnit.SECONDS)
                    .readTimeout(60, TimeUnit.SECONDS)
                    .writeTimeout(60, TimeUnit.SECONDS)
                    .build();
            Gson gson = new GsonBuilder()
                    .setLenient()
                    .create();
            api = new Retrofit.Builder()
                    .baseUrl("http://www.kelidaval.ir")
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .client(client)
                    .build()
                    .create(Api.class);
//            api=new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
//                    .baseUrl(base_url)
//                    .build();
        }


        return api;
    }
    @Override
    public void onCreate() {
        super.onCreate();

        danaTypeface = Typeface.createFromAsset(getAssets(), "fonts/vazir_med.ttf");
        ViewPump.init(ViewPump.builder()
                .addInterceptor(new CalligraphyInterceptor(
                        new io.github.inflationx.calligraphy3.CalligraphyConfig.Builder()
                                .setDefaultFontPath("fonts/vazir_med.ttf")
                                .setFontAttrId(R.attr.fontPath)
                                .build()))
                .build());
    }
}
