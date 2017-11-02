package sounds.hop.hip.bryan.liu.com.hiphopsounds;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.annotation.RawRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TwentyOne extends AppCompatActivity {
SoundPool savageSounds;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        savageSounds = new SoundPool(3, AudioManager.STREAM_MUSIC, 0);
        setContentView(R.layout.activity_twenty_one);
        int twentyone = savageSounds.load(getApplicationContext(), R.raw.twentyone, 0);
        /*int yeah = savageSounds.load(getApplicationContext(), R.raw.savage_yeah, 0);
        int woah = savageSounds.load(getApplicationContext(), R.raw.savage_woah6, 0);*/
        setButtons("21", R.id.one, R.id.oneSound, twentyone);
/*        setButtons("yeah", R.id.two, R.id.twoSound, yeah);
        setButtons("woah", R.id.three, R.id.threeSound, woah);*/
    }
    public void setButtons(String adlib, int id, int btnId, final int rawID/*@RawRes final int sound*/){

        TextView txtview =(TextView) findViewById(id);
        txtview.setText(adlib);
        Button btn =(Button) findViewById(btnId);
        btn.setSoundEffectsEnabled(false);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savageSounds.play(rawID, 1, 1, 0, 0, 1);
             /*   savageSounds = MediaPlayer.create(getApplicationContext(), sound);
                savageSounds.start();*/

            }
        });
    }
}
