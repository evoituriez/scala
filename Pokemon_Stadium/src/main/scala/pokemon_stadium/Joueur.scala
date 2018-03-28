package pokemon_stadium

class Joueur

class Alternance(val joueur1: Joueur, val joueur2: Joueur) {
  private var joueurActuel = joueur1
  def alterner = if (joueurActuel == joueur1) joueur2 else joueur1
  def joueur = joueurActuel
}
