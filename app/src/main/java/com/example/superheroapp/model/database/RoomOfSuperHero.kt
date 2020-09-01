package com.example.superheroapp.model.database

import android.content.Context
import androidx.room.*
import com.example.superheroapp.model.pojo.ConverterList
import com.example.superheroapp.model.pojo.SuperHero

@Database(entities = [SuperHero::class], version = 1)
@TypeConverters(ConverterList::class)
abstract class RoomOfSuperHero : RoomDatabase(){
    abstract fun daoSuperHero() : DaoSuperHero
    companion object{
        @Volatile
        private var INSTANCE : RoomOfSuperHero? =  null

        fun getDatabase(context: Context): RoomOfSuperHero{
            val tempInstance = INSTANCE
            if (tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    RoomOfSuperHero::class.java,
                    "databaseOfSuperheroes")
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }
}

//fun getPhotoDB(context: Context):PhotoDataRoomBase{
//    if(INSTANCE == null)
//        synchronized(this){
//            INSTANCE = Room.databaseBuilder(context.applicationContext, PhotoDataRoomBase::class.java, DBNAME).build()
//        }
//    return INSTANCE!!
//}