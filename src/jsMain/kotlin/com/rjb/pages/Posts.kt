package com.rjb.pages

import androidx.compose.runtime.Composable
import com.rjb.components.page.Footer
import com.rjb.components.page.Navbar
import com.rjb.components.page.PageContainer
import com.rjb.components.PageHeader
import com.rjb.components.posts.PostPreview
import com.rjb.models.ExternalLink
import com.rjb.models.Post
import com.rjb.models.Tag.Companion.airbnbTag
import com.rjb.models.Tag.Companion.talkTag
import com.rjb.routing.Path
import kotlin.js.Date

val airbnbTechTalk = Post(
    titleText = "Innovating at scale with Server-driven UI",
    date = Date(2021, 5, 8),
    description = "While at Airbnb, I built a universal server-driven UI platform any product team could build features on. Watch me explain the high level concepts of this platform and how it works.",
    link = ExternalLink(link = "https://www.facebook.com/AirbnbTech/videos/1445539065813160/?t=1843"),
    tags = listOf(airbnbTag, talkTag),
    buttonText = "Watch →"
)

val postsList = listOf(
    airbnbTechTalk,
)

@Composable
fun Posts() {
    val path = Path.POSTS

    Navbar(path)
    PageContainer {
        PageHeader(path)
        // No double divider as posts will specify their top divider
        postsList.sorted().forEach {
            PostPreview(it)
        }
    }
    Footer()
}