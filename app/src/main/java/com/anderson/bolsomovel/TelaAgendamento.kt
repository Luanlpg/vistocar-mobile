package com.anderson.bolsomovel

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_tela_agendamento.*
import kotlinx.android.synthetic.main.toolbar.*

class TelaAgendamento: AppCompatActivity() {

    private var agendamentos = listOf<Agendamento>()
    private val context: Context get() = this

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_agendamento)

        setSupportActionBar(toolbar)

        //toolbar
        supportActionBar?.title = "Agendamentos"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        //RecycleView
        recyclerAgendamentos?.layoutManager = LinearLayoutManager(context)
        recyclerAgendamentos?.itemAnimator = DefaultItemAnimator()
        recyclerAgendamentos?.setHasFixedSize(true)
    }

    override fun onResume() {
        super.onResume()
        taskAgendamentos()
    }

    fun taskAgendamentos(){
        agendamentos = AgendamentoService.getAgendamentos(context)
        recyclerAgendamentos?.adapter = AgendamentoAdapter(agendamentos) {oncliClickAgendamento(it)}
    }

    fun oncliClickAgendamento(agendamento: Agendamento) {
        Toast.makeText(context, "Clicou em ${agendamento.tipoServico}", Toast.LENGTH_LONG).show()
    }

}