class Chien(val nom: String, var dresse:Boolean = false) {
  def seDeplacer = "Je marche"
  def dresser = {
    dresse = true
    "Je m'appelle" + this.nom + "et j'ai été dressé"
  }
  def afficher = println("Je suis un chien, je m'appelle " + nom + " et " + seDeplacer)
}

class Serpent(val nom: String, var dresse:Boolean = false) {
  def seDeplacer = "Je glisse"
  def dresser = {
    dresse = true
    "Je m'appelle" + this.nom + "et j'ai été dressé"
  }
  def afficher = println("Je suis un serpent, je m'appelle " + nom + " et " + seDeplacer)
}

class Poisson(val nom: String, var dresse:Boolean = false) {
  def seDeplacer = "Je nage"
  def dresser = {
    dresse = true
    "Je m'appelle" + this.nom + "et j'ai été dressé"
  }
  def afficher = println("Je suis un poisson, je m'appelle " + nom + " et " + seDeplacer)
}

object Jojo {
  def dresser(a: Chien) = a.dresser
  def dresser(a: Serpent) = a.dresser
  def dresser(a: Poisson) = a.dresser
}


def main(args: Array[String]) = {
  val chien = new Chien("Bobby")
  val serpent = new Serpent("Tika")
  val poisson = new Poisson("Gustave")
  chien.afficher
  poisson.afficher
  Jojo.dresser(serpent)
  serpent.afficher
}