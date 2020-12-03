package br.com.desafio

class Curso(val nome: String, val codigoCurso: Int) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Curso) return false
        if (codigoCurso != other.codigoCurso) return false

        return true
    }

}