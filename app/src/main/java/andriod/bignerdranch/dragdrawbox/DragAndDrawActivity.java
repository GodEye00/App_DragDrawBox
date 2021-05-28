package andriod.bignerdranch.dragdrawbox;


import android.content.Context;
import android.content.Intent;

import androidx.fragment.app.Fragment;

public class DragAndDrawActivity extends
       SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return DragAndDrawFragment.newInstance();
    }
}