fun main(args: Array<String>) {


    /* 1: Drawing a Right-Angled Triangle
            Write a Kotlin program that draws a right-angled triangle of stars with a height of 5.*/
    fun drawingRightAngled(high: Int) {
        for (index in 1..high) {
            for (item in 1..index) {
                print("*")
            }
            println(" ")
        }
    }

    /* Drawing an Isosceles Triangle
             Write a Kotlin program that draws an isosceles triangle of stars with a height of 5.*/


    fun drawingAnIsoscelesTriangle(high: Int = 5) {
        for (index in 1..5) {
            for (i in 5 downTo index) {
                print(" ")
            }
            for (item in 1..index * 2) {
                print(" ")
                print("*")
            }
            println(" ")
        }
    }


    /* 3: Drawing a Pyramid
     Write a Kotlin program that draws a pyramid of stars with a height of 5.*/

    fun drawingAPyramid(high: Int) {
        for (index in 1..high) {
            for (i in 1..high - index) {
                print(" ")
            }
            for (item in 1..(2 * index - 1)) {
                print("*")
            }

            println()
        }
    }


    /*
        4: Counting Vowels in a String
        Write a Kotlin program that counts the number of vowels (a, e, i, o, u) in the string "Kotlin is awesome".
    */

    fun String.countingVowelsInAString(): Int {
        var count = 0
        for (i in this) {
            if (i == 'o' || i == 'e' || i == 'i' || i == 'a' || i == 'u') {
                count++

            }

        }
        return count
    }

    /* 5: Reversing a String
     Write a Kotlin program that reverses the string "Kotlin".*/

    fun reversingAString() = { kotlinVal: String ->
        println(kotlinVal.reversed())
    }

    /*6: Filtering Digits from a String
    Write a Kotlin program that filters and prints only the digits from the string "K0t1l1n 2s 4w3s0m3".

    */

    fun filteringFigitsFromAString(text: String) {
        /*another way */
        val digit = text.filter {
            it.isDigit()
        }

        println(digit)
    }


    /* 7: Splitting a String into Words
     Write a Kotlin program that splits the string "Kotlin is a great language" into words and prints each word on a new line.*/

    /*8: Counting Words in a String
Write a Kotlin program that counts the number of words in the string "Kotlin is a great language".*/
    var count: Int? = null
    var splitting = "Kotlin is a great language"
    val sPilt = splitting.split(" ")
    for (item in sPilt) {
        println("word $item")
        count = (count ?: 0) + 1
    }

    println(count)
    println("===========================================================================")


    /*9: Removing Spaces from a String
    Write a Kotlin program that removes all spaces from the string "Kotlin is fun" and prints the result.

    */

    val removingSpacesFromAString = { funk: String ->
        funk.replace(" ", "")
    }

}



