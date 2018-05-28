/*=====================================================================
□ INFORMATION
  ○ Data : 28.05.2018
  ○ Mail : eun1310434@naver.com
  ○ Blog : https://blog.naver.com/eun1310434
  ○ Reference : Do it android app Programming

□ FUNCTION
  ○ CODING을 활용한 Linear Layout Setting

□ STUDY
  ○ Linear Layout
     - LinearLayout is a view group that aligns all children in a single direction, vertically or horizontally.
        You can specify the layout direction with the android:orientation attribute.
        All children of a LinearLayout are stacked one after the other,
        so a vertical list will only have one child per row,
        no matter how wide they are, and a horizontal list will only be one row high
        (the height of the tallest child, plus padding).
        A LinearLayout respects margins between children and the gravity
        (right, center, or left alignment) of each child.
=====================================================================*/

package com.eun1310434.linearlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.LinearLayout;

public class LinearLayoutCodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL);

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT);

        Button button01 = new Button(this);
        button01.setText("Button 01");
        button01.setLayoutParams(params);
        mainLayout.addView(button01);

        setContentView(mainLayout);
    }
}
