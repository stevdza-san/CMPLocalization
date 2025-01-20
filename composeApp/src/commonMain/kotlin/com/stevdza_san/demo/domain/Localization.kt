package com.stevdza_san.demo.domain

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
expect class Localization {
    fun applyLanguage(iso: String)
}