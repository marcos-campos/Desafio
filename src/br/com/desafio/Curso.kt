package br.com.desafio

class Curso(val nome: String, val codigoCurso: Int, val quantidadeMaximaAlunos: Int) {

    lateinit var professorTitular: ProfessorTitular
    lateinit var professorAdjunto: ProfessorAdjunto
    var listaAlunos = mutableListOf<Aluno>()

    constructor(nome: String, codigoCurso: Int, quantidadeMaximaAlunos: Int, professorTitular: ProfessorTitular, professorAdjunto: ProfessorAdjunto, listaAlunos: MutableList<Aluno>): this(nome, codigoCurso, quantidadeMaximaAlunos) {

        this.professorTitular = professorTitular
        this.professorAdjunto = professorAdjunto
        this.listaAlunos = listaAlunos
    }

    override fun equals(other: Any?): Boolean {

        if (this === other) return true
        if (other !is Curso) return false
        if (codigoCurso != other.codigoCurso) return false

        return true
    }

    fun adicionarAluno(aluno: Aluno): Boolean {
        if (listaAlunos.size < quantidadeMaximaAlunos) {
            listaAlunos.add(aluno)
            return true
        } else {
            println("Quantidade maxima de alunos já atingida")
            return false
        }
    }

    fun excluirAluno(aluno: Aluno) {
        listaAlunos.remove(aluno)
    }

    fun adicionarProfessorTitular(professorTitular: ProfessorTitular){
        this.professorTitular = professorTitular
    }

    fun adicionarProfessorAdjunto(professorAdjunto: ProfessorAdjunto){
        this.professorAdjunto = professorAdjunto
    }

    override fun toString(): String {
        return "O curso $nome, de código $codigoCurso, tem quantidade maxima de alunos de $quantidadeMaximaAlunos ."
    }


}