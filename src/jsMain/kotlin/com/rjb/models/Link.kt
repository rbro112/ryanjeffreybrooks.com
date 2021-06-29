package com.rjb.models

import androidx.compose.runtime.Composable
import app.softwork.routingcompose.NavLink
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text

abstract class Link(open val link: String) {

    @Composable
    abstract fun toAnchor(
        title: String,
        linkClasses: List<String>,
    )
}

data class InternalLink(override val link: String) : Link(link) {

    @Composable
    override fun toAnchor(
        title: String,
        linkClasses: List<String>,
    ) {
        NavLink(to = link) {
            Div(
                attrs = { classes(*linkClasses.toTypedArray()) }
            ) {
                Text(title)
            }
        }
    }
}

data class ExternalLink(override val link: String) : Link(link) {

    @Composable
    override fun toAnchor(
        title: String,
        linkClasses: List<String>,
    ) {
        A(
            href = link,
            attrs = { classes(*linkClasses.toTypedArray()) }
        ) {
            Text(title)
        }
    }
}