class Course (private val name: CourseName )
{
    var grade:Double? = null

    set(value) {
        if (value != null && value in 1.0..6.0) {
            field = value
        } else {
            throw Exception("Value is null or whatever")
        }
    }

    val passed:Boolean

    get() = grade != null && grade!! in 1.0 ..4.0

    override fun toString(): String {
        return "$name [$grade]"
    }

}


