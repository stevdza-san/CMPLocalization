package com.stevdza_san.demo.domain

import android.content.Context
import android.os.LocaleList
import java.util.Locale

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual class Localization(
    private val context: Context
) {
    actual fun applyLanguage(iso: String) {
        val locale = Locale(iso)
        Locale.setDefault(locale)
        val config = context.resources.configuration
        config.setLocales(LocaleList(locale))
    }
}