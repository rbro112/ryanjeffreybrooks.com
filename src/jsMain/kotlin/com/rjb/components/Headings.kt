package com.rjb.components

import androidx.compose.runtime.Composable
import com.rjb.routing.Path
import com.rjb.style.SizeStyles
import com.rjb.style.TextStyles
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text

/**
 * Helper to pass a Path directly.
 */
@Composable
fun PageHeader(path: Path) {
    PageHeader(path.displayText)
}

@Composable
fun PageHeader(text: String) {
    Div(attrs = {
        classes(TextStyles.fontDisplay, TextStyles.fontBold, TextStyles.text2Xl, SizeStyles.py4)
    }) {
        Text(text)
    }
}