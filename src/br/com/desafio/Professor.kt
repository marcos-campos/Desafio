package br.com.desafio

open class Professor(val nome: String, val sobrenome: String, var tempoNaEmpresa: Int, val codigoProfessor: Int) {

    override fun equals(other: Any?): Boolean {

        if (this === other) return true
        if (other !is Professor) return false
        if (codigoProfessor != other.codigoProfessor) return false

        return true
    }

    override fun toString(): String {
        return "Professor(nome='$nome', sobrenome='$sobrenome', tempoNaEmpresa=$tempoNaEmpresa, codigoProfessor=$codigoProfessor)"
    }

}