package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //1-x
    //2-0
    public int c=0;
    int[] a={0,0,0,0,0,0,0,0,0};
    public static final String s="com.example.Tictactoe.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public int win() {
        if (a[0] == 1 && a[1] == 1 && a[2] == 1)
            return (100);
        else if(a[0]==1 && a[3]==1 && a[6]==1)
            return (100);
        else if(a[6]==1 && a[7]==1 && a[8]==1)
            return (100);
        else if(a[2]==1 && a[5]==1 && a[8]==1)
            return (100);
        else if(a[0]==1 && a[4]==1 && a[8]==1)
            return (100);
        else if(a[2]==1 && a[4]==1 && a[6]==1)
            return (100);
        else if(a[3]==1 && a[4]==1 && a[5]==1)
            return (100);
        else if(a[1]==1 && a[4]==1 && a[7]==1)
            return (100);
        else if(a[0]==2 && a[1]==2 && a[2]==2)
            return (200);
        else if(a[0]==2 && a[3]==2 && a[6]==2)
            return (200);
        else if(a[6]==2 && a[7]==2 && a[8]==2)
            return (200);
        else if(a[2]==2 && a[5]==2 && a[8]==2)
            return (200);
        else if(a[0]==2 && a[4]==2 && a[8]==2)
            return (200);
        else if(a[2]==2 && a[4]==2 && a[6]==2)
            return (200);
        else if(a[3]==2 && a[4]==2 && a[5]==2)
            return (200);
        else if(a[1]==2 && a[4]==2 && a[7]==2)
            return (200);
        else
            return (300);

    }

    public  void click_1(View view)
    {
        ImageView view_1 =(ImageView)findViewById(R.id.imageView_0);

        if(a[0]==0)
        {
            c=c+1;
            if (c % 2 != 0) {
                Toast.makeText(this, "Player 2 Turn", Toast.LENGTH_SHORT).show();
                view_1.setImageResource(R.drawable.cross);
                a[0] = 1;
            } else {
                Toast.makeText(this, "Player 1 Turn", Toast.LENGTH_SHORT).show();
                view_1.setImageResource(R.drawable.zero);
                a[0] = 2;
            }
        }
        int r=win();
        if(r==100)
        {
            Intent intent = new Intent(this, DisplayActivity.class);
            String message="X wins the game";
            intent.putExtra(s,message);
            startActivity(intent);
        }
        if(r==200)
        {
            Intent intent = new Intent(this, DisplayActivity.class);
            String message="O wins the game";
            intent.putExtra(s,message);
            startActivity(intent);
        }
        if(r==300 && c==9)
        {
            Intent intent = new Intent(this, DisplayActivity.class);
            String message="Its a Draw";
            intent.putExtra(s,message);
            startActivity(intent);
        }
    }
    public  void click_2(View view)
    {
        ImageView view_1 =(ImageView)findViewById(R.id.imageView_1);

        if(a[1]==0)
        {
            c=c+1;
            if (c % 2 != 0) {
                Toast.makeText(this, "Player 2 turn", Toast.LENGTH_SHORT).show();
                view_1.setImageResource(R.drawable.cross);
                a[1] = 1;
            } else {
                Toast.makeText(this, "Player 1 turn", Toast.LENGTH_SHORT).show();
                view_1.setImageResource(R.drawable.zero);
                a[1] = 2;
            }
        }
        int r=win();
        if(r==100)
        {
            Intent intent = new Intent(this, DisplayActivity.class);
            String message="X wins the game";
            intent.putExtra(s,message);
            startActivity(intent);
        }
        if(r==200)
        {
            Intent intent = new Intent(this, DisplayActivity.class);
            String message="O wins the game";
            intent.putExtra(s,message);
            startActivity(intent);
        }
        if(r==300 && c==9)
        {
            Intent intent = new Intent(this, DisplayActivity.class);
            String message="Its a Draw";
            intent.putExtra(s,message);
            startActivity(intent);
        }
    }
    public  void click_3(View view)
    {
        ImageView view_1 =(ImageView)findViewById(R.id.imageView_2);

        if(a[2]==0)
        {
            c=c+1;
            if(c%2!=0)
            {
                Toast.makeText(this, "Player 2 turn", Toast.LENGTH_SHORT).show();
                view_1.setImageResource(R.drawable.cross);
                a[2]=1;
            }
            else
            {
                Toast.makeText(this, "Player 1 turn", Toast.LENGTH_SHORT).show();
                view_1.setImageResource(R.drawable.zero);
                a[2]=2;
            }
        }
        int r=win();
        if(r==100)
        {
            Intent intent = new Intent(this, DisplayActivity.class);
            String message="X wins the game";
            intent.putExtra(s,message);
            startActivity(intent);
        }
        if(r==200)
        {
            Intent intent = new Intent(this, DisplayActivity.class);
            String message="O wins the game";
            intent.putExtra(s,message);
            startActivity(intent);
        }
        if(r==300 && c==9)
        {
            Intent intent = new Intent(this, DisplayActivity.class);
            String message="Its a Draw";
            intent.putExtra(s,message);
            startActivity(intent);
        }
    }
    public  void click_4(View view)
    {
        ImageView view_1 =(ImageView)findViewById(R.id.imageView_3);

        if(a[3]==0)
        {
            c=c+1;
            if(c%2!=0)
            {
                Toast.makeText(this, "Player 2 turn", Toast.LENGTH_SHORT).show();
                view_1.setImageResource(R.drawable.cross);
                a[3]=1;
            }
            else
            {
                Toast.makeText(this, "Player 1 turn", Toast.LENGTH_SHORT).show();
                view_1.setImageResource(R.drawable.zero);
                a[3]=2;
            }
        }
        int r=win();
        if(r==100)
        {
            Intent intent = new Intent(this, DisplayActivity.class);
            String message="X wins the game";
            intent.putExtra(s,message);
            startActivity(intent);
        }
        if(r==200)
        {
            Intent intent = new Intent(this, DisplayActivity.class);
            String message="O wins the game";
            intent.putExtra(s,message);
            startActivity(intent);
        }
        if(r==300 && c==9)
        {
            Intent intent = new Intent(this, DisplayActivity.class);
            String message="Its a Draw";
            intent.putExtra(s,message);
            startActivity(intent);
        }
    }
    public  void click_5(View view)
    {
        ImageView view_1 =(ImageView)findViewById(R.id.imageView_4);

        if(a[4]==0)
        {
            c=c+1;
            if(c%2!=0)
            {
                Toast.makeText(this, "Player 2 turn", Toast.LENGTH_SHORT).show();
                view_1.setImageResource(R.drawable.cross);
                a[4]=1;
            }
            else
            {
                Toast.makeText(this, "Player 1 turn", Toast.LENGTH_SHORT).show();
                view_1.setImageResource(R.drawable.zero);
                a[4]=2;
            }
        }
        int r=win();
        if(r==100)
        {
            Intent intent = new Intent(this, DisplayActivity.class);
            String message="X wins the game";
            intent.putExtra(s,message);
            startActivity(intent);
        }
        if(r==200)
        {
            Intent intent = new Intent(this, DisplayActivity.class);
            String message="O wins the game";
            intent.putExtra(s,message);
            startActivity(intent);
        }
        if(r==300 && c==9)
        {
            Intent intent = new Intent(this, DisplayActivity.class);
            String message="Its a Draw";
            intent.putExtra(s,message);
            startActivity(intent);
        }
    }
    public  void click_6(View view)
    {
        ImageView view_1 =(ImageView)findViewById(R.id.imageView_5);

        if(a[5]==0)
        {
            c=c+1;
            if(c%2!=0)
            {
                Toast.makeText(this, "Player 2 turn", Toast.LENGTH_SHORT).show();
                view_1.setImageResource(R.drawable.cross);
                a[5]=1;
            }
            else
            {
                Toast.makeText(this, "Player 1 turn", Toast.LENGTH_SHORT).show();
                view_1.setImageResource(R.drawable.zero);
                a[5]=2;
            }
        }
        int r=win();
        if(r==100)
        {
            Intent intent = new Intent(this, DisplayActivity.class);
            String message="X wins the game";
            intent.putExtra(s,message);
            startActivity(intent);
        }
        if(r==200)
        {
            Intent intent = new Intent(this, DisplayActivity.class);
            String message="O wins the game";
            intent.putExtra(s,message);
            startActivity(intent);
        }
        if(r==300 && c==9)
        {
            Intent intent = new Intent(this, DisplayActivity.class);
            String message="Its a Draw";
            intent.putExtra(s,message);
            startActivity(intent);
        }
    }
    public  void click_7(View view)
    {
        ImageView view_1 =(ImageView)findViewById(R.id.imageView_6);

        if(a[6]==0)
        {
            c=c+1;
            if(c%2!=0)
            {
                Toast.makeText(this, "Player 2 turn", Toast.LENGTH_SHORT).show();
                view_1.setImageResource(R.drawable.cross);
                a[6]=1;
            }
            else
            {
                Toast.makeText(this, "Player 1 turn", Toast.LENGTH_SHORT).show();
                view_1.setImageResource(R.drawable.zero);
                a[6]=2;
            }
        }
        int r=win();
        if(r==100)
        {
            Intent intent = new Intent(this, DisplayActivity.class);
            String message="X wins the game";
            intent.putExtra(s,message);
            startActivity(intent);
        }
        if(r==200)
        {
            Intent intent = new Intent(this, DisplayActivity.class);
            String message="O wins the game";
            intent.putExtra(s,message);
            startActivity(intent);
        }
        if(r==300 && c==9)
        {
            Intent intent = new Intent(this, DisplayActivity.class);
            String message="Its a Draw";
            intent.putExtra(s,message);
            startActivity(intent);
        }
    }
    public  void click_8(View view)
    {
        ImageView view_1 =(ImageView)findViewById(R.id.imageView_7);

        if(a[7]==0)
        {
            c=c+1;
            if(c%2!=0)
            {
                Toast.makeText(this, "Player 2 turn", Toast.LENGTH_SHORT).show();
                view_1.setImageResource(R.drawable.cross);
                a[7]=1;
            }
            else
            {
                Toast.makeText(this, "Player 1 turn", Toast.LENGTH_SHORT).show();
                view_1.setImageResource(R.drawable.zero);
                a[7]=2;
            }
        }
        int r=win();
        if(r==100)
        {
            Intent intent = new Intent(this, DisplayActivity.class);
            String message="X wins the game";
            intent.putExtra(s,message);
            startActivity(intent);
        }
        if(r==200)
        {
            Intent intent = new Intent(this, DisplayActivity.class);
            String message="O wins the game";
            intent.putExtra(s,message);
            startActivity(intent);
        }
        if(r==300 && c==9)
        {
            Intent intent = new Intent(this, DisplayActivity.class);
            String message="Its a Draw";
            intent.putExtra(s,message);
            startActivity(intent);
        }
    }
    public  void click_9(View view)
    {
        ImageView view_1 =(ImageView)findViewById(R.id.imageView_8);

        if(a[8]==0)
        {
            c=c+1;
            if(c%2!=0)
            {
                Toast.makeText(this, "Player 2 turn", Toast.LENGTH_SHORT).show();
                view_1.setImageResource(R.drawable.cross);
                a[8]=1;
            }
            else
            {
                Toast.makeText(this, "Player 1 turn", Toast.LENGTH_SHORT).show();
                view_1.setImageResource(R.drawable.zero);
                a[8]=2;
            }
        }
        int r=win();
        if(r==100)
        {
            Intent intent = new Intent(this, DisplayActivity.class);
            String message="X wins the game";
            intent.putExtra(s,message);
            startActivity(intent);
        }
        if(r==200)
        {
            Intent intent = new Intent(this, DisplayActivity.class);
            String message="O wins the game";
            intent.putExtra(s,message);
            startActivity(intent);
        }
        if(r==300 && c==9)
        {
            Intent intent = new Intent(this, DisplayActivity.class);
            String message="Its a Draw";
            intent.putExtra(s,message);
            startActivity(intent);
        }
    }

}
