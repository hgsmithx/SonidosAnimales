package cl.ubb.animalsounds;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //NO TENGO NI PICO IDEA QUE ES ESTO...
    private final int maxStreams=1;
    private final int streamType=AudioManager.STREAM_MUSIC;
    private final int srcQuality=0;
    private SoundPool soundPool;

    private int idSoundCat;
    private int idSoundCow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        soundPool = new SoundPool(maxStreams, streamType, srcQuality);
        idSoundCat = soundPool.load(getApplicationContext(), R.raw.cat,1);
        idSoundCow = soundPool.load(getApplicationContext(),R.raw.cow,1 );
    }

    public void playCat(View view){
        soundPool.play(idSoundCat, 1,1,1,0,1);

    }
    public void playCow(View view){
        soundPool.play(idSoundCow,1,1,1,0,1);
    }

}
