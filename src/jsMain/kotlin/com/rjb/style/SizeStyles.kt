package com.rjb.style

import org.jetbrains.compose.web.css.*

object SizeStyles : StyleSheet() {

    private val SIZE_0 = 0.cssRem
    private val SIZE_1 = .25.cssRem
    private val SIZE_2 = .5.cssRem
    private val SIZE_3 = .75.cssRem
    private val SIZE_4 = 1.cssRem
    private val SIZE_5 = 1.25.cssRem
    private val SIZE_6 = 1.5.cssRem
    private val SIZE_8 = 2.cssRem
    private val SIZE_10 = 2.5.cssRem
    private val SIZE_12 = 3.cssRem
    private val SIZE_16 = 4.cssRem
    private val SIZE_20 = 5.cssRem
    private val SIZE_24 = 6.cssRem
    private val SIZE_32 = 8.cssRem
    private val SIZE_40 = 10.cssRem
    private val SIZE_48 = 12.cssRem
    private val SIZE_56 = 14.cssRem
    private val SIZE_64 = 16.cssRem

    private fun attr(
        attribute: String,
        spacing: CSSSizeValue<out CSSUnit>
    ) = style { property(attribute, spacing) }

    private fun height(spacing: CSSSizeValue<out CSSUnit>) = attr("height", spacing)

    private fun width(spacing: CSSSizeValue<out CSSUnit>) = attr("width", spacing)

    /**
     * Padding
     */

    private fun padding(spacing: CSSSizeValue<out CSSUnit>) = attr("padding", spacing)
    private fun paddingX(spacing: CSSSizeValue<out CSSUnit>) = style {
        property("padding-left", spacing)
        property("padding-right", spacing)
    }

    private fun paddingY(spacing: CSSSizeValue<out CSSUnit>) = style {
        property("padding-top", spacing)
        property("padding-bottom", spacing)
    }

    private fun paddingLeft(spacing: CSSSizeValue<out CSSUnit>) = attr("padding-left", spacing)
    private fun paddingRight(spacing: CSSSizeValue<out CSSUnit>) = attr("padding-right", spacing)

    /**
     * Padding
     */

    val p0 by padding(SIZE_0)
    val p1 by padding(SIZE_1)
    val p2 by padding(SIZE_2)
    val p3 by padding(SIZE_3)
    val p4 by padding(SIZE_4)
    val p5 by padding(SIZE_5)
    val p6 by padding(SIZE_6)
    val p8 by padding(SIZE_8)
    val p10 by padding(SIZE_10)
    val p12 by padding(SIZE_12)
    val p16 by padding(SIZE_16)
    val p20 by padding(SIZE_20)
    val p24 by padding(SIZE_24)
    val p32 by padding(SIZE_32)
    val p40 by padding(SIZE_40)
    val p48 by padding(SIZE_48)
    val p56 by padding(SIZE_56)
    val p64 by padding(SIZE_64)

    val px0 by paddingX(SIZE_0)
    val px1 by paddingX(SIZE_1)
    val px2 by paddingX(SIZE_2)
    val px3 by paddingX(SIZE_3)
    val px4 by paddingX(SIZE_4)
    val px5 by paddingX(SIZE_5)
    val px6 by paddingX(SIZE_6)
    val px8 by paddingX(SIZE_8)
    val px10 by paddingX(SIZE_10)
    val px12 by paddingX(SIZE_12)
    val px16 by paddingX(SIZE_16)
    val px20 by paddingX(SIZE_20)
    val px24 by paddingX(SIZE_24)
    val px32 by paddingX(SIZE_32)
    val px40 by paddingX(SIZE_40)
    val px48 by paddingX(SIZE_48)
    val px56 by paddingX(SIZE_56)
    val px64 by paddingX(SIZE_64)

    val pl6 by paddingLeft(SIZE_6)

    val pr1 by paddingRight(SIZE_1)
    val pr6 by paddingRight(SIZE_6)

    val py0 by paddingY(SIZE_0)
    val py1 by paddingY(SIZE_1)
    val py2 by paddingY(SIZE_2)
    val py3 by paddingY(SIZE_3)
    val py4 by paddingY(SIZE_4)
    val py5 by paddingY(SIZE_5)
    val py6 by paddingY(SIZE_6)
    val py8 by paddingY(SIZE_8)
    val py10 by paddingY(SIZE_10)
    val py12 by paddingY(SIZE_12)
    val py16 by paddingY(SIZE_16)
    val py20 by paddingY(SIZE_20)
    val py24 by paddingY(SIZE_24)
    val py32 by paddingY(SIZE_32)
    val py40 by paddingY(SIZE_40)
    val py48 by paddingY(SIZE_48)
    val py56 by paddingY(SIZE_56)
    val py64 by paddingY(SIZE_64)

    /**
     * Margin
     */

    private fun margin(spacing: CSSSizeValue<out CSSUnit>) = attr("margin", spacing)
    private fun marginX(spacing: CSSSizeValue<out CSSUnit>) = style {
        property("margin-left", spacing)
        property("margin-right", spacing)
    }

    private fun marginY(spacing: CSSSizeValue<out CSSUnit>) = style {
        property("margin-top", spacing)
        property("margin-bottom", spacing)
    }

    private fun marginRight(spacing: CSSSizeValue<out CSSUnit>) = attr("margin-right", spacing)
    private fun marginLeft(spacing: CSSSizeValue<out CSSUnit>) = attr("margin-left", spacing)
    private fun marginBottom(spacing: CSSSizeValue<out CSSUnit>) = attr("margin-bottom", spacing)
    private fun marginTop(spacing: CSSSizeValue<out CSSUnit>) = attr("margin-top", spacing)

    val m0 by margin(SIZE_0)
    val m1 by margin(SIZE_1)
    val m2 by margin(SIZE_2)
    val m3 by margin(SIZE_3)
    val m4 by margin(SIZE_4)
    val m5 by margin(SIZE_5)
    val m6 by margin(SIZE_6)
    val m8 by margin(SIZE_8)
    val m10 by margin(SIZE_10)
    val m12 by margin(SIZE_12)
    val m16 by margin(SIZE_16)
    val m20 by margin(SIZE_20)
    val m24 by margin(SIZE_24)
    val m32 by margin(SIZE_32)
    val m40 by margin(SIZE_40)
    val m48 by margin(SIZE_48)
    val m56 by margin(SIZE_56)
    val m64 by margin(SIZE_64)
    val mAuto by style {
        property("margin", "auto")
    }

    val mx0 by marginX(SIZE_0)
    val mx1 by marginX(SIZE_1)
    val mx2 by marginX(SIZE_2)
    val mx3 by marginX(SIZE_3)
    val mx4 by marginX(SIZE_4)
    val mx5 by marginX(SIZE_5)
    val mx6 by marginX(SIZE_6)
    val mx8 by marginX(SIZE_8)
    val mx10 by marginX(SIZE_10)
    val mx12 by marginX(SIZE_12)
    val mx16 by marginX(SIZE_16)
    val mx20 by marginX(SIZE_20)
    val mx24 by marginX(SIZE_24)
    val mx32 by marginX(SIZE_32)
    val mx40 by marginX(SIZE_40)
    val mx48 by marginX(SIZE_48)
    val mx56 by marginX(SIZE_56)
    val mx64 by marginX(SIZE_64)
    val mxAuto by style {
        property("margin-left", "auto")
        property("margin-right", "auto")
    }

    val mr6 by marginRight(SIZE_6)
    val ml2 by marginLeft(SIZE_2)
    val ml4 by marginLeft(SIZE_4)

    val my0 by marginY(SIZE_0)
    val my1 by marginY(SIZE_1)
    val my2 by marginY(SIZE_2)
    val my3 by marginY(SIZE_3)
    val my4 by marginY(SIZE_4)
    val my5 by marginY(SIZE_5)
    val my6 by marginY(SIZE_6)
    val my8 by marginY(SIZE_8)
    val my10 by marginY(SIZE_10)
    val my12 by marginY(SIZE_12)
    val my16 by marginY(SIZE_16)
    val my20 by marginY(SIZE_20)
    val my24 by marginY(SIZE_24)
    val my32 by marginY(SIZE_32)
    val my40 by marginY(SIZE_40)
    val my48 by marginY(SIZE_48)
    val my56 by marginY(SIZE_56)
    val my64 by marginY(SIZE_64)
    val myAuto by style {
        property("margin-top", "auto")
        property("margin-bottom", "auto")
    }

    val mt1 by marginTop(SIZE_1)
    val mt2 by marginTop(SIZE_2)
    val mt3 by marginTop(SIZE_3)

    val mb0 by marginBottom(SIZE_0)
    val mb1 by marginBottom(SIZE_1)
    val mb2 by marginBottom(SIZE_2)

    /**
     * Height
     */

    val h0 by height(SIZE_0)
    val h1 by height(SIZE_1)
    val h2 by height(SIZE_2)
    val h3 by height(SIZE_3)
    val h4 by height(SIZE_4)
    val h5 by height(SIZE_5)
    val h6 by height(SIZE_6)
    val h8 by height(SIZE_8)
    val h10 by height(SIZE_10)
    val h12 by height(SIZE_12)
    val h16 by height(SIZE_16)
    val h20 by height(SIZE_20)
    val h24 by height(SIZE_24)
    val h32 by height(SIZE_32)
    val h40 by height(SIZE_40)
    val h48 by height(SIZE_48)
    val h56 by height(SIZE_56)
    val h64 by height(SIZE_64)
    val hFull by attr("height", 100.percent)
    val hScreen by attr("height", 100.vh)
    val hAuto by style {
        property("height", "auto")
    }

    val minHScreen by attr("min-height", 100.vh)

    /**
     * Width
     */

    val wFull by attr("width", 100.percent)
}