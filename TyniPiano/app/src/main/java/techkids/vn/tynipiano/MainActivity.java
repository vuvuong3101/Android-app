package techkids.vn.tynipiano;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.toString() ;
    private ImageView C, D, E, F, G , A, B, C2, D2, F2, G2, A2;
    private int soundC, soundD, soundE, soundF, soundG, soundA, soundB, soundC2, soundD2, soundF2, soundG2, soundA2;
    private SoundPool soundPool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get ID
        C = (ImageView) findViewById(R.id.C);
        C2 = (ImageView) findViewById(R.id.C2);
        D = (ImageView) findViewById(R.id.D);
        D2 = (ImageView) findViewById(R.id.D2);
        E = (ImageView) findViewById(R.id.E);
        F = (ImageView) findViewById(R.id.F);
        F2 = (ImageView) findViewById(R.id.F2);
        G = (ImageView) findViewById(R.id.G);
        G2 = (ImageView) findViewById(R.id.G2);
        A = (ImageView) findViewById(R.id.A);
        A2 = (ImageView) findViewById(R.id.A2);
        B = (ImageView) findViewById(R.id.B);

        // load sound
        soundPool =  new SoundPool.Builder().setMaxStreams(5).build();

        soundC = soundPool.load(this, R.raw.sound_1, 1);
        soundC2 = soundPool.load(this, R.raw.sound_2, 1);
        soundD = soundPool.load(this, R.raw.sound_3, 1);
        soundD2 = soundPool.load(this, R.raw.sound_4, 1);
        soundE = soundPool.load(this, R.raw.sound_5, 1);
        soundF = soundPool.load(this, R.raw.sound_6, 1);
        soundF2 = soundPool.load(this, R.raw.sound_7, 1);
        soundG = soundPool.load(this, R.raw.sound_8, 1);
        soundG2 = soundPool.load(this, R.raw.sound_9, 1);
        soundA = soundPool.load(this, R.raw.sound_10, 1);
        soundA2 = soundPool.load(this, R.raw.sound_11, 1);
        soundB = soundPool.load(this, R.raw.sound_12, 1);

        // xu li phim bam
        C.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == android.view.MotionEvent.ACTION_DOWN) {
                    soundPool.play(soundC, 1, 1, 0, 0, 1);
                    C.setImageResource(R.drawable.pressed_white_key);
                } else if (event.getAction() == android.view.MotionEvent.ACTION_UP) {
                    C.setImageResource(R.drawable.default_white_key);

                }
                return true;
            }
        });

        C2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == android.view.MotionEvent.ACTION_DOWN) {
                    soundPool.play(soundC2, 1, 1, 0, 0, 1);
                    C2.setImageResource(R.drawable.pressed_black_key);
                } else if (event.getAction() == android.view.MotionEvent.ACTION_UP) {
                    C2.setImageResource(R.drawable.default_black_key);

                }
                return true;
            }
        });

        D.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == android.view.MotionEvent.ACTION_DOWN) {
                    soundPool.play(soundD, 1, 1, 0, 0, 1);
                    D.setImageResource(R.drawable.pressed_white_key);
                } else if (event.getAction() == android.view.MotionEvent.ACTION_UP) {
                    D.setImageResource(R.drawable.default_white_key);

                }
                return true;
            }
        });

        D2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == android.view.MotionEvent.ACTION_DOWN) {
                    soundPool.play(soundD2, 1, 1, 0, 0, 1);
                    D2.setImageResource(R.drawable.pressed_black_key);
                } else if (event.getAction() == android.view.MotionEvent.ACTION_UP) {
                    D2.setImageResource(R.drawable.default_black_key);

                }
                return true;
            }
        });

        E.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == android.view.MotionEvent.ACTION_DOWN) {
                    soundPool.play(soundE, 1, 1, 0, 0, 1);
                    E.setImageResource(R.drawable.pressed_white_key);
                } else if (event.getAction() == android.view.MotionEvent.ACTION_UP) {
                    E.setImageResource(R.drawable.default_white_key);

                }
                return true;
            }
        });

        F.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == android.view.MotionEvent.ACTION_DOWN) {
                    soundPool.play(soundF, 1, 1, 0, 0, 1);
                    F.setImageResource(R.drawable.pressed_white_key);
                } else if (event.getAction() == android.view.MotionEvent.ACTION_UP) {
                    F.setImageResource(R.drawable.default_white_key);

                }
                return true;
            }
        });

        F2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == android.view.MotionEvent.ACTION_DOWN) {
                    soundPool.play(soundF2, 1, 1, 0, 0, 1);
                    F2.setImageResource(R.drawable.pressed_black_key);
                } else if (event.getAction() == android.view.MotionEvent.ACTION_UP) {
                    F2.setImageResource(R.drawable.default_black_key);

                }
                return true;
            }
        });

        G.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == android.view.MotionEvent.ACTION_DOWN) {
                    soundPool.play(soundG, 1, 1, 0, 0, 1);
                    G.setImageResource(R.drawable.pressed_white_key);
                } else if (event.getAction() == android.view.MotionEvent.ACTION_UP) {
                    G.setImageResource(R.drawable.default_white_key);

                }
                return true;
            }
        });

        G2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == android.view.MotionEvent.ACTION_DOWN) {
                    soundPool.play(soundG2, 1, 1, 0, 0, 1);
                    G2.setImageResource(R.drawable.pressed_black_key);
                } else if (event.getAction() == android.view.MotionEvent.ACTION_UP) {
                    G2.setImageResource(R.drawable.default_black_key);

                }
                return true;
            }
        });

        A.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == android.view.MotionEvent.ACTION_DOWN) {
                    soundPool.play(soundA, 1, 1, 0, 0, 1);
                    A.setImageResource(R.drawable.pressed_white_key);
                } else if (event.getAction() == android.view.MotionEvent.ACTION_UP) {
                    A.setImageResource(R.drawable.default_white_key);

                }
                return true;
            }
        });
        A2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == android.view.MotionEvent.ACTION_DOWN) {
                    soundPool.play(soundA2, 1, 1, 0, 0, 1);
                    A2.setImageResource(R.drawable.pressed_black_key);
                } else if (event.getAction() == android.view.MotionEvent.ACTION_UP) {
                    A2.setImageResource(R.drawable.default_black_key);

                }
                return true;
            }
        });

        B.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == android.view.MotionEvent.ACTION_DOWN) {
                    soundPool.play(soundB, 1, 1, 0, 0, 1);
                    B.setImageResource(R.drawable.pressed_white_key);
                } else if (event.getAction() == android.view.MotionEvent.ACTION_UP) {
                    B.setImageResource(R.drawable.default_white_key);

                }
                return true;
            }
        });


    }
}
