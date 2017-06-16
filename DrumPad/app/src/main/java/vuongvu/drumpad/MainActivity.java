package vuongvu.drumpad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import vuongvu.drumpad.touches.Touch;
import vuongvu.drumpad.touches.TouchAction;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.toString();
    List<ImageView> defaultKeys = new ArrayList<>();
    List<TouchInfo> touchInfoList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        defaultKeys.add((ImageView) findViewById(R.id.key1));
        defaultKeys.add((ImageView) findViewById(R.id.key2));
        defaultKeys.add((ImageView) findViewById(R.id.key3));
        defaultKeys.add((ImageView) findViewById(R.id.key4));
        defaultKeys.add((ImageView) findViewById(R.id.key5));
        defaultKeys.add((ImageView) findViewById(R.id.key6));
        defaultKeys.add((ImageView) findViewById(R.id.key7));
        defaultKeys.add((ImageView) findViewById(R.id.key8));
        defaultKeys.add((ImageView) findViewById(R.id.key9));
        defaultKeys.add((ImageView) findViewById(R.id.key10));
        defaultKeys.add((ImageView) findViewById(R.id.key11));
        defaultKeys.add((ImageView) findViewById(R.id.key12));
        defaultKeys.add((ImageView) findViewById(R.id.key13));
        defaultKeys.add((ImageView) findViewById(R.id.key14));
        defaultKeys.add((ImageView) findViewById(R.id.key15));
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        List<Touch> touches = Touch.processEvent(event);
        Log.d(TAG, "onTouchEvent: " + touches.toString());
        if ( touches.size() == 0) return false;

        Touch firstTouch =  touches.get(0);
        if ( firstTouch.getAction() == TouchAction.DOWN){
            ImageView pressedKey = FindKeyByTouch(firstTouch);
            if (!checkPressedKey(pressedKey)) {
                //TODO : Play sound
                touchInfoList.add(new TouchInfo(pressedKey, firstTouch));
            }
        }
        updateKey();
        return super.onTouchEvent(event);
    }

    private  void updateKey() {
        for (ImageView defaultkey: defaultKeys) {
            if (checkPressedKey(defaultkey)) {
                defaultkey.setImageResource(R.drawable.key_pressed);
            } else {
                defaultkey.setImageResource(R.drawable.key_default);
            }
        }
    }
    private  boolean checkPressedKey(ImageView pressedkey) {
        for (TouchInfo touchInfo : touchInfoList) {
            if (touchInfo.pressedKey == pressedkey ) {
                return true;
            }
        }
        return  false;
    }
    public  boolean Inside(float x, float y, View view) {
        int [] location =  new int[2];
        view.getLocationOnScreen(location);

        int top = location[1];
        int left =  location[0];
        int right = left + view.getWidth();
        int bottom =  top + view.getHeight();
        return x > left && x < right && x > top && x < bottom;
    }

    private  ImageView FindKeyByTouch(Touch touch) {
        for ( ImageView keydefault : defaultKeys) {
            if ( touch.checkHit(keydefault)) {
                return keydefault;
            }
        }

        return  null;
    }

    class TouchInfo {
        public  ImageView pressedKey;
        public  Touch touch;

        public TouchInfo(ImageView pressedKey, Touch touch) {
            this.pressedKey = pressedKey;
            this.touch = touch;
        }
    }
}
