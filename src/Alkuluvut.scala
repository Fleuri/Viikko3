

object Alkuluvut extends App{
  println("Anna luku")
  var luku = readInt
  var list = List[Int](luku);
  var i = 2
  while(list.size < luku) {
    if (isPrime(i)) {
      list :+ i
    }
  }
  

def isPrime(n: Int) : Boolean = {

	var i = 2;
 
	if (n == 2) {
		 true;	
	}
 
	while (i < n) {
		if (n % i == 0) {
			 false;
		}
		i+=1;
	}
 
	 true;
}
 }