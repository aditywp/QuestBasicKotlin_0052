package com.example.basickotlin

// List adalah Kumpulan data yang disusun secara berurutan dari
// List bersifat ordered, artinya data yang dimasukkan akan memiliki posisi sesuai urutan
// List bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah // List Read-Only menggunakan listOf
// List Mutable menggunakan mutableListOf

fun ContohList() {
    println("=== List ===")

    // List Read-Only
    val readonlyAbjad = listOf("A", "B", "C")
    println(readonlyAbjad)

    // List Mutable
    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    // Menambahkan data ke dalam List Mutable
    shape.add("Rectangle")
    println(shape)

    // Menghapus data dari List Mutable
    shape.remove("Triangle")
    println(shape)

    // Mengubah data di dalam List Mutable
    shape[0] = "Oval"
    println(shape)

    // List Read-Only
    val shapesLocked: List<String> = shape
    println(shapesLocked)

}

// Set adalah Kumpulan data yang tidak memiliki posisi atau urutan tertentu dan hanya menyimpan data unik (tidak ada duplikasi)

fun ContohSet() {
    println()
    println("=== Set ====")

    // Set Read-Only
    val readonlyAbjad = setOf("A", "B", "C")
    println(readonlyAbjad)

    // Set Mutable
    val shape: MutableSet<String> = mutableSetOf("Circle", "Square", "Triangle")
    println(shape)

    // Menambahkan data ke dalam Set Mutable
    shape.add("Rectangle")
    println(shape)


    // Menghapus data dari Set Mutable
    shape.remove("Circle")
    println(shape)

}
