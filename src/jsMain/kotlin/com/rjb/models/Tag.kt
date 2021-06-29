package com.rjb.models

import com.rjb.style.ColorStyles.rausch
import com.rjb.style.ColorStyles.sevenWeeks
import com.rjb.style.ColorStyles.textSecondary

data class Tag(
    val styleClass: String,
    val text: String
) {

    companion object {
        val airbnbTag = Tag(
            styleClass = rausch,
            text = "Airbnb"
        )

        val sevenWeeksTag = Tag(
            styleClass = sevenWeeks,
            text = "7 Weeks"
        )

        val articleTag = Tag(
            styleClass = textSecondary,
            text = "Article"
        )

        val talkTag = Tag(
            styleClass = textSecondary,
            text = "Talk"
        )
    }
}
