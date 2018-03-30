package pokemon_stadium

abstract protected class Pokemon(val nom: String, var pv_max: Double) extends Type with Attaque {
  var pv: Double = this.pv_max
  var nb_attaque: Int = 2
  var aobjet: Boolean = false
  //var objet: Objet = "Baie"

  private val random = scala.util.Random

  def attaquer(a: Attaque, p: Pokemon): Unit = {

    val chance: Int = 100 / a.precision - 1
    val hasChance: Boolean = random.nextInt(chance) != 0
    val pokeHasAttackType: Boolean = a.typename == typename

    if (hasChance) {
      if (pokeHasAttackType) {
        p.pv -= a.puissance * 1.5
        val hasAttacked = true
      }
      else {
        p.pv -= a.puissance
        val hasAttacked = true
      }
    }
    else {
      val hasAttacked = false
    }
  }
}

object Pikachu extends Pokemon("Pikachu", 100) with Elec with Attaque

object Dracofeu extends Pokemon("Dracofeu", 150) with Feu with Attaque

object Tortank extends Pokemon("Tortank", 200) with Eau with Attaque

object Raichu extends Pokemon("Pikachu", 150) with Elec with Attaque
