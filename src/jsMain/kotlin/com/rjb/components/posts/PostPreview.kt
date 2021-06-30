package com.rjb.components.posts

import androidx.compose.runtime.Composable
import com.rjb.components.DividerDoubleDotted
import com.rjb.models.Link
import com.rjb.models.Post
import com.rjb.models.Tag
import com.rjb.style.ColorStyles.bgButtonHover
import com.rjb.style.ColorStyles.textPrimary
import com.rjb.style.ColorStyles.textSecondary
import com.rjb.style.FlexStyles.alignSelfCenter
import com.rjb.style.FlexStyles.flex
import com.rjb.style.FlexStyles.justifySpaceBetween
import com.rjb.style.SizeStyles.mb2
import com.rjb.style.SizeStyles.mr6
import com.rjb.style.SizeStyles.mt1
import com.rjb.style.SizeStyles.mt3
import com.rjb.style.SizeStyles.my1
import com.rjb.style.SizeStyles.my3
import com.rjb.style.SizeStyles.my4
import com.rjb.style.SizeStyles.p1
import com.rjb.style.SizeStyles.pr1
import com.rjb.style.SizeStyles.py1
import com.rjb.style.SizeStyles.py2
import com.rjb.style.TextStyles.fontBold
import com.rjb.style.TextStyles.fontDisplay
import com.rjb.style.TextStyles.fontMono
import com.rjb.style.TextStyles.hoverUnderline
import com.rjb.style.TextStyles.text2Xl
import com.rjb.style.TextStyles.textBase
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

@Composable
fun PostPreview(post: Post) {

    DividerDoubleDotted()
    PostTitle(post)
    PostTags(post.tags)
    PostDescription(post.description)
    CTA(post.buttonText, post.link)
}

val postTitleClasses = listOf(
    fontDisplay,
    fontBold,
    textPrimary,
    text2Xl,
    mr6,
    py1,
    my1,
    bgButtonHover
)

@Composable
fun PostTitle(post: Post) {

    Div(attrs = {
        classes(flex, justifySpaceBetween, mt3)
    }) {
        post.link.toAnchor(post.titleText, postTitleClasses)

        Div(attrs = {
            classes(fontMono, textBase, textSecondary, alignSelfCenter)
        }) {
            Text(post.formattedDate)
        }
    }
}

@Composable
fun PostTags(tags: List<Tag>) {
    Div(attrs = {
        classes(fontMono, textBase, fontBold, mt1)
    }) {
        tags.forEach { Tag(it) }
    }
}

@Composable
fun Tag(tag: Tag) {
    Span(attrs = {
        classes(tag.styleClass, pr1)
    }) {
        Text("[${tag.text}]")
    }
}

@Composable
fun PostDescription(description: String) {
    Div(attrs = {
        classes(textPrimary, fontMono, textBase, my4)
    }) {
        Text(description)
    }
}

@Composable
fun CTA(
    text: String,
    link: Link
) {
    Div(attrs = {
        classes(mb2, py2)
    }) {
        link.toAnchor(
            text,
            listOf(
                fontMono,
                textBase,
                fontBold,
                textPrimary,
                hoverUnderline,
                p1,
                my3,
                bgButtonHover
            )
        )
    }
}