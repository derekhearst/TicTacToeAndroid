package derek.tictactoeapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TwoPlayer extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, reset;
    int turn = 0;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_player);


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


        turn = 1;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b1.getText().toString() == "") {
                    if (turn == 1) {
                        turn = 2;
                        b1.setText("X");
                        b1.setBackgroundColor(Color.rgb(255,109,136));

                    } else if (turn == 2) {
                        turn = 1;
                        b1.setText("O");
                        b1.setBackgroundColor(Color.rgb(109,213,255));

                    }
                }
                b1.setClickable(false);
                checkWin();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b2.getText().toString() == "") {
                    if (turn == 1) {
                        turn = 2;
                        b2.setText("X");
                        b2.setBackgroundColor(Color.rgb(255,109,136));

                    } else if (turn == 2) {
                        turn = 1;
                        b2.setText("O");
                        b2.setBackgroundColor(Color.rgb(109,213,255));

                    }
                }
                b2.setClickable(false);
                checkWin();


            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b3.getText().toString() == "") {
                    if (turn == 1) {
                        turn = 2;
                        b3.setText("X");
                        b3.setBackgroundColor(Color.rgb(255,109,136));

                    } else if (turn == 2) {
                        turn = 1;
                        b3.setText("O");
                        b3.setBackgroundColor(Color.rgb(109,213,255));

                    }
                }
                b3.setClickable(false);
                checkWin();

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b4.getText().toString() == "") {
                    if (turn == 1) {
                        turn = 2;
                        b4.setText("X");
                        b4.setBackgroundColor(Color.rgb(255,109,136));

                    } else if (turn == 2) {
                        turn = 1;
                        b4.setText("O");
                        b4.setBackgroundColor(Color.rgb(109,213,255));

                    }
                }
                b4.setClickable(false);
                checkWin();

            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b5.getText().toString() == "") {
                    if (turn == 1) {
                        turn = 2;
                        b5.setText("X");
                        b5.setBackgroundColor(Color.rgb(255,109,136));

                    } else if (turn == 2) {
                        turn = 1;
                        b5.setText("O");
                        b5.setBackgroundColor(Color.rgb(109,213,255));

                    }
                }
                b5.setClickable(false);
                checkWin();

            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b6.getText().toString() == "") {
                    if (turn == 1) {
                        turn = 2;
                        b6.setText("X");
                        b6.setBackgroundColor(Color.rgb(255,109,136));

                    } else if (turn == 2) {
                        turn = 1;
                        b6.setText("O");
                        b6.setBackgroundColor(Color.rgb(109,213,255));

                    }
                }
                b6.setClickable(false);
                checkWin();

            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b7.getText().toString() == "") {
                    if (turn == 1) {
                        turn = 2;
                        b7.setText("X");
                        b7.setBackgroundColor(Color.rgb(255,109,136));

                    } else if (turn == 2) {
                        turn = 1;
                        b7.setText("O");
                        b7.setBackgroundColor(Color.rgb(109,213,255));

                    }
                }
                b7.setClickable(false);
                checkWin();

            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b8.getText().toString() == "") {
                    if (turn == 1) {
                        turn = 2;
                        b8.setText("X");
                        b8.setBackgroundColor(Color.rgb(255,109,136));

                    } else if (turn == 2) {
                        turn = 1;
                        b8.setText("O");
                        b8.setBackgroundColor(Color.rgb(109,213,255));

                    }
                }
                b8.setClickable(false);
                checkWin();

            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b9.getText().toString() == "") {
                    if (turn == 1) {
                        turn = 2;
                        b9.setText("X");
                        b9.setBackgroundColor(Color.rgb(255,109,136));

                    } else if (turn == 2) {
                        turn = 1;
                        b9.setText("O");
                        b9.setBackgroundColor(Color.rgb(109,213,255));

                    }
                }
                b9.setClickable(false);
                checkWin();

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
                startActivity(new Intent(TwoPlayer.this, Menu.class));
                return true;
            }
        });
    }

    public void checkWin() {
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
        counter++;
        if ((counter > 8)) {
            Toast.makeText(TwoPlayer.this, "DRAW!!", Toast.LENGTH_LONG).show();

            reset();
        }


        if (a.equals(b) && a.equals(c) && a.equals("X")) {
            Toast.makeText(TwoPlayer.this, "Winner Player X", Toast.LENGTH_LONG).show();
            reset();
        }
        if (d == e && e == f && f == "X") {
            Toast.makeText(TwoPlayer.this, "Winner Player X", Toast.LENGTH_LONG).show();
            reset();
        }
        if (g == h && h == i && i == "X") {
            Toast.makeText(TwoPlayer.this, "Winner Player X", Toast.LENGTH_LONG).show();
            reset();
        }

        if (a == d && a == g && a == "X") {
            Toast.makeText(TwoPlayer.this, "Winner Player X", Toast.LENGTH_LONG).show();
            reset();
        }
        if (b == e && e == h && h == "X") {
            Toast.makeText(TwoPlayer.this, "Winner Player X", Toast.LENGTH_LONG).show();
            reset();
        }
        if (c == f && f == i && i == "X") {
            Toast.makeText(TwoPlayer.this, "Winner Player X", Toast.LENGTH_LONG).show();
            reset();
        }


        if (a == e && a == i && a == "X") {
            Toast.makeText(TwoPlayer.this, "Winner Player X", Toast.LENGTH_LONG).show();
            reset();
        }
        if (c == e && e == g && g == "X") {
            Toast.makeText(TwoPlayer.this, "Winner Player X", Toast.LENGTH_LONG).show();
            reset();
        }


        if (a == b && a == c && a == "O") {
            Toast.makeText(TwoPlayer.this, "Winner Player O", Toast.LENGTH_LONG).show();
            reset();
        }
        if (d == e && e == f && f == "O") {
            Toast.makeText(TwoPlayer.this, "Winner Player O", Toast.LENGTH_LONG).show();
            reset();
        }
        if (g == h && h == i && i == "O") {
            Toast.makeText(TwoPlayer.this, "Winner Player O", Toast.LENGTH_LONG).show();
            reset();
        }

        if (a == d && a == g && a == "O") {
            Toast.makeText(TwoPlayer.this, "Winner Player O", Toast.LENGTH_LONG).show();
            reset();
        }
        if (b == e && e == h && h == "O") {
            Toast.makeText(TwoPlayer.this, "Winner Player O", Toast.LENGTH_LONG).show();
            reset();
        }
        if (c == f && f == i && i == "O") {
            Toast.makeText(TwoPlayer.this, "Winner Player O", Toast.LENGTH_LONG).show();
            reset();
        }


        if (a == e && a == i && a == "O") {
            Toast.makeText(TwoPlayer.this, "Winner Player O", Toast.LENGTH_LONG).show();
            reset();
        }
        if (c == e && e == g && g == "O") {
            Toast.makeText(TwoPlayer.this, "Winner Player O", Toast.LENGTH_LONG).show();
            reset();
        }


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




        counter=0;


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

                b1.setBackgroundResource(android.R.drawable.btn_default);
                b2.setBackgroundResource(android.R.drawable.btn_default);
                b3.setBackgroundResource(android.R.drawable.btn_default);
                b4.setBackgroundResource(android.R.drawable.btn_default);
                b5.setBackgroundResource(android.R.drawable.btn_default);
                b6.setBackgroundResource(android.R.drawable.btn_default);
                b7.setBackgroundResource(android.R.drawable.btn_default);
                b8.setBackgroundResource(android.R.drawable.btn_default);
                b9.setBackgroundResource(android.R.drawable.btn_default);
                turn = 1;

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
