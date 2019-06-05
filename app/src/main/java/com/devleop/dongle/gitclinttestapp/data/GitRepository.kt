package com.devleop.dongle.gitclinttestapp.data

data class GitRepository(
    val name: String,
    val description: String,
    val startCount : Int,
    val watchCount : Int,
    val forkCount : Int
)
