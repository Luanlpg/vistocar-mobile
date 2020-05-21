package com.anderson.bolsomovel

import android.content.Context

object AgendamentoService {

    fun getAgendamentos(context: Context): List<Agendamento> {
        val agendamentos = mutableListOf<Agendamento>()

        for (i in 1..10){
            val v = Agendamento()

            v.modelo = "Modelo $i"
            v.marca = "Marca $i"
            v.tipoServico = "Tipo de serviço $i"
            v.data = "20/05/2020"
            v.horario= "21:59"

            agendamentos.add(v)
        }
        return agendamentos
    }

}