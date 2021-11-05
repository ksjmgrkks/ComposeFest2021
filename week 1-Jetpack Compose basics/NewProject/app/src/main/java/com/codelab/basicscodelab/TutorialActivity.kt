package com.codelab.basicscodelab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codelab.basicscodelab.data.SampleData
import com.codelab.basicscodelab.ui.theme.ksjmgrkksTheme

class TutorialActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ksjmgrkksTheme {
                MyAppStart()
            }

        }
    }
}

data class Message(val chatName: String, val chatMessage: String)

@Composable
fun MessageCard(msg: Message) {

    // padding 값 설정하기
    Row(modifier = Modifier.padding(all = 8.dp)) {
        Image(
            painter = painterResource(R.drawable.profileimage),
            contentDescription = "Contact profile picture",
            modifier = Modifier
                // 이미지 사이즈를 70dp로 설정
                .size(55.dp)
                // 이미지를 원형으로 자르기(clip)
                .clip(CircleShape)
                .border(1.5.dp, MaterialTheme.colors.primary, CircleShape)
        )

        // Spacer 는 사이 공간을 설정하는 명령이다.
        Spacer(modifier = Modifier.width(10.dp))

        // We keep track if the message is expanded or not in this
        // variable
        var isExpanded by remember { mutableStateOf(false) }

        // We toggle the isExpanded variable when we click on this Column
        Column(modifier = Modifier.clickable { isExpanded = !isExpanded }) {
            Surface(color = MaterialTheme.colors.secondaryVariant) {
                Text(
                    text = msg.chatName,
                    color = MaterialTheme.colors.background,
                    style = MaterialTheme.typography.subtitle2
                )
            }

            Spacer(modifier = Modifier.height(4.dp))

            Surface(
                shape = MaterialTheme.shapes.medium,
                elevation = 1.dp,
            ) {
                Text(
                    text = msg.chatMessage,
                    modifier = Modifier.padding(all = 4.dp),
                    // If the message is expanded, we display all its content
                    // otherwise we only display the first line
                    maxLines = if (isExpanded) Int.MAX_VALUE else 3,
                    style = MaterialTheme.typography.body2
                )
            }
        }
    }
}

//@Preview(name = "Light Mode")
//@Preview(
//    uiMode = Configuration.UI_MODE_NIGHT_YES,
//    showBackground = true,
//    name = "Dark Mode"
//)
//@Composable
//fun PreviewMessageCard() {
//    BasicsCodelabTheme {
//        MessageCard(
//            msg = Message("Colleague", "Take a look at Jetpack Compose, it's great!")
//        )
//    }
//}

@Composable
private fun MyAppStart() {
    Conversation(SampleData.chatConversation)
}


@Composable
fun Conversation(messages: List<Message>) {
    LazyColumn {
        items(messages) { message ->
            MessageCard(message)
        }
    }
}

@Preview
@Composable
fun PreviewConversation() {
    ksjmgrkksTheme {
        MyAppStart()
    }
}