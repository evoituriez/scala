/*class Calculatrice {
	def somme2(x: Int, y: Int) : Int = x + y
	def somme3(x: Int, y: Int, z: Int) : Int = somme2(x, somme2(y, z))
	def somme(x: Int, y: Int, z: Int = 0) : Int = x + y + z
	def methode = {
		var x: Int = 5
		x += 2
		x *= 8
		x %= 3
		x
	}
}

val z = new */


/*class Zero {
	var msg: String = ""
	def envoyerMessage(newmsg: String, zero: Zero) = zero.msg = newmsg
	def lireMessage(): String = msg
}
{
	val mateo = new Zero
	val cam = new Zero
	mateo envoyerMessage("Bonjour !", cam)
	cam.lireMessage
}
*/

/*class Boucles {
	def boucleWhile {
	var x: Int = 3
	while (x < 6) {
		x += 1
		println(x)
	}
}
}
val b = new Boucles
b.boucleWhile*/

/*class Boucles {
	def boucleFor = for (i <- 1 to 6) println(i)
}

val b = new Boucles
b.boucleFor*/


class Diviseurs {
	def afficherDiviseurs(n: Int) = for {i <- 1 to n
										if (n % i == 0)} println(i)
	def bouclesImbriquees(n: Int) = for {
		i <- 1 to n
		j <- 1 to n
	} println(i + " " + j)
	def afficherMultiples(n: Int) = for {
		m <- 1 to (10 * n)
		if (m % n == 0)	} println(m)
	def f(n: Int) = for(i <- 0 to 10) println(i * n)
}

val d = new Diviseurs
//d.afficherDiviseurs(6)
//d.bouclesImbriquees(2)
d.afficherMultiples(2)
d.f(3)


















