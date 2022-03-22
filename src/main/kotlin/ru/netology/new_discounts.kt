package ru.netology

var commission:Long = 0
fun getComission (thisTransfer:Long, system:String, isAction:Boolean): Long {
    when (system) {
        "VkPay" -> commission = 0
        "MasterCard", "Maestro" -> if(thisTransfer > 30000 && thisTransfer < 7500000 && isAction == true) commission = 0 else commission =
            (thisTransfer * 0.6 / 100 + 2000).toInt().toLong()
        "Visa", "МИР" -> if(thisTransfer * 0.75 / 100 > 3500) commission =
            (thisTransfer * 0.75 / 100).toInt().toLong() else commission = 3500
        }
    return commission
    }

fun main(){
    val thisTransfer: Long = 1000000
    val system: String = "Maestro"
    val isAction: Boolean = false
    val commission = getComission(thisTransfer, system, isAction)

    println("Ваш перевод составит: $thisTransfer" + " копеек")
    println("Ваша комиссия составит: $commission" + " копеек")
}