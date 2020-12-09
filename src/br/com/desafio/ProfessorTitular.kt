package br.com.desafio

class ProfessorTitular(nome: String, sobrenome: String, tempoNaEmpresa: Int, codigoProfessor: Int, val especialidade: String): Professor(nome, sobrenome, tempoNaEmpresa, codigoProfessor){

    override fun toString(): String {
        return "$nome tem especialidade de '$especialidade'"
    }
}