fun main() {
    // '1' Самый простой пример использования анонимной функции:
    /* println({
         val currentYear  = 2020
         "Welcome to SimVillage, Mayor! (copyright $currentYear)"
     }())*/


    /** '2' Объявление переменной "функционального типа".
     * Переменная, которая содержит анонимную функцию и может
     * передаваться по коду. В данном случае, показывает, что
     * компилятор может присвоить переменной любую функцию, которая не
     * принимает аргументов(пустые скобки) и возвращает значение типа String */

    /* val greetingFunction: () -> String = {
        val currentYear = 2020
        "Welcome to SimVillage, Mayor! (copyright $currentYear)"
    }
     println(greetingFunction())
    */

    // '3' Определение функциональных аргументов
    // и поддержка нескольких типов (String, Int):
   /* val greetingFunction: (String, Int) -> String = {playerName, numBuildings ->
        val currentYear = 2020
        println("Adding $numBuildings houses")
        "Welcome  to SimVillage, $playerName! (copyright $currentYear)"
    }

    println(greetingFunction("Adler",10))
    */

   /* // '4' Объявление функции, которая принимает функцию
    val greetingFunction = { playerName: String, numBuildings: Int ->
        val currentYear = 2020
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }

    runSimulation("Adler", greetingFunction)
}
// '4' Объявление функции, которая принимает функцию
fun runSimulation(playerName: String,
                  greetingFunction: (String, Int) -> String) {
    val numBuildings = (1..10).shuffled().last() //случайный генератор цифры
    println(greetingFunction(playerName,numBuildings))*/



}
