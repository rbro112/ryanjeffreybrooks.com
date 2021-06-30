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
import com.rjb.models.Tag.Companion.articleTag
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

val airbnbGPPost = Post(
    titleText = "A Deep Dive into Airbnb’s Server-Driven UI System",
    date = Date(2021, 5, 29),
    description = "A deep dive into the server-driven UI system my team and I built at Airbnb called the Ghost Platform \uD83D\uDC7B.",
    link = ExternalLink(link = "https://medium.com/airbnb-engineering/a-deep-dive-into-airbnbs-server-driven-ui-system-842244c5f5"),
    tags = listOf(airbnbTag, articleTag),
    buttonText = "Read more →"
)

val postsList = listOf(
    airbnbTechTalk,
    airbnbGPPost,
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