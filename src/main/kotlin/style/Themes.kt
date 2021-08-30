package style

import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.selectors.CSSSelector


object AppTheme : StyleSheet() {


    private val primaryColor = Color("#4BD326")
    private val primaryGradient = rgba(0, 0, 0, 0.25)
    private val primaryTextColor = Color("#FFFFFF")
    private val secondaryTextColor = Color("#000000")

    val mainColor by variable<CSSColorValue>()
    val colorGradient by variable<CSSColorValue>()
    val textColor by variable<CSSColorValue>()
    val secTextColor by variable<CSSColorValue>()


    val buttonStyle by style {
        background("var(--mainColor)")
        color(secTextColor.value())
        padding(15.px, 32.px)
        textAlign("center")
        textDecoration("none")
        display(DisplayStyle("inline-block"))
        fontSize(16.px)
    }

    val subtitle by style {
        property(
            "padding",
            "0.5px , 1px"
        )
        property(
            "background",
            "linear-gradient(to top, ${colorGradient.value()}, ${colorGradient.value()}) var(--mainColor)"
        )
        property(
            "color",
            "var(--textColor)"
        )
    }

    init {
        "header" style {
            property(
                "text-align",
                "center"
            )
        }
        "main" style {
            property(
                "padding",
                "1rem"
            )
            property(
                "flex",
                "1"
            )
        }
        "body, html" style {
            property(
                "height",
                "100%"
            )
        }
        "body" style {
            property(
                "display",
                "flex"
            )
            property(
                "flex-direction",
                "column"
            )
            property(
                "font-family",
                "system-ui,-apple-system,BlinkMacSystemFont,Segoe UI,Roboto,Oxygen,Ubuntu,Cantarell,Droid Sans,Helvetica Neue,Arial,sans-serif",
            )
        }
        "h1" style {
            property(
                "background",
                "var(--mainColor)"
            )
            property(
                "margin",
                "0"
            )
            property(
                "padding",
                "1rem"
            )
            property(
                "color",
                "var(--textColor)"
            )
        }
        "footer" style {
            property(
                "color",
                "var(--textColor)"
            )
            property(
                "position",
                "fixed"
            )
            property(
                "left",
                "0"
            )
            property(
                "bottom",
                "0"
            )
            property(
                "width",
                "100%"
            )
            property(
                "text-align",
                "center"
            )
            property(
                "padding",
                "1rem"
            )
            property(
                "background",
                "var(--mainColor)"
            )
        }
        "*" style {
            property(
                "margin",
                "0"
            )
        }
        CSSSelector.Universal style {
            mainColor(primaryColor)
            colorGradient(primaryGradient)
            textColor(primaryTextColor)
            secTextColor(secondaryTextColor)
        }
    }
}
