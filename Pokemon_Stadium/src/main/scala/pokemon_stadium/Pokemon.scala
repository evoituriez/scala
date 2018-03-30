package pokemon_stadium

abstract protected class Pokemon(val nom: String, var pv_max: Double) extends Type with Attaque {
  var pv: Double = this.pv_max
  var nb_attaque: Int = 2
  var aobjet: Boolean = false
  //var objet: Objet = "Baie"
  var hasAttaqued: Boolean = false

  private val random = scala.util.Random

  def attaquer(a: Attaque, p: Pokemon): Unit = {
    var hasAttacked: Boolean = false
    val hasChance: Boolean = random.nextInt(99) <= a.precision
    val pokeHasAttackType: Boolean = a.typename == typename

    if (hasChance) {
      if (pokeHasAttackType) {
        p.pv -= a.puissance * 1.5
        println(nom + " a attaqué !")
      }
      else {
        p.pv -= a.puissance
        println(nom + " a attaqué !")
      }
    }
    else {
      println(nom + " a manqué sa cible !")
    }
  }
}

object Pikachu extends Pokemon("Pikachu", 100) with Elec with Attaque

object Dracofeu extends Pokemon("Dracofeu", 150) with Feu with Attaque

object Tortank extends Pokemon("Tortank", 200) with Eau with Attaque

object Raichu extends Pokemon("Pikachu", 150) with Elec with Attaque
