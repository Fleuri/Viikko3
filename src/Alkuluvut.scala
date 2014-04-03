

object Alkuluvut extends App{
  

   println("Give number")
   var number = readInt();
   val list: List[Int] = calculate(number);
 println(list);

   def factorial(n: Int): Int = {
    if(n==0||n==1) {
      1;
    } else {
      n*factorial(n-1)
    }
  }
   
   def calculate(k: Int): List[Int]  = {
     var list = List[Int]();
     var n = 1;
     while(list.length < k) {
       var c = factorial(n)
       var prime = 2 + (2*c%(n+1))
       if (!list.contains(prime) && prime > 0) {
         list = list :+ prime;
       }
       n+=1
     }
     list
   }
 }