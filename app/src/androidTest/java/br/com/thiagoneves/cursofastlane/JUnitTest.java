package br.com.thiagoneves.cursofastlane;

import android.support.test.rule.ActivityTestRule;

import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import tools.fastlane.screengrab.Screengrab;
import tools.fastlane.screengrab.UiAutomatorScreenshotStrategy;
import tools.fastlane.screengrab.locale.LocaleTestRule;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.pressBack;
import static android.support.test.espresso.matcher.ViewMatchers.isRoot;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(JUnit4.class)
public class JUnitTest {

    @ClassRule
    public static final LocaleTestRule localeTestRule = new LocaleTestRule();

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @BeforeClass
    public static void beforeAll() {
        Screengrab.setDefaultScreenshotStrategy(new UiAutomatorScreenshotStrategy());
    }

    @Test
    public void testTakeScreenshots() {

        Screengrab.screenshot("MainActivity");

        onView(withId(R.id.button)).perform(click());
        Screengrab.screenshot("ActivityTelaUm");
        onView(isRoot()).perform(pressBack());

        onView(withId(R.id.button2)).perform(click());
        Screengrab.screenshot("ActivityCalculo");
        onView(isRoot()).perform(pressBack());

        onView(withId(R.id.button3)).perform(click());
        Screengrab.screenshot("ActivityTexto");
        onView(isRoot()).perform(pressBack());

        onView(withId(R.id.button4)).perform(click());
        Screengrab.screenshot("ActivityUltima");
        onView(isRoot()).perform(pressBack());

    }

}
