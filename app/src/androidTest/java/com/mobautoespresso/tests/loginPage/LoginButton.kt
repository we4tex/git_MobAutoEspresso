package com.mobautoespresso.tests.loginPage

import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.mobautoespresso.pages.LoginPages
import com.mobautoespresso.ui.login.LoginActivity
import org.hamcrest.Matchers.not
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LoginButton {

    private val lP = LoginPages()

    @get:Rule
    val activityRule = ActivityScenarioRule(LoginActivity::class.java)

    @Test
    fun checkLoginButtonIsDisplayed() {
        lP.loginButton.check(matches(isDisplayed()))
    }

    @Test
    fun checkLoginButtonIsUnable() {
        lP.loginButton.check(matches(not(isEnabled())))
    }

    @Test
    fun checkCorrectButtonIsEnabled() {
        lP.checkCorrectWorkButton()
    }
}
