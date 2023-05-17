package com.desperate.gromov_clo_bot.bot.handler

import com.desperate.gromov_clo_bot.bot.State
import com.desperate.gromov_clo_bot.model.User
import org.telegram.telegrambots.meta.api.methods.PartialBotApiMethod
import java.io.Serializable

interface Handler {
    fun handle(user: User, message: String) : List<PartialBotApiMethod<out Serializable>>

    fun operatedBotState() : State

    fun operatedCallBackQuery() : List<String>
}