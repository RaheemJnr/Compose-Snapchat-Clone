package com.debanshu777.snapchatUIComposeClone.features.feature_stories.domain.model

import android.media.Image
import com.debanshu777.snapchatUIComposeClone.common.domain.model.User

data class FriendsStory(
    val userName: String,
    val stories: List<Story>,
    val storyCount:Int,
    val thumbnail: String
)
