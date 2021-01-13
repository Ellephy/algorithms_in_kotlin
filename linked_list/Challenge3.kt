package algorithms_in_kotlin.linked_list

private fun <T> addInReverse(list: LinkedList<T>, node: Node<T>) {
    val next = node.next
    if (next != null) addInReverse(list, next)
    list.append(
        node.value
    )
}

fun <T> LinkedList<T>.reversed(): LinkedList<T> {
    val result = LinkedList<T>()
    val head = nodeAt(0)

    if (head != null) {
        addInReverse(result, head)
    }

    return result
}