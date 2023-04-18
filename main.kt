fun main() {
    println(twoSum(
        nums = intArrayOf(0, 3, -3, 4, -1),
        target = -1
    ).joinToString())
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    // Initialize map of remainders, where:
    // i-th key is (target - nums[i]) and i-th value is index of nums[i]
    val remaindersMap: MutableMap<Int, Int> = mutableMapOf()

    // Iterate through nums array
    var i = 0
    while (i < nums.size) {
        // Check if we found a solution
        val index = remaindersMap[nums[i]]?:-1
        if (index >= 0) {
            return intArrayOf(index, i)
        } 

        // Update remainders map
        remaindersMap.put(target - nums[i], i)

        // Go to next item in array
        i++
    }

    // If it gets here -> no solution found
    return intArrayOf()
}