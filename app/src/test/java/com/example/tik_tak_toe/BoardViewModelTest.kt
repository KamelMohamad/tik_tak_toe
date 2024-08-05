package com.example.tik_tak_toe

import org.junit.Test

class BoardViewModelTest {
    @Test
    fun `cell at 0,0 empty with Player X returns X` () {
        val viewModel = BoardViewModel()

        viewModel.placeMark(0,0)
        asseertEquals(viewModel.PlayerX, viewModel.board.value[0][0])
    }
}