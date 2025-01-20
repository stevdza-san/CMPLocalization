package com.stevdza_san.demo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import cmplocalization.composeapp.generated.resources.Res
import cmplocalization.composeapp.generated.resources.selected_language
import com.stevdza_san.demo.domain.Language
import org.jetbrains.compose.resources.stringResource

@Composable
fun MainScreen(
    language: Language,
    onLanguageChange: (Boolean) -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "${stringResource(Res.string.selected_language)}: ${language.name}",
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(12.dp))
        Switch(
            checked = language == Language.English,
            onCheckedChange = onLanguageChange
        )
    }
}