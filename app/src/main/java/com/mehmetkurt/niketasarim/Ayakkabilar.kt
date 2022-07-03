package com.mehmetkurt.niketasarim

import java.io.Serializable

data class Ayakkabilar (var ayakkkabi_id:Int,
                        var ayakkabi_ad:String,
                        var ayakkabi_Aciklama:String,
                        var ayakkabi_fiyat:String,
                        var ayakkabi_marka:String,
                        var ayakkabi_indirim:String,
                        var ayakkabi_indirimsonrası_fiyat:String):Serializable
{

}