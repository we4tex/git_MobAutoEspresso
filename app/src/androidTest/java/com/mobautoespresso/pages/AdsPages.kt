package com.mobautoespresso.pages

import androidx.test.espresso.Espresso
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.mobautoespresso.R

class AdsPages {

    val titleAdsPage = Espresso.onView(withId(R.id.app_title))
    val levelAdsPage = Espresso.onView(withId(R.id.level))
    val buttonAdsPage = Espresso.onView(withId(R.id.next_level_button))

}