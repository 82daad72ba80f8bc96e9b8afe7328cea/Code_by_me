interface Adoption {
    val days : Int
    val price : Double
    val benefits : List <String >
}

class LimitedAdoption(override val days: Int):Adoption {
    override val price: Double = days * 5.0
    override val benefits: List<String> =
        listOf("Besuchen des Tieres", "Füttern des Tieres")
}

class UnlimitedAdoption(val name : String):Adoption{
    override val days: Int = Int.MAX_VALUE
    override val price: Double = 1000.0
    override val benefits: List<String> =
        listOf("Streicheln der Tiere","Füttern und Besuchen","Gedenktafel mit dem Namen der Person am gehege")
}

