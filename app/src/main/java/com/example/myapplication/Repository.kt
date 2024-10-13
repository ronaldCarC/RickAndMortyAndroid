package com.example.myapplication

import android.util.Log
import com.example.myapplication.model.ListaTodo
import com.example.myapplication.model.RickAndMorthyRspn

interface Repository {
    suspend fun getTodoNotes(): List<ListaTodo>
    suspend fun getRickAndMorthy(): RickAndMorthyRspn
}