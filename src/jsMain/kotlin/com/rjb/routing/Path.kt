package com.rjb.routing

enum class Path(
    val pathString: String,
    val displayText: String
) {
    POSTS("/", "Posts"),
    ABOUT("/about", "About");

    val pathStringCleaned: String
        get() = pathString.removePrefix("/")
}