fun main() {
    // '1' Самый простой пример использования анонимной функции:
    /* println({
         val currentYear  = 2020
         "Welcome to SimVillage, Mayor! (copyright $currentYear)"
     }())*/


    /** '2' Объявление переменной функционального типа. Показывает, что
     * компилятор может присвоить переменной любую функцию, которая не
     * принимает аргументов(пустые скобки) и возвращает значение типа String */

    /* val greetingFunction: () -> String = {
        val currentYear = 2020
        "Welcome to SimVillage, Mayor! (copyright $currentYear)"
    }
     println(greetingFunction())*/


}