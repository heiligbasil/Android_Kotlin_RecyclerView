package com.lambdaschool.android_kotlin_recyclerview

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.serialization.UnstableDefault

class MainActivity : AppCompatActivity() {

    @UnstableDefault
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var classNameReflection: String? = this::class.simpleName
        var methodNameReflection: String? = this::getLocalClassName.javaClass.enclosingMethod.name

        val viewAdapter = SuperHeroRvAdapter(this)
        (this as Activity).runOnUiThread {
            recycler_view.apply {
                setHasFixedSize(false)
                layoutManager = LinearLayoutManager(applicationContext)
                adapter = viewAdapter
            }
        }

/*        Thread(Runnable {
            HisNetworkAdapter.httpGetRequest("https://www.superheroapi.com/api.php/10220044976853570/644",
                object : HisNetworkAdapter.NetworkHttpCallback {
                    override fun returnResult(success: Boolean?, result: String) {

                        if (success!!) {
                            val superheros: SuperHero = Json.nonstrict.parse(SuperHero.serializer(), result)
                            Log.i(
                                "$classNameReflection",
                                "$methodNameReflection - ${Json.stringify(SuperHero.serializer(), superheros)}"
                            )
                        }
                    }

                })
        }).start()*/

        /*val superHerosHardCodedObject: SuperHero = Json.parse(SuperHero.serializer(), superHeroHardCodedString)
        Log.i(
            "$classNameReflection",
            "$methodNameReflection - ${Json.stringify(SuperHero.serializer(), superHerosHardCodedObject)}"
        )*/

    }

    val superHeroHardCodedString: String = ("{\n" +
            "   \"response\":\"success\",\n" +
            "   \"id\":\"644\",\n" +
            "   \"name\":\"Superman\",\n" +
            "   \"powerstats\":{\n" +
            "      \"intelligence\":\"94\",\n" +
            "      \"strength\":\"100\",\n" +
            "      \"speed\":\"100\",\n" +
            "      \"durability\":\"100\",\n" +
            "      \"power\":\"100\",\n" +
            "      \"combat\":\"85\"\n" +
            "   },\n" +
            "   \"biography\":{\n" +
            "      \"full-name\":\"Clark Kent\",\n" +
            "      \"alter-egos\":\"Superman Prime One-Million\",\n" +
            "      \"aliases\":[\n" +
            "         \"Clark Joseph Kent\",\n" +
            "         \"The Man of Steel\",\n" +
            "         \"the Man of Tomorrow\",\n" +
            "         \"the Last Son of Krypton\",\n" +
            "         \"Big Blue\",\n" +
            "         \"the Metropolis Marvel\",\n" +
            "         \"the Action Ace\"\n" +
            "      ],\n" +
            "      \"place-of-birth\":\"Krypton\",\n" +
            "      \"first-appearance\":\"ACTION COMICS #1\",\n" +
            "      \"publisher\":\"Superman Prime One-Million\",\n" +
            "      \"alignment\":\"good\"\n" +
            "   },\n" +
            "   \"appearance\":{\n" +
            "      \"gender\":\"Male\",\n" +
            "      \"race\":\"Kryptonian\",\n" +
            "      \"height\":[\n" +
            "         \"6'3\",\n" +
            "         \"191 cm\"\n" +
            "      ],\n" +
            "      \"weight\":[\n" +
            "         \"225 lb\",\n" +
            "         \"101 kg\"\n" +
            "      ],\n" +
            "      \"eye-color\":\"Blue\",\n" +
            "      \"hair-color\":\"Black\"\n" +
            "   },\n" +
            "   \"work\":{\n" +
            "      \"occupation\":\"Reporter for the Daily Planet and novelist\",\n" +
            "      \"base\":\"Metropolis\"\n" +
            "   },\n" +
            "   \"connections\":{\n" +
            "      \"group-affiliation\":\"Justice League of America, The Legion of Super-Heroes (pre-Crisis as Superboy); Justice Society of America (pre-Crisis Earth-2 version); All-Star Squadron (pre-Crisis Earth-2 version)\",\n" +
            "      \"relatives\":\"Lois Lane (wife), Jor-El (father, deceased), Lara (mother, deceased), Jonathan Kent (adoptive father), Martha Kent (adoptive mother), Seyg-El (paternal grandfather, deceased), Zor-El (uncle, deceased), Alura (aunt, deceased), Supergirl (Kara Zor-El, cousin), Superboy (Kon-El\\/Conner Kent, partial clone)\"\n" +
            "   },\n" +
            "   \"image\":{\n" +
            "      \"url\":\"https:\\/\\/www.superherodb.com\\/pictures2\\/portraits\\/10\\/100\\/791.jpg\"\n" +
            "   }\n" +
            "}")

}
