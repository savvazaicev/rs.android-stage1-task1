package subtask5

import kotlin.math.max

class HighestPalindrome {

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        var countOfReplacments = 0
        var numOfIters = 0
        var str = StringBuilder(digitString)
        repeat(str.length / 2) {
            var firstDigit = Integer.parseInt(str[n / 2 - numOfIters - 1].toString())
            var secondDigit = Integer.parseInt(str[n / 2 + numOfIters].toString())
            var max = max(firstDigit, secondDigit).toString()
            if (firstDigit != secondDigit) {
                str.replace(n / 2 - numOfIters - 1, n / 2 - numOfIters, max)
                str.replace(n / 2 + numOfIters, n / 2 + numOfIters + 1, max)
                countOfReplacments++
            }
            numOfIters++
        }
        for (i in 0 until k - countOfReplacments) {
            str.replace(i, i + 1, "9")
            str.replace(n - i - 1, n - i, "9")
        }
        return if (k >= countOfReplacments) str.toString() else "-1"
    }
}