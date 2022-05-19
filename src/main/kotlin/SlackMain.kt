import com.slack.api.bolt.App
import com.slack.api.bolt.jetty.SlackAppServer
import com.slack.api.bolt.response.Response
import java.lang.System.getenv

fun main() {
    val app = App()
    app.command("/hello") { _, ctx ->
        print("hello!!!")
        Response.ok("world")
        ctx.ack("world")
    }
    SlackAppServer(app, getenv("PORT")?.toInt() ?: 8080)
        .start()
}
