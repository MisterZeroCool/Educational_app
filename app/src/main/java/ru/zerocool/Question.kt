package ru.zerocool

data class Question(
    val problem: String,
    val answer: String,
    val operator1: String,
    val operator2: String,
    val operator3: String,
    val operator4: String,
    var selectedOption: String
)
