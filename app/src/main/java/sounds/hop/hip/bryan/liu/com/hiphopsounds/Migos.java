package sounds.hop.hip.bryan.liu.com.hiphopsounds;

import android.media.MediaPlayer;
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

public class Migos extends AppCompatActivity {
    MediaPlayer migosSounds;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_migos);
    }


    public void setButtons(String adlib, int id, int btnId, @RawRes final int sound){

        TextView txtview =(TextView) findViewById(id);
        txtview.setText(adlib);
        Button btn =(Button) findViewById(btnId);
        btn.setSoundEffectsEnabled(false);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                migosSounds = MediaPlayer.create(getApplicationContext(), sound);
                migosSounds.start();
            }
        });
    }
}
