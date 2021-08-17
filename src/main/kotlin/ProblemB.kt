class ProblemB {

    fun main() {

        val t = readInt()
        var n: Int; var k: Int; var counter: Int
        var answerString: String

        for (count in 1..t) {
            val modelString = readListInt()
            n = modelString[0]; k = modelString[1]; counter = 0
            answerString = ""

            for (i in 1..n) {
                if (counter == k)
                    counter = 0

                answerString += 'a' + counter
                counter++
            }
            println(answerString)
        }
    }
}