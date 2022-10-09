import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable

fun main() {
    var count: Int by mutableStateOf(0)

    // DOMツリーを生成する
    renderComposable(rootElementId = "root") {
        Div({ style { padding(25.px) } }) {
            Input(InputType.Text)

            Span(
                attrs = { style { color(Color.blue) }}
            ) {
                Text("Hello, Kotlin")
            }

            Button(
                attrs = {
                    onClick { println("Button clicked") }
                }
            ) { Text("Button") }
        }
    }
}

