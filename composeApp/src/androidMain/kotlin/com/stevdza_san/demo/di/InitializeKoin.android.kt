package com.stevdza_san.demo.di

import com.stevdza_san.demo.domain.Localization
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

actual val targetModule = module {
    single<Localization> { Localization(context = androidContext()) }
}