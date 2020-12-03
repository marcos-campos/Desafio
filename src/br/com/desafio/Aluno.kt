package br.com.desafio

class Aluno(val nome:String, val sobrenome: String, val codigoAluno: Int) {


    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Aluno) return false

        if (codigoAluno != other.codigoAluno) return false

        return true
    }


}


