public class PerritoTest {
    @Test void appHasAGreeting() {
        Perrito classUnderTest = new Perrito();
        assertNotNull("app should have a greeting", classUnderTest.ladrar());
    }
}
