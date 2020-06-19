package numl.fake.newsdectector;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.chaquo.python.PyObject;
import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;
import com.example.newsdectector.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (! Python.isStarted()) {
            Python.start(new AndroidPlatform(getApplicationContext()));
        }
        Python python = Python.getInstance();
        PyObject pyObject=python.getModule("ss");
PyObject obj=pyObject.callAttr("helloworld");
        Log.d("check",obj.toString());
    }
}
