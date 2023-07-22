fun isBalanced(input: String): String {
    val stack = mutableListOf<Char>()
    val openingBrackets = "({["
    val closingBrackets = ")}]"
    val bracketPairs = mapOf(')' to '(', '}' to '{', ']' to '[')

    for (char in input) {
        if (char in openingBrackets) {
            stack.add(char)
        } else if (char in closingBrackets) {
            if (stack.isEmpty() || stack.removeAt(stack.size - 1) != bracketPairs[char]) {
                return "NO"
            }
        }
    }

    return if (stack.isEmpty()) "YES" else "NO"
}

fun main() {
    print("Masukkan input: ")
    val input = readLine()?.trim()

    if (input != null) {
        val result = isBalanced(input)
        println("Output: $result")
    }
}
