package br.com.desafio

class DigitalHouseManager(var listaAluno: MutableList<Aluno>, var listaProfessor: MutableList<Professor>, var listaCurso: MutableList<Curso>, var listaMatriculas: MutableList<Matricula>) {

    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaAlunos: Int){

       val curso1 = Curso(nome, codigoCurso, quantidadeMaximaAlunos)

        listaCurso.add(curso1)

    }

    fun excluirCurso(codigoCurso: Int){
      for (curso in listaCurso){
          if (curso.codigoCurso == codigoCurso){
              listaCurso.remove(curso)
          }else{
              println("Código do curso não encontrado")
          }

      }
    }

    fun registarProfessorAdjunto(nomeProfessorAdjunto: String, sobrenome: String, codigoProfessorAdjunto: Int, quantidadeHorasMonitoria: Int){

        val professorAdjunto1 = ProfessorAdjunto(nomeProfessorAdjunto, sobrenome, 0, codigoProfessorAdjunto, quantidadeHorasMonitoria)
        listaProfessor.add(professorAdjunto1)
    }
}

