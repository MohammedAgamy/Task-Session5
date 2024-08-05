fun main(args: Array<String>) {


    //normal fun tack one parameter
    drawingRightAngled(high = 5)
    //normal fun tack one parameter as optional
    drawingAnIsoscelesTriangle()
    //normal fun tack one parameter return Unit and used scope fun
    val pyramid = drawingAPyramid(high = 5)
    pyramid?.let {
        println(it)
    }
    //extension functions to counting vowels in string return as int value
    val counts = "Kotlin is awesome".countingVowelsInAString()
    println(counts)
    //Lambda Expressions
    reversingAString("Kotlin")
    //normal fun tack a parameter as string
    filteringFigitsFromAString("gusd3g23jhjh2223")
    //Higher-Order Functions ,inline fun and Lambda Expressions
    splittingAStringIntoWords("Kotlin is awesome") { text ->
        println(text)
    }
    //Anonymous Functions and Lambda Expressions
    removingSpacesFromAString("Kotlin is awesome")


}


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
    for (index in 1..high) {
        for (i in high downTo index) {
            print("  ")
        }
        for (item in 1..index * 2) {
            print(" ")
            print("*")
        }
        println()
    }
}


/* 3: Drawing a Pyramid
 Write a Kotlin program that draws a pyramid of stars with a height of 5.*/

fun drawingAPyramid(high: Int): Unit {
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
    for (i in this.lowercase()) {
        if (i == 'o' || i == 'e' || i == 'i' || i == 'a' || i == 'u') {
            count++

        }

    }
    return count
}

/* 5: Reversing a String
 Write a Kotlin program that reverses the string "Kotlin".*/

fun reversingAString(kotlinVal: String): () -> Unit = {
    println(kotlinVal.reversed())
}

/*6: Filtering Digits from a String
Write a Kotlin program that filters and prints only the digits from the string "K0t1l1n 2s 4w3s0m3".

*/

fun filteringFigitsFromAString(text: String) {
    val digit = text.filter {
        it.isDigit()
    }
    println(digit)
}


/* 7: Splitting a String into Words
 Write a Kotlin program that splits the string "Kotlin is a great language" into words and prints each word on a new line.*/

/*8: Counting Words in a String
Write a Kotlin program that counts the number of words in the string "Kotlin is a great language".*/

inline fun splittingAStringIntoWords(splitting: String, text: (String) -> Unit) {
    var count: Int? = null
    val sPilt = splitting.split(" ")
    for (item in sPilt) {
        text(item)
        count = (count ?: 0) + 1
    }

    println(count)
}


/*9: Removing Spaces from a String
Write a Kotlin program that removes all spaces from the string "Kotlin is fun" and prints the result.

*/

val removingSpacesFromAString = { funk: String ->
    funk.replace(" ", "")
}