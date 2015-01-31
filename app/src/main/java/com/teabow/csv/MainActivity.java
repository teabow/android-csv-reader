package com.teabow.csv;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.teabow.csv.model.User;
import com.teabow.csv.reader.CSVReader;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * Created by teabow on 31/01/15.
 */
public class MainActivity extends Activity {

    private static final String DEBUG_TAG = "CSVReader";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        readData();
    }

    private void readData() {
        try {
            List<Object> users = CSVReader.readFile(this, R.raw.users, User.class);
            for (Object o : users) {
                Log.d(DEBUG_TAG, o.toString());
            }
        }
        catch(IOException e) {
            Log.e(DEBUG_TAG, e.getMessage());
        }
        catch(IllegalAccessException e) {
            Log.e(DEBUG_TAG, e.getMessage());
        }
        catch(InstantiationException e) {
            Log.e(DEBUG_TAG, e.getMessage());
        }
        catch(InvocationTargetException e) {
            Log.e(DEBUG_TAG, e.getMessage());
        }
    }

}
