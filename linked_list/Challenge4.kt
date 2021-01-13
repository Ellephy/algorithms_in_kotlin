package algorithms_in_kotlin.linked_list

fun <T : Comparable<T>> LinkedList<T>.mergeSorted(otherList: LinkedList<T>): LinkedList<T> {
    if (this.isEmpty()) return otherList
    if (otherList.isEmpty()) return this

    val result = LinkedList<T>()

    var left = this.nodeAt(0)
    var right = otherList.nodeAt(0)

    // to compare and merge
    while (left != null && right != null) {
        if (left.value < right.value) {
            left = append(result, left)
        } else {
            right = append(result, right)
        }
    }

    // to arrange remaining items
    while (left != null) {
        left = append(result, left)
    }
    while (right != null) {
        right = append(result, right)
    }

    return result
}

private fun <T : Comparable<T>> append(list: LinkedList<T>, node: Node<T>): Node<T>? {
    list.append(node.value)
    return node.next
}
