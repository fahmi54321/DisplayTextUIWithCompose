package com.android.displaytextuiwithcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicText
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.android.displaytextuiwithcompose.ui.theme.DisplayTextUIWithComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}


@Composable
fun TextUi(text:String) {
    Column() {
        val customerFont = Font(resId = R.font.aclonica)
        val customFontFamily = FontFamily(customerFont)

        BasicText(text = "Welcome", modifier = Modifier.padding(4.dp), style = MaterialTheme.typography.h2)
        BasicText(text = "Welcome", modifier = Modifier.padding(4.dp), style = MaterialTheme.typography.h2.copy(fontWeight = FontWeight.Bold))
        Spacer(modifier = Modifier.height(16.dp))
        BasicText(text = text, modifier = Modifier.padding(4.dp), style = MaterialTheme.typography.h4)
        BasicText(text = text, modifier = Modifier.padding(4.dp), style = TextStyle.Default.copy(color = Color.Red, fontSize = 30.sp))
        BasicText(text = text, modifier = Modifier.padding(4.dp), style = TextStyle.Default.copy(color = Color.Red, fontSize = 30.sp, fontFamily = customFontFamily))
        Text(text = text, modifier = Modifier.padding(4.dp), style = MaterialTheme.typography.h4)
        Text(text = text, modifier = Modifier.padding(4.dp), style = MaterialTheme.typography.h4.copy(color = Color.Green,fontSize = 40.sp, fontStyle = FontStyle.Italic))
    }
}

@Preview
@Composable
fun PreviewTextUi() {
    TextUi(text = "Welcome to Jetpack Compose")
}
