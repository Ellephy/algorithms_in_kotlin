package algorithms_in_kotlin.stack

import algorithms_in_kotlin.utils.example

fun main() {
    "using a stack" example {
        val stack = StackImpl<Int>().apply {
            push(1)
            push(2)
            push(3)
            push(4)
        }
        print(stack)

        val poppedElement = stack.pop()
        if (poppedElement != null) {
            println("\nPopped: $poppedElement\n")
        }
        print(stack)
    }
}