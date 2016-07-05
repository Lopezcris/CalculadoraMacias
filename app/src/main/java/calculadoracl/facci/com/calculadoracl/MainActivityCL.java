package calculadoracl.facci.com.calculadoracl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
public class MainActivityAC extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener{


    Double numero1,numero2,resultado;
    String operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_cl);

    }
    public void Acerca(View v){
        Intent pas = new Intent(this, AcercaActivtyAC.class);
        startActivity(pas);
    }

    public void Borrar(View v){
        numero1=0.0;
        numero2=0.0;
        EditText tv = (EditText) findViewById(R.id.idresulta) ;
        tv.setText("");
    }


    public void onClickOperacionCapturaNumero1(View miView)
    {
        EditText tv = (EditText) findViewById(R.id.idresulta) ;
        numero1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }

    public void Uno(View miView)
    {
        EditText tv = (EditText) findViewById(R.id.idresulta) ;
        tv.setText(tv.getText() + "1");
    }
    public void Dos(View miView)
    {
        EditText tv = (EditText) findViewById(R.id.idresulta) ;
        tv.setText(tv.getText() + "2");
    }
    public void Tres(View miView)
    {
        EditText tv = (EditText) findViewById(R.id.idresulta) ;
        tv.setText(tv.getText() + "3");
    }
    public void Cuatro(View miView)
    {
        EditText tv = (EditText) findViewById(R.id.idresulta) ;
        tv.setText(tv.getText() + "4");
    }
    public void Cinco(View miView)
    {
        EditText tv = (EditText) findViewById(R.id.idresulta) ;
        tv.setText(tv.getText() + "5");
    }
    public void Seis(View miView)
    {
        EditText tv = (EditText) findViewById(R.id.idresulta) ;
        tv.setText(tv.getText() + "6");
    }
    public void Siete(View miView)
    {
        EditText tv = (EditText) findViewById(R.id.idresulta) ;
        tv.setText(tv.getText() + "7");
    }
    public void Ocho(View miView)
    {
        EditText tv = (EditText) findViewById(R.id.idresulta) ;
        tv.setText(tv.getText() + "8");
    }
    public void Nueve(View miView)
    {
        EditText tv = (EditText) findViewById(R.id.idresulta) ;
        tv.setText(tv.getText() + "9");
    }
    public void Cero(View miView)
    {
        EditText tv = (EditText) findViewById(R.id.idresulta) ;
        tv.setText(tv.getText() + "0");
    }

    public void Igual(View miView)
    {
        EditText tv = (EditText) findViewById(R.id.idresulta) ;
        numero2 = Double.parseDouble(tv.getText().toString());

        if(operador.equals("+"))
        {
            resultado= numero1+numero2;
        }
        else if(operador.equals("-"))
        {
            resultado= numero1-numero2;
        }
        else if(operador.equals("*"))
        {
            resultado= numero1*numero2;
        }
        else if(operador.equals("/"))
        {
            resultado= numero1/numero2;
        }
        tv.setText(resultado.toString());
    }

    public void Mas(View miView)
    {
        operador="+";
        onClickOperacionCapturaNumero1(miView);
    }
    public void Menos(View miView)
    {
        operador="-";
        onClickOperacionCapturaNumero1(miView);
    }
    public void Multiplicar(View miView)
    {
        operador="*";
        onClickOperacionCapturaNumero1(miView);
    }


    @Override
    public void onClick(View v) {
        EditText pantalla = (EditText)findViewById(R.id.idresulta);
        int press = v.getId();
        String al = pantalla.getText().toString();

    }
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }
}
