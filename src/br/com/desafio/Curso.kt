package br.com.desafio

class Curso(val nome: String, val codigoCurso: Int, val professorTitular: ProfessorTitular, val professorAdjunto: ProfessorAdjunto, val quantidadeMaximaAlunos: Int = 10, var listaAlunos: MutableList<Aluno> = mutableListOf()) {


    override fun equals(other: Any?): Boolean {

        if (this === other) return true
        if (other !is Curso) return false
        if (codigoCurso != other.codigoCurso) return false

        return true
    }

    fun adicionarAluno(aluno: Aluno): Boolean {
        if (quantidadeMaximaAlunos <= listaAlunos.size) {
            listaAlunos.add(aluno)
            return true
        } else {
            return false
        }
    }

    fun excluirAluno(aluno: Aluno) {
        listaAlunos.remove(aluno)
    }

}