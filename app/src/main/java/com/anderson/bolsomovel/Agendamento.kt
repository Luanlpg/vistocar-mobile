package com.anderson.bolsomovel

class Agendamento {

    var id: Long = 0
    var modelo: String = ""
    var marca: String = ""
    var tipoServico: String = ""
    var data: String = ""
    var horario: String = ""

    override fun toString (): String{
        return "Agendamento(tipoServico='$tipoServico')"
    }

}