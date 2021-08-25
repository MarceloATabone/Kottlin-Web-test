
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.selectors.CSSSelector

object AppCSSVariables {

    val layoutDicColor by variable<CSSColorValue>()
    val colCount by variable<StylePropertyNumber>()
    val horizontalLayout by variable<CSSUnitValue>()

}


object AppStylesheet : StyleSheet() {

    val layoutDiva by style {

    }

    val layoutDiv by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)
        height(100.percent)
        margin(0.px)
    }

    val headStyle by style {
        boxSizing("border-box")
        paddingBottom(96.px)
        paddingTop(1.px)
        backgroundColor(Color("#000"))
        color(Color("#fff"))

        textAlign("center")
        fontSize(35.px)
    }


}