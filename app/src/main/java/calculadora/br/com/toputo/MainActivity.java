package calculadora.br.com.toputo;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonMais, buttonMenos, buttonDiv,
            buttonMult, buttonPonto, buttonC, buttonEqual;
    EditText visor;

    float valor1, valor2;

    boolean BMais, Bmenos, BX, BDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.putasso2);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonPonto = (Button) findViewById(R.id.buttonPonto);
        buttonMais = (Button) findViewById(R.id.buttonMais);
        buttonMenos = (Button) findViewById(R.id.buttonMenos);
        buttonMult = (Button) findViewById(R.id.buttonMult);
        buttonDiv = (Button) findViewById(R.id.buttondiv);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        visor = (EditText) findViewById(R.id.visor);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                visor.setText(visor.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                visor.setText(visor.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                visor.setText(visor.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                visor.setText(visor.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                visor.setText(visor.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                visor.setText(visor.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                visor.setText(visor.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                visor.setText(visor.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                visor.setText(visor.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                visor.setText(visor.getText() + "0");
            }
        });

        buttonMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (visor == null) {
                    visor.setText("");
                } else {
                    valor1 = Float.parseFloat(visor.getText() + "");
                    BMais = true;
                    visor.setText(null);
                }
            }
        });

        buttonMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor1 = Float.parseFloat(visor.getText() + "");
                Bmenos = true;
                visor.setText(null);
            }
        });

        buttonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor1 = Float.parseFloat(visor.getText() + "");
                BX = true;
                visor.setText(null);
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor1 = Float.parseFloat(visor.getText() + "");
                BDiv = true;
                visor.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor2 = Float.parseFloat(visor.getText() + "");

                if (BMais == true) {
                    visor.setText(valor1 + valor2 + "" );
                    BMais = false;
                }

                if (Bmenos == true) {
                    visor.setText(valor1 - valor2 + "");
                    Bmenos = false;
                }

                if (BX == true) {
                    visor.setText(valor1 * valor2 + "");
                    BX = false;
                }

                if (BDiv == true) {
                    visor.setText(valor1 / valor2 + "");
                    BDiv = false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                visor.setText("");
            }
        });

        buttonPonto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                visor.setText(visor.getText() + ".");
            }
        });
    }
}