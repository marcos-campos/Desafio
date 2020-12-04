package br.com.desafio

import java.util.*

fun main() {

    val aluno1 = Aluno("João", "Silva", 1)
    val aluno2 = Aluno("José", "Souza", 2)

    val professor1 = Professor("Joaquim", "Soares", 2, 1)
    val professor2 = Professor("Julio", "Alves", 5, 2)

    val professorTitular1 = ProfessorTitular("alan", "delon", 10, 3, "mestrado")
    val professorAdjunto1 = ProfessorAdjunto("bruno", "Andrade", 5, 4, 10)

    val curso1 = Curso("Android", 1, professorTitular1, professorAdjunto1, 10, mutableListOf())

    val matricula1 = Matricula(aluno1, curso1, Date())

    println(matricula1.data)
    println("")
    println(aluno1 == aluno2)
    println(professor1 == professor2)


}
