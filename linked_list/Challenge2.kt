package algorithms_in_kotlin.linked_list

// Runner Technique
fun <T> LinkedList<T>.getMiddle(): Node<T>? {
    var slow = nodeAt(0)
    var fast = nodeAt(0)

    while(fast != null) {
        fast = fast.next
        if(fast != null) {
            fast = fast.next
            slow = slow?.next
        }
    }
    return slow
}