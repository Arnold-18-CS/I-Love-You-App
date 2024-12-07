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
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.iloveyou.ui.theme.ILoveYouTheme
import com.example.iloveyou.ui.theme.LoveQuoteProvider

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
    var loveQuote = remember { mutableStateOf(LoveQuoteProvider.getRandomQuotes()) }

    // Function to reload content
    fun reloadContent() {
        loveQuote.value = LoveQuoteProvider.getRandomQuotes()
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFEECEE)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        LoveImage()
        LoveQuote(loveQuote.value)
        FromText()
        ReloadButton { reloadContent() }
    }
}

@Composable
fun ReloadButton(onReload: () -> Unit) {
    Button(
        onClick = onReload,
        colors = buttonColors(Color(0xFF4C494F)),
        modifier = Modifier
            .padding(30.dp)
    ){
        Text("More Love", fontSize = 18.sp, fontWeight = FontWeight.Bold)
    }
}

@Composable
fun LoveImage(){

    val loveImages = listOf(
        R.drawable.love,
        R.drawable.love1,
        R.drawable.love2,
        R.drawable.love3,
    )

    val image = painterResource(id = loveImages.random())
    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier
            .padding(20.dp)
            .size(300.dp)

    )
}

@Composable
fun LoveQuote(quote: String) {
    val cuteFont = FontFamily(
        Font(R.font.custom_font, FontWeight.Normal)
    )
    Text(
        text = quote,
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = cuteFont,
        lineHeight = 40.sp,
        letterSpacing = 2.sp,
        modifier = Modifier
            .size(300.dp)
            .padding(horizontal = 20.dp)
            .padding(bottom = 16.dp, top = 40.dp)
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

@Preview(showBackground = true)
@Composable
fun LovePreview() {
    ILoveYouTheme {
        ILoveYouApp()
    }
}