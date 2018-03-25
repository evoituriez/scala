package cirque

sealed trait Nourriture
class NourritureCarnivore extends Nourriture
class NourritureHerbivore extends Nourriture

sealed abstract class Animal(protected val nom: String, protected var dresse: Boolean = false) {

  protected var aFaim = false

  private[cirque] def manger(n: Nourriture): Unit = aFaim = false

  private[cirque] def faireLeShow: Unit = println("Je ne fais rien")

  private[cirque] def dresser(): Unit = {
    dresse = true
    println("je suis dressé")
  }

}

trait Carnivore extends Animal {
  private[cirque] def manger(n: NourritureCarnivore): Unit = {
    aFaim = false
    println("Nourriture : " + n)
  }
}

trait Herbivore extends Animal {
  private[cirque] def manger(n: NourritureHerbivore): Unit = {
    aFaim = false
    println("Nourriture : " + n)
  }
}

class Chien(n: String, d: Boolean) extends Animal(n, d) with Carnivore {
  def seDeplacer: String = "Je marche"

  override def faireLeShow: Unit = if (this.dresse && !this.aFaim) {
    println("Je danse")
    this.aFaim = true
  } else super.faireLeShow

  override private[cirque] def manger(n: NourritureCarnivore): Unit = {
    aFaim = false
  }
}

class Serpent(n: String, d: Boolean) extends Animal(n, d) with Carnivore {
  def seDeplacer: String = "Je glisse"

  override def faireLeShow: Unit = if (this.dresse && !this.aFaim) {
    println("Je mange des pizzas")
    this.aFaim = true
  } else super.faireLeShow

  override private[cirque] def manger(a: NourritureCarnivore): Unit = {
    aFaim = false
  }
}

class Poisson(n: String, d: Boolean) extends Animal(n, d) with Carnivore {
  def seDeplacer: String = "Je nage"

  override def faireLeShow: Unit = if (this.dresse && !this.aFaim) {
    println("Je saute")
    this.aFaim = true
  } else super.faireLeShow

  override private[cirque] def manger(a: NourritureCarnivore): Unit = {
    aFaim = false
    println("Nourriture : " + a)
  }
}

object Spot extends Animal("Spot", false) with Carnivore with Herbivore {

  override private[cirque] def manger(a: NourritureCarnivore): Unit = {
    aFaim = false
  }

  override private[cirque] def manger(n: NourritureHerbivore): Unit = {
    aFaim = false
  }
}

object Jojo {
  def dresser(a: Animal): Unit = a.dresser()

  def faireLeShow(a: Animal): Unit = a.faireLeShow

  def faireMangerC(carnivore: Animal, viande: NourritureCarnivore): Unit = carnivore.manger(viande: NourritureCarnivore)

  def faireMangerH(herbivore: Animal, salade: NourritureHerbivore): Unit = herbivore.manger(salade: NourritureHerbivore)
}

object Main extends App {

  val chien: Animal = new Chien("Bobby", false)
  val serpent: Animal = new Serpent("Garry", false)
  val salade: NourritureHerbivore = new NourritureHerbivore
  val viande: NourritureCarnivore = new NourritureCarnivore

  Jojo.dresser(chien)
  Jojo.faireLeShow(chien)
  Jojo.faireLeShow(chien)
  Jojo.faireLeShow(serpent)
  Jojo.faireMangerC(chien, viande)
}