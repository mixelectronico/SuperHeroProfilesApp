package com.example.superheroapp.model.pojo

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "superhero")
data class SuperHero(@PrimaryKey val id : Int = 0,
                     val name : String,
                     val slug : String,
                     @Embedded val powerstats : PowerStats,
                     @Embedded val appearance : Appearance,
                     @Embedded val biography : Biography,
                     @Embedded val work : Work,
                     @Embedded val connections : Connections,
                     @Embedded val images : Images)