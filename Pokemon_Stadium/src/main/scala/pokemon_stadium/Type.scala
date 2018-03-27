package pokemon_stadium

abstract class Type {
  def typeAttaque: Unit
}

trait Eau extends Type
trait Feu extends Type
trait Psy extends Type
trait Elec extends Type
trait Air extends Type
trait Terre extends Type