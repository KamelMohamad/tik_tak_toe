package com.example.tik_tak_toe.model

class Board {
    val rows : List<List<Any?>> = listOf(
        listOf(CellValue.EMPTY,CellValue.EMPTY,CellValue.EMPTY,),
        listOf(CellValue.EMPTY,CellValue.EMPTY,CellValue.EMPTY,),
        listOf(CellValue.EMPTY,CellValue.EMPTY,CellValue.EMPTY,),
    )
}

enum class CellValue {
    EMPTY,
    X,
    O
}