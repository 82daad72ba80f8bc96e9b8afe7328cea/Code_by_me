class Student  (val name : String ="", val age : Int = 0 )
{
    val courses = mutableListOf<Course>()

    fun addCourse(course: Course) {
        if (course !in courses) {
            this.courses += course
        } else {
            throw Exception("Du kannst nicht zweimal den selben Kurs besuchen")
        }
    }

    fun averageGrade(): Double {
        var sum = 0.0
        for (course in courses) {
            sum += course.grade ?: 0.0
        }
        return sum / courses.size
    }






}
