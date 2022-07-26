import org.testng.annotations.Test;

public class SuperPriceTest extends DriverFactory {

    SuperPricePage superPricePage;

    @Test
    public void testFavouriteProduct() throws InterruptedException {
        superPricePage = new SuperPricePage(driver);
        superPricePage.SuperPrice();
    }
}
