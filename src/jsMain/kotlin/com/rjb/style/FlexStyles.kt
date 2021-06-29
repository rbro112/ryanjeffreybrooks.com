package com.rjb.style

import org.jetbrains.compose.web.css.*

object FlexStyles : StyleSheet() {

    val flex by style {
        display(DisplayStyle.Flex)
    }

    val flexWrap by style {
        flexWrap(FlexWrap.Wrap)
    }

    val justifySpaceBetween by style {
        justifyContent(JustifyContent.SpaceBetween)
    }

    val alignSelfCenter by style {
        alignSelf(AlignSelf.Center)
    }
}