package subtask3

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String = (bill.filterIndexed { i, _ -> i != k }.sum() / 2).let { if (b == it) "Bon Appetit" else (b - it).toString() }
}
