package com.example.recipeapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter

@Composable
fun CategoryDetailScreen(category: Category){

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.LightGray)
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = category.strCategory,
            modifier = Modifier.padding(top = 12.dp),
            textAlign = TextAlign.Center,
            fontSize = 32.sp
        )

        Image(painter = rememberAsyncImagePainter(category.strCategoryThumb),
            contentDescription = "${category.strCategory} Thumbail",
            modifier = Modifier
                .wrapContentSize()
                .aspectRatio(1f)
        )

        Text(text = category.strCategoryDescription,
            textAlign = TextAlign.Justify,
            fontSize = 22.sp,
            modifier = Modifier.verticalScroll(rememberScrollState()))
    }

}