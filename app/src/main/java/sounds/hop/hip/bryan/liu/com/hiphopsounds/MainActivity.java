package sounds.hop.hip.bryan.liu.com.hiphopsounds;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;
import static android.os.Build.VERSION_CODES.M;

public class MainActivity extends AppCompatActivity {
    Button migos;
    Button pump;
    Button uzi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        migos = (Button) findViewById(R.id.migosButton);
        pump = (Button) findViewById(R.id.pumpButton);
        uzi = (Button) findViewById(R.id.uziButton);
    }

    public void openTwentyOneList(View v) {
        Intent i = new Intent(this, TwentyOne.class);
        startActivity(i);
    }




    public void openMigosList(View v){
        Intent i = new Intent(this, Migos.class);
        startActivity(i);


    }


    public void openPumpList(View v){
        Intent i = new Intent(this, LilPump.class);
        startActivity(i);

       /* final MediaPlayer mp = MediaPlayer.create(this, R.raw.highway85);
        setContentView(R.layout.activity_lil_pump);
        TextView lilpump = (TextView) findViewById(R.id.one);
        lilpump.setText("lil pump");
        Button lilpumpPlus = (Button) findViewById(R.id.onePlus);
        lilpumpPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Button lilpumpSound = (Button) findViewById(R.id.oneSound);
        lilpumpSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });

        TextView ooh = (TextView) findViewById(R.id.two);
        ooh.setText("ooh");
        Button oohPlus = (Button) findViewById(R.id.twoPlus);
        Button oohSound = (Button) findViewById(R.id.twoSound);*/
    }

    public void openUziList(View v){
Intent i = new Intent(this, LilUzi.class);
        startActivity(i);
    }

}
