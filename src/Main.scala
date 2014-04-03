object Main extends App {
/*var a = new MinSek(2,11)
println(a)               // 2:11
a = new MinSek(2,-11)
println(a)               // 1:49
a = new MinSek(-2,11)
println(a)               // -1:49
a = new MinSek(-2,-11)
println(a)               // -2:11

a = new MinSek(66)
println(a)               // 1:06   Huom: sekunnit siis aina 2 numerolla!
a = new MinSek
println(a)               // 0:00
println(new MinSek(-21)) // -0:21
a = new MinSek(1,601)
println(a)               // 11:01

// infix operaatiot + ja - kahdelle MinSek-arvolle
val b = new MinSek(2,45)
val c = new MinSek(49)
println(b + " ja " + c)  // 2:45 ja 0:49
a = b + c
println(a)               // 3:34
println(b - c)           // 1:56
println(c - b)           // -1:56
println(b - c + a)       // 5:30
println(b - a)           // -0:49
a = new MinSek(2,11)
println(a)               // 2:11
println(a * 2)           // 4:22
println(a / 2)           // 1:05

println(a * -2)           // -4:22
println(a / -2)           // -1:05
println(-a)               // -2:11
println(-(-a))            // 2:11
*/
val d = new MinSek(3, 14)
val e = new MinSek(-3, -10)
println(d + " ja " + e)   // 3:14 ja -3:10
d += e
println(d)                // 0:04
d -= e
println(d)                // 3:14

// kasvattava ja vähentävä sijoitusoperatio MinSek-arvolle ja kokonaisluvulle
val f = new MinSek(3, 14)
println(f)                // 3:14
f += 61
println(f)                // 4:15
f -= 6000
println(f)                // -95:45

// kertova ja jakava sijoitusoperaatio MinSek-arvolle ja kokonaisluvulle
val g = new MinSek(3, 14)
println(g)                // 3:14
g *= 2
println(g)                // 6:28
g /= 3
println(g)                // 2:09

// onko seuraava vaarallista?
val h = new MinSek
val i = h
println(h + " ja " + i)   // 0:00 ja 0:00
h += 666
println(h + " ja " + i)   // 11:06 ja 11:06
}
