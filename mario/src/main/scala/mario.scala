// Jeu Mario

class Personnage {
	//Vars
	var nom: String = "Héro"
	var pv: Int = 10
	var pieces: Int = 0

	//Methodes
	def sauter = println(this.nom + " a sauté !")
	
	def reSauter = println(this.nom + " a fait le grand saut !")

	def vaincreEnnemi(e: Ennemi) = println(this.nom + " a vaincu " + e.nom + " !")

	def entrerChateau = println(this.nom + " est entré dans le château")

	def vaincreBoss(b: Boss) = println(this.nom + " a vaincu " + b.nom + " !")

	def sauver(p: Princesse) = println(this.nom + " a sauvé " + p.nom + " !")

	//def gagnerArgent

	//def perdreArgent

	//def mourir = println("Vous avez perdu. Recommencer ?")
	//def donnerBisous(princesse: Princesse)
	//def donnerGifle(perso: Personnage)

	 // renvoie un Int entre 0 et 9 == (10 - 1)J

	}
	
	class Ennemi {
		var nom: String = "Ennemi"

		def battre(p: Personnage) = {
			println(nom + " a défoncé la gueule de " + p.nom)
			p.pv -= 1
		}
	}

	class Boss {
		var nom: String = "Boss"

		def battre(p: Personnage) = {
			println(nom + " a défoncé la gueule de " + p.nom)
			p.pv -= 1
		}
	}

	class Princesse {
		var nom: String = "Princesse"

		def donnerBisou(p: Personnage) = {
			println(nom + " a fait un bisou à " + p.nom)
			p.pv -= 1
		}

		def donnerGifle(p: Personnage) = {
			println(nom + " a donné une gifle à " + p.nom)
			p.pv -= 1
		}
	}

class Jeu {
	//vals
	val mario = new Personnage
	val bomba = new Ennemi
	val bowser = new Boss
	val peach = new Princesse
	val rand = new scala.util.Random

	//vars
	var gameOver = false

	//Methodes
	def chance(n: Int, m: Int) = {
		rand.nextInt(m) >= n
	}


	def commencerLeJeu = {
		mario.nom = "Mario"
		bomba.nom = "Bomba"
		bowser.nom = "Bowser"
		peach.nom = "Peach"

		for (i <- 1 to 10; if(!gameOver)) {
			
			if(this.chance(1,5)) {
				mario.sauter

				if(this.chance(1,3)) {
					mario.reSauter

					if (this.chance(1,4)) {
						mario.vaincreEnnemi(bomba)

						if (this.chance(3,10) || this.chance(3,10)) {
							mario.entrerChateau

							if (this.chance(1,2)) {
								mario.vaincreBoss(bowser)

								if (this.chance(1,3)) {
									peach.donnerBisou(mario)
									println("Bravo, vous avez terminé le jeu !")
								
								} else peach.donnerGifle(mario)
							
							} else bowser.battre(mario)

						} else println(mario.nom + " a été attrapé devant le château !")
					
					} else bomba.battre(mario)

				} else println(mario.nom + " est tombé dans le deuxième trou")

			} else println(mario.nom + " est tombé dans le premier trou")
			
			if (mario.pv == 0) {
				this.gameOver = true
				println("Vous avez perdu")
			}
		}
	}
}

/*object Main extends App {
	val j = new Jeu
	j.commencerLeJeu
}*/