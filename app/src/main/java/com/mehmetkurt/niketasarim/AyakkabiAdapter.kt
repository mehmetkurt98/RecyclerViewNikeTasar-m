package com.mehmetkurt.niketasarim

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mehmetkurt.niketasarim.databinding.CardtasarimBinding

class AyakkabiAdapter(var mContext:Context,
                      var ayakkabilarListesi:List<Ayakkabilar>):
                        RecyclerView.Adapter<AyakkabiAdapter.CardTasarimTutucu>() {
inner class CardTasarimTutucu(tasarim:CardtasarimBinding) :RecyclerView.ViewHolder(tasarim.root){
    var tasarim:CardtasarimBinding
init {
this.tasarim=tasarim
}

}

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val layoutInflater=LayoutInflater.from(mContext)
        val tasarim=CardtasarimBinding.inflate(layoutInflater,parent,false)
        return CardTasarimTutucu(tasarim)

        }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
    val ayakkabi=ayakkabilarListesi.get(position)
    val t=holder.tasarim
    t.imageViewResim.setImageResource(mContext.resources.getIdentifier(ayakkabi.ayakkabi_ad,"drawable",mContext.packageName))
    t.textViewFiyat.text=ayakkabi.ayakkabi_fiyat
        t.textViewAyakkabDetay.text=ayakkabi.ayakkabi_Aciklama
        t.textViewMarka.text=ayakkabi.ayakkabi_marka
        t.textViewNdirimOran.text=ayakkabi.ayakkabi_indirim
        t.textViewSonFiyat.text=ayakkabi.ayakkabi_indirimsonrası_fiyat




    }

    override fun getItemCount(): Int {
        return ayakkabilarListesi.size
    }

}