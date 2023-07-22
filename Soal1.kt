fun a000124(n: Int): String {
    var result = ""
    var current = 0
    for (i in 1..n) {
        current += i
        result += "$current-"
    }
    return result.removeSuffix("-")
}

fun main() {
    print("Masukkan nilai n: ")
    val n = readLine()?.toIntOrNull()
    if (n != null && n > 0) {
        val output = a000124(n)
        println("Output: $output")
    } else {
        println("Masukkan n dengan benar (angka positif).")
    }
}
