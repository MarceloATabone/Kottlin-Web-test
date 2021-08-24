import androidx.compose.runtime.*
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Style
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.renderComposable


fun main() {
    renderComposable(rootElementId = "head") {
        Head()
    }
    renderComposable(rootElementId = "root") {
        Body()
    }
    renderComposable(rootElementId = "foot") {
        Foot()
    }
}

@Composable
fun Head() {

    Div {

    }
}

@Composable
fun Body() {

    var greeting by remember { mutableStateOf(greet()) }
    Button(attrs = { onClick { greeting = greet() } }) {
        Text(greeting)
    }

}

@Composable
fun Foot() {



}

fun greet() = listOf("Hello", "Hallo", "Hola", "Servus").random()

