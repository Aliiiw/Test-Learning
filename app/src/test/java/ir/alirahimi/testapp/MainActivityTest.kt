package ir.alirahimi.testapp



import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.junit.Assert.assertEquals

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [28]) // Specify the SDK version for Robolectric
class MainActivityTest {

    @Test
    fun testActivityTitle() {
        val activity = Robolectric.buildActivity(MainActivity::class.java).create().resume().get()
        assertEquals("My App", activity.title)
    }
}

