package ch12

data class Player(
    val id: Int,
    val name: String,
    val points: Int,
)

fun main() {
    val player = Player(0, "Alice", 9999)
    println(player)
    println("player: $player")
}
