package biz.fedc.mlfie;

import com.google.android.maps.MapActivity;
import android.app.Activity;
import android.os.Bundle;

/**
 * @author Yoshihiko
 */
public class ShowResultMapsActivity extends MapActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.show_result_maps_activity);
	}

	/**
	 * ルート情報を表示するかどうか.
	 * @return ルート情報を表示するならtrueを返す
	 */
	@Override
	protected boolean isRouteDisplayed() {
		return false;
	}
}
