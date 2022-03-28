package com.mobautoespresso.pages

import androidx.test.espresso.Espresso
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isEnabled
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.mobautoespresso.R
import org.hamcrest.Matchers.not

class LoginPages {

    val loginButton: ViewInteraction = Espresso.onView(withId(R.id.login))
    val emailInput: ViewInteraction = Espresso.onView(withId(R.id.username))
    val passwordInput: ViewInteraction = Espresso.onView(withId(R.id.password))
    val containerLoginPage: ViewInteraction = Espresso.onView(withId(R.id.container))

    fun checkCorrectWorkButton() {
        emailInput.perform(click()).perform(typeText("login"))
        for (i in 0..3) {
            val text = "pass"
            passwordInput.perform(click()).perform(typeText(text.substring(0,i)))
            if (i < 3) {
                loginButton.check(matches(not(isEnabled())))
            } else {
                loginButton.check(matches(isEnabled()))
            }
        }
    }
}
