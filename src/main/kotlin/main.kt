import androidx.compose.runtime.*
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.dom.Section
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.renderComposable


fun main() {

    renderComposable(rootElementId = "root") {

        Style(AppStylesheet)
        Layout {
            Header()
        }

    }

}



@Composable
fun Header() {
    Section(attrs = {
        classes(AppStylesheet.headStyle)
    }) {
        Text("Oi Cido")
    }
}

@Composable
fun Body() {


}

@Composable
fun Foot() {


}

