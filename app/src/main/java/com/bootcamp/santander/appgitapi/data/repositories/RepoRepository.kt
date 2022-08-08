package com.bootcamp.santander.appgitapi.data.repositories

import com.bootcamp.santander.appgitapi.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}
