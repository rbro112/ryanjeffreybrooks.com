package com.rjb.components

import androidx.compose.runtime.Composable
import com.rjb.style.RJBStyles.dividerDotted
import com.rjb.style.RJBStyles.dividerLight
import org.jetbrains.compose.web.css.bottom
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text

@Composable
fun DividerDoubleDotted() {
    Div(attrs = {
        classes(dividerDotted)
        style {
            bottom(2.px)
        }
    })
    Div(attrs = { classes(dividerDotted) })
}

@Composable
fun DividerLight() {
    Div(attrs = { classes(dividerLight) })
}

@Composable
fun TextSpacer() {
    Text(" :: ")
}