package com.example.retrofit_practice_project

data class ResponseItem(
    val districts: List<District>,
    val id: Int,
    val name: String
)