package pokemon_stadium

import pokemon_stadium.Main.{j1, j2}

class Jeu(joueur1: Joueur, joueur2: Joueur) {

  val alternance = new Alternance(joueur1, joueur2)

  joueur1.nom = "Jules"
  joueur2.nom = "Marine"

  joueur1.acheter(Pikachu, Dracofeu, Tortank)
  joueur1.lancerAttaque(AttaqueLanceFlamme, Dracofeu, Raichu)

  println("Début du Jeu")
  println(AttaqueLanceFlamme.typename)

  println(AttaqueLanceFlamme.puissance)
  Pikachu.attaquer(AttaqueLanceFlamme, Dracofeu)
  println(Dracofeu.pv)
  alternance.alterner
}
