package com.tistory.blackjin.domain.di

import com.tistory.blackjin.domain.interactor.usecases.GetReposUsecase
import org.koin.dsl.module

val usecaseModule = module {

    factory {
        GetReposUsecase(get(), get())
    }
}