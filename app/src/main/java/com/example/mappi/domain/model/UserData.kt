package com.example.mappi.domain.model

data class UserData(
    val userId: String,
    val userName: String?,
    val email: String?,
    val profilePictureUrl: String?,
    val posts: List<String> = emptyList(),
    var requestStatus: RequestStatus = RequestStatus.NONE
)
