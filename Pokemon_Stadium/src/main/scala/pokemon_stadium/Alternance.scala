package pokemon_stadium

class Alternance(joueur1: Joueur, joueur2: Joueur) {
  private var joueurActuel = joueur1
  def alterner = {
    if (joueurActuel == joueur1) {
      joueurActuel = joueur2
      joueur2
    } else {
      joueurActuel = joueur1
      joueur1
    }
  }
}
