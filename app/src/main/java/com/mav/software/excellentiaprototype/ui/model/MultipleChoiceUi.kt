package com.mav.software.excellentiaprototype.ui.model

data class MultipleChoiceUi(
    val question: String,
    val choices: List<String>,
    val correctAnswer: String,
    val thumbnail: Int? = null //va a ser un id resource si es que necesitamos una imagen
)
