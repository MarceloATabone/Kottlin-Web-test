import androidx.compose.runtime.Composable
import designsystem.AppButton
import designsystem.AppTextbutton
import kotlinx.browser.window
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.selectors.attr
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable
import style.AppTheme


@Composable
fun Layout(content: @Composable () -> Unit) {
    Div{
        content()
        Header {
            H1 {
                Text("Site Title")
            }
            Div(
                attrs = {
                    classes(AppTheme.subtitle)
                }
            ) {
                Text("Subtitle")
            }
        }
        Main {
            //Text("Main")
            renderComposable(rootElementId = "container") {

                Div {
                    AppButton("1", { window.alert(" oi ") })
                }
                Div {
                    AppTextbutton("1", "Button Text", { window.alert(" oi 2 ") })
                }
                Nav {

                }
            }
        }
        Footer {
            Text("Footer")
        }
    }
}

