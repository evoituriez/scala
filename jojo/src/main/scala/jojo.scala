class Chien(val nom: String, var dresse:Boolean = false) {
  def seDeplacer: String = "Je marche"
  def dresser: String = {
    dresse = true
    "Je m'appelle" + this.nom + "et j'ai été dressé"
  }
  def afficher: Unit = println("Je suis un chien, je m'appelle " + nom + " et " + seDeplacer)
}

class Serpent(val nom: String, var dresse:Boolean = false) {
  def seDeplacer: String = "Je glisse"
  def dresser: String = {
    dresse = true
    "Je m'appelle" + this.nom + "et j'ai été dressé"
  }
  def afficher: Unit = println("Je suis un serpent, je m'appelle " + nom + " et " + seDeplacer)
}

class Poisson(val nom: String, var dresse:Boolean = false) {
  def seDeplacer: String = "Je nage"
  def dresser: String = {
    dresse = true
    "Je m'appelle" + this.nom + "et j'ai été dressé"
  }
  def afficher: Unit = println("Je suis un poisson, je m'appelle " + nom + " et " + seDeplacer)
}

object Jojo {
  def dresser(a: Chien): String = a.dresser
  def dresser(a: Serpent): String = a.dresser
  def dresser(a: Poisson): String = a.dresser

  def main(args: Array[String]) = {
    val chien = new Chien("Bobby")
    val serpent = new Serpent("Tika")
    val poisson = new Poisson("Gustave")
    chien.afficher
    poisson.afficher
    Jojo.dresser(serpent)
    serpent.afficher

    type Multipliable = {def *(n: Double): Double}
    def fois4(x: Multipliable) = x * 4
    if (3.5 .isInstanceOf[Multipliable]) fois4(3.5 .asInstanceOf[Multipliable])
  }
}
"Hello world"