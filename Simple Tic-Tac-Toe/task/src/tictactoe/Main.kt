package tictactoe

import kotlin.math.absoluteValue

const val INPUT_SIZE = 8

const val WIN_CONDITIONS = 7

fun main() {
    //emtpyField
    val xField: MutableList<Int> = mutableListOf()
    val oField: MutableList<Int> = mutableListOf()
    var gameField = mutableListOf<MutableList<String>>(
        mutableListOf<String>(" ", " ", " "),
        mutableListOf<String>(" ", " ", " "),
        mutableListOf<String>(" ", " ", " ")
    )
    println(
        """
        |---------
        || ${gameField[0][0]} ${gameField[0][1]} ${gameField[0][2]} |
        || ${gameField[1][0]} ${gameField[1][1]} ${gameField[1][2]} |
        || ${gameField[2][0]} ${gameField[2][1]} ${gameField[2][2]} |
        |---------
    """.trimMargin()
    )

    //gameState
    //win conditions
    var xWins = false
    var oWins = false
    val winConditions: MutableList<MutableList<Int>> = mutableListOf(
        mutableListOf<Int>(0, 1, 2),
        mutableListOf<Int>(0, 3, 6),
        mutableListOf<Int>(0, 4, 8),
        mutableListOf<Int>(2, 5, 8),
        mutableListOf<Int>(2, 4, 6),
        mutableListOf<Int>(6, 7, 8),
        mutableListOf<Int>(1, 4, 7),
        mutableListOf<Int>(3, 4, 5)
    )

//Impossible state check by number of elements
    val impossibleCheck = (xField.size - oField.size).absoluteValue
    //check if game is incomplete
    var checkIncomplete = false
    var xOro = 0
    var emptyField: Int = 9
    while (emptyField != 0){
        //User input
        val (coordinateA: String, coordinateB: String) = readln().split(" ")
        //sanitizing input
        if (coordinateA.toDoubleOrNull() == null || coordinateB.toDoubleOrNull() == null) {
            println("You should enter numbers!")
        } else if (coordinateA.toInt() !in 1..3 || coordinateB.toInt() !in 1..3) {
            println("Coordinates should be from 1 to 3!")
        } else if (gameField[coordinateA.toInt() - 1][coordinateB.toInt() - 1] != " ") {
            println("This cell is occupied! Choose another one!")
        } else {
            when (gameField[coordinateA.toInt() - 1][coordinateB.toInt() - 1]) {
                gameField[0][0] -> if (xOro == 1) {
                    gameField[0][0] = "X"
                    xField.add(0)
                    xOro = 0
                    emptyField--
                } else if (xOro == 0) {
                    gameField[0][0] = "O"
                    oField.add(0)
                    xOro = 1
                    emptyField--
                }

                gameField[0][1] -> if (xOro == 1) {
                    gameField[0][1] = "X"
                    xField.add(1)
                    xOro = 0
                    emptyField--
                } else if (xOro == 0) {
                    gameField[0][1] = "O"
                    oField.add(1)
                    xOro = 1
                    emptyField--
                }

                gameField[0][2] -> if (xOro == 1) {
                    gameField[0][2] = "X"
                    xField.add(2)
                    xOro = 0
                    emptyField--
                } else if (xOro == 0) {
                    gameField[0][2] = "O"
                    oField.add(2)
                    xOro = 1
                    emptyField--
                }

                gameField[1][0] -> if (xOro == 1) {
                    gameField[1][0] = "X"
                    xField.add(3)
                    xOro = 0
                    emptyField--
                } else if (xOro == 0) {
                    gameField[1][0] = "O"
                    oField.add(3)
                    xOro = 1
                    emptyField--
                }

                gameField[1][1] -> if (xOro == 1) {
                    gameField[1][1] = "X"
                    xField.add(4)
                    xOro = 0
                    emptyField--
                } else if (xOro == 0) {
                    gameField[1][1] = "O"
                    oField.add(4)
                    xOro = 1
                    emptyField--
                }

                gameField[1][2] -> if (xOro == 1) {
                    gameField[1][2] = "X"
                    xField.add(5)
                    xOro = 0
                    emptyField--
                } else if (xOro == 0) {
                    gameField[1][2] = "O"
                    oField.add(5)
                    xOro = 1
                    emptyField--
                }

                gameField[2][0] -> if (xOro == 1) {
                    gameField[2][0] = "X"
                    xField.add(6)
                    xOro = 0
                    emptyField--
                } else if (xOro == 0) {
                    gameField[2][0] = "O"
                    oField.add(6)
                    xOro = 1
                    emptyField--
                }

                gameField[2][1] -> if (xOro == 1) {
                    gameField[2][1] = "X"
                    xField.add(7)
                    xOro = 0
                    emptyField--
                } else if (xOro == 0) {
                    gameField[2][1] = "O"
                    oField.add(7)
                    xOro = 1
                    emptyField--
                }

                gameField[2][2] -> if (xOro == 1) {
                    gameField[2][2] = "X"
                    xField.add(8)
                    xOro = 0
                    emptyField--
                } else if (xOro == 0) {
                    gameField[2][2] = "O"
                    oField.add(8)
                    xOro = 1
                    emptyField--
                }
            }
            println(
                """
        |---------
        || ${gameField[0][0]} ${gameField[0][1]} ${gameField[0][2]} |
        || ${gameField[1][0]} ${gameField[1][1]} ${gameField[1][2]} |
        || ${gameField[2][0]} ${gameField[2][1]} ${gameField[2][2]} |
        |---------
    """.trimMargin()
            )
        }

    }
    for (i in 0..WIN_CONDITIONS) {
        if (xField.containsAll(winConditions[i])) {
            xWins = true
        }
        if (oField.containsAll(winConditions[i])) {
            oWins = true
        }
    }
//print game state
    if (xWins && !oWins && impossibleCheck <= 1) {
        println("X wins")
    } else if (!xWins && oWins && impossibleCheck <= 1) {
        println("O wins")
    } else if (!xWins && !oWins && impossibleCheck <= 1) {
        when (checkIncomplete) {
            false -> println("Draw")
        }
    }
}

