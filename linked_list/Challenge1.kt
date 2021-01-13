package algorithms_in_kotlin.linked_list

fun <T> LinkedList<T>.printInReverse() {
    this.nodeAt(0)?.printInReverse()
}

fun <T> Node<T>.printInReverse() {
    this.next?.printInReverse()

    if(this.next != null) {
        print(" -> ")
    }

    print(this.value.toString())
}