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
    val image = painterResource(id = R.drawable.love)
    val loveQuotes = arrayOf(
        "In your eyes, I find my home; in your heart, I find my peace; and in your soul, I find my forever.",
        "You’re the rhythm of my heartbeat, the light in my sky, and the reason my world spins.",
        "In a thousand lifetimes, I’d find you again and again, because you’re my beginning and my end.",
        "Love is not finding someone to live with; it’s finding someone you can’t live without.",
        "You’re my favorite place to go, when my mind searches for peace and my heart searches for love.",
        "The stars in your eyes shine brighter than any galaxy, guiding me to where love and eternity meet.",
        "If love is a language, then you’re the poetry I’ve been longing to read all my life.",
        "Every time I see you, my heart whispers softly, ‘Here is where I belong, forevermore.’",
        "I didn’t fall for you in a moment; I fell in love with every tiny thing you are, piece by piece.",
        "With you, love feels effortless, like breathing—natural, endless, and absolutely necessary.",
        "Your smile is the sunrise that brightens my day, and your embrace is the sunset where I rest.",
        "In this vast universe, our love is a secret constellation, glowing bright for us alone.",
        "I want to grow old with you, watching dreams turn to memories, and moments turn to forever.",
        "You’re the reason my walls came down, and my heart learned to trust, hope, and feel again.",
        "No measure of time with you will be enough, because every second is a lifetime of love.",
        "Your love is like a melody, playing softly in the background, making everything more beautiful.",
        "Our souls found each other like puzzle pieces, fitting perfectly where no one else ever could.",
        "You’re the calm in my chaos, the light in my darkness, and the love that keeps me going.",
        "I knew I loved you when I looked at you and saw my forever staring back at me.",
        "In your arms, I found my haven, and in your heart, I found the love I’ve been searching for."
    )

    fun randQuote(): String {
        val randomInt = Random.nextInt(0, 20)
        return loveQuotes[randomInt]
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFEECEE))
        ,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Image(
            painter = image,
            contentDescription = null
        )

        Text(
            text = randQuote(),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(20.dp)
        )

        Text(
            text = "From Arnold",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive,
            modifier = Modifier
                .padding(
                    top = 24.dp,
                    bottom = 8.dp
                )
        )
    }
}

@Composable


@Preview(showBackground = true)
@Composable
fun LovePreview() {
    ILoveYouTheme {
        ILoveYouApp()
    }
}