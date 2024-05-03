package com.example.project11

import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

val Context.dataStore by preferencesDataStore(
    name = "my_preferences"
)

class DataStoreManager(val context: Context) {

    val USERNAME_KEY = stringPreferencesKey("username")

    suspend fun saveUserName(userName: String){
        context.dataStore.edit {
            it[USERNAME_KEY] = userName
        }
    }

    fun getUserName() : Flow<String> =
        context.dataStore.data.map {
            it[USERNAME_KEY] ?: ""
        }
}