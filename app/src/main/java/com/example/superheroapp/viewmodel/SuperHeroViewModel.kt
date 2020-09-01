package com.example.superheroapp.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.superheroapp.model.Repository
import com.example.superheroapp.model.pojo.SuperHero

class SuperHeroViewModel(application: Application): AndroidViewModel(application) {
    private val repository = Repository(application)

    fun getSuperHeroesAsList(){
        repository.getSuperHeroProfiles()
    }
}