
fun main(kotlinIsFun: Array<String>) {
    val math1 = Course(CourseName.MATH)
    val math2 = Course(CourseName.MATH)
    math1.grade = 3.0
    math2.grade = 2.0

    val chemistry1 = Course(CourseName.CHEMISTRY)
    val chemistry2 = Course(CourseName.CHEMISTRY)
    chemistry1.grade = 5.0
    chemistry2.grade = 6.0

    val english1 = Course(CourseName.ENGLISH)
    val english2 = Course(CourseName.ENGLISH)
    english1.grade = 2.0
    english2.grade = 1.0

    val student1 = Student("Schmittens",14)
    val student2 = Student("Marry",17)


    student1.addCourse(math1)
    student1.addCourse(chemistry1)
    student1.addCourse(english1)


    student2.addCourse(math2)
    student2.addCourse(chemistry2)
    student2.addCourse(english2)
    //student1.addCourse(math1) //invalid

    // test: hinzufügen von Schülern
    val studentClass  = StudentClass("10B")

    studentClass.addStudent(student1)
    studentClass.addStudent(student2)
    //studentClass.addStudent(student1)  //Student existiert bereits
    println(studentClass.getAmountOfStudentsWithLetter('S'))

    studentClass.printClassInfo()




}