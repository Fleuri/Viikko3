

object Alkuluvut extends App{
  println("Anna luku")
  var luku = readInt
  var list = scala.collection.mutable.MutableList[Int]();
  var i = 2 // i += lower
  while(list.size < luku) { //while(i < upper)
    if (isPrime(i)) {  
      list += i   
       }
    i += 1
  }

  println(list);

def isPrime(n: Int) : Boolean = {

	var i = 2;
 
	if (n == 2) {
		return true;	
	}
 
	while (i < n) {
		if (n % i == 0) {
			 return false;
		}
		i+=1;
	}
 	return true;
}
 }