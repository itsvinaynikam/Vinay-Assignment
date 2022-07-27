package com.example.bottomenevigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.bottomenevigation.databinding.ActivityMainBinding
import com.example.bottomenevigation.fragment.*

class MainActivity : AppCompatActivity() {

  lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        setSupportActionBar(binding.toolBar)

        binding.toolBar.title="HOME"

        addfragment("HOME",homescreen_fragment())



        binding.bottomNavigation.setOnItemSelectedListener{

            when(it.itemId) {
                R.id.btn_home -> {
                    addfragment("Home",homescreen_fragment())

                    true
                }
                R.id.btn_Search -> {

                    addfragment("Search",searchscreen_fragment())

                    true
                }
                R.id.btn_reel -> {

                    addfragment("Reel",reelscreen_fragment())

                    true
                }
                R.id.btn_fav -> {
                    addfragment("Favorite",favoite_fragment())

                    true
                }
                R.id.btn_profile-> {

                    addfragment("Profile",profile_fragment())

                    true
                }
                else -> false
            }

        }








    }

    private fun addfragment(title: String,fragment: Fragment) {

      supportFragmentManager.beginTransaction().apply {
          replace(R.id.fragment_contener,fragment,title)
          addToBackStack(null)
          commit()

      }
        binding.toolBar.title=title



        /*var manager=supportFragmentManager
        var trasaction=manager.beginTransaction()
        trasaction.replace(R.id.fragment_contener,fragment,title)
        trasaction.addToBackStack(null)
        trasaction.commit()*/

    }
}