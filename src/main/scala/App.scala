/**
 * Created by kduraj on 6/11/15.
 */

object App {

  def main(args: Array[String]) {

    /*-------------------------------------*/
    println("Parse Person JSON ... ")
    val person = new Person
    person.readJson
    /*-------------------------------------*/
    val getUrl = new GetURL
    getUrl.crawl("http://nootrino.com")
    /*-------------------------------------*/
  }

}
