package com.rjb.pages

import androidx.compose.runtime.Composable
import com.rjb.components.DividerDoubleDotted
import com.rjb.components.PageHeader
import com.rjb.components.page.Footer
import com.rjb.components.page.Navbar
import com.rjb.components.page.PageContainer
import com.rjb.routing.Path
import com.rjb.style.ColorStyles.darkOrange
import com.rjb.style.FlexStyles.alignSelfCenter
import com.rjb.style.FlexStyles.flex
import com.rjb.style.RJBStyles.imageBorder
import com.rjb.style.RJBStyles.roundedImage
import com.rjb.style.SizeStyles.h32
import com.rjb.style.SizeStyles.pl6
import com.rjb.style.SizeStyles.py6
import com.rjb.style.SizeStyles.w32
import com.rjb.style.TextStyles.fontBody
import com.rjb.style.TextStyles.fontMono
import com.rjb.style.TextStyles.textBase
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Text

@Composable
fun About() {
    val path = Path.ABOUT

    Navbar(path)
    PageContainer {
        PageHeader(path)
        DividerDoubleDotted()
        AboutContent()
    }
    Footer()
}

@Composable
fun AboutContent() {
    Div(attrs = {
        classes(py6, flex)
    }) {
        Img(
            src = "profile_picture.png",
            attrs = {
                classes(roundedImage, imageBorder, w32, h32)
            }
        )

        Div(attrs = {
            classes(fontBody, fontMono, pl6, textBase, alignSelfCenter)
        }) {
            Text("I'm Ryan, the first engineer at ")
            A(
                href = "https://emergetools.com",
                attrs = { classes(darkOrange) }
            ) {
                Text("Emerge")
            }
            Text(". I've previously worked at ")
            A(
                href = "https://airbnb.com",
                attrs = { classes(darkOrange) }
            ) {
                Text("Airbnb")
            }
            Text(" and ")
            A(
                href = "https://mailchimp.com",
                attrs = { classes(darkOrange) }
            ) {
                Text("MailChimp")
            }
            Text(" and I own a little app called ")
            A(
                href = "https://7weeksapp.com",
                attrs = { classes(darkOrange) }
            ) {
                Text("7 Weeks")
            }
            Text(". I'm originally from Atlanta, spent some time in San Francisco and am now living in Seattle. If not coding, you'll find me scuba diving, climbing or complaining about Atlanta sports.")
        }
    }
}
