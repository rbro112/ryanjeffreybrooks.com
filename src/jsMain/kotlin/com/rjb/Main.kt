package com.rjb

import app.softwork.routingcompose.BrowserRouter
import com.rjb.components.page.Container
import com.rjb.pages.About
import com.rjb.pages.Posts
import com.rjb.routing.Path
import com.rjb.style.*
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.renderComposable

fun main() {
    renderComposable(rootElementId = "root") {

        Style(RJBStyles)
        Style(FlexStyles)
        Style(ColorStyles)
        Style(SizeStyles)
        Style(TextStyles)

        Container {

            BrowserRouter(Path.POSTS.pathString) {
                route(Path.ABOUT.pathStringCleaned) {
                    noMatch { About() }
                }
                route(Path.POSTS.pathStringCleaned) {
                    // Add Markdown routing here in the future
                    noMatch { Posts() }
                }
                noMatch { Posts() }
            }
        }
    }
}