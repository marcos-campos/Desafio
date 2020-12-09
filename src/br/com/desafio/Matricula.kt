package br.com.desafio

import java.util.*

class Matricula(val aluno: Aluno, val curso: Curso, var data: Date) {

    override fun toString(): String {
        return "O aluno $aluno fez a matricula: $data"
    }
}