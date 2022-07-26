import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SuperPricePage extends DriverFactory {

    public SuperPricePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    /*
    Senaryo 2
    • Uygulama açılır.
    • Anasayfada Süper Fiyat, Süper Teklif’e tıklanır.
    • Süper Fiyat, Süper Teklif sayfasından bir ürüne gidilir.(Birden fazla görseli olan ürün seçilir.)
    • Ürün detayda ürünün görseline tıklanır ve yana doğru scroll edilir.
    • Görsel ekranı kapatılır.
    • Ürün detaydan favori butonuna basılır.
    • Açılan login sayfasından login olunur ve login olunduğu kontrol edilir.
    • Beğendiklerim sayfasına gidilip ürünün beğendiklerime eklendi görülür.
     */

    private final By clickSuperPrice = By.xpath("//body/div[@id='container']/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]");
    private final By superPriceSelectProduct = By.xpath("//a[@data-index='1']");
    private final By selectedProductClickImage = By.xpath("//img[contains(@title,'Xiaomi Mi Vacuum')]");
    private final By selectedProductScrollOne = By.xpath("//*[@id=\"productDetailsZoomCarousel\"]/div[2]/div[2]");
    private final By selectedProductScrollTwo = By.xpath("//*[@id=\"productDetailsZoomCarousel\"]/div[2]/div[2]");
    private final By selectedImageClose = By.xpath("//button[contains(text(),'Kapat')]");
    private final By clickFavouriteIcon = By.xpath("//div[contains(text(),'Beğen')]");
    String email = "hbtesting2@mailinator.com";
    String password = "Hbtesting123.";
    private final By loginWithEMail = By.xpath("//input[@id='txtUserName']");
    private final By loginOkey = By.xpath("//*[@id=\"btnLogin\"]");
    private final By enterPassword = By.xpath("//input[@id='txtPassword']");
    private final By loginButton = By.xpath("//button[@id='btnEmailSelect']");
    private final By favouriteProductTab = By.xpath("//a[contains(text(),'Beğendiklerim')]");



    public void SuperPrice() throws InterruptedException {
        js.executeScript("window.scrollTo(0,500)");
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickSuperPrice)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(superPriceSelectProduct)).click();
        js.executeScript("window.scrollTo(0,250)");
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectedProductClickImage)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectedProductScrollOne)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectedProductScrollTwo)).click();
        Thread.sleep(5000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectedImageClose)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickFavouriteIcon)).click();
        Thread.sleep(5000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginWithEMail)).sendKeys(email);
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginOkey)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterPassword)).sendKeys(password);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton)).click();
        //Thread.sleep(5000);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(favouriteProductTab)).click();
        //Thread.sleep(5000);
    }
}
