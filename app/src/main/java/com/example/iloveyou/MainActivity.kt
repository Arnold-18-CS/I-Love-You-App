package com.example.iloveyou

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.iloveyou.ui.theme.ILoveYouTheme
import com.example.iloveyou.ui.theme.LoveQuoteProvider
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ILoveYouTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    ILoveYouApp()
                }
            }
        }
    }
}

@Composable
fun ILoveYouApp() {
    val loveQuote = LoveQuoteProvider.getRandomQuotes()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFEECEE))
        ,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        LoveImage()
        LoveQuote(loveQuote)
        FromText()
    }
}

@Composable
fun LoveQuote(quote: String) {
    Text(
        text = quote,
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Cursive,
        modifier = Modifier
            .padding(20.dp)
    )
}

@Composable
fun FromText(){
    Text(
        text = "From Arnold",
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Cursive,
        modifier = Modifier
            .padding(20.dp)
    )
}

@Composable
fun LoveImage(){
    val image = painterResource(id = R.drawable.love)
    Image(
        painter = image,
        contentDescription = null
    )
}

@Preview(showBackground = true)
@Composable
fun LovePreview() {
    ILoveYouTheme {
        ILoveYouApp()
    }
}