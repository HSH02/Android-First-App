package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greetingcard.ui.theme.GreetingCardTheme

// MainActivity 클래스는 앱의 진입점입니다.
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // 엣지 투 엣지 모드를 활성화합니다.
        setContent {
            GreetingCardTheme { // 앱의 테마를 설정합니다.
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android1",
                        //modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

// @Composable 어노테이션은 이 함수가 컴포저블 함수임을 나타냅니다.
// 컴포저블 함수는 UI를 정의하는 데 사용됩니다.
@Composable
fun Greeting(name: String) {
    Surface(color = Color.Magenta) { // 배경 색상을 설정합니다.
        Text(text = "Hi, my name is $name!", modifier = Modifier.padding(24.dp)) // 텍스트를 표시하고 패딩을 추가합니다.
    }
}

// @Preview 어노테이션은 이 함수가 미리보기용임을 나타냅니다.
// Android Studio에서 UI를 미리 볼 수 있습니다.
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GreetingCardTheme {
        Greeting("Meghan")
    }
}
