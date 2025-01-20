package com.stevdza_san.demo

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.stevdza_san.demo.domain.Language
import com.stevdza_san.demo.domain.Localization
import dev.burnoo.compose.remembersetting.rememberStringSetting
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.koinInject

@Composable
@Preview
fun App() {
    MaterialTheme {
        val localization = koinInject<Localization>()
        var languageIso by rememberStringSetting(
            key = "savedLanguageIso",
            defaultValue = Language.English.iso
        )
        val selectedLanguage by derivedStateOf {
            Language.entries.first { it.iso == languageIso }
        }

        MainScreen(
            language = selectedLanguage,
            onLanguageChange = {
                languageIso = if (it) Language.English.iso
                else Language.Serbian.iso
                localization.applyLanguage(languageIso)
            }
        )
    }
}