/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.example.android.devbyteviewer.database

import android.content.Context
import androidx.lifecycle.LiveData
<<<<<<< HEAD
import androidx.room.*

@Dao
interface VideoDao {
=======
import androidx.room.Dao
import androidx.room.Database
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Room
import androidx.room.RoomDatabase


@Dao
interface VideoDao{
>>>>>>> ba1237c2ddc3dd4687252ca405fdc90a055e897f
    @Query("select * from databasevideo")
    fun getVideos(): LiveData<List<DatabaseVideo>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg videos: DatabaseVideo)
}

@Database(entities = [DatabaseVideo::class], version = 1)
<<<<<<< HEAD
abstract class VideosDatabase : RoomDatabase() {
    abstract val videoDao: VideoDao
}

private lateinit var INSTANCE: VideosDatabase

fun getDatabase(context: Context): VideosDatabase {
    synchronized(VideosDatabase::class.java) {
        if (!::INSTANCE.isInitialized) {
            INSTANCE = Room.databaseBuilder(context.applicationContext,
                    VideosDatabase::class.java,
                    "videos").build()
=======
abstract class Videosdatabase : RoomDatabase(){
    abstract val videoDao: VideoDao
}
private lateinit var INSTANCE: Videosdatabase

fun getDatabase(context: Context): Videosdatabase{
    synchronized(Videosdatabase::class.java) {
        if (!::INSTANCE.isInitialized) {
            INSTANCE = Room.databaseBuilder(
                context.applicationContext,
                Videosdatabase::class.java, "videos"
            ).build()
>>>>>>> ba1237c2ddc3dd4687252ca405fdc90a055e897f
        }
    }
    return INSTANCE
}
<<<<<<< HEAD
=======

>>>>>>> ba1237c2ddc3dd4687252ca405fdc90a055e897f
