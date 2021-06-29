package com.rjb.style

import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.selectors.hover
import org.jetbrains.compose.web.css.selectors.plus

object ColorStyles : StyleSheet() {

    const val TEXT_PRIMARY = "#222222"
    private const val TEXT_SECONDARY = "#717171"
    private const val TEXT_TERTIARY = "#B0B0B0"
    const val DIVIDER = "#DDDDDD"

    private const val ORANGE = "#EB7C3B"
    private const val DARK_ORANGE = "#C16530"
    private const val YELLOW = "#F2B44B"
    private const val BLUE = "#418CC4"
    private const val RAUSCH = "#FF5A5F"
    private const val SEVEN_WEEKS = "#78B088"

    const val BACKGROUND = "#FEFFF9"
    const val BACKGROUND_HOVER = "#CECFC9"

    private fun color(hexColor: String) = style { color(hexColor) }

    private fun bgColor(hexColor: String) = style { backgroundColor(hexColor) }

    /**
     * Text colors
     */
    val textPrimary by color(TEXT_PRIMARY)

    val textSecondary by color(TEXT_SECONDARY)

    val textTertiary by color(TEXT_TERTIARY)

    /**
     * Branding colors
     */
    val orange by color(ORANGE)
    val bgOrange by bgColor(ORANGE)

    val darkOrange by color(DARK_ORANGE)

    val yellow by color(YELLOW)
    val bgYellow by bgColor(YELLOW)

    val blue by color(BLUE)
    val bgBlue by bgColor(BLUE)

    val rausch by color(RAUSCH)
    val sevenWeeks by color(SEVEN_WEEKS)

    /**
     * Layout & general
     */
    val bgBackground by bgColor(BACKGROUND)

    val bgButtonHover by style {
        self + hover() style {
            backgroundColor(BACKGROUND_HOVER)
            borderRadius(4.px)
        }
    }
}