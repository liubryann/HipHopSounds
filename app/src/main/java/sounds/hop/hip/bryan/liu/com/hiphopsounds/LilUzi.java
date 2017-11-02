package sounds.hop.hip.bryan.liu.com.hiphopsounds;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RawRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by liubr_000 on 10/23/2017.
 */

public class LilUzi extends AppCompatActivity {
    SoundPool UziSounds;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        UziSounds = new SoundPool(3, AudioManager.STREAM_MUSIC, 0);
        setContentView(R.layout.activity_uzi);
        int yeah = UziSounds.load(getApplicationContext(), R.raw.yeahx3yaw, 0);
        setButtons("yeahx5", R.id.one, R.id.oneSound, yeah);
    }
    public void setButtons(String adlib, int id, int btnId, final int rawID/*@RawRes final int sound*/){

        TextView txtview =(TextView) findViewById(id);
        txtview.setText(adlib);
        Button btn =(Button) findViewById(btnId);
        btn.setSoundEffectsEnabled(false);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UziSounds.play(rawID, 1, 1, 0, 0, 1);
              /*  UziSounds = MediaPlayer.create(getApplicationContext(), sound);
                UziSounds.start();*/
            }
        });
    }
}
