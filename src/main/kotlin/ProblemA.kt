class ProblemA {

    fun main() {

        val t = readInt()
        var a: Int; var b: Int; var k: Int
        var totalPosition: Long

        for (count in 1..t) {
            val numbersJump = readListInt()
            a = numbersJump[0]; b = numbersJump[1]; k = numbersJump[2]
            totalPosition = 0

            for (i in 1..k) {
                when(i % 2 == 0) {
                    false -> totalPosition += a
                    true -> totalPosition -= b
                }
            }
            println(totalPosition)
        }
    }
}