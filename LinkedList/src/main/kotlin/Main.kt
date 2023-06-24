
fun main(args: Array<String>) {
  /*  val x = Linkedlist<String>()
    println(x.size())
    println(x.isEmpty())

    x.addFirst("Ye")
    x.addFirst("Ya")
    x.addSorted("anan")
    x.addLast("Bum")
    println(x.size())
    println(x.isEmpty())

    println(x.toString())

*/

    val fruits = LinkedList <String>()

    fruits.addFirst ("Birne")
    fruits.addFirst ("Apfel")
    println(fruits.toString()) // [Apfel , Birne ]

    fruits.addLast ("Erdbeere")
    println(fruits.toString()) // [Apfel , Birne , Erdbeere ]

    fruits.addSorted("Banane")
    println (fruits.toString()) // [Apfel , Banane , Birne , Erdbeere ]

    fruits.addSorted("Blaubeere")

    println (fruits.toString())

    val newList = LinkedList <String>()
    newList.addLast("Wassermelone")
    newList.addLast("Mango")
    fruits.appendList(newList)
    println (fruits.toString())

    fruits.insertDataAtIndex(3,"Hallo")
    println(fruits.toString())

    fruits.forEach { element -> println(element)}
   // fruits.forEach { element -> println(fruits.size())   }

    val found = fruits.firstWhere { element -> element.startsWith('B') }
    println("Found in List : $found")

    val found1 = fruits.firstWhere { element -> element.contains("beere") }
    println("Found in List : $found1")

    val found2 = fruits.firstWhere { element -> element.length > 10 }

    println("Found in List : $found2")

    println(fruits.toString())

    val geteilt = {x : zahl,y : zahl -> x/y }
    val r = geteilt(10,2)
    println(r)
}

typealias zahl = Int
