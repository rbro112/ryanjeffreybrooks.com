package com.rjb.components.page

import androidx.compose.runtime.Composable
import app.softwork.routingcompose.NavLink
import com.rjb.routing.Path
import com.rjb.style.ColorStyles.bgBlue
import com.rjb.style.ColorStyles.bgOrange
import com.rjb.style.ColorStyles.bgYellow
import com.rjb.style.FlexStyles.flex
import com.rjb.style.FlexStyles.flexWrap
import com.rjb.style.FlexStyles.justifySpaceBetween
import com.rjb.style.RJBStyles.listNone
import com.rjb.style.SizeStyles.h1
import com.rjb.style.SizeStyles.ml4
import com.rjb.style.SizeStyles.py2
import com.rjb.style.SizeStyles.wFull
import com.rjb.style.TextStyles.cursorPointer
import com.rjb.style.TextStyles.fontDisplay
import com.rjb.style.TextStyles.fontMedium
import com.rjb.style.TextStyles.hoverUnderline
import com.rjb.style.TextStyles.textXl
import com.rjb.style.TextStyles.underline
import org.jetbrains.compose.web.dom.*
import org.w3c.dom.HTMLUListElement

@Composable
fun Navbar(selectedPath: Path) {
    Header(attrs = {
        classes(wFull)
    }) {
        NavItems(selectedPath)
        DecoLine()
    }
}

@Composable
fun NavItems(selectedPath: Path) {
    Nav(attrs = {
        classes(
            py2,
            flex,
            flexWrap,
            justifySpaceBetween
        )
    }) {
        NavLink(
            to = Path.POSTS.pathString,
            attrs = {
                classes(cursorPointer)
            }
        ) {
            Img(src = "rjb_logo.svg")
        }

        Ul(attrs = {
            classes(flex, flexWrap, listNone)
        }) {
            Path.values().forEach { NavItem(it, selectedPath) }
        }
    }
}

@Composable
fun DOMScope<HTMLUListElement>.NavItem(
    path: Path,
    selectedPath: Path,
) {
    Li {
        NavLink(
            attrs = {
                classes(
                    ml4,
                    fontDisplay,
                    textXl,
                    cursorPointer,
                    fontMedium,
                    hoverUnderline
                )

                if (path == selectedPath) classes(underline)
            },
            to = path.pathString
        ) {
            Text(path.displayText)
        }
    }
}

@Composable
fun DecoLine() {
    Div(attrs = { classes(bgOrange, h1) })
    Div(attrs = { classes(bgYellow, h1) })
    Div(attrs = { classes(bgBlue, h1) })
}