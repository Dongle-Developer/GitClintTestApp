package com.devleop.dongle.gitclinttestapp.remote.model

data class Permissions(
    val admin: Boolean,
    val pull: Boolean,
    val push: Boolean
)