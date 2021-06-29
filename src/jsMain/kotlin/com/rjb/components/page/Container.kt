package com.rjb.components.page

import androidx.compose.runtime.Composable
import com.rjb.style.RJBStyles.container
import com.rjb.style.SizeStyles.minHScreen
import com.rjb.style.SizeStyles.mxAuto
import com.rjb.style.SizeStyles.my0
import com.rjb.style.SizeStyles.p8
import com.rjb.style.SizeStyles.py4
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Main

@Composable
fun Container(content: @Composable () -> Unit) {
    // TODO: More reactive for mobile
    Main(attrs = {
        classes(container, mxAuto, my0, p8, minHScreen)
    }) {
        content()
    }
}

@Composable
fun PageContainer(content: @Composable () -> Unit) {
    Div(attrs = {
        classes(container, py4)
    }) {
        content()
    }
}
