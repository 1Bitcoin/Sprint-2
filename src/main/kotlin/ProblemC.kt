class ProblemC {

    fun main() {

        val n = readInt()
        val ratingsList = readListInt().sortedDescending()
        var countTasks = 0

        for (i in ratingsList.indices step 2) {
            countTasks += ratingsList[i] - ratingsList[i + 1]
        }
        println(countTasks)
    }
}