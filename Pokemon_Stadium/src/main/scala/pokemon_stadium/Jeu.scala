package pokemon_stadium

import pokemon_stadium.Main.{j1, j2}

class Jeu(joueur1: Joueur, joueur2: Joueur) {

  val alternance = new Alternance(joueur1, joueur2)

  joueur1.nom = "Jules"
  joueur2.nom = "Marine"

  joueur1.acheter(Pikachu, Dracofeu, Tortank)
  joueur2.acheter(Raichu, Dracofeu, Tortank)

  println("Début du Jeu")
  joueur1.lancerAttaque(AttaqueLanceFlamme, Dracofeu, Raichu)

  Pikachu.attaquer(AttaqueEclair, Dracofeu)
}
