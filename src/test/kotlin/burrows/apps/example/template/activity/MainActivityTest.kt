package burrows.apps.example.template.activity;

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricGradleTestRunner

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 * @since 0.0.1
 */
@RunWith(RobolectricGradleTestRunner::class)
class MainActivityTest {

    @Test
    fun testActivityShouldNotBeNull() {
        val mainActivity = Robolectric.setupActivity(MainActivity::class.java)

        assertThat(mainActivity).isNotNull()
    }
}
