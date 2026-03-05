package oop_133486_Tjho_Rionaldinko.week04

class Manager(name: String, baseSalary: Int): Employee(name, baseSalary) {
    override fun work() {
        println("$name sedang memimppin rapat divisi.")
    }

    override fun calculateBonus(): Int {
        return super.calculateBonus() + 500000
    }

}