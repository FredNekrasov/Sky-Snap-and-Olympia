package com.fredprojects.core.ui

import android.content.Context
import android.widget.Toast
import androidx.fragment.app.Fragment

fun Context.displayMessage(message: String) = Toast.makeText(
    this, message, Toast.LENGTH_SHORT
).show()
fun Context.displayMessageById(messageId: Int) = displayMessage(getString(messageId))
private fun Fragment.fragmentTransaction() = requireActivity().supportFragmentManager.beginTransaction()
fun Fragment.replaceFragment(
    holderId: Int, fragment: Fragment
) = fragmentTransaction().replace(holderId, fragment).commit()
fun Fragment.addFragment(
    holderId: Int, fragment: Fragment
) = fragmentTransaction().add(holderId, fragment).commit()
fun Context.randItemFromArray(arrayId: Int): Int = resources.getStringArray(arrayId).indices.random()
fun Context.getItemFromArray(arrayId: Int): String = resources.getStringArray(arrayId)[randItemFromArray(arrayId)]