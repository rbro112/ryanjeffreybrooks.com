package com.rjb.style

import com.rjb.style.ColorStyles.DIVIDER
import com.rjb.style.ColorStyles.TEXT_PRIMARY
import org.jetbrains.compose.web.css.*

object RJBStyles : StyleSheet() {

    init {

        "html" style {
            backgroundColor(ColorStyles.BACKGROUND)
        }
    }

    // TODO: More reactive for mobile
    val container by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)
        property("box-sizing", "border-box")
        property("max-width", 864.px)
    }

    /**
     * Dividers
     */

    val dividerLight by style {
        property("border-bottom", "1px solid $DIVIDER")
        position(Position.Relative)
        display(DisplayStyle.Block)
        width(100.percent)
    }

    val dividerDotted by style {
        property("border-bottom", "3px dotted $TEXT_PRIMARY")
        position(Position.Relative)
        display(DisplayStyle.Block)
        width(100.percent)
    }

    /**
     * Image
     */

    val roundedImage by style {
        borderRadius(50.percent)
    }

    val imageBorder by style {
        border {
            color(TEXT_PRIMARY)
            width(4.px)
            style(LineStyle.Solid)
        }
    }

    /**
     * List
     */

    val listNone by style {
        property("list-style", "none")
    }
}