package com.example.user.motherearthbinar

import com.google.gson.annotations.SerializedName

data class BeritaModel(
    @SerializedName("judul") var judul: String? = "judul",
    @SerializedName("berita") var berita: String? = "berita",
    @SerializedName("menit") var menit: String? = "berita",
    @SerializedName("tanggal") var tanggal: String? = "berita"
)