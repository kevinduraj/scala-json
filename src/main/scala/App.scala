/**
 * Created by kduraj on 6/11/15.
 */

import net.liftweb.json._

object App {
  implicit val formats = DefaultFormats // Brings in default date

  def main(args: Array[String]) {

    /*-------------------------------------*/
    val json1 = new ParseJSON1
    json1.readJson
    /*-------------------------------------*/
    val json2 = new ParseJSON2
    json2.lift_web()
    /*-------------------------------------*/
    //    val getUrl = new GetURL
    //    getUrl.crawl("http://nootrino.com")
    /*-------------------------------------*/

  }
}
