package com.example.shopping

import androidx.annotation.DrawableRes

object Data {


    class  Demo(@DrawableRes var img:Int,
        var name:String,
                var disp:String,
                var price:String
        )

    var datalist= listOf(Demo(R.drawable.dress,
        name = "The dress", disp = "The best dress ever", price = "$100"),
        Demo(R.drawable.blakdress,
            name = "The dress", disp = "The best dress ever", price = "$100"),
        Demo(R.drawable.dress,
            name = "The dress", disp = "The best dress ever", price = "$100"),
                Demo(R.drawable.blakdress,
        name = "The dress", disp = "The best dress ever", price = "$100"),
                        Demo(R.drawable.dress,
        name = "The dress", disp = "The best dress ever", price = "$100"),
        Demo(R.drawable.blakdress,
            name = "The dress", disp = "The best dress ever", price = "$100"),
        Demo(R.drawable.dress,
            name = "The dress", disp = "The best dress ever", price = "$100"),
        Demo(R.drawable.blakdress,
            name = "The dress", disp = "The best dress ever", price = "$100"),
        Demo(R.drawable.dress,
            name = "The dress", disp = "The best dress ever", price = "$100"),
        Demo(R.drawable.blakdress,
            name = "The dress", disp = "The best dress ever", price = "$100"),
        Demo(R.drawable.dress,
            name = "The dress", disp = "The best dress ever", price = "$100"),
        Demo(R.drawable.blakdress,
            name = "The dress", disp = "The best dress ever", price = "$100")
    )
}