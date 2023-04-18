fun main() {
    println(twoSum(
        nums = intArrayOf(0, 3, -3, 4, -1),
        target = -1
    ).joinToString())
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    // Initialize list of remainders, where:
    // remainders[i] = target - nums[i]
    val remainders: MutableList<Int> = mutableListOf()

    // Iterate through nums array
    var i = 0
    while (i < nums.size) {
        // Check if we found a solution
        val index = remainders.indexOf(nums[i])
        if (index >= 0) {
            return intArrayOf(index, i)
        } 

        // Add new item to remainders
        remainders.add(target - nums[i])

        // Go to next item in array
        i++
    }

    // If it gets here -> no solution found
    return intArrayOf()
}