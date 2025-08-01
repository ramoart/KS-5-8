import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import javax.lang.model.util.Elements


fun main() {
    val doc: Document = Jsoup.connect("https://en.wikipedia.org/").get()
    println(doc.title())
    val newsHeadLines: org.jsoup.select.Elements = doc.select("#mp-itn b a")
    println(newsHeadLines)
}

