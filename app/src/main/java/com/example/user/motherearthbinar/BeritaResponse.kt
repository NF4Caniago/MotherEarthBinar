package com.example.user.motherearthbinar

import com.google.gson.annotations.SerializedName


data class BeritaResponse(@SerializedName("status") val status: String?,
                         @SerializedName("data") val data: List<BeritaModel>?,
                         @SerializedName("error") val error: String)