package com.sew.accessibility_application.activities

import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {
    companion object {
        const val EMAIL_ERROR = "Please enter a valid email ID"
        const val PASSWORD_ERROR = "Please enter password"
        const val FULL_NAME_ERROR = "Please enter your name"
        const val CONFIRM_PASSWORD_ERROR = "Please enter the confirmed password"
        const val PASSWORD_MISMATCH_ERROR = "Passwords do not match"

        const val PREFIX_FULL_NAME = "Your full name is "
        const val FULL_NAME = "Random Arora"

        const val EMAIL_ID = "random@domain.com"
        const val PREFIX_EMAIL_ID = "your email ID is "
    }
}