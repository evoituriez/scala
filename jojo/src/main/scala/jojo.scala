class Animal(val nom: String, var dresse:Boolean = false) {
  def dresser: String = {
    dresse = true
    "Je m'appelle" + this.nom + "et j'ai été dressé"
  }
  def afficher: Unit = println("Je suis un" this.nom ", je m'appelle " + nom)
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

  val serpent = new Serpent("Garry")
  val poisson = new Poisson("Mike")
  val chien = new Chien("Kim")

  type Dressable = {def dresser() = Unit}
  def dresser(a: Dressable) = a.dresser

  if (serpent.isInstanceOf[Jojo.Dressable])
    Jojo.dresser(serpent)
}

object Main extends App {

}