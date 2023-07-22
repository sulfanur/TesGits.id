fun denseRanking(scores: IntArray, gitsScores: IntArray): IntArray {
    val sortedScores = scores.distinct().sortedDescending()
    val ranksMap = mutableMapOf<Int, Int>()

    var rank = 1
    for (score in sortedScores) {
        ranksMap[score] = rank
        rank++
    }

    val gitsRanks = IntArray(gitsScores.size)
    for (i in gitsScores.indices) {
        val score = gitsScores[i]
        gitsRanks[i] = ranksMap.getOrElse(score) { sortedScores.size + 1 }
    }

    return gitsRanks
}

fun main() {
    print("Masukkan jumlah pemain: ")
    val numPlayers = readLine()?.toIntOrNull()

    if (numPlayers != null && numPlayers > 0) {
        print("Masukkan skor pemain (pisahkan dengan spasi): ")
        val scores = readLine()?.split(" ")?.mapNotNull { it.toIntOrNull() }?.toIntArray()

        if (scores != null && scores.size == numPlayers) {
            print("Masukkan jumlah permainan yang diikuti GITS: ")
            val numGames = readLine()?.toIntOrNull()

            if (numGames != null && numGames > 0) {
                print("Masukkan skor yang didapatkan GITS (pisahkan dengan spasi): ")
                val gitsScores = readLine()?.split(" ")?.mapNotNull { it.toIntOrNull() }?.toIntArray()

                if (gitsScores != null && gitsScores.size == numGames) {
                    val rankings = denseRanking(scores, gitsScores)
                    println("Output: ${rankings.joinToString(" ")}")
                } else {
                    println("Masukkan skor GITS dengan benar (jumlah sesuai dengan yang diminta).")
                }
            } else {
                println("Masukkan jumlah permainan GITS dengan benar (angka positif).")
            }
        } else {
            println("Masukkan skor pemain dengan benar (jumlah sesuai dengan yang diminta).")
        }
    } else {
        println("Masukkan jumlah pemain dengan benar (angka positif).")
    }
}
