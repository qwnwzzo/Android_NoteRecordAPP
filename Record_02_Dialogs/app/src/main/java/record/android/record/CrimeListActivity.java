package record.android.record;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Owner on 2015-12-15.
 */
public class CrimeListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_content);

        if(savedInstanceState == null){
            getFragmentManager()
                    .beginTransaction()
                    .add(R.id.fragment_container, new CrimeListFragment(), CrimeListFragment.NAME)
                    .commit();
        }
    }
}
