package com.example.mejorespelis

import com.example.mejorespelis.Model.PeliculasResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiService {

    @GET
    suspend fun getAllPeliculas(@Url url: String): Response<PeliculasResponse>
}