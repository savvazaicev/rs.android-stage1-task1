package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var arr = sadArray
        repeat(arr.size - 2) { with(arr) { arr = filterIndexed { i, value -> i == 0 || i == size - 1 || get(i - 1) + get(i + 1) > value }.toIntArray() } }
        return arr
    }
}
