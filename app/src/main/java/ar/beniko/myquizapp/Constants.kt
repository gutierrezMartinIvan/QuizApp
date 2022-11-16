package ar.beniko.myquizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> = createQuestions("What country does this flag belong to")

    private fun createQuestions(question: String): ArrayList<Question> {
        val questions = ArrayList<Question>()

        val que1 = Question(
            1, question, R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia",
            "Armenia", "Austria", 1
        )
        questions.add(que1)

        val que2 = Question(
            2, question, R.drawable.ic_flag_of_australia,
            "Brazil", "Australia",
            "Fiji", "Austria", 2
        )
        questions.add(que2)

        val que3 = Question(
            3, question, R.drawable.ic_flag_of_belgium,
            "India", "New Zealand",
            "Belgium", "Kuwat", 3
        )
        questions.add(que3)

        val que4 = Question(
            4, question, R.drawable.ic_flag_of_brazil,
            "Argentina", "Germany",
            "New Zealand", "Brazil", 4
        )
        questions.add(que4)

        val que5 = Question(
            5, question, R.drawable.ic_flag_of_denmark,
            "Denmark", "Germany",
            "Fiji", "Australia", 1
        )
        questions.add(que5)

        val que6 = Question(
            6, question, R.drawable.ic_flag_of_fiji,
            "Chile", "Peru",
            "Fiji", "Australia", 3
        )
        questions.add(que6)

        val que7 = Question(
            7, question, R.drawable.ic_flag_of_germany,
            "Russia", "Peru",
            "Germany", "Spain", 3
        )
        questions.add(que7)

        val que8 = Question(
            8, question, R.drawable.ic_flag_of_india,
            "India", "United States",
            "Denmark", "Paraguay", 1
        )
        questions.add(que8)

        val que9 = Question(
            9, question, R.drawable.ic_flag_of_kuwait,
            "India", "Belgium",
            "Germany", "Kuwait", 4
        )
        questions.add(que9)

        val que10 = Question(
            10, question, R.drawable.ic_flag_of_new_zealand,
            "Russia", "New Zealand",
            "Brazil", "Argentina", 2
        )
        questions.add(que10)

        return questions
    }
}