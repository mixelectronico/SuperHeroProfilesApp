package com.example.superheroapp.model.api

import com.example.superheroapp.model.pojo.SuperHero
import retrofit2.Call
import retrofit2.http.GET

interface apiSuperHero {
    @GET("all.json")
    fun getAllSuperHero(): Call<List<SuperHero>>
}