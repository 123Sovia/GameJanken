package coding.gamejanken


import android.view.ViewDebug.IntToString
import coding.gamejanken.Game.optionDrawable
import kotlin.random.Random

object Game {

    private val rules = mapOf(
        "ROCK-SCISSORS" to true,
        "ROCK-PAPER" to false,
        "SCISSORS-PAPER" to true,
        "SCISSORS-ROCK" to false,
        "PAPPER-ROCK" to true,
        "PAPER-SCISSORS" to false,
    )

    private val options = listOf("ROCK", "SCISSORS", "PAPER")

   private val optionDrawable = mapOf(
        "ROCK" to  R.drawable.rock,
        "SCISSORS" to R.drawable.scissors,
        "PAPPER" to R.drawable.paper,

    )
    fun pickRandomOption(): String = options[Random.nextInt(from = 0, until = 3)]

    fun pickDrawable(option: String): Int = optionDrawable[option]!!

    fun isDraw(from: String, to : String): Boolean = from == to

    fun isWin(from: String, to: String): Boolean = rules["$from-$to"]!!


}