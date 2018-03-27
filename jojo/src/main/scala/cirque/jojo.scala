package cirque

abstract class Nourriture
class NourritureCarnivore extends Nourriture
class NourritureHerbivore extends Nourriture

abstract class Animal(protected val nom: String, protected var dresse: Boolean = false) {

  protected var aFaim = false

  private[cirque] def faireLeShow: Unit = println("Je ne fais rien")

  private[cirque] def dresser: Unit = {
    dresse = true
    println("Je m'appelle " + this.nom + " et j'ai été dressé")
  }
}

trait Carnivore extends Animal {
  def manger(n: NourritureCarnivore): Unit = {
    aFaim = false
    println("Nourriture : " + n)
  }
}

trait Herbivore extends Animal {
  def manger(n: NourritureHerbivore): Unit = {
    aFaim = false
    println("Nourriture : " + n)
  }
}

trait Omnivore extends Herbivore with Carnivore

class Chien(n: String, d: Boolean) extends Animal(n, d) with Carnivore {
  def seDeplacer: String = "Je marche"

  override def faireLeShow: Unit = if (this.dresse && !this.aFaim) {
    println("Je danse")
    this.aFaim = true
  } else super.faireLeShow

  override def manger(a: NourritureCarnivore): Unit = {
    aFaim = false
    println("Nourriture : " + a)
  }
}

class Serpent(n: String, d: Boolean) extends Animal(n, d) with Carnivore {
  def seDeplacer: String = "Je glisse"

  override def faireLeShow: Unit = if (this.dresse && !this.aFaim) {
    println("Je mange des pizzas")
    this.aFaim = true
  } else super.faireLeShow

  override def manger(a: NourritureCarnivore): Unit = {
    aFaim = false
    println("Nourriture : " + a)
  }
}

class Poisson(n: String, d: Boolean) extends Animal(n, d) with Carnivore {
  def seDeplacer: String = "Je nage"

  override def faireLeShow: Unit = if (this.dresse && !this.aFaim) {
    println("Je saute")
    this.aFaim = true
  } else super.faireLeShow

  override def manger(a: NourritureCarnivore): Unit = {
    aFaim = false
    println("Nourriture : " + a)
  }
}

object Spot extends Animal("Spot") with Omnivore

object Jojo {
  def dresser(a: Animal): Unit = a.dresser

  def faireLeShow(a: Animal): Unit = a.faireLeShow

  def faireMangerC(carnivore: Carnivore, viande: NourritureCarnivore): Unit = carnivore.manger(viande: NourritureCarnivore)

  def faireMangerH(herbivore: Herbivore, salade: NourritureHerbivore): Unit = herbivore.manger(salade: NourritureHerbivore)
}


object Main extends App {
  val chien: Chien = new Chien("Bobby", false)
  val serpent: Serpent = new Serpent("Garry", false)
  val salade: NourritureHerbivore = new NourritureHerbivore
  val viande: NourritureCarnivore = new NourritureCarnivore

  Jojo.dresser(chien)
  Jojo.faireLeShow(chien)
  Jojo.faireLeShow(chien)
  Jojo.faireLeShow(serpent)
  Jojo.faireMangerC(chien, viande)
  Jojo.faireLeShow(chien)
}