package com.example.superheroapp.model.pojo

import androidx.room.TypeConverters

class Biography (val fullName : String,
                 val alterEgos : String,
                 @TypeConverters(ConverterList::class)
                 val aliases : List<String>,
                 val placeOfBirth : String,
                 val firstAppearance : String,
                 val publisher : String,
                 val alignment : String)