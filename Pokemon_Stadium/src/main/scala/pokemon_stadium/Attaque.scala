package pokemon_stadium

trait Attaque extends Type {
  val puissance: Double = 0
}

//trait AttaqueElec extends Attaque with Elec

object AttaqueLanceFlamme extends Attaque with Feu {
  override val puissance: Double = 10
}

object AttaqueEclair extends Attaque with Elec {
  override val puissance: Double = 5
}



//trait AttaqueClassique extends Attaque
/*trait AttaqueSpeciale extends Attaque {
  protected def attaqueSpeciale(pokemon: Pokemon): Unit = pokemon.pv -= 10
}*/

