import io.github.bonigarcia.wdm.WebDriverManager
import org.openqa.selenium.By
import org.openqa.selenium.firefox.FirefoxDriver

fun main() {
    WebDriverManager.firefoxdriver().setup()

    val driver = FirefoxDriver()
    driver.get("https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/")

    Thread.sleep(5000)

    val quotes = driver.findElements(By.cssSelector("div[class*='sc-2aegk7-2']"))
    for (quote in quotes) {
        println(quote.text)
    }

    driver.quit()
}
