package com.sew.accessibility_application.activities

import android.os.Bundle
import com.sew.accessibility_application.R
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        imgBackButton.setOnClickListener {
            finish()
        }
        tvFullName.text = FULL_NAME
        tvFullName.contentDescription = PREFIX_FULL_NAME + FULL_NAME

        tvEmail.text = EMAIL_ID
        tvEmail.contentDescription = PREFIX_EMAIL_ID + EMAIL_ID
    }
}
