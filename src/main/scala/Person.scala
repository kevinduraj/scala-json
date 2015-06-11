/**
 * Created by kduraj on 6/11/15.
 */

// class Person(name: String, age: Int, lovesScala: Boolean)
class Person() {
  var name: String = ""
  var age: Double = 0.0
  var lovesScala: Boolean = false

  def readJson(): Unit = {

    val jsonStr = """{ "name" : "Kevin", "age" : 41, "lovesScala": true }"""
    val result = scala.util.parsing.json.JSON.parseFull(jsonStr)

    result match {

      case Some(e: Map[String, AnyVal]) => {

        println(e + "\n")
        e.foreach { pair =>
          println(pair._1 + ":" + pair._2)
        }
      }
      case None => println("Failed.")

    }
  }
}
