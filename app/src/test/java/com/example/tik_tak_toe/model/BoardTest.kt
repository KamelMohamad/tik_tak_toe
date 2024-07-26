package com.example.tik_tak_toe.model

import org.junit.Assert.*

import org.junit.Before
import org.junit.Test

class BoardTest {

    @Before
    fun setUp() {
    }

    @Test
    fun `when we create a instance of a board the board has 3 * 3 cells`(){
        val expectedRowCount  = 3
        val expectedColumnCount = 3
        val board = Board()
        assertEquals(expectedRowCount,board.rows.size)
        for ( row in board.rows){
            assertEquals(expectedColumnCount,row.size)
        }
    }
}