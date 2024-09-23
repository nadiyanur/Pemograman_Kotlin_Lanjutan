//nor nadiya
fun main(args: Array<String>) {
    try {
        val myVar: Int = 10
        val v: String = "Rekayasa Perangkat Lunak"
        v.toInt() // Ini akan menimbulkan NumberFormatException karena string tidak bisa dikonversi ke integer
    } catch (e: NumberFormatException) {
        println("Error: Tidak bisa mengonversi string ke angka!")
    } catch (e: Exception) {
        e.printStackTrace() // Menangani exception umum lainnya
    } finally {
        println("Exception Handling in Kotlin")
    }
}
