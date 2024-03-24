fun main() {
    println("Seb is een ei 🥚")
    val b1 = Breuk(100, 101)
    val b2 = Breuk(33, 34)
    val som = b1 + b2
    println(som)
}

data class Breuk(val teller: Int, val noemer: Int) {
    operator fun plus(other: Breuk): Breuk {
        val nieuwenoemer = this.noemer * other.noemer
        val nieuweteller1 =this.teller * other.noemer
        val nieuweteller2 =other.teller * this.noemer
        val nieuweteller = nieuweteller1 + nieuweteller2
        val nieuwebreuk = Breuk(nieuweteller, nieuwenoemer)
        return nieuwebreuk
    }
}