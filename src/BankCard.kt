class BankCard(val numberCard:String,private val cardCode:Int,
               private val passCard:String) {

    var pass = ""
        set(value) {
            field=when{
                value == passCard ->  value
                else -> "false"
            }
        }

    fun checkPass ():Boolean{
        var booleanNext=true
        println("Для вывода кода карты введите пароль:")
        var countPass=3
        while (countPass-- > 0) {
            pass = readln()
            if (pass !="false"){
                println("Код вашей карты: $cardCode")
                countPass =0
                booleanNext=true
            }else{
                println("Пароль не верный")
                println("Попробуйте еще раз ввести пароль, осталось попыток: $countPass")
                booleanNext=false
                if (countPass==0) println("Извините, карта заблокирована")
            }
        }
        return booleanNext
    }
}