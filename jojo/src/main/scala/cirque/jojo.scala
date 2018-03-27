package cirque

sealed trait Nourriture
class NourritureCarnivore extends Nourriture
class NourritureHerbivore extends Nourriture

sealed trait Animal {

  type N <: Nourriture
  protected val nom: String

  protected var dresse = false
  protected var aFaim = false

  private[cirque] def manger(n: N): Unit = {
    aFaim = false
    println("Nourriture : " + n)
  }

  private[cirque] def faireLeShow: Unit = println("Je ne fais rien")

  private[cirque] def dresser(): Unit = {
    dresse = true
    println("je suis dressé")
  }

}

sealed trait Carnivore extends Animal {
  override type N = NourritureCarnivore
}
sealed trait Herbivore extends Animal {
  override type N = NourritureHerbivore
}
sealed trait Omnivore extends Animal {
  override type N = Nourriture
}

class Chien(override val nom: String) extends Carnivore {

  def seDeplacer: String = "Je marche"

  override def faireLeShow: Unit = if (this.dresse && !this.aFaim) {
    println("Je danse")
    this.aFaim = true
  } else super.faireLeShow

}

class Serpent(override protected val nom: String) extends Carnivore {
  def seDeplacer: String = "Je glisse"

  override def faireLeShow: Unit = if (this.dresse && !this.aFaim) {
    println("Je mange des pizzas")
    this.aFaim = true
  } else super.faireLeShow

}

class Poisson(override protected val nom: String) extends Carnivore {
  def seDeplacer: String = "Je nage"

  override def faireLeShow: Unit = if (this.dresse && !this.aFaim) {
    println("Je saute")
    this.aFaim = true
  } else super.faireLeShow

}

object Spot extends Omnivore {
  override protected val nom: String = "Spot"
}

object Jojo {
  def dresser(a: Animal): Unit = a.dresser()

  def faireLeShow(a: Animal): Unit = a.faireLeShow

  def faireManger(animal: Omnivore, nourriture: Omnivore#N): Unit = animal.manger(nourriture)
  def faireManger(animal: Carnivore, nourriture: Carnivore#N): Unit = animal.manger(nourriture)
  def faireManger(animal: Herbivore, nourriture: Herbivore#N): Unit = animal.manger(nourriture)
}

object Main extends App {

  val chien: Chien = new Chien("Bobby")
  val serpent: Serpent = new Serpent("Garry")
  val salade: NourritureHerbivore = new NourritureHerbivore
  val viande: NourritureCarnivore = new NourritureCarnivore

  Jojo.dresser(chien)
  Jojo.faireLeShow(chien)
  Jojo.faireLeShow(chien)
  Jojo.faireLeShow(serpent)
  Jojo.dresser(Spot)
  Jojo.faireLeShow(Spot)
  Jojo.faireManger(Spot, viande)
  Jojo.faireManger(Spot, salade)
  Jojo.faireManger(chien, viande)

}