package com.example.tik_tak_toe

import com.example.tik_tak_toe.model.Board
import org.junit.Assert.*
import org.junit.Test

class GameViewModelTest{

    @Test
    fun `Given an instance of GameViewModel, the instance has a state property with empty 3 by 3 board`(){
        val expected = Board()
        val viewModel = GameViewModel()
        val board = viewModel.state.board
        for ( row in board)
    }
}