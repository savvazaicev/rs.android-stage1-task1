package subtask4

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val arrayOfOpBrackets: Array<Char> = arrayOf('<', '(', '[')
        val arrayOfEndBrakets: Array<Char> = arrayOf('>', ')', ']')
        var arr: Array<String> = emptyArray()
        for ((i, opBracket) in inputString.withIndex()) {
            var bracketIsMatches = false
            var indexOfBracket = 0
            for (bracketIndex in arrayOfOpBrackets.indices) {
                if (opBracket == arrayOfOpBrackets[bracketIndex]) {
                    bracketIsMatches = true
                    indexOfBracket = bracketIndex
                    break
                }
            }
            if (bracketIsMatches) {
                for (endBracketIndex in i until inputString.length) {
                    if (inputString[endBracketIndex] == arrayOfEndBrakets[indexOfBracket]) {
                        val substring = inputString.substring(i + 1, endBracketIndex)
                        var countOp = 0
                        var countEnd = 0
                        for (s in substring) {
                            when (s) {
                                arrayOfOpBrackets[indexOfBracket] -> countOp++
                                arrayOfEndBrakets[indexOfBracket] -> countEnd++
                            }
                        }
                        if (countOp == countEnd) {
                            arr += substring
                            break
                        }
                    }
                }
            }
        }
        return arr
    }
}
