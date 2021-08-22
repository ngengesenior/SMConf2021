package com.ngengeapps.smconf2021.android.ui

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun SMConfTheme(
    content:@Composable ()-> Unit

) {
    MaterialTheme(
        colors = smConfColors,
        content = content,
        typography = SMConfTypography
    )
}