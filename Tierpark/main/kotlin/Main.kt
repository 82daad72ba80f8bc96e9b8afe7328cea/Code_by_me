
fun main(args:Array<String>) {

    val dog1 = Dog(" Golden Retriever ", 6, " Anja ", " Fluffy ", true)
    val cat1 = Cat(" Britisch Kurzhaar ", 1, " Sascha ", " Lucy ")
    val bird1 = Bird(" Amsel ", 1, false)
    val owl1 = Owl(" Eule ", 5, true, listOf(" Maus ", " Maulwurf "))
    val parrot1 = Parrot(" Blaupapagei ", 1, false, listOf("Hallo", "Was geht", "Moin"))

       println(parrot1.makeSound ())

       println(owl1.hunts())
       println(owl1.flySilently())

       println(cat1.scratchFurniture())

       println(dog1.fetchToy())



    println("\n-------------------------------------\n-------------------------------------\n")


    val bird2 = Bird("Amsel", 1, false )

    val owl2 = Owl("Eule", 5, true , listOf ("Maus","Maulwurf") )

    val dog2 = Dog("Golden Retriever",6 , "Anja", "Emma",true )
    dog2.addAdoption(UnlimitedAdoption("Knuffi"))

    val cat2 = Cat("Britisch Kurzhaar",1,"Sascha","Lucy")
    cat2.addAdoption( LimitedAdoption (60) )
    cat2.addAdoption( UnlimitedAdoption ("Sandy"))

    val parrot2 = Parrot (" Blaupapagei ", 1, false ,listOf("Hallo", "GutenTag", "Ich mag Pizza", "Tschüß") )
    parrot2.addAdoption (UnlimitedAdoption("Mario"))

    val zoo = Zoo()
    zoo.add(dog2)
    zoo.add(cat2)
    zoo.add(bird2)
    zoo.add(owl2)
    zoo.add(parrot2)

    println (zoo.getTotalAdoptionMoney()) // 2300
    println (zoo.getBirdsInZoo()) // Bird , Owl , Parrot
    println (zoo.getUnlimitedAdopters()) // Sandy . Mario
    println (zoo.getNumberOfGreetingParrots(listOf(" Hallo "," Guten Tag "))) // 1
    println (zoo.getBabies()) // Cat , Bird , Parrot

}