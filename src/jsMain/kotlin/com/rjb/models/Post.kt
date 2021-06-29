package com.rjb.models

import kotlin.js.Date

data class Post(
    val titleText: String,
    val date: Date,
    val description: String,
    val link: Link,
    val tags: List<Tag>,
    val buttonText: String,
) : Comparable<Post> {

    val formattedDate: String
        get() {
            val options = dateLocaleOptions {
                month = "short"
                day = "numeric"
                year = "numeric"
            }
            return date.toLocaleDateString("en-US", options)
        }

    override fun compareTo(other: Post) = (other.date.getTime() - date.getTime()).toInt()
}