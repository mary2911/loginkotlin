package garcia.maria.loginkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnEntrar.setOnClickListener {
        val user = etNombre .text.toString();
        val pass= etPass.text.toString();

        if(user.equals("") or pass.equals("")){
            mensaje("Datos vacios",Toast.LENGTH_LONG)

        }else{
            if (user.equals("Maria") and pass.equals("1234")){
                mensaje("Bienvenid@")
                val i = Intent(this,segundaActivity::class.java)
                i.putExtra("nombre","Mary")
                startActivity(i)
            }else{
                mensaje("No te conozco")
            }
        }
    }
    }

    override fun onStart() {
        super.onStart()
        Log.wtf("ejemplo","debo estar en el onstart");
    }

    override fun onResume() {
        super.onResume()
        Log.w("ejemplo","debo estar en el onResume");
    }



fun mensaje(mensaje:String,dur:Int=Toast.LENGTH_SHORT){
    Toast.makeText(this,mensaje,dur).show()
}




}
