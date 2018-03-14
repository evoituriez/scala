class Personne(val nom: String, var age: Int)

val test = new Personne("Gilbert", 10)

println(test.nom)
test.age += 1
println(test.age)