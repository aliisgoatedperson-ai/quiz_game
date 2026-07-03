

fun main() {
    var Score = 0
    val Questions = listOf(
        Question(
            "What Is Kotlin", // Question 1
            listOf(
                "Programming Language" ,//Idx 0 // Correct Answer
                "Engine", // Idx 1 // Wrong
                "Cartoon", // Idx 2 // Wrong
                "Language", // Idx 3 // Wrong
            ),
            1, // Correct Answer
        ),
        Question(
            "Which Engine Is Used To Create Android Apps ",
            listOf(
                "Unreal Engine",
                "Android Studio",
                "Xcode",
                "Intellij",
            ),
            2,
        ),
        Question(
            "Which Language Is Used To Create Android Apps",
            listOf(
                "Flutter",
                "Swift" ,
                "Python" ,
                "None Of These",
            ),
            4
        ),
        Question(
            "Which Software Is Used To Create IOS Apps",
            listOf(
                "Android Studio",
                "Xcode",
                "Intellij",
                "None Of These",
            ),
            2,
        ),
        Question(
            "Which Engine Is Used To Make Game",
            listOf(
                "Unity",
                "Xcode",
                "1 and 4",
                "Unreal Engine",
            ),
            3
        )

    )

    for (q in Questions) {
        println(q.question)
        for (i in q.Options.indices) { // Indices Are Indexes
            println("${1+i} ${q.Options[i]}")
        }
        val Input = readLine()!!.toInt()

        if (Input == q.Answer) { // Checks If The Answer Is Correct
            println("Correct Answer !")
            Score += 1
        } else {
            println("Wrong Answer !")
            Score += 0
        }

    }
    println("Your Score Is $Score . You Did Very Well !")
}