package sounds.hop.hip.bryan.liu.com.hiphopsounds;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.annotation.RawRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


/**
 * Created by liubr_000 on 10/22/2017.
 */

public class LilPump extends AppCompatActivity{
    SoundPool pumpSounds;

    int sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pumpSounds = new SoundPool(3, AudioManager.STREAM_MUSIC, 0);
      int lilpump = pumpSounds.load(getApplicationContext(), R.raw.lilpump, 1);
        int ooh = pumpSounds.load(getApplicationContext(), R.raw.pump_ooh, 1);
        int yeah = pumpSounds.load(getApplicationContext(), R.raw.pump_yeah, 1);
        int prrr = pumpSounds.load(getApplicationContext(), R.raw.pump_prrr, 1);


        setContentView(R.layout.activity_lil_pump);
        setButtons("lil pump", R.id.one, R.id.oneSound, lilpump);
        setButtons("ooh", R.id.two, R.id.twoSound, ooh);
        setButtons("yeah", R.id.three, R.id.threeSound, yeah);
        setButtons("prrr", R.id.four, R.id.fourSound, prrr);

    }

       /* TextView lilpump = (TextView) findViewById(R.id.one);
        lilpump.setText("lil pump");Button lilpumpSound = (Button) findViewById(R.id.oneSound);
        lilpumpSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pumpSounds = MediaPlayer.create(LilPump.this, R.raw.lilpump);
                pumpSounds.start();
            }
        });

        TextView ooh = (TextView) findViewById(R.id.two);
        ooh.setText("ooh");
        Button oohSound = (Button) findViewById(R.id.twoSound);
        oohSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pumpSounds = MediaPlayer.create(LilPump.this, R.raw.pumpOoh);
                pumpSounds.start();
            }
        });

    }*/

    public void setPlusButtons(int btnId, int mixButtonId){
        Button btn = (Button) findViewById(btnId);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }


    public void setButtons(String adlib, int id, int btnId, final int rawID/*@RawRes final int sound*/){

        TextView txtview =(TextView) findViewById(id);
        txtview.setText(adlib);
        Button btn =(Button) findViewById(btnId);
        btn.setSoundEffectsEnabled(false);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pumpSounds.play(rawID, 1, 1, 0, 0, 1);

                /*pumpSounds = MediaPlayer.create(getApplicationContext(), sound);
                pumpSounds.start();
                pumpSounds.reset();*/
            }
        });
    }
}
