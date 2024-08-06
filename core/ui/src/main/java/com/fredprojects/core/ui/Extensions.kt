package com.fredprojects.core.ui

import android.content.Context
import android.widget.Toast

fun Context.displayMessage(message: String) = Toast.makeText(
    this, message, Toast.LENGTH_SHORT
).show()
fun Context.displayMessageById(messageId: Int) = Toast.makeText(
    this, getString(messageId), Toast.LENGTH_SHORT
).show()