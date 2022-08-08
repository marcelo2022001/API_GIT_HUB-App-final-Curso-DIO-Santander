package com.bootcamp.santander.appgitapi.domain


import com.bootcamp.santander.appgitapi.core.UseCase
import com.bootcamp.santander.appgitapi.data.model.Repo
import com.bootcamp.santander.appgitapi.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}