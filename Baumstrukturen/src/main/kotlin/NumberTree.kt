import org.junit.jupiter.api.Assertions.*


sealed class  NumberTree{  //BAUM

    abstract fun size() : Int
    abstract fun contains(value : Int) : Boolean
    abstract fun sum() : Int
    abstract fun average():Double

    abstract fun addSorted(value : Int):NumberTree

    fun processNode(){
        when(this){
            is EmptyTree -> {}
            is DataNode -> {println(" ${this.data}")}
        }
    }

    abstract fun processPreOrder()
    abstract fun processPostOrder()
    abstract fun processInOrder()


}

object EmptyTree : NumberTree() {  //LEERER BAUM

    override fun size() :Int = 0
    override fun sum ():Int = 0
    override fun contains(value : Int) : Boolean = false
    override fun average():Double = 0.0

    override fun addSorted(value : Int):DataNode = DataNode(value)

    override fun processPreOrder(){ }
    override fun  processPostOrder(){}
    override fun  processInOrder(){}

}

class DataNode(val data:Int, private val left:NumberTree = EmptyTree, private val right:NumberTree = EmptyTree):NumberTree() {


    override fun size():Int = 1 + left.size() + right.size()

    override fun sum():Int = data + left.sum() + right.sum()

    override fun contains(value : Int): Boolean = data == value ||(value < data && left.contains(value)) ||(value > data && right.contains(value))

    override fun average(): Double {
        val sum:Double = data.toDouble() + left.sum() + right.sum()
        val size:Int = 1 + left.size() + right.size()
        return sum / size
    }

    override fun addSorted(value : Int):NumberTree = if(value < data) DataNode(data,left.addSorted(value) , right)
                                                    else  DataNode(data, left, right.addSorted(value))

    override fun processPreOrder(){
        processNode()
        left.processPreOrder()
        right.processPreOrder()
    }
    override fun processPostOrder(){
        left.processPostOrder()
        right.processPostOrder()
        processNode()
    }
    override fun  processInOrder(){
        left.processInOrder()
        processNode()
        right.processInOrder()
    }
}



fun main() {

/*val root : NumberTree = DataNode(5,DataNode(3, DataNode(2)),
    DataNode(4 ,DataNode(8,DataNode(10))))



    println("Die Summe vom Baum ist : ${root.sum()}")
    println("Der Baum enthält die 6 : ${root.contains(6)}")

    val anotherTree = DataNode(5,
        DataNode(11,DataNode(30),DataNode(4)),
        DataNode(8,DataNode(10)))

    */





    var root:NumberTree = EmptyTree

    root = root.addSorted(12)
    root = root.addSorted(22)
    root = root.addSorted(15)
    root = root.addSorted(7)



    //val anotherTree:Tree = root.addSorted(20)

    println("Baum : ${root.sum()}")
    println("Baum average : ${root.average()}")

println("process : ")
    root.processPreOrder()

    var yetAnotherTree : NumberTree = EmptyTree
    yetAnotherTree = yetAnotherTree.addSorted(7)
    yetAnotherTree = yetAnotherTree.addSorted(22)
    yetAnotherTree = yetAnotherTree.addSorted(15)
    yetAnotherTree = yetAnotherTree.addSorted(12)



    //yetAnotherTree.processPreOrder()
}