package mx.edu.tesoem.isc.eijd.gridviewbaseadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gvdatos;

    ArrayList<String> arreglo = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gvdatos = findViewById(R.id.gvdatos);
        contenido contenidoobj = new contenido(arreglo,this);
        gvdatos.setAdapter(contenidoobj);
        arreglo.add("Edson");
        arreglo.add("Camila");
        arreglo.add("Maria");
        arreglo.add("Pedro");
        arreglo.add("Tania");
        arreglo.add("Lucero");
        arreglo.add("Gabriela");
        arreglo.add("Adrian");
        arreglo.add("Valentina");
        arreglo.add("Mateo");
    }
}