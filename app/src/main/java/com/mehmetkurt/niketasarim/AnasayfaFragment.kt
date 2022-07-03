package com.mehmetkurt.niketasarim

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.mehmetkurt.niketasarim.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {
    private lateinit var tasarim:FragmentAnasayfaBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim= FragmentAnasayfaBinding.inflate(inflater,container,false)
        tasarim.rv.layoutManager=StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        val ayakkabilarListesi=ArrayList<Ayakkabilar>()
        val f1=Ayakkabilar(1,"nike1a","Jodan One Take 3 Erkek Beyaz Basketbol Ayakkabısı DC7701-100","2629.90 ₺","Nike","SEPETTE %20 İNDİRİM","2103.92₺")
        val f2=Ayakkabilar(2,"nike2a","Jordan One Take 3 NBA Erkek Kırmızı Basketbol Ayakkabısı DC7701-600","2539.90 ₺","Nike","SEPETTE %20 İNDİRİM","2031.92 ₺")
        val f3=Ayakkabilar(3,"nike3a","Jordan One Take 3 NBA Erkek Siyah Basketbol Ayakkabısı DC7701-073","1829.90 ₺","Nike","SEPETTE %10 İNDİRİM","1646.91 ₺")
        val f4=Ayakkabilar(4,"nike4a","Jordan Max Aura 3 NBA Erkek Beyaz Basketbol Ayakkabısı CZ4167-160","2149.90 ₺","Nike","SEPETTE %10 İNDİRİM","1934.91₺")
        ayakkabilarListesi.add(f1)
        ayakkabilarListesi.add(f2)
        ayakkabilarListesi.add(f3)
        ayakkabilarListesi.add(f4)
        val adapter=AyakkabiAdapter(requireContext(),ayakkabilarListesi)
        tasarim.rv.adapter=adapter












        return tasarim.root
    }



}