package com.anderson.bolsomovel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class AgendamentoAdapter (val agendamentos  : List<Agendamento>,
                          val onClick: (Agendamento) -> Unit
): RecyclerView.Adapter<AgendamentoAdapter.AgendamentosViewHolder> (){

    class AgendamentosViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val cardTitulo: TextView
        val progessbarAgendamento: ProgressBar
        val card_agendamento: CardView

        init{
            cardTitulo = view.findViewById(R.id.cardTipoServico)
            progessbarAgendamento = view.findViewById(R.id.progessbarAgendamento)
            card_agendamento = view.findViewById(R.id.card_agendamento)
        }
    }


    override fun getItemCount() = this.agendamentos.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AgendamentosViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adapter_agendamento, parent, false)

        val holder = AgendamentosViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: AgendamentosViewHolder, position: Int) {
        val context = holder.itemView.context
        val agendamento = agendamentos[position]

        holder.cardTitulo.text = agendamento.tipoServico

        holder.itemView.setOnClickListener{(onClick(agendamento))}
    }

}