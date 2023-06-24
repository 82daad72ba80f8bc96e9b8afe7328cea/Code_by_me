import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*


class NumberTreeTest {

    @Test
    fun size() {
        var root:NumberTree = EmptyTree

        root = root.addSorted(12)
        root = root.addSorted(22)
        root = root.addSorted(15)
        root = root.addSorted(7)

        assertEquals(4, root.size())
    }

    @Test
    fun contains() {

        var root:NumberTree = EmptyTree

        root = root.addSorted(12)
        root = root.addSorted(22)
        root = root.addSorted(15)
        root = root.addSorted(7)

        assertTrue(root.contains(7))
        assertTrue(root.contains(12))
        assertTrue(root.contains(15))
        assertTrue(root.contains(22))
        assertFalse(root.contains(3))


    }

    @Test
    fun sum() {

        var root:NumberTree = EmptyTree

        root = root.addSorted(12)
        root = root.addSorted(22)
        root = root.addSorted(15)
        root = root.addSorted(7)

        assertEquals(56,root.sum())
    }

    @Test
    fun average() {

        var root:NumberTree = EmptyTree

        root = root.addSorted(12)
        root = root.addSorted(22)
        root = root.addSorted(15)
        root = root.addSorted(7)

        assertEquals(14.0,root.average())

        var emptyRoot : NumberTree = EmptyTree

        assertEquals(0.0, emptyRoot.average())


    }

    @Test
    fun addSorted() {

        var root:NumberTree = EmptyTree

        root = root.addSorted(12)
        root = root.addSorted(22)
        root = root.addSorted(15)
        root = root.addSorted(7)

        //gucken ob hinzugefügt also erstens hinzufügen dann kontrollieren
        root = root.addSorted(8)
        assertTrue(root.contains(8))
        assertEquals(5,root.size())

    }

    @Test
    fun processNode() {

       /* var root:NumberTree = EmptyTree

        root = root.addSorted(12)
        root = root.addSorted(22)
        root = root.addSorted(15)
        root = root.addSorted(7)*/

        val x = DataNode(12,left = DataNode(15, left = DataNode(7)), right = DataNode(22))

        //ist unser processnode am anfang unser ergebniss
      assertEquals(12,x.data )


    }

    @Test
    fun processPreOrder() {

       /* var root:NumberTree = EmptyTree

        root = root.addSorted(12)
        root = root.addSorted(22)
        root = root.addSorted(15)
        root = root.addSorted(7)*/

        val x = DataNode(12,left = DataNode(15, left = DataNode(7)), right = DataNode(22))

        assertEquals(println(x.data), x.processPreOrder())


    }

    @Test
    fun processPostOrder() {

        /*var root:NumberTree = EmptyTree

        root = root.addSorted(12)
        root = root.addSorted(22)
        root = root.addSorted(15)
        root = root.addSorted(7)*/
        val x = DataNode(12,left = DataNode(15, left = DataNode(7)), right = DataNode(22))

        assertEquals(println(x.data), x.processPostOrder())
    }

    @Test
    fun processInOrder() {

       /* var root:NumberTree = EmptyTree

        root = root.addSorted(12)
        root = root.addSorted(22)
        root = root.addSorted(15)
        root = root.addSorted(7)*/
        val x = DataNode(12,left = DataNode(15, left = DataNode(7)), right = DataNode(22))

        assertEquals(println(x.data), x.processInOrder())
    }
}