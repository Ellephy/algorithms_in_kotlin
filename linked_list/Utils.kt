package algorithms_in_kotlin.linked_list

infix fun String.example(function: () -> Unit) {
    println("---Example of $this---")
    function()
    println()
}