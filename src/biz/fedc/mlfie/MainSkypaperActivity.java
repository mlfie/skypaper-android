package biz.fedc.mlfie;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

/**
 * @author Yoshihiko
 */
public class MainSkypaperActivity extends Activity {
	
	private static final int SHOW_EDITOR = 0;
	private static final int SHOW_RESULT_MAPS = 1;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		// 画面のXMLを設定する
        setContentView(R.layout.main_skypaper_activity);
        
        Button button01 = (Button)findViewById(R.id.button1);
        button01.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				Intent intent = new Intent(MainSkypaperActivity.this, ThrowSkypaperActivity.class);
				TextView textView = (TextView)findViewById(R.id.textView1);
				CharSequence text = textView.getText();
				intent.putExtra("TEXT", text);
				startActivityForResult(intent, SHOW_EDITOR);
			}
		});
        
        Button button02 = (Button)findViewById(R.id.button2);
        button02.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				Intent intent = new Intent(MainSkypaperActivity.this, ShowResultMapsActivity.class);
				startActivity(intent);
			}
		});
    }
    
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    	if (requestCode == SHOW_EDITOR) {
			if (resultCode == RESULT_OK) {
				TextView textView = (TextView)findViewById(R.id.textView1);
				textView.setText(data.getCharSequenceExtra("TEXT"));
			}
		}
    }
    
    @Override
    protected void onResume() {
    	super.onResume();
    	Log.d(this.getClass().getName(), "onResume");
    }
    
    @Override
    protected void onPause() {
    	super.onPause();
    	Log.d(this.getClass().getName(), "onPause");
    }
}