package com.londonappbrewery.destini;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    private   TextView story;
    private Button top;
    private Button bottom;
    public int index=1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState!=null)
        {
            index=savedInstanceState.getInt("firstPart");
        }



        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        story=(TextView) findViewById(R.id.storyTextView);
        top=(Button) findViewById(R.id.buttonTop);
        bottom=(Button)findViewById(R.id.buttonBottom);

        if(index==1) {
            story.setText(R.string.T1_Story);
            top.setText(R.string.T1_Ans1);
            bottom.setText(R.string.T1_Ans2);
        }
        else if(index==2)
        {
            story.setText(R.string.T2_Story);
            top.setText(R.string.T2_Ans1);
            bottom.setText(R.string.T2_Ans2);
        }
        else if(index==3)
        {
            story.setText(R.string.T3_Story);
            top.setText(R.string.T3_Ans1);
            bottom.setText(R.string.T3_Ans2);
        }
        else if(index==4)
        {
            story.setText(R.string.T4_End);
            top.setVisibility(View.GONE);
            bottom.setVisibility(View.GONE);

        }
        else if(index==5)
        {
            story.setText(R.string.T5_End);
            top.setVisibility(View.GONE);
            bottom.setVisibility(View.GONE);
        }

        else
        {
            story.setText(R.string.T6_End);
            top.setVisibility(View.GONE);
            bottom.setVisibility(View.GONE);
        }


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(" button clicked","top");
               TopChange();

            }
        });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        bottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("button clicked","button");
                BottomChange();





            }
        });


    }

 public void   TopChange() {

     if (index==1)
     {
          story.setText(R.string.T3_Story);
          top.setText(R.string.T3_Ans1);
          bottom.setText(R.string.T3_Ans2);
          index=3;

      } else if (index==3) {
          story.setText(R.string.T6_End);
          top.setVisibility(View.GONE);
          bottom.setVisibility(View.GONE);
          index=6;

      }
      else
      {
          story.setText(R.string.T3_Story);
          top.setText(R.string.T3_Ans1);
          bottom.setText(R.string.T3_Ans2);
          index=3;
      }


  }

      public void  BottomChange() {
          if (index==1) {
              story.setText(R.string.T2_Story);
              top.setText(R.string.T2_Ans1);
              bottom.setText(R.string.T2_Ans2);
              index=2;

          } else if (index==2) {
              story.setText(R.string.T4_End);
              top.setVisibility(View.GONE);
              bottom.setVisibility(View.GONE);
              index=4;

          }
          else  {
              story.setText(R.string.T5_End);
              top.setVisibility(View.GONE);
              bottom.setVisibility(View.GONE);
              index=5;

          }



      }





@Override
    public void onSaveInstanceState(Bundle outState)
{
    super.onSaveInstanceState(outState);
    outState.putInt("firstPart",index);

}


}
