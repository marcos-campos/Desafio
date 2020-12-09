package br.com.desafio

class ProfessorAdjunto(nome: String, sobrenome: String, tempoNaEmpresa: Int, codigoProfessor: Int, val horasMonitoria: Int): Professor(nome, sobrenome, tempoNaEmpresa, codigoProfessor) {
    override fun toString(): String {
        return "$nome tem $horasMonitoria horas de monitoria"
    }
}