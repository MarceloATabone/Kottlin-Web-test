package designsystem

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Text
import style.AppTheme


@Composable
fun AppButton(
    id: String,
    onClick: () -> Unit = {},
    content: @Composable () -> Unit = {}
) {
    Button(attrs = {
        classes(AppTheme.buttonStyle)
        id(id)
        onClick{ onClick.invoke() }
    }){
        content.invoke()
    }
}

@Composable
fun AppTextbutton(
    id: String,
    text: String,
    onClick: () -> Unit = {}
){
    AppButton(id,onClick){
        Text(text)
    }
}






