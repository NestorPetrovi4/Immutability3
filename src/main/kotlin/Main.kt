fun main() {
    val regularCustomer = true
    val resultSum = 8_000
    val discountSum = 100
    val discountTax = 5
    val discountRegularTax = 1

    var sumPay = if (resultSum > 1000) resultSum - discountSum else resultSum
    sumPay = if (resultSum > 10_000) sumPay - (sumPay*discountTax)/100 else sumPay
    sumPay = if (resultSum > 1000 && regularCustomer) sumPay - (sumPay*discountRegularTax)/100 else sumPay

    println("Итоговая сумма к оплате с учетом скидок составляет $sumPay")

}