import androidx.compose.runtime.*
import designsystem.AppButton
import kotlinx.browser.window
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.css.selectors.className
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable
import style.AppTheme


fun main() {

    renderComposable(rootElementId = "root") {

        Style(AppTheme)
        Layout {}


    }
}