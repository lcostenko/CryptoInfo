package com.example.cryptoapp.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("CoinInfo")
    @Expose
    val coinInfo: CoinInfo? = null
)