class Animal(val nom: String, var dresse: Boolean = false) {
  def dresser: String = {
    dresse = true
    "Je m'appelle" + this.nom + "et j'ai été dressé"
  }
  def afficher: Unit = println("Je suis un animal, je m'appelle " + nom)
}

class Chien(n: String, d: Boolean) extends Animal(n, d) {
  def seDeplacer: String = "Je marcher"
}

class Serpent(n: String, d: Boolean) extends Animal(n, d) {
  def seDeplacer: String = "Je glisse"
}

class Poisson(n: String, d: Boolean) extends Animal(n, d) {
  def seDeplacer: String = "Je nage"
}

object Jojo {
  def dresser(a: Animal): String = a.dresser
}

object Main extends App {
  val chien: Animal = new Chien("Bobby")
  val serpent : Animal = new Serpent("Garry")

  Jojo.dresser(chien)
  Jojo.dresser(serpent)
}