package com.map.personalitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {
    TextView inst,ques_tv;
    Button in1,in2,n,ac2,ac1,res;
    String[] q_array={"I feel uncomfortable when I disagree with someone","I lose my belongings","I have a vivid imagination","I would enjoy attending a large party in my honor","I dislike being in competition with others","I prefer to follow a schedule","I question the wisdom of my elders","I enjoy being the center of attention","I try to avoid conflict","I make sure my work is finished on time","It is important to me to follow traditions","I make an effort to be popular","I sympathize with the homeless","I have trouble controlling my impulses","I think about why people do the things they do","Being around lots of people energizes me","I am helpful to the people around me","I am ambitious","I like to do things as they were done in the past","I avoid being alone","I forgive easily","I like trying out new hobbies","I like to stay active","It is best to be totally objective when making a decision","I keep my belongings in their proper place","I have a rich fantasy life","I have little to say","I enjoy being there for people when they are feeling sad","I would rather go with the flow than have a set schedule","I enjoy philosophical discussions","I let other people know what I think","I avoid arguing, even when I disagree","I am very attentive to deadlines","I would like to play a musical instrument","I have a lot of fun","I resist temptations","It is easy for me to talk to strangers","I am concerned for the welfare of elderly people","I am determined to achieve success in life","I believe in the importance of art","I like to spend my free time alone","I believe people should be punished for their mistakes","I enjoy having a daily routine","I spend time seeking out new experiences","I am on the go","I wish other people would be more logical","I like to tidy up","I enjoy imagining the future","I find it difficult to express my opinions","I like to help others with their personal problems","I finish assignments before they are due","I like thinking about the mysteries of the universe","I have a lot of energy","I can't stand when someone doesn't like me","I follow my impulses","I enjoy trying to understand complicated ideas","I feel very happy","I spend time trying to understand myself","I get a thrill out of meeting new people","I need support from other people","I am not bothered by disorder","I enjoy going to museums"};
    String[] agree={"Yes I try not to draw attention to myself","I like debate and feel very uncomfortable when I disagree with someone","I can not protect and often lose my belongings","I am visionary and have a very vivid imagination","I would dynamically and greatly enjoy attending a large party in my honor","I do dislike being in competition with others and perform","I always prefer to follow a schedule like a teacher","I definitely question and inspect the wisdom of my elders","I enjoy performing and being the center of attention","I try to avoid conflict","I make sure my work is finished on time like a composer","It is important and fascinating to me to follow traditions and craftsmanship","I make an enthuastic and dynamic effort to be popular","I really sympathize with the homeless and protect them","I am not a commander have trouble and difficult in controlling my impulses","I vision and think about why people do the things they do","Yes Being around lots of people energizes me","I am provider to the people around me","I am extremly  highly ambitious and want to be a champion","I like to do and supervise things as they were done in the past","I avoid being alone and sad","I forgive easily","I like trying out new hobbies and have lot of fun","I like to stay active","It is good and best to be totally objective when making a decision like a mastermind","I like to architect my belongings in their proper place","I have a rich fantasy life","I have and strongly believe in little to say","I am a healer I enjoy being there for people when they are feeling sad and cheer them up ","I would rather go with the flow than have a set schedule ","I enjoy philosophical discussions like teacher and visionary ","Yes I let other people know what I think","Yes I avoid arguing, even when I disagree","I am very attentive to deadlines","I would love and delighted to play a musical instrument","I have a lot of fun and be energetic","Yes I resist temptations","Like a teacher and provider It is easy for me to talk to strangers","I like to provide and I am concerned for the welfare of elderly people","I am champion anddetermined to achieve success in life","I believe in the importance of art and craft","Yes I like to spend my free time alone","I believe and inspect people should be punished for their mistakes","I enjoy having a daily routine","I spend time seeking out new experiences and crafting ","Yes I am on the go","I wish other people would be more logical like to teach them","I like to compose and tidy up","Yes I enjoy imagining the future","Yes I find it very difficult to express my opinions","I like to counsel others with their personal problems","I finish assignments before they are due like champion","I like visioning about the mysteries of the universe","I have a lot of energy","I can't stand when someone doesn't like me","Yes I follow my impulses","I enjoy trying to understand complicated ideas and master my mind","I feel very happy","I spend time trying to understand and supervise myself","I get a thrill out of meeting new people","I need support from other people","I am not bothered by disorder","I enjoy travelling to museums"};
    String[] disagree={"No I try not to draw attention to myself","No I do not feel uncomfortable when I disagree with someone","No I never lose my belongings","I do not have a vivid imagination","I would not enjoy attending a large party in my honor","I never mind being in competition with others","I never prefer to follow a schedule","I do not question the wisdom of my elders","I hate being the center of attention","I try to create conflict","I procastinate so my work is never finished on time","It is bad to me to follow traditions","I not want to be popular","I mock the homeless","I do not have trouble controlling my impulses","I never think about why people do the things they do","Being around lots of people makes me dull","I am not helpful to the people around me","I am not at all ambitious","I dislike to do things as they were done in the past","I love being alone","I punishes easily","I have no new hobbies","I like to stay passive","It is worst to be totally objective when making a decision",
            "I never keep my belongings in their proper place","I have a poor fantasy life","I have lot of things to say","I hate being there for people when they are feeling sad","I would never go with the flow than have a set schedule","I get bore on philosophical discussions","I never let other people know what I think","I like to debate, even when I disagree","I am not very attentive to deadlines","I would fo not like to play a musical instrument","I am often sad","I do not resist temptations","It is hard for me to talk to strangers","I am not concerned for the welfare of elderly people","I am not determined to achieve success in life like a loser","I do not believe in the importance of art","I like to spend my free time alone","I believe people should be forgiven for their mistakes","I dislike having a daily routine","I do not spend time seeking out new experiences","I am not on the go","I wish other people would be less logical","I like to mess up","I enjoy imagining the future","I find it easy to express my opinions","I like to trouble others with their personal problems","I am lazy and do not finish assignments before they are due","I dislike thinking about the mysteries of the universe","I have a lot of energy","I can stand when someone doesn't like me I do not debate","I do not follow my impulses","I hate trying to understand complicated ideas","I feel very happy","No, I do not spend time trying to understand myself","I do not get a thrill out of meeting new people","I am mastermind andao not need support from other people","I am afraid by disorder","I never appreciate going to museums"};

    int length=q_array.length;
    String[] ans= new String[length+1];
    int i=0;
    //MediaPlayer mp1;

    @Override
    protected void onStart() {
        super.onStart();
        //mp1=MediaPlayer.create(this,R.raw.peaceandhappydavidfesliyan);
        //mp1.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        inst=findViewById(R.id.textView5);
        ques_tv=findViewById(R.id.textView6);
        in1=findViewById(R.id.button2);
        in2=findViewById(R.id.button3);
        n=findViewById(R.id.button4);
        ac2=findViewById(R.id.button5);
        ac1=findViewById(R.id.button6);
        res=findViewById(R.id.button8);
        in1.setOnClickListener(this);
        in2.setOnClickListener(this);
        n.setOnClickListener(this);
        ac2.setOnClickListener(this);
        ac1.setOnClickListener(this);
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(getApplicationContext(),Result.class);
                intent1.putExtra("string-array", ans);
                startActivity(intent1);
            }
        });
        res.setEnabled(false);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button2:
                ans[i]=disagree[i];
                inst.setText(Integer.toString(i)+ ans[i]);
                ques_tv.setText(q_array[i]);
                i=i+1;
                if(i==length) {
                    in1.setEnabled(false);
                    in2.setEnabled(false);
                    n.setEnabled(false);
                    ac1.setEnabled(false);
                    ac2.setEnabled(false);
                    ques_tv.setText("Test completed !");
                    res.setEnabled(true);
                    break;
                }
                break;
            case R.id.button3:
                ans[i]=disagree[i];
                inst.setText(Integer.toString(i)+ ans[i]);
                ques_tv.setText(q_array[i]);
                i=i+1;
                if(i==length+1) {
                    in1.setEnabled(false);
                    in2.setEnabled(false);
                    n.setEnabled(false);
                    ac1.setEnabled(false);
                    ac2.setEnabled(false);
                    ques_tv.setText("Test completed !");
                    res.setEnabled(true);
                    break;
                }
                break;
            case R.id.button4:
                ans[i]="";
                inst.setText(Integer.toString(i)+ ans[i]);
                ques_tv.setText(q_array[i]);
                i=i+1;
                if(i==length) {
                    in1.setEnabled(false);
                    in2.setEnabled(false);
                    n.setEnabled(false);
                    ac1.setEnabled(false);
                    ac2.setEnabled(false);
                    ques_tv.setText("Test completed !");
                    res.setEnabled(true);
                    break;
                }
                break;
            case R.id.button5:
                ans[i]=agree[i];
                inst.setText(Integer.toString(i)+ ans[i]);
                ques_tv.setText(q_array[i]);
                i=i+1;
                if(i==length) {
                    in1.setEnabled(false);
                    in2.setEnabled(false);
                    n.setEnabled(false);
                    ac1.setEnabled(false);
                    ac2.setEnabled(false);
                    ques_tv.setText("Test completed !");
                    res.setEnabled(true);
                    break;
                }
                break;
            case R.id.button6:
                ans[i]=agree[i];
                inst.setText(Integer.toString(i)+ ans[i]);
                ques_tv.setText(q_array[i]);
                i=i+1;
                if(i==length) {
                    in1.setEnabled(false);
                    in2.setEnabled(false);
                    n.setEnabled(false);
                    ac1.setEnabled(false);
                    ac2.setEnabled(false);
                    ques_tv.setText("Test completed !");
                    res.setEnabled(true);
                    break;
                }
                //inst.setText(Integer.toString(i)+ ans[i]);
                //ques_tv.setText(q_array[i++]);

                /*if(i==length+1){
                    in1.setEnabled(false);
                    in2.setEnabled(false);
                    n.setEnabled(false);
                    ac1.setEnabled(false);
                    ac2.setEnabled(false);
                    ques_tv.setText("Test completed !");
                    res.setEnabled(true);
                    break;
                }*/

        }


    }

    @Override
    protected void onPause() {
        super.onPause();
        //mp1.stop();
    }
}
