import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements

fun main() {
    val doc: Document = Jsoup.connect("https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/")
        .ignoreContentType(true)
        .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0 Safari/537.36")
        .get()
    val quotes: Elements = doc.select("div.sc-2aegk7-2.bzpNIu")
    println(quotes)


}