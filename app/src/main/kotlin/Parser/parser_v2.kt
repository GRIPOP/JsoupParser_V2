package org.example.app

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements

const val URL_SITE = "https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/"

fun main() {
    val doc: Document = Jsoup.connect(URL_SITE).get()
    val quotes: Elements = doc.select("article")

    quotes.forEach { println(it.text())}
}