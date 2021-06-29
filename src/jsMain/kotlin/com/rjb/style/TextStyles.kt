package com.rjb.style

import org.jetbrains.compose.web.css.CSSSizeValue
import org.jetbrains.compose.web.css.CSSUnit
import org.jetbrains.compose.web.css.StyleSheet
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.selectors.hover
import org.jetbrains.compose.web.css.selectors.plus

object TextStyles : StyleSheet() {

    private fun attr(
        attribute: String,
        value: CSSSizeValue<out CSSUnit>
    ) = style { property(attribute, value) }

    private fun fontWeight(weight: Int) = style { property("font-weight", weight) }

    private fun fontSize(size: CSSSizeValue<out CSSUnit>) = attr("font-size", size)

    /**
     * Font
     */

    val fontDisplay by style {
        property(
            "font-family",
            "Helvetica-neue, Helvetica, sans-serif"
        )
    }

    val fontBody by style {
        property(
            "font-family",
            "Helvetica-neue, Helvetica, sans-serif"
        )
    }

    val fontMono by style {
        property("font-family", "monospace")
    }

    /**
     * Font weights
     */

    val fontHairline by fontWeight(100)
    val fontThin by fontWeight(200)
    val fontLight by fontWeight(300)
    val fontNormal by fontWeight(400)
    val fontMedium by fontWeight(500)
    val fontSemibold by fontWeight(600)
    val fontBold by fontWeight(700)
    val fontExtraBold by fontWeight(800)
    val fontBlack by fontWeight(900)

    /**
     * Text sizes
     */

    val textXs by fontSize(.75.cssRem)
    val textSm by fontSize(.875.cssRem)
    val textBase by fontSize(1.cssRem)
    val textXl by fontSize(1.25.cssRem)
    val text2Xl by fontSize(1.5.cssRem)
    val text3Xl by fontSize(1.875.cssRem)
    val text4Xl by fontSize(2.25.cssRem)
    val text5Xl by fontSize(3.cssRem)
    val text6Xl by fontSize(4.cssRem)

    /**
     * Text modifiers
     */

    val underline by style {
        property("text-decoration", "underline")
    }

    /**
     * Hover states
     */

    val hoverUnderline by style {
        self + hover() style {
            property("text-decoration", "underline")
        }
    }

    val cursorPointer by style {
        property("cursor", "pointer")
    }

    /**
     * Alignment
     */

    val textAlignCenter by style {
        property("text-align", "center")
    }
}