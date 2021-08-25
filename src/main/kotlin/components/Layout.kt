import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text



@Composable
fun Layout(content: @Composable () -> Unit) {
    Div({


    }) {
        content()
    }
}

