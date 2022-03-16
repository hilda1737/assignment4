fun main(){
   var y = arrayInt(arrayOf(5,8,9))
    println(y)


     var x=mixed(arrayOf(12.7F,12.77,67.8F,12.888,"hey",1))
println(x)
    var vowels=arrofcha(arrayOf('s','c','k','o','y','a','p','i'))
    println(vowels)


}

    fun arrayInt(numbers:Array<Int>) :Int{
    var product  = 1
        numbers.forEach { number ->

             product *= number

    }
    return product

}

fun mixed(digits:Array<Any>): Double {
    var sum = 0.0
    digits.forEach { digit ->

     if( digit is  Double|| digit is Float){
         sum += digit.toString().toDouble()

        }
}

return sum
}

  fun arrofcha(alpha:Array<Char>) :Int {
      var sum = 0
      alpha.forEach { Char ->
          if(Char=='a'||Char=='e'||Char=='i'||Char=='o'||Char=='u'){
              sum++
          }

      }
      return sum
  }