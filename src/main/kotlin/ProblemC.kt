class ProblemC {

    fun main() {

        val n = readInt()
        val ratingsList = readListInt().sorted()
        var countTasks = 0

        for (i in ratingsList.indices step 2) {
            countTasks += ratingsList[i + 1] - ratingsList[i]
        }
        println(countTasks)
    }
}