package com.qingniu.testjitpack

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.qingniu.testjitpack.ui.theme.TestJitpackTheme
import com.qingniu.toastlibrary.ToastUtil
import com.yl.pack.YLPacker

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestJitpackTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }

        Log.e("hyrrr",YLPacker.unpack("FBB1DE0772AAAA738225399D07A53873CF6785E0F5D4FCF5A56D2981F5398A19"))
        ToastUtil.toast(this)
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TestJitpackTheme {
        Greeting("Android")
    }
}