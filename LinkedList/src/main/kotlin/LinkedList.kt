class LinkedList <T:Comparable<T>> {

    data class Node<T>(var data: T, var next: Node<T>?)

    private var first: Node<T>? = null
    private var size = 0

    fun isEmpty(): Boolean {
        return first == null // O(1)
    }

    fun addFirst(newData: T) {
        first = Node(newData, first)
        size++ // O(1) konstante
    }

    fun addLast(newData: T) {
        var newNode = Node(newData, null)
        if (first == null) {
            first = newNode
        } else {
            var runPointer = first
            while (runPointer?.next != null) {
                runPointer = runPointer.next
            }
            runPointer?.next = newNode
        }
        size++  //O(n) da wir eine while schleife haben
    }

    fun addSorted(newData: T) {
        val newNode = Node(newData, null)

        if (first == null || newData <= first!!.data) {
            newNode.next = first
            first = newNode
        } else {
            var runPointer = first

            while (runPointer?.next != null && newData >= runPointer.next!!.data) {
                runPointer = runPointer.next
            }

            newNode.next = runPointer?.next
            runPointer?.next = newNode
        }
        size++       // O(n) wegen while schleife
    }

    fun clear() {
        first = null  // O(1) da konstant
        size = 0
    }

    fun sizeOf(): Int {
      /*  var count = 0  O(n) weil die while schleife n-mal durchlaufen wird
        var currentNode = first
        while (currentNode != null) {
            count++
            currentNode = currentNode.next
        }
        return count*/
        return  size // O(1)
    }

    override fun toString(): String {
        var out = ""
        var current = first
        out += "["
        while (current != null) { // O(n)

            out += current.data
            if (current.next == null) {
                out += "]"
            } else {
                out += ","
            }
            current = current.next
        }
        return out // O(n) weil wir n-mal durchlaufen
    }


    fun appendList(newList: LinkedList<T>) {
        if (newList.isEmpty()) {
            return
        }
        if (isEmpty()) {
            first = newList.first
            return
        }
        var current = first

        while (current?.next != null) { // O(n)
            current = current.next
        }

        current?.next = newList.first // *
        size += newList.size // O(n) weil wir n-mal durchlaufen
    }

    fun forEach(action : (T) -> Unit){
        var run = first
        var size = sizeOf() - 1
        println("Size of List is : $size")
        while (run?.next != null) {
            action(run.data)
            run = run.next  // ich denke  O(n)

        }
    }

    fun firstWhere(condition : (T)->Boolean) : T?{
    var run = first
        while (run?.next != null ){
           if (condition(run.data)){
                return run.data
            }
            run = run.next
        }
       return null  //Durch die while schleife ist es O(n) 
    }

    fun  insertDataAtIndex( index : Int,value : T ): T? {
        var currentPos = first
        var count = 0
        while (currentPos?.next != null ){
            if (count == index){
                var x  =  Node<T>(value,currentPos.next)
                currentPos.next  = x
            }
            currentPos = currentPos.next
            count++
        }
        return null
    }

   /* fun chunked( sizeToDivide : Int) : List<List<T>>{
        var currentPos = first
        var list : List<List<T>> = listOf(listOf<T>())

        return list
    }*/


}



/*
out += current.data
if (current.next == null) {
    out += "]"
} else {
    out += ","
}
current = current.next*/
