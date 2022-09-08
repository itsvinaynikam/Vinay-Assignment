package com.example.dialogs

import android.content.ClipData
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class dialog_activity : AppCompatActivity() {

      val dsimple:Button
      get() = findViewById(R.id.simple_dailog)

      val dsinglechoice:Button
      get() = findViewById(R.id.single_choice_dialog)

       val dsinglechoiceRedio:Button
       get() = findViewById(R.id.singlechoice_redio)

    val dmultichoicedialog:Button
        get() = findViewById(R.id.multi_choice)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    dsimple.setOnClickListener{
                                 showsimpleDialog()
                          }

        dsinglechoice.setOnClickListener{
            singlechoice()
        }

        dsinglechoiceRedio.setOnClickListener{
            singlechoiceRedio()

        }

        dmultichoicedialog.setOnClickListener{
            multichoicedialogs()

        }

    }

     fun showsimpleDialog()
     {
         var builder=AlertDialog.Builder(this)
         builder.setTitle("Alert")
             .setMessage("Are you sure you want to logout from this apliction")
             .setPositiveButton("logout", DialogInterface.OnClickListener {
                     dialog, i ->
                 //Toast.makeText(this, "The possitive button clicked", Toast.LENGTH_SHORT).show()
                 startActivity(Intent(this,next_activity::class.java))

                 
             })
             .setNegativeButton("Cancel", DialogInterface.OnClickListener { dialogInaterface, i ->
                 Toast.makeText(this, "The Negitive button clicked", Toast.LENGTH_SHORT).show()
                 
             }).show()


     }

    fun singlechoice()

    {

        var person= arrayOf("ROHIT","RUTIK","CHETAN","PANNU")

        var builder=AlertDialog.Builder(this)

        builder.setTitle("pick a person")
            .setItems(person, DialogInterface.OnClickListener { dialog,i->
                var selectperson=person[i]

                Toast.makeText(this, "$selectperson", Toast.LENGTH_SHORT).show()
            }).show()
    }

    fun singlechoiceRedio()
    {

        var person= arrayOf("ROHIT","RUTIK","CHETAN","PANNU")
          var selectperson=""
        var builder=AlertDialog.Builder(this)

        builder.setTitle("Who  Is Accounter ?")
            .setSingleChoiceItems(person,-1, DialogInterface.OnClickListener { dialog, i->

                selectperson=person[i]
            })
            .setPositiveButton("Done", DialogInterface.OnClickListener { dialog, i->
                Toast.makeText(this, "$selectperson", Toast.LENGTH_SHORT).show()
            }).setNegativeButton("cancel", DialogInterface.OnClickListener { dialog, i ->
                Toast.makeText(this, "The Negitive button clicked", Toast.LENGTH_SHORT).show()
            }).show()


    }
    fun multichoicedialogs()
    {

        var person= arrayOf("ROHIT","RUTIK","CHETAN","PANNU")
        var list= mutableListOf<String>()

        var builder=AlertDialog.Builder(this)

        builder.setTitle("Who  Is Accounter ?")
            .setMultiChoiceItems(person,null, DialogInterface.OnMultiChoiceClickListener { dialog, i, stutas->

               var selectperson2=person[1]

                if (stutas){
                    list.add(selectperson2)

                }else
                {
                    list.remove(selectperson2)
                }

               // Toast.makeText(this, "$list", Toast.LENGTH_SHORT).show()
            })
            .setPositiveButton("Done", DialogInterface.OnClickListener { dialog, i->
                Toast.makeText(this, "$list", Toast.LENGTH_SHORT).show()
            }).setNegativeButton("cancel", DialogInterface.OnClickListener { dialog, i ->
                Toast.makeText(this, "The Negitive button clicked", Toast.LENGTH_SHORT).show()
            }).show()

    }


}



