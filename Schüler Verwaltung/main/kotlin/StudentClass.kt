class StudentClass(private val id : String="") {

    private val students = mutableListOf<Student>()

    fun addStudent(student: Student) {
        if (student !in students) {
            students.add(student)
        } else {
            throw Exception("Der Student ${student.name} existiert bereits")
        }
    }


    fun printClassInfo(){
        println("                 Schüler der Klasse $id                   ")
        for (student in students){
                println("\u001B[93m◤―――――――――――――――――――――――――――――――――◥\u001B[0m")
                println("Name : ${student.name}")
                println("Alter : ${student.age}")
                println("Klasse : $id")
                println("Besuchte kurse : ${student.courses}")
                println("Durchschnitt: ${student.averageGrade()}")
                println("\u001B[93m◣―――――――――――――――――――――――――――――――――◢\u001B[0m")
        }
    }

    fun getAmountOfStudentsWithLetter(char:Char):Int{
        var count = 0
        for (student in students){
          if(student.name.startsWith(char)){
              count++
          }
        }
        return count
    }
}



