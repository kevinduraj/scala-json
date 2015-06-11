/**
 * Created by kduraj on 6/11/15.
 */
class GetURL {

  def crawl(url: String) {

    println("Parsing JSON: ")
    val jsonString = scala.io.Source.fromURL(url).mkString
    println(jsonString)
  }
}
