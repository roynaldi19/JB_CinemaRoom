package cinema

import kotlin.system.exitProcess

fun main() {
//    // write your code here
//    val rows = 7
//    val seatsPerRow = 8
//
//    println("Cinema:")
//    print("  ")
//    for (seat in 1..seatsPerRow) {
//        print("$seat ")
//    }
//    println()
//
//    for (row in 1..rows) {
//        print("$row ")
//        for (seat in 1..seatsPerRow) {
//            print("S ")
//        }
//        println()
//    }

    println("Enter the number of rows:")
    val rows = readln().toInt()
    println("Enter the number of seats in each row:")
    val seats = readln().toInt()

    val totalSeats = rows * seats

    val frontHalfRows: Int
    val backHalfRows: Int

    if (rows % 2 == 0) {
        frontHalfRows = rows / 2
        backHalfRows = rows / 2
    } else {
        frontHalfRows = rows / 2
        backHalfRows = rows - frontHalfRows
    }

    val profit: Int
    if (totalSeats <= 60) {
        profit = totalSeats * 10
    } else {
        profit = (frontHalfRows * seats * 10) + (backHalfRows * seats * 8)
    }

    // Print the total incom
    println("Total income:$$profit")
}