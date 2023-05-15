

class Zoo(){

    val tierList = mutableListOf<Animal>()



    fun add(animal: Animal){
        tierList.add(animal)
    }
    fun remove(animal: Animal){
        tierList.remove(animal)
    }

    fun getTotalAdoptionMoney():Int {
        var count = 0.0
        for (i in tierList) {
            for (j in i.unlimitedAdoptions) {
                count += j.price
            }
        }
        for (i in tierList) {
            for (j in i.limitedAdoptions) {
                count += j.price
            }
        }
        return count.toInt()
    }

    fun getBirdsInZoo(): List<String> {
        val birdList = mutableListOf<String>()
        for (bird in tierList){
            if (bird is Parrot){
                birdList.add(bird.toString())
            }
            else if (bird is Owl){
                birdList.add(bird.toString())
            }
        }
        return birdList
    }


    fun getUnlimitedAdopters():List<String>{
        val x = mutableListOf<String>()
        for (i in tierList){
            for (j in i.unlimitedAdoptions){
                for (k in j.name)
                    if (j.name !in x) {
                        x.add(j.name)
                }
                x.sort()
            }
        }
        return x
    }

    fun getNumberOfGreetingParrots(words: List<String>): Int {
        var count = 0
        for (parrot in tierList) {
            if (parrot is Parrot) {
                for (knownWord in parrot.knownWords) {
                    if (words.contains(knownWord)) {
                        count++
                    }
                }
            }
        }
        return count
    }

    fun getBabies():MutableList<Animal>{
        val listeVonBabys = mutableListOf<Animal>()
        for(baby in tierList){
            if (baby.age <= 1 ){
            listeVonBabys.add(baby)
            }
        }
        return listeVonBabys
    }


}