package com.stevdza_san.demo.domain

import platform.Foundation.NSUserDefaults

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual class Localization {
    actual fun applyLanguage(iso: String) {
        NSUserDefaults.standardUserDefaults.setObject(
            arrayListOf(iso), "AppleLanguages"
        )
    }
}