package com.mobautoespresso.tests.adsPage

import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isEnabled
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.mobautoespresso.MainActivity
import com.mobautoespresso.pages.AdsPages
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LoadingAdsPage {

    private val ads = AdsPages()
    private val correctTitle = "Interstitial Ad Sample"

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun checkLoadingAdsPage() {
        ads.titleAdsPage.check(matches(isEnabled()))
    }

    @Test
    fun checkCorrectTitleAdsPage() {
        ads.titleAdsPage.check(matches(withText(correctTitle)))
    }

}
