package ru.mq.service

import org.springframework.stereotype.Component
import ru.mq.logger

@Component
class MessageServiceImpl : MessageService {

    private val log by logger()

    //Do whatever you want with message and send result back,
    //if you need it can be some data class or custom model
    override suspend fun doWork(message: String): String {
        log.info("{}", "Message is: $message")
        return "response"
    }
}