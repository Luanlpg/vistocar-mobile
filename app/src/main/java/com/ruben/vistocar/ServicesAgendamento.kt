package com.ruben.vistocar

import android.content.Context
import android.content.Intent
import androidx.core.content.ContextCompat.startActivity

object ServicesAgendamento {

    fun getAgendamentos(context: Context): List<agendamento> {
        val agendamentos = mutableListOf<agendamento>()

        val a = agendamento()
        a.nome = "Veículos Recuperados de Sinistro"
        a.categoria = "1"
        a.foto = "http://www.vistocar.com.br/template/imagens/img-home-1.png"
        agendamentos.add(a)

        val b = agendamento()
        b.nome = "Veículos Modificados/ Alteração de Caracteristicas"
        b.categoria = "2"
        b.foto = "https://www.vistocar.com.br/template/imagens/img-home-2.png"
        agendamentos.add(b)

        val c = agendamento()
        c.nome = "Gás Natural Veicular (GNV)"
        c.categoria = "3"
        c.foto = "https://www.vistocar.com.br/template/imagens/img-home-3.png"
        agendamentos.add(c)

        val d = agendamento()
        d.nome = "Transporte Produtos Perigosos"
        d.categoria = "4"
        d.foto = "https://www.vistocar.com.br/template/imagens/img-home-4.png"
        agendamentos.add(d)

        val e = agendamento()
        e.nome = "Inspeção Mercosul (CITV)"
        e.categoria = "5"
        e.foto = "http://www.vistocar.com.br/template/imagens/img-home-5.png"
        agendamentos.add(e)

        val f = agendamento()
        f.nome = "Alvarás de Taxis e Escolares"
        f.categoria = "6"
        f.foto = "http://www.vistocar.com.br/template/imagens/img-home-6.png"
        agendamentos.add(f)

        return agendamentos
    }

}