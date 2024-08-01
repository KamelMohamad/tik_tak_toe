package com.example.tik_tak_toe.view

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tik_tak_toe.model.CellValue

@Composable
fun BoardView() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(1f)
    ) {
        BoardRow(modifier = Modifier
            .fillMaxWidth()
            .weight(1f))
        BoardRow(modifier = Modifier
            .fillMaxWidth()
            .weight(1f))
        BoardRow(modifier = Modifier
            .fillMaxWidth()
            .weight(1f))
    }
}

@Composable
private fun BoardRow(modifier: Modifier) {
    Row(
        modifier = modifier
    ) {
      BoardCell(modifier = Modifier.weight(1f).fillMaxHeight())
      BoardCell(modifier = Modifier.weight(1f).fillMaxHeight())
      BoardCell(modifier = Modifier.weight(1f).fillMaxHeight())
    }
}

@Composable
private fun BoardCell(modifier: Modifier){
    Column(
        modifier = modifier.border(4.dp, color = Color.Yellow)
    ) {

    }
}

@Preview
@Composable
fun PreviewBoard(){
    BoardView()
}
