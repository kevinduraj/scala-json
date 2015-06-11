/**
 * Created by kduraj on 6/11/15.
 */

class ParseJSON1() {

  class Person(var name: String, var age: Double, var lovesScala: Boolean)
//  var name: String = ""
//  var age: Double = 0.0
//  var lovesScala: Boolean = false

  def readJson(): Unit = {

    val person = new Person("",0,false)
    val jsonStr = """{ "name" : "Kevin", "age" : 41, "lovesScala": true }"""
    val result = scala.util.parsing.json.JSON.parseFull(jsonStr)

    result match {

      case Some(e: Map[String, Any]) => {

        println(e + "\n")
        e.foreach { pair =>
          println(pair._1 + ":" + pair._2)

          if(pair._1 == "name")
                person.name = pair._2.toString
          else if (pair._1 == "age")
                person.age = pair._2.asInstanceOf[Double]
          else if (pair._1 == "lovesScala")
                person.lovesScala = pair._2.asInstanceOf[Boolean]
        }
      }
      case None => println("Failed.")

    }

    printObject(person)
  }

  def printObject(person: Person): Unit = {

    println("\n--------------------------------")
    println(s"name       = ${person.name}")
    println(s"age        = ${person.age}")
    println(s"lovesScala = ${person.lovesScala}")
    println("--------------------------------")

  }
}
