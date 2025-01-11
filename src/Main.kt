fun main() {
// Задание 1
    val cardOne=BankCard("2165 5485 6854 6895",758, "1111")
    var booleanNext = true
    do{
        println("Введите значение:\n \t1 - Показать номер карты\n " +
                "\t2 - Показать код карты \n \t0 - Выход")
        val input = readln().toString()
        if (input =="0") {
            println("Вы вышли из программы.")
            booleanNext = false
            break
        } else if (input =="1") {
            println("Ваш номер карты: ${cardOne.numberCard}")
            println()
        } else if (input =="2"){
            booleanNext = cardOne.checkPass()
            println()
        }else{
            println("Запрос не понятен, попробуйте еще раз")
            booleanNext=true
            continue
        }
    }while (booleanNext)
    println("Всего доброго.")
//Задание 2
    println()
    var a=7
    a += 7
    println("a+7=$a")
    a -= 4
    println("a-4=$a")
    a *= 2
    println("a*2=$a")
    a %= 3
    println("Остаток от деления на 3=$a")
//Задание 3
    println()
    var number = 753
    var count = 1
    repeat(5){
        println("Результат$count: $number -> ${reversNum(number)}")
        number = (10..190).random()
        count++
    }
}
fun reversNum (aNum:Int):Int{
    val charArr=aNum.toString().toCharArray()
    val charTemp = charArr[0]
    charArr[0] = charArr[charArr.size-1]
    charArr[charArr.size-1] = charTemp
    return charArr.concatToString().toInt()
}