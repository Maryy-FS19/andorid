//პალინდრომეს პოვნა
fun main() {
    val originalString2_1 = "elepanth"
    val result2_1 = checkPalindrome(originalString2_1)
    println(result2_1)
    val originalString2_2 = "ele"
    val result2_2 = checkPalindrome(originalString2_2)
    println(result2_2)
}

fun checkPalindrome(originalString: String): Boolean{

    var reverseString = ""

    val len = originalString.length
    for (i in (len - 1) downTo 0) {
        reverseString = reverseString + originalString[i]
    }
    return originalString.equals(reverseString, ignoreCase = true)
}
