package com.rjb.components.page

import androidx.compose.runtime.Composable
import com.rjb.components.TextSpacer
import com.rjb.style.ColorStyles.textSecondary
import com.rjb.style.SizeStyles.mb1
import com.rjb.style.SizeStyles.mt3
import com.rjb.style.SizeStyles.mx2
import com.rjb.style.SizeStyles.my4
import com.rjb.style.TextStyles.fontMono
import com.rjb.style.TextStyles.textAlignCenter
import com.rjb.style.TextStyles.textSm
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Text

@Composable
fun Footer() {
    // TODO: Fix colors
    Div(attrs = {
        classes(mt3, mb1, textAlignCenter)
    }) {
        A(
            href = "https://twitter.com/rbro112",
            attrs = { classes(mx2) }
        ) {
            Img("twitter.svg")
        }
        A(
            href = "https://www.linkedin.com/in/rbro112/",
            attrs = { classes(mx2) }
        ) {
            Img("linkedin.svg")
        }
        A(
            href = "https://github.com/rbro112",
            attrs = { classes(mx2) }
        ) {
            Img("github.svg")
        }
        A(
            href = "mailto:ryanjeffrey.brooks112@gmail.com",
            attrs = { classes(mx2) }
        ) {
            Img("email.svg")
        }
    }

    org.jetbrains.compose.web.dom.Footer(attrs = {
        classes(textSecondary, fontMono, textSm, my4, textAlignCenter)
    }) {
        Text("2021 Ryan Brooks")
        TextSpacer()
        A(
            href = "https://github.com/rbro112/ryanjeffreybrooks.com",
            attrs = { classes(textSecondary) }
        ) {
            Text("Built with Kotlin and Compose-Web")
        }
    }
}