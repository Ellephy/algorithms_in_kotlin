package algorithms_in_kotlin.linked_list

class LinkedListIterator<T>(private val list: LinkedList<T>) : Iterator<T>, MutableIterator<T> {

    private var index = 0

    override fun hasNext(): Boolean {
        return index < list.size
    }

    private var lastNode: Node<T>? = null

    override fun next(): T {
        if (index >= list.size) throw IndexOutOfBoundsException()

        lastNode = if (index == 0) {
            list.nodeAt(0)
        } else {
            lastNode?.next
        }
        index++
        return lastNode!!.value
    }

    override fun remove() {
        if (index == 1) {
            list.pop()
        } else {
            val prevNode = list.nodeAt(index - 2) ?: return
            list.removeAfter(prevNode)
            lastNode = prevNode
        }
        index--
    }
}