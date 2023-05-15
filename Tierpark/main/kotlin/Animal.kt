abstract class Animal (val species: String, val age: Int)
{
    abstract fun makeSound():String
    open fun addAdoption(unlimitedAdoption: UnlimitedAdoption){unlimitedAdoptions.add(unlimitedAdoption)}
    open fun addAdoption(limitedAdoption: LimitedAdoption){limitedAdoptions.add(limitedAdoption)}
    open var unlimitedAdoptions:MutableList<UnlimitedAdoption> = mutableListOf()
    open var limitedAdoptions:MutableList<LimitedAdoption> = mutableListOf()

}

open class Pet(species: String, age: Int, val owner: String, val name: String):Animal(species,age)
{
   override fun makeSound():String{
        return "$name sagt etwas."
    }
}

class Cat(species: String, age: Int, owner: String, name: String):Pet(species,age,owner,name)
{
    override fun makeSound():String{
       return "$name sagt etwas, Miauw"
    }
    fun scratchFurniture():String{
        return "$species, $name Kratzt an den Möbeln"
    }
}

class Dog(species: String, age: Int, owner: String, name: String, val wagsTail: Boolean):Pet(species,age,owner,name)
{
    override fun makeSound():String{
        return "$name sagt etwas, Wuff Wuff"
    }
    fun fetchToy():String{
        return if (wagsTail){
            "$name holt das Spielzeug zurück und Freut sich"
        }else{
            "$name holt das Spielzeug zurück und Freut sich nicht "
        }
    }
}

open class Bird(species: String, age: Int, val nocturnal: Boolean):Animal(species,age)
{
    override fun makeSound():String{
       return "$species singt oder zwitschert"
    }
}

class Parrot(species: String, age: Int, nocturnal: Boolean, val knownWords: List<String>
):Bird(species,age,nocturnal)
{
    override fun makeSound():String{
       return "$species ahmt folgende Wörter nach: ${knownWords.joinToString()}}"
    }
}

class Owl(species: String, age: Int, nocturnal: Boolean = true, private val prey: List<String>):Bird(species,age,nocturnal)
{
   override fun makeSound():String{
       return "$species sagt etwas,Guguk Guguk"
    }
    fun flySilently():String{
        return if (nocturnal){
          "$species fliegt lautlos"
        }else{
          "$species fliegt nicht lautlos"
        }
    }
    fun hunts():String{
        return "$species fliegt lautlos und jagt ${prey.joinToString(",")}"
    }
}