package pokemon_stadium

trait Type {
  val typename = "Aucun type"
}

trait Elec extends Type {
  override val typename = "Electricité"
}

trait Feu extends Type {
  override val typename = "Feu"
}

trait Eau extends Type {
  override val typename = "Eau"
}

/*
trait Psy extends Type {
  val nom: String = "Psy"
}

trait Air extends Type {
  val nom: String = "Air"
}
trait Terre extends Type {
  val nom: String = "Terre"
}*/