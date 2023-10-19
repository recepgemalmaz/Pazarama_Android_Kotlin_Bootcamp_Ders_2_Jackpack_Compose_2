package com.recepgemalmaz.pazarama_bootcamp_jackpack_compose_2

import android.content.Context
import android.media.Image
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.ImageBitmapConfig
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.recepgemalmaz.pazarama_bootcamp_jackpack_compose_2.ui.theme.Pazarama_Bootcamp_Jackpack_Compose_2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Pazarama_Bootcamp_Jackpack_Compose_2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScrenn()
                }
            }
        }
    }
}

@Composable
fun MainScrenn() {

    var context = LocalContext.current

    Column {
        Text(text = "Ders-2 Compose Ornekler", color = Color.Red, fontSize = 40.sp)

        Spacer(modifier = Modifier.padding(20.dp))

        Button(
            onClick =
            {
                var t: Toast = Toast.makeText(context, "Merhaba", Toast.LENGTH_SHORT)
                t.show()

            })
        {

            Column {
                //Text(text = "Deneme", color = Color.Yellow, fontSize = 20.sp)
                Image(
                    bitmap = ImageBitmap.imageResource(id = R.drawable.pig),
                    contentDescription = "Pig"
                )

                Text(text = "PIG", color = Color.Yellow, fontSize = 25.sp, modifier = Modifier.padding(70.dp,0.dp,0.dp,15.dp),
                    textAlign = TextAlign.Center)


            }




        }

    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Pazarama_Bootcamp_Jackpack_Compose_2Theme {
        MainScrenn()
    }
}