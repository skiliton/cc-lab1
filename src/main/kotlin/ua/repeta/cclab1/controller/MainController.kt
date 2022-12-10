package ua.repeta.cclab1.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController {

    @GetMapping("/")
    fun index() : List<Message> = listOf(
        Message("Hello world!")
    )

    data class Message(val text: String)
}
