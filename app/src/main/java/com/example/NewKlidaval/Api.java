package com.example.NewKlidaval;

import com.example.NewKlidaval.Models.Model_Respons;
import com.example.NewKlidaval.Models.Model_Respons_Addmelc;
import com.example.NewKlidaval.Models.Model_Respons_Login_Moshaver;
import com.example.NewKlidaval.Models.Model_Respons_loginUser;
import com.example.NewKlidaval.Models.Model_melkList;
import com.example.NewKlidaval.Models.Model_regUser;
import com.example.NewKlidaval.Models.Rec_invest;
import com.example.NewKlidaval.Models.Res_Arias;
import com.example.NewKlidaval.Models.Res_citys;

import okhttp3.RequestBody;
import okhttp3.Response;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface Api {
    @POST("/api/regUser.php")
    @FormUrlEncoded
    Call<Model_regUser> regUser(@Field("name")String name
            , @Field("mobile")String mobile);




    @POST("/api/index.php")
    @FormUrlEncoded
    Call<Model_Respons> index(@Field("transaction")String transaction
            , @Field("aria")String aria, @Field("type")String type);



    @POST("/api/melkAdmin.php")
    @FormUrlEncoded
    Call<Model_melkList> ListOfHomeAdmins(@Field("adminId")String adminId
            );

    @POST("/api/melkAdmin.php")
    @FormUrlEncoded
    Call<Model_melkList> ListOfHomeAdmins(@Field("adminId")String adminId
    );


    https://www.kelidaval.ir/api/costumerList.php


    @POST("/api/deleteEstate.php")
    @FormUrlEncoded
    Call<Model_Respons_Addmelc> deleteEstate(@Field("id")String id
    );


    @POST("/api/melkAdminEx.php")
    @FormUrlEncoded
    Call<Model_melkList> melkAdminEx(@Field("adminId")String adminId
    );


    @POST("/api/loginEstate.php")
    @FormUrlEncoded
    Call<Model_Respons_Login_Moshaver> Login_Moshaver(@Field("userName")String userName
            , @Field("password")String password);



    @POST("/api/loginUser.php")
    @FormUrlEncoded
        Call<Model_Respons_loginUser> loginUser(@Field("mobile")String mobile);

    @POST("/api/search.php")
    @FormUrlEncoded
    Call<Model_Respons> search(@Field("transaction")String transaction,
                               @Field("aria")String aria,
                               @Field("type")String type,
                               @Field("asansur")String asansur,
                               @Field("parking")String parking,
                               @Field("takvahed")String takvahed,
                               @Field("pishKharid")String pishKharid,
                               @Field("bedMin")String bedMin,
                               @Field("bedMax")String bedMax,
                               @Field("priceMin")String priceMin,
                               @Field("priceMax")String priceMax,
                               @Field("mortgageMin")String mortgageMin,
                               @Field("mortgageMax")String mortgageMax,
                               @Field("rentMin")String rentMin,
                               @Field("rentMax")String rentMax,
                               @Field("yearMin")String yearMin,
                               @Field("yearMax")String yearMax,
                               @Field("areaMin")String areaMin,
                               @Field("areaMax")String areaMax,
                               @Field("text")String text
                               );

    @POST("/api/addEstateAdmin.php")
    @FormUrlEncoded
    Call<Model_Respons_Addmelc> Add_Melc_User(@Field("transaction")String transaction,
                                         @Field("aria")String aria,
                                         @Field("type")String type,
                                         @Field("name")String name,
                                         @Field("mobile")String mobile,
                                         @Field("asli")String asli,
                                         @Field("address")String address,
                                         @Field("num")String num,
                                         @Field("kafArea")String kafArea,
                                         @Field("balkonArea")String balkonArea,
                                         @Field("area")String area,
                                         @Field("year")String year,
                                         @Field("bedroom")String bedroom,
                                         @Field("unit")String unit,
                                         @Field("unitFloor")String unitFloor,
                                         @Field("floor")String floor,
                                         @Field("mortgage")String mortgage,
                                         @Field("rent")String rent,
                                         @Field("price")String price,
                                         @Field("detail")String detail,
                                         @Field("detailUser")String detailUser,
                                         @Field("position")String position,
                                         @Field("asansur")String asansur,
                                         @Field("parking")String parking,
                                         @Field("data3")String data3_takvahe,
                                         @Field("data4")String data4_anbari,
                                         @Field("data5")String data5_takhliye,
                                         @Field("data6")String data6_kelidaval,
                                         @Field("data7")String data7_hayat,
                                         @Field("data8")String data8_abgarmkon,
                                         @Field("data9")String data9_hood,
                                         @Field("data10")String data10_gazsafheee,
                                         @Field("data11")String data11_komoddevari,
                                         @Field("data12")String data12_pompab,
                                         @Field("data13")String data13_darbzedserghat,
                                         @Field("pool")String pool_pakage,
                                         @Field("garden")String garden_teras,
                                         @Field("special")String special_melkmige,
                                         @Field("data15")String data15_pishkharid,
                                         @Field("show")String data16_show,
                                         @Field("adminId")String adminId

    );
    @POST("/api/addEstateAdmin.php")
    @FormUrlEncoded
    Call<Model_Respons_Addmelc> Add_Melc(@Field("transaction")String transaction,
                                              @Field("aria")String aria,
                                              @Field("type")String type,
                                              @Field("name")String name,
                                              @Field("mobile")String mobile,
                                              @Field("renterMobile")String renterMobile,
                                              @Field("agentMobile")String agentMobile,
                                              @Field("asli")String asli,
                                              @Field("address")String address,
                                              @Field("num")String num,
                                              @Field("kafArea")String kafArea,
                                              @Field("balkonArea")String balkonArea,
                                              @Field("area")String area,
                                              @Field("year")String year,
                                              @Field("bedroom")String bedroom,
                                              @Field("unit")String unit,
                                              @Field("unitFloor")String unitFloor,
                                              @Field("floor")String floor,
                                              @Field("mortgage")String mortgage,
                                              @Field("rent")String rent,
                                              @Field("price")String price,
                                              @Field("detail")String detail,
                                              @Field("detailUser")String detailUser,
                                              @Field("position")String position,
                                              @Field("asansur")String asansur,
                                              @Field("parking")String parking,
                                              @Field("data3")String data3_takvahe,
                                              @Field("data4")String data4_anbari,
                                              @Field("data5")String data5_takhliye,
                                              @Field("data6")String data6_kelidaval,
                                              @Field("data7")String data7_hayat,
                                              @Field("data8")String data8_abgarmkon,
                                              @Field("data9")String data9_hood,
                                              @Field("data10")String data10_gazsafheee,
                                              @Field("data11")String data11_komoddevari,
                                              @Field("data12")String data12_pompab,
                                              @Field("data13")String data13_darbzedserghat,
                                              @Field("pool")String pool_pakage,
                                              @Field("garden")String garden_teras,
                                              @Field("special")String special_melkmige,
                                              @Field("data15")String data15_pishkharid,
                                              @Field("show")String data16_show,
                                              @Field("adminId")String adminId

    );
    @POST("/api/editEstateAdmin.php")
    @FormUrlEncoded
    Call<Model_Respons_Addmelc> Edit_Melc(@Field("transaction")String transaction,
                                         @Field("aria")String aria,
                                         @Field("type")String type,
                                         @Field("name")String name,
                                         @Field("mobile")String mobile,
                                         @Field("renterMobile")String renterMobile,
                                         @Field("agentMobile")String agentMobile,
                                         @Field("asli")String asli,
                                         @Field("address")String address,
                                         @Field("num")String num,
                                         @Field("kafArea")String kafArea,
                                         @Field("balkonArea")String balkonArea,
                                         @Field("area")String area,
                                         @Field("year")String year,
                                         @Field("bedroom")String bedroom,
                                         @Field("unit")String unit,
                                         @Field("unitFloor")String unitFloor,
                                         @Field("floor")String floor,
                                         @Field("mortgage")String mortgage,
                                         @Field("rent")String rent,
                                         @Field("price")String price,
                                         @Field("detail")String detail,
                                         @Field("detailUser")String detailUser,
                                         @Field("position")String position,
                                         @Field("asansur")String asansur,
                                         @Field("parking")String parking,
                                         @Field("data3")String data3_takvahe,
                                         @Field("data4")String data4_anbari,
                                         @Field("data5")String data5_takhliye,
                                         @Field("data6")String data6_kelidaval,
                                         @Field("data7")String data7_hayat,
                                         @Field("data8")String data8_abgarmkon,
                                         @Field("data9")String data9_hood,
                                         @Field("data10")String data10_gazsafheee,
                                         @Field("data11")String data11_komoddevari,
                                         @Field("data12")String data12_pompab,
                                         @Field("data13")String data13_darbzedserghat,
                                         @Field("pool")String pool_pakage,
                                         @Field("garden")String garden_teras,
                                         @Field("special")String special_melkmige,
                                         @Field("data15")String data15_pishkharid,
                                         @Field("show")String data16_show,
                                         @Field("adminId")String adminId,
                                         @Field("id")String id

    );


    @POST("/api/searchCityName.php")
    Call<Res_citys> citys();

    @POST("/api/aria.php")
    Call<Res_Arias> getArias();



    @POST("/api/invest.php")
    Call<Rec_invest> invest();
}
