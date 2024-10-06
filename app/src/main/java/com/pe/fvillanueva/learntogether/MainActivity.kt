package com.pe.fvillanueva.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pe.fvillanueva.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTogetherTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ListArticle(
                        title = stringResource(R.string.article_title),
                        intro = stringResource(R.string.article_intro),
                        body = stringResource(R.string.article_body)
                    )
                }
            }
        }
    }
}

@Composable
fun ListArticle(title: String, intro: String, body: String, modifier: Modifier = Modifier){
    val  image = painterResource(R.drawable.bg_compose_background)
    Box(modifier){
        Column (
            verticalArrangement = Arrangement.Center
        ){
            Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.FillWidth
            )
            Text(
                text = title,
                fontSize = 24.sp,
                modifier = Modifier
                    .padding(
                        start = 16.dp,
                        top = 16.dp,
                        bottom = 16.dp,
                        end = 16.dp
                    )

            )
            Text(
                text = intro,
                textAlign = TextAlign.Justify,
                modifier = Modifier
                    .padding(16.dp)
            )
            Text(
                text = body,
                textAlign = TextAlign.Justify,
                modifier = Modifier
                    .padding(16.dp)
            )
        }

    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LearnTogetherTheme {
        ListArticle(
            title = stringResource(R.string.article_title),
            intro = stringResource(R.string.article_intro),
            body = stringResource(R.string.article_body)
        )
    }
}