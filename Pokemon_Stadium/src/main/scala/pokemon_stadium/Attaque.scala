package pokemon_stadium

trait Attaque extends Type {
  val puissance: Double = 0
  //La précision est calculée en pourcentage
  val precision: Int = 0
}

//trait AttaqueElec extends Attaque with Elec

object AttaqueLanceFlamme extends Attaque with Feu {
  override val puissance: Double = 10
  override val precision: Int = 50
}

object AttaqueEclair extends Attaque with Elec {
  override val puissance: Double = 5
  override val precision: Int = 25
}

object AttaqueKarsher extends Attaque with Eau {
  override val puissance: Double = 20
  override val precision: Int = 10
}



//trait AttaqueClassique extends Attaque
/*trait AttaqueSpeciale extends Attaque {
  protected def attaqueSpeciale(pokemon: Pokemon): Unit = pokemon.pv -= 10
}*/

