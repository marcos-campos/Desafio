package br.com.desafio

import java.util.*

class DigitalHouseManager(var listaAluno: MutableList<Aluno>, var listaProfessor: MutableList<Professor>, var listaCurso: MutableList<Curso>, var listaMatriculas: MutableList<Matricula>) {

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
        listaProfessor.add(professorAdjunto1)
    }

    fun registrarProfessorTitular(nomeProfessorTitular: String, sobrenomeProfessorTitular: String, codigoProfessor: Int, especialidade: String) {

        val professorTitular1 = ProfessorTitular(nomeProfessorTitular, sobrenomeProfessorTitular, 0, codigoProfessor, especialidade)
        listaProfessor.add(professorTitular1)
    }

    fun excluirProfessor(codigoProfessor: Int) {
        for (it in listaProfessor) {
            if (it.codigoProfessor == (codigoProfessor)) {
                listaProfessor.remove(it)
            } else {
                println("Professor não encontrado")
            }
        }
    }

    fun cadastrarAluno(nomeAluno: String, sobrenomeAluno: String, codigoAluno: Int) {

        val aluno1 = Aluno(nomeAluno, sobrenomeAluno, codigoAluno)
        listaAluno.add(aluno1)
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        for (aluno in listaAluno) {
            if (aluno.codigoAluno == (codigoAluno)) {
                for (curso in listaCurso) {
                    if (curso.codigoCurso == (codigoCurso)) {
                        if (curso.adicionarAluno(aluno)) {
                            val matricula1 = Matricula(aluno, curso, data = Date())
                            listaMatriculas.add(matricula1)
                            println("Matrícula criada com sucesso")
                        } else {
                            println("Quantidade de alunos excedida")
                        }

                    } else {
                        println("Curso não encontrado")
                    }
                }
            } else {
                println("Aluno não encontrado")

            }
        }
    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {
        for (curso in listaCurso) {
            if (curso.codigoCurso == codigoCurso)
                for (professorTitular in listaProfessor) {
                    if (professorTitular.codigoProfessor == codigoProfessorTitular) {
                        for (professorAdjunto in listaProfessor) {
                            if (professorAdjunto.codigoProfessor == codigoProfessorAdjunto) {
                                curso.adicionarProfessorTitular(professor)
                                curso.adicionarProfessorAdjunto(professorAdjunto as ProfessorAdjunto)
                            }
                        }
                    }
                }
        }


    }
}





