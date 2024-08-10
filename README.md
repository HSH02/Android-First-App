# Android-First-App
https://developer.android.com/get-started/overview?hl=ko

1. MainActivity 클래스:
ComponentActivity를 상속받아 앱의 진입점 역할을 합니다.
onCreate 메서드에서 enableEdgeToEdge를 호출하여 엣지 투 엣지 모드를 활성화합니다.
setContent 블록 내에서 GreetingCardTheme을 사용하여 앱의 테마를 설정하고, Scaffold를 사용하여 기본 레이아웃 구조를 정의합니다.

3. Greeting 함수:
@Composable 어노테이션이 붙어 있어 컴포저블 함수임을 나타냅니다.
Surface 컴포저블을 사용하여 배경 색상을 설정합니다.
Text 컴포저블을 사용하여 텍스트를 표시하고, Modifier.padding을 사용하여 텍스트 주위에 패딩을 추가합니다.
*Composable 함수는 Jetpack Compose로 사용자 인터페이스를 만들기 위해 사용하는 특수한 코틀린 함수

5. GreetingPreview 함수:
@Preview 어노테이션이 붙어 있어 Android Studio에서 UI를 미리 볼 수 있습니다.
GreetingCardTheme을 사용하여 테마를 설정하고, Greeting 함수를 호출하여 미리보기를 제공합니다.
