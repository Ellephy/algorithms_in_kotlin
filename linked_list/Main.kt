package algorithms_in_kotlin.linked_list

fun main() {
    "creating and linking nodes" example {
        val node1 = Node(value = 1)
        val node2 = Node(value = 2)
        val node3 = Node(value = 3)

        node1.next = node2
        node2.next = node3

        println(node1)
    }

    "push" example {
        val list = LinkedList<Int>()
        list.push(3)
        list.push(2)
        list.push(1)

        println(list)
    }

    "fluent interface push" example {
        val list = LinkedList<Int>()
        list.push(3).push(2).push(1)

        println(list)
    }

    "append" example {
        val list = LinkedList<Int>()
        list.append(1)
        list.append(2)
        list.append(3)

        println(list)
    }

    "inserting at a particular index" example {
        val list = LinkedList<Int>()
        list.push(3).push(2).push(1)

        println("Before inserting: $list")

        var middleNode = list.nodeAt(1)!!
        for (i in 1..3) {
            middleNode = list.insert(-1 * i, middleNode)
        }

        println("After inserting: $list")
    }

    "pop" example {
        val list = LinkedList<Int>()
        list.push(3).push(2).push(1)

        println("Before popping: $list")

        val poppedValue = list.pop()

        println("After popping: $list")
        println("Popped value: $poppedValue")
    }

    "removing the last node" example {
        val list = LinkedList<Int>()
        list.push(3).push(2).push(1)

        println("Before removing last node: $list")

        val removedValue = list.removeLast()

        println("After removing last node: $list")
        println("Removed value: $removedValue")
    }

    "removing a node after a particular node" example {
        val list = LinkedList<Int>()
        list.push(3).push(2).push(1)

        println("Before removing at particular index: $list")

        val index = 1
        val node = list.nodeAt(index - 1)!!
        val removedValue = list.removeAfter(node)

        println("Before removing at particular index: $list")
        println("Removed value: $removedValue")
    }

    "printing double" example {
        val list = LinkedList<Int>()
        list.push(3).push(2).push(1)

        println("Before doubling: $list")

        for (item in list) {
            println("Double: ${2 * item}")
        }
    }

    "remove all elements" example {
        val list: MutableCollection<Int> = LinkedList()
        list.add(3)
        list.add(2)
        list.add(1)
        list.add(4)
        list.add(5)
        println(list)

        list.removeAll(listOf(3, 4, 6))
        println(list)
    }

    "print in reverse" example {
        val list = LinkedList<Int>()
        list.add(3)
        list.add(2)
        list.add(1)
        list.add(4)
        list.add(5)
        println(list)
        list.printInReverse()
    }

    "print middle" example {
        val list = LinkedList<Int>()
        list.add(3)
        list.add(2)
        list.add(0)
        list.add(5)
        println(list)
        println(list.getMiddle()?.value)
    }

    "reverse list" example {
        val list = LinkedList<Int>()
        list.add(3)
        list.add(2)
        list.add(1)
        list.add(4)
        list.add(5)
        println("Original: $list")
        println("Reversed: ${list.reversed()}")
    }

    "merge lists" example {
        val list = LinkedList<Int>()
        list.add(1)
        list.add(2)
        list.add(3)
        list.add(4)
        list.add(5)

        val other = LinkedList<Int>()
        other.add(-1)
        other.add(0)
        other.add(2)
        other.add(2)
        other.add(7)

        println("Left: $list")
        println("Right: $other")
        println("Merged: ${list.mergeSorted(other)}")
    }
}