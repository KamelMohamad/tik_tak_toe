package com.example.tik_tak_toe.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tik_tak_toe.R
import java.time.format.TextStyle

@Composable
fun EmployeeCard(name: String, role: String){
   Column(modifier = Modifier
       .aspectRatio(2f)
       .fillMaxWidth(0.75f)
       .background(color = Color.Yellow)
       .padding(24.dp)) {
        Row(modifier = Modifier
            .fillMaxHeight(0.5f)
            .fillMaxWidth(1f)){
            //Company Name
            Column(modifier = Modifier
                .fillMaxWidth(0.75f)
                .fillMaxHeight(1f)) {
               Text(text = "Nederlandse Spoorwegen", style = titleTextStyle)
            }
            //Company Logo
            Column {
                Image(painter = painterResource(id = R.drawable.logo_ns), contentDescription = "Ns logo test")
            }
        }
       //Employee Name
       Row(modifier = Modifier
           .fillMaxWidth()){
           Text(text = "Employee name: $name", style = normalTextStyle)
       }
       Spacer(modifier = Modifier.height(8.dp))
       //Employee Role
       Row(modifier = Modifier
           .fillMaxWidth()){
           Text(text = "Employee role: $role", style = normalTextStyle)
       }
   }
}
@Preview(name = "EmployeeCardPreview")
@Composable
fun PreviewEmployeeCard(){
    EmployeeCard(name = "Alexander", role = "DevOps")
}

val titleTextStyle = androidx.compose.ui.text.TextStyle(color = Color.Blue, fontSize = 24.sp, fontWeight = FontWeight.Bold)
val normalTextStyle = androidx.compose.ui.text.TextStyle(color = Color.Blue, fontSize = 16.sp, fontWeight = FontWeight.Normal)
