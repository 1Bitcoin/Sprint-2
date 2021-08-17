class ProblemD {

    fun main() {

        val t = readInt()
        var numClients: Int; var n: Int
        var maxProfit: Long; var currentProfit: Long

        for (count in 1..t) {
            n = readInt()
            val numbers = readListLong().sortedDescending()
            numClients = 1; maxProfit = 0

            for (i in numbers.indices) {
                currentProfit = numClients * numbers[i]
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit
                }
                numClients++
            }
            println(maxProfit)
        }
    }
}