package com.example.superheroapp.model

import android.content.Context
import android.util.Log
import com.example.superheroapp.model.api.RetrofitClient
import com.example.superheroapp.model.pojo.SuperHero
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Repository(context : Context) {

    private val tag = "APIHERO"

    fun getSuperHeroProfiles(){
        RetrofitClient.retrofitInstance().getAllSuperHero().enqueue(object : Callback<List<SuperHero>> {
            override fun onResponse(call: Call<List<SuperHero>>, response: Response<List<SuperHero>>) {
                Log.d("APIHERO", response.body().toString())

            }

            override fun onFailure(call: Call<List<SuperHero>>, t: Throwable) {
                Log.d(tag, t.toString())
            }

        })
    }

}