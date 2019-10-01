package examples.aaronhoskins.com.unittestingdemo;

import androidx.test.espresso.Espresso;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.filters.LargeTest;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.Espresso.*;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivitiyUITest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule
            = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testTextChange() {
        Espresso
                .onView(withId(R.id.etUserInput))
                .perform(typeText("Hello"));
        Espresso.onView(withId(R.id.btnProcessInput)).perform(click());
        Espresso
                .onView(withId(R.id.tvOutput))
                .check(matches(withText("Hello")))
;    }
}
