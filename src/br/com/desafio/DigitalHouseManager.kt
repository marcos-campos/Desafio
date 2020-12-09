package br.com.desafio

import java.util.*

class DigitalHouseManager(var listaAluno: MutableList<Aluno>, var listaProfessorTitular: MutableList<ProfessorTitular>, var listaProfessorAdjunto: MutableList<ProfessorAdjunto>, var listaCurso: MutableList<Curso>, var listaMatriculas: MutableList<Matricula>) {


    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaAlunos: Int) {

        val curso1 = Curso(nome, codigoCurso, quantidadeMaximaAlunos)

        listaCurso.add(curso1)

    }

    fun excluirCurso(codigoCurso: Int) {
        for (curso in listaCurso) {
            if (curso.codigoCurso == codigoCurso) {
                listaCurso.remove(curso)
            } else {
                println("Código do curso não encontrado")
            }

        }
    }

    fun registarProfessorAdjunto(nomeProfessorAdjunto: String, sobrenome: String, codigoProfessor: Int, quantidadeHorasMonitoria: Int) {

        val professorAdjunto1 = ProfessorAdjunto(nomeProfessorAdjunto, sobrenome, 0, codigoProfessor, quantidadeHorasMonitoria)
        listaProfessorAdjunto.add(professorAdjunto1)
    }

    fun registrarProfessorTitular(nomeProfessorTitular: String, sobrenomeProfessorTitular: String, codigoProfessor: Int, especialidade: String) {

        val professorTitular1 = ProfessorTitular(nomeProfessorTitular, sobrenomeProfessorTitular, 0, codigoProfessor, especialidade)
        listaProfessorTitular.add(professorTitular1)
    }

    fun excluirProfessorTitular(codigoProfessorTitular: Int) {
        for (it in listaProfessorTitular) {
            if (it.codigoProfessor == (codigoProfessorTitular)) {
                listaProfessorTitular.remove(it)
            } else {
                println("Professor titular não encontrado")
            }
        }
    }

    fun excluirProfessorAdjunto(codigoProfessorAdjunto: Int) {
        for (codigoAdjunto in listaProfessorAdjunto) {
            if (codigoAdjunto.codigoProfessor == (codigoProfessorAdjunto)) {
                listaProfessorAdjunto.remove(codigoAdjunto)
            } else {
                println("Professor adjunto não encontrado")
            }

        }
    }

    fun cadastrarAluno(nomeAluno: String, sobrenomeAluno: String, codigoAluno: Int) {

        val aluno1 = Aluno(nomeAluno, sobrenomeAluno, codigoAluno)
        listaAluno.add(aluno1)
        println("Aluno cadastrado com sucesso!")
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        for (aluno in listaAluno) {
            if (aluno.codigoAluno == (codigoAluno)) {
                println("Aluno já cadastrado nesse curso")
            } else {
                for (curso in listaCurso) {
                    if (curso.codigoCurso == (codigoCurso)) {

                        if (curso.adicionarAluno(aluno)) {
                            val matricula1 = Matricula(aluno, curso, data = Date())
                            listaMatriculas.add(matricula1)
                            println("Matrícula criada com sucesso")

                        }
                    }
                }
            }
        }
    }

        fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {

            for (curso in listaCurso) {
                if (curso.codigoCurso == codigoCurso) {

                    for (professorTitular in listaProfessorTitular) {
                        if (professorTitular.codigoProfessor == codigoProfessorTitular) {

                            for (professorAdjunto in listaProfessorAdjunto) {
                                if (professorAdjunto.codigoProfessor == codigoProfessorAdjunto) {

                                    curso.adicionarProfessorTitular(professorTitular)
                                    println("Professor titular adicionado com sucesso")
                                    curso.adicionarProfessorAdjunto(professorAdjunto)
                                    println("Professor adjunto adicionado com sucesso")

                                }
                            }
                        }
                    }
                }

            }
        }

    override fun toString(): String {
        return "DigitalHouseManager(listaAluno=$listaAluno, listaProfessorTitular=$listaProfessorTitular, listaProfessorAdjunto=$listaProfessorAdjunto, listaCurso=$listaCurso, listaMatriculas=$listaMatriculas)"
    }


}






