package br.com.desafio

import java.util.*

fun main() {

//    println(matricula1.data)
//    println("")
//    println(aluno1 == aluno2)
//    println(professor1 == professor2)

    val professorTitular1 = ProfessorTitular("Andre", "Souza", 0, 10, "Pós graduação")
    val professorTitular2 = ProfessorTitular("Arthur", "Silva", 0, 20, "Mestrado")

    val professorAdjunto1 = ProfessorAdjunto("Bruno", "Andrade", 0, 30, 50)
    val professorAdjunto2 = ProfessorAdjunto("Breno", "Soares", 0, 40, 80)

    val curso1 = Curso("Full Stack", 20001, 3)
    val curso2 = Curso("Android", 20002, 2)

    val aluno1 = Aluno("Fabio", "Dias", 1)
    val aluno2 = Aluno("Flavio", "Costa", 2)

    val matricula1 = Matricula(aluno1, curso1, Date())
    val matricula2 = Matricula(aluno2, curso2, Date())

    val listaProfessoresTitulares = mutableListOf<ProfessorTitular>(professorTitular1, professorTitular2)
    val listaProfessoresAdjuntos = mutableListOf<ProfessorAdjunto>(professorAdjunto1, professorAdjunto2)

    val listaAlunos = mutableListOf<Aluno>(aluno1, aluno2)

    val listaCursos = mutableListOf<Curso>(curso1, curso2)

    val listaMatriculas = mutableListOf<Matricula>(matricula1, matricula2)

    val digitalHouseManager = DigitalHouseManager(listaAlunos, listaProfessoresTitulares, listaProfessoresAdjuntos, listaCursos, listaMatriculas)

//    println("")
//    println(digitalHouseManager.listaProfessorAdjunto)
//    println("")
//
//    println(digitalHouseManager.listaProfessorTitular)
//    println("")
//
//    println(digitalHouseManager.listaCurso)
//    println("")
//
//    println(digitalHouseManager.listaMatriculas)
//    println("")
//
//    println(digitalHouseManager.listaAluno)
//    println("")


    digitalHouseManager.registrarCurso("Full Stack Avançado", 80, 5)
    println(digitalHouseManager.listaCurso)

    digitalHouseManager.alocarProfessores(80, 20,30)

    println("")

    digitalHouseManager.cadastrarAluno("Ricado", "Romano", 3)

    println(curso1.quantidadeMaximaAlunos)
    println("")

    println(curso1.listaAlunos)
    println("")

    digitalHouseManager.matricularAluno(3, 20001)






}
