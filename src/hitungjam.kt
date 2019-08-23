import java.util.*

class Kerja () {
    var nama=""
    var nik = ""
    var jamMasuk =0
    var jamKeluar =0
}
fun main (args : Array<String>)  {
    var scan = Scanner(System.`in`)
    var jamkerja = Kerja()
    println("masukkan nama")
    jamkerja.nama=scan.next()
    println("masukkan nik")
    jamkerja.nik=scan.next()
    println("masukkan jam mulai")
    jamkerja.jamMasuk=scan.nextInt()
    println("masukkan jam selesai")
    jamkerja.jamKeluar=scan.nextInt()
    var lamakerja=jamkerja.jamKeluar-jamkerja.jamMasuk
    println(lamakerja)
}