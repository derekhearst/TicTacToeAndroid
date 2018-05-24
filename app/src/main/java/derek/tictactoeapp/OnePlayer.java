package derek.tictactoeapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class OnePlayer extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, reset;
    int turn = 1;
    int counter = 0;
    Random ran = new Random();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_player);

        b1 =  findViewById(R.id.b1);
        b2 =  findViewById(R.id.b2);
        b3 =  findViewById(R.id.b3);
        b4 =  findViewById(R.id.b4);
        b5 =  findViewById(R.id.b5);
        b6 =  findViewById(R.id.b6);
        b7 =  findViewById(R.id.b7);
        b8 =  findViewById(R.id.b8);
        b9 =  findViewById(R.id.b9);
        reset =  findViewById(R.id.reset);

        b1.setClickable(true);
        b2.setClickable(true);
        b3.setClickable(true);
        b4.setClickable(true);
        b5.setClickable(true);
        b6.setClickable(true);
        b7.setClickable(true);
        b8.setClickable(true);
        b9.setClickable(true);
        reset.setClickable(true);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setText("X");
                b1.setClickable(false);
                b1.setBackgroundColor(Color.rgb(255,109,136));
                clicked();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b2.setText("X");
                b2.setClickable(false);
                b2.setBackgroundColor(Color.rgb(255,109,136));
                clicked();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b3.setText("X");
                b3.setClickable(false);
                b3.setBackgroundColor(Color.rgb(255,109,136));
                clicked();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b4.setText("X");
                b4.setClickable(false);
                b4.setBackgroundColor(Color.rgb(255,109,136));
                clicked();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b5.setText("X");
                b5.setClickable(false);
                b5.setBackgroundColor(Color.rgb(255,109,136));
                clicked();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b6.setText("X");
                b6.setClickable(false);
                b6.setBackgroundColor(Color.rgb(255,109,136));
                clicked();
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b7.setText("X");
                b7.setClickable(false);
                b7.setBackgroundColor(Color.rgb(255,109,136));
                clicked();
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b8.setText("X");
                b8.setClickable(false);
                b8.setBackgroundColor(Color.rgb(255,109,136));
                clicked();
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b9.setText("X");
                b9.setClickable(false);
                b9.setBackgroundColor(Color.rgb(255,109,136));
                clicked();
            }
        });


        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset();
            }
        });
        reset.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                startActivity(new Intent(OnePlayer.this, Menu.class));
                return true;
            }
        });

    }


    public void clicked() {
        counter++;
        if(checkWin()){
            win();
        }
        else{
            turn = 2;
            aiPick();
        }


    }

    public void picked(){
        counter++;
        if(checkWin()){
            win();
        }
        turn=1;
    }

    public void aiPick() {
        if (turn == 2) {
            int aipicks = ran.nextInt(9) + 1;
            switch (aipicks) {
                case 1:
                    if (!b1.isClickable()) {
                        aiPick();
                        return;
                    } else {
                        b1.setText("O");
                        b1.setClickable(false);
                        b1.setBackgroundColor(Color.rgb(109,213,255));
                        picked();
                        return;
                    }


                case 2:
                    if (!b2.isClickable()) {
                        aiPick();
                        return;
                    } else {
                        b2.setText("O");
                        b2.setClickable(false);
                        b2.setBackgroundColor(Color.rgb(109,213,255));
                        picked();
                        return;
                    }


                case 3:
                    if (!b3.isClickable()) {
                        aiPick();
                        return;
                    } else {
                        b3.setText("O");
                        b3.setClickable(false);
                        b3.setBackgroundColor(Color.rgb(109,213,255));
                        picked();
                        return;
                    }


                case 4:
                    if (!b4.isClickable()) {
                        aiPick();
                        return;
                    } else {
                        b4.setText("O");
                        b4.setClickable(false);
                        b4.setBackgroundColor(Color.rgb(109,213,255));
                        picked();
                        return;
                    }


                case 5:
                    if (!b5.isClickable()) {
                        aiPick();
                        return;
                    } else {
                        b5.setText("O");
                        b5.setClickable(false);
                        b5.setBackgroundColor(Color.rgb(109,213,255));
                        picked();
                        return;
                    }


                case 6:
                    if (!b6.isClickable()) {
                        aiPick();
                        return;
                    } else {
                        b6.setText("O");
                        b6.setClickable(false);
                        b6.setBackgroundColor(Color.rgb(109,213,255));
                        picked();
                        return;
                    }


                case 7:
                    if (!b7.isClickable()) {
                        aiPick();
                        return;
                    } else {
                        b7.setText("O");
                        b7.setClickable(false);
                        b7.setBackgroundColor(Color.rgb(109,213,255));
                        picked();
                        return;
                    }


                case 8:
                    if (!b8.isClickable()) {
                        aiPick();
                        return;
                    } else {
                        b8.setText("O");
                        b8.setClickable(false);
                        b8.setBackgroundColor(Color.rgb(109,213,255));
                        picked();
                        return;
                    }

                case 9:
                    if (!b9.isClickable()) {
                        aiPick();
                        return;
                    } else {
                        b9.setText("O");
                        b9.setClickable(false);
                        b9.setBackgroundColor(Color.rgb(109,213,255));
                        picked();
                        return;
                    }
            }


        }
    }
    
    public boolean checkWin(){
        String a, b, c, d, e, f, g, h, i;
        a = b1.getText().toString();
        b = b2.getText().toString();
        c = b3.getText().toString();
        d = b4.getText().toString();
        e = b5.getText().toString();
        f = b6.getText().toString();
        g = b7.getText().toString();
        h = b8.getText().toString();
        i = b9.getText().toString();
        
        if ((counter > 9)) {
            Toast.makeText(OnePlayer.this, "DRAW!!", Toast.LENGTH_LONG).show();
            return true;
        }
        if (a.equals(b) && a.equals(c) && a.equals("X")) {
            Toast.makeText(OnePlayer.this, "Winner Player X", Toast.LENGTH_LONG).show();
            return true;
        }
        if (d == e && e == f && f == "X") {
            Toast.makeText(OnePlayer.this, "Winner Player X", Toast.LENGTH_LONG).show();
            return true;
        }
        if (g == h && h == i && i == "X") {
            Toast.makeText(OnePlayer.this, "Winner Player X", Toast.LENGTH_LONG).show();
            return true;
        }

        if (a == d && a == g && a == "X") {
            Toast.makeText(OnePlayer.this, "Winner Player X", Toast.LENGTH_LONG).show();
            return true;
        }
        if (b == e && e == h && h == "X") {
            Toast.makeText(OnePlayer.this, "Winner Player X", Toast.LENGTH_LONG).show();
            return true;
        }
        if (c == f && f == i && i == "X") {
            Toast.makeText(OnePlayer.this, "Winner Player X", Toast.LENGTH_LONG).show();
            return true;
        }


        if (a == e && a == i && a == "X") {
            Toast.makeText(OnePlayer.this, "Winner Player X", Toast.LENGTH_LONG).show();
            return true;
        }
        if (c == e && e == g && g == "X") {
            Toast.makeText(OnePlayer.this, "Winner Player X", Toast.LENGTH_LONG).show();
            return true;
        }


        if (a == b && a == c && a == "O") {
            Toast.makeText(OnePlayer.this, "Winner Player O", Toast.LENGTH_LONG).show();
            return true;
        }
        if (d == e && e == f && f == "O") {
            Toast.makeText(OnePlayer.this, "Winner Player O", Toast.LENGTH_LONG).show();
            return true;
        }
        if (g == h && h == i && i == "O") {
            Toast.makeText(OnePlayer.this, "Winner Player O", Toast.LENGTH_LONG).show();
            return true;
        }

        if (a == d && a == g && a == "O") {
            Toast.makeText(OnePlayer.this, "Winner Player O", Toast.LENGTH_LONG).show();
            return true;
        }
        if (b == e && e == h && h == "O") {
            Toast.makeText(OnePlayer.this, "Winner Player O", Toast.LENGTH_LONG).show();
            return true;
        }
        if (c == f && f == i && i == "O") {
            Toast.makeText(OnePlayer.this, "Winner Player O", Toast.LENGTH_LONG).show();
            return true;
        }


        if (a == e && a == i && a == "O") {
            Toast.makeText(OnePlayer.this, "Winner Player O", Toast.LENGTH_LONG).show();
            return true;
        }
        if (c == e && e == g && g == "O") {
            Toast.makeText(OnePlayer.this, "Winner Player O", Toast.LENGTH_LONG).show();
            return true;
        }
        return false;
    }


    public void win() {
        reset();
    }

    public void reset() {
        b1.setClickable(false);
        b2.setClickable(false);
        b3.setClickable(false);
        b4.setClickable(false);
        b5.setClickable(false);
        b6.setClickable(false);
        b7.setClickable(false);
        b8.setClickable(false);
        b9.setClickable(false);
        reset.setClickable(false);




        counter = 0;
        turn = 1;


        new CountDownTimer(1000, 1000) {
            public void onTick(long mil) {

            }

            public void onFinish() {
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
                turn = 1;

                b1.setBackgroundResource(android.R.drawable.btn_default);
                b2.setBackgroundResource(android.R.drawable.btn_default);
                b3.setBackgroundResource(android.R.drawable.btn_default);
                b4.setBackgroundResource(android.R.drawable.btn_default);
                b5.setBackgroundResource(android.R.drawable.btn_default);
                b6.setBackgroundResource(android.R.drawable.btn_default);
                b7.setBackgroundResource(android.R.drawable.btn_default);
                b8.setBackgroundResource(android.R.drawable.btn_default);
                b9.setBackgroundResource(android.R.drawable.btn_default);

                b1.setClickable(true);
                b2.setClickable(true);
                b3.setClickable(true);
                b4.setClickable(true);
                b5.setClickable(true);
                b6.setClickable(true);
                b7.setClickable(true);
                b8.setClickable(true);
                b9.setClickable(true);
                reset.setClickable(true);
            }

        }.start();

    }
}
