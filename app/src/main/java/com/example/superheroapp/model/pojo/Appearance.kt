package com.example.superheroapp.model.pojo

import androidx.room.TypeConverters

class Appearance (val gender : String,
                  val race : String,
                  @TypeConverters(ConverterList::class)
                  val height : List<String>,
                  @TypeConverters(ConverterList::class)
                  val weight : List<String>,
                  val eyeColor : String,
                  val hairColor : String)