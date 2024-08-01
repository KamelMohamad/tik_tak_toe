package com.example.tik_tak_toe.view

import androidx.compose.ui.test.assertAll
import androidx.compose.ui.test.assertCountEquals
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onAllNodesWithTag
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class BoardViewTest {
    @get:Rule
    val testRule = createComposeRule()

    @Test
    fun givenBoardView_whenRendered_then9EmptyBoardCellsAreDisplayed() {
        testRule.setContent {
            BoardView()
        }
        testRule.onAllNodesWithTag("BoardCell").assertCountEquals(9)
        testRule.onAllNodesWithTag("BoardCell").assertAll(hasText(""))
    }
}