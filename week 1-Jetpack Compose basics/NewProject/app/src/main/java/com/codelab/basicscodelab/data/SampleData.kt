package com.codelab.basicscodelab.data

import com.codelab.basicscodelab.Message

object SampleData {
    // Sample conversation data
    val name = "김규성"
    val chatConversation = listOf(
        Message(
            name,
            "Jetpack Compose 코드랩 1주차 두근두근"
        ),
        Message(
            name,
            "List of Android versions:\n" +
                    "Android KitKat (API 19)\n" +
                    "Android Lollipop (API 21)\n" +
                    "Android Marshmallow (API 23)\n" +
                    "Android Nougat (API 24)\n" +
                    "Android Oreo (API 26)\n" +
                    "Android Pie (API 28)\n" +
                    "Android 10 (API 29)\n" +
                    "Android 11 (API 30)\n" +
                    "Android 12 (API 31)\n"
        ),
        Message(
            name,
            "자바만 하다가 코틀린을 하니까\n" +
                    "신선하고 재밌네요"
        ),
        Message(
            name,
            "Searching for alternatives to XML layouts..."
        ),
        Message(
            name,
            "Hey, take a look at Jetpack Compose, it's great!\n" +
                    "It's the Android's modern toolkit for building native UI." +
                    "It simplifies and accelerates UI development on Android." +
                    "Less code, powerful tools, and intuitive Kotlin APIs :)"
        ),
        Message(
            name,
            "It's available from API 21+ :)"
        ),
        Message(
            name,
            "Writing Kotlin for UI seems so natural, Compose where have you been all my life?"
        ),
        Message(
            name,
            "Android Studio next version's name is Arctic Fox"
        ),
        Message(
            name,
            "Android Studio Arctic Fox tooling for Compose is top notch ^_^"
        ),
        Message(
            name,
            "I didn't know you can now run the emulator directly from Android Studio"
        ),
        Message(
            name,
            "Compose Previews are great to check quickly how a composable layout looks like"
        ),
        Message(
            name,
            "Previews are also interactive after enabling the experimental setting"
        ),
        Message(
            name,
            "Have you tried writing build.gradle with KTS?"
        ),
    )
}