/**
 * Created by kduraj on 6/11/15.
 */
class ParseJSON2 {

  import net.liftweb.json._
  implicit val formats = DefaultFormats // Default date

  def lift_web(): Unit = {

    case class Person(name: String, address: Address, children: List[Child])
    case class Child(name: String, age: Int, dob: Option[java.util.Date])
    case class Address(street: String, city: String)


    val json = parse("""
         {
           "name": "Kevin Duraj",
               "address": {
               "street": "Main Street",
               "city": "Santa Monica"
              },
           "children": [
             {
               "name": "Mary",
               "age": 5
               "dob": "2005-04-04"
             },
             {
               "name": "Thomas",
               "age": 3
               "dob": "2007-19-04"
             }
           ]
         }
                     """)

    println(json.extract[Person])

    val person = json.extract[Person]
    println(person.address)
  }

}

