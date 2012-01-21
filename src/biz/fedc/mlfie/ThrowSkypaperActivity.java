package biz.fedc.mlfie;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * @author Yoshihiko
 */
public class ThrowSkypaperActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// 画面のXMLを設定する
		setContentView(R.layout.throw_skypaper_activity);
		
		Button button = (Button)findViewById(R.id.button1);
		
		Bundle extras = getIntent().getExtras();
		if (extras != null) {
			EditText editText = (EditText)findViewById(R.id.editText1);
			editText.setText(extras.getCharSequence("TEXT"));
		}
		
		button.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				Intent intent = new Intent();
				EditText editText = (EditText)findViewById(R.id.editText1);
				CharSequence text = editText.getText();
				intent.putExtra("TEXT", text);
				setResult(RESULT_OK, intent);
				finish();
			}
		});
	}

}
