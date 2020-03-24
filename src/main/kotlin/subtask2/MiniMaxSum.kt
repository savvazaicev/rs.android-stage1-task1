package subtask2

class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray) = with(input) {intArrayOf(sum() - max()!!, sum() - min()!!)}
}
