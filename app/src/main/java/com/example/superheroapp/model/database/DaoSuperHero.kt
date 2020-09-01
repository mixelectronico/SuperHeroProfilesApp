package com.example.superheroapp.model.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.example.superheroapp.model.pojo.SuperHero

@Dao
interface DaoSuperHero {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun getDefaultSuperHeroes(lisOfSuperHeroes: List<SuperHero>)

}