package sugarcaneselection.thaib.org.sugarcanselection.review.util;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.data.RadarDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;

import sugarcaneselection.thaib.org.sugarcanselection.Item.CloneDataItem;
import sugarcaneselection.thaib.org.sugarcanselection.Item.ScoreItem;
import sugarcaneselection.thaib.org.sugarcanselection.R;
import sugarcaneselection.thaib.org.sugarcanselection.database.Columns;

public class ReviewCloneSelectedActivity extends AppCompatActivity {

    private RadarChart radarChart;
    //TODO จัดการ  Chart ให้เข้าที่
    private TextView tvCloneCode;

    private static final String ARG_CLONECODE = "CloneCode";
    private CloneDataItem cloneDataItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_clone_selected);
        InitializeCloneDataItem();
        getSupportActionBar().show();
        InitializeView();
    }

    private void InitializeCloneDataItem() {
        cloneDataItem = new CloneDataItem();
        HashMap<String,ScoreItem> mDataScore = new HashMap<>();
        cloneDataItem.setClonecode(getIntent().getStringExtra(ARG_CLONECODE));
        getCloneDataItem();

    }
    private void getCloneDataItem() {
        Uri uri = Uri.parse(getResources().getString(R.string.URI_Distinc));
        String[] projection = null;
        String sortOrder = null;
        String selection = Columns.CLONECODE + " = ?";
        String[] selectionArgs = {cloneDataItem.getClonecode()};
        ContentResolver r = getContentResolver();
        Cursor c = r.query(uri, projection, selection, selectionArgs, sortOrder);
        while (c != null && c.moveToNext()) {
            Log.d("Clone Data", c.toString());
            cloneDataItem.setSelectStatus(c.getString(c.getColumnIndex(Columns.SELECT_STATUS)));


//            tvTotalScore.setText(c.getFloat(c.getColumnIndex(Columns.TOTAL_SCORE))+" คะแนน");
//            tvHeight.setText(c.getInt(c.getColumnIndex(Columns.HEIGHT))+" cm");
//            tvBrix.setText(c.getFloat(c.getColumnIndex(Columns.BRIX))+"");
//            tvStalkPerClump.setText(c.getInt(c.getColumnIndex(Columns.STALK_AMOUNT))+"");
//            tvStuff.setText(c.getString(c.getColumnIndex(Columns.STUFF)));

            cloneDataItem.setPicfull(c.getString(c.getColumnIndex(Columns.FULLPICURL)));
            cloneDataItem.setPicupper(c.getString(c.getColumnIndex(Columns.UPPERPICURL)));
            cloneDataItem.setPiclower(c.getString(c.getColumnIndex(Columns.LOWERPICURL)));
        }

        c.close();
    }

    private void InitializeView(){
        radarChart = (RadarChart) findViewById(R.id.RadarChart);
        setupRadarChart();

        tvCloneCode = (TextView) findViewById(R.id.textViewCloneCode);
        tvCloneCode.setText(cloneDataItem.getClonecode());

        ImageView picFull = (ImageView) findViewById(R.id.imageView_full);
        ImageView picUp = (ImageView) findViewById(R.id.imageView_up);
        ImageView picLow = (ImageView) findViewById(R.id.imageView_low);

        Picasso.with(this).load(cloneDataItem.getPicfull().toString()).rotate(90).into(picFull);
        Picasso.with(this).load(cloneDataItem.getPicupper().toString()).rotate(90).into(picUp);
        Picasso.with(this).load(cloneDataItem.getPiclower().toString()).rotate(90).into(picLow);


    }
    private void setupRadarChart(){
        setData();
    }

    private String[] mTopicList = new String[] {
            "Overview", "Total Score","Brix", "ความสูง", "ลำ/กอ", "ไส้อ้อย", "ทรงกอ"
    };

    private void setData(){

        int mult = 150;
        int cnt =7;
        ArrayList<Entry> yCheckClone = new ArrayList<>();
        ArrayList<Entry> yClone = new ArrayList<>();

        for (int i = 0; i < cnt; i++) {
            yCheckClone.add(new Entry((float) (Math.random() * mult) + mult / 2, i));
        }

        for (int i = 0; i < cnt; i++) {
            yClone.add(new Entry((float) (Math.random() * mult) + mult / 2, i));
        }


        ArrayList<String> xTopics = new ArrayList<>();
        for (int i = 0; i < cnt; i++)
            xTopics.add(mTopicList[i % mTopicList.length]);

        RadarDataSet set1 = new RadarDataSet(yCheckClone,"พันธุ์เช็ค");
        set1.setColor(ColorTemplate.VORDIPLOM_COLORS[0]);
        set1.setDrawFilled(true);
        set1.setLineWidth(2f);
        //TODO เปลี่ยนเบอร์โคลนให้เป็นตัวแปร
        RadarDataSet set2 = new RadarDataSet(yClone,"A14001-001");
        set2.setColor(ColorTemplate.VORDIPLOM_COLORS[4]);
        set2.setDrawFilled(true);
        set2.setLineWidth(2f);

        ArrayList<RadarDataSet> sets = new ArrayList<>();
        sets.add(set1);
        sets.add(set2);

        RadarData data = new RadarData(xTopics, sets);
        //สำหรับเปลี่ยนแบบ Font
//        data.setValueTypeface(tf);
        data.setValueTextSize(8f);
        data.setDrawValues(false);

        radarChart.setData(data);

        radarChart.invalidate();
    }

    private class dataScore{
        private Integer TotalScoreValues;
        private Integer HeightValues;
        private Integer StalkperClump;
        private Float   BrixValues;
        private String  Stuff;
        private String  ClumpCharacteristic;

        public Integer getTotalScoreValues() {
            return TotalScoreValues;
        }

        public void setTotalScoreValues(Integer totalScoreValues) {
            TotalScoreValues = totalScoreValues;
        }

        public Integer getHeightValues() {
            return HeightValues;
        }

        public void setHeightValues(Integer heightValues) {
            HeightValues = heightValues;
        }

        public Integer getStalkperClump() {
            return StalkperClump;
        }

        public void setStalkperClump(Integer stalkperClump) {
            StalkperClump = stalkperClump;
        }

        public Float getBrixValues() {
            return BrixValues;
        }

        public void setBrixValues(Float brixValues) {
            BrixValues = brixValues;
        }

        public String getStuff() {
            return Stuff;
        }

        public void setStuff(String stuff) {
            Stuff = stuff;
        }

        public String getClumpCharacteristic() {
            return ClumpCharacteristic;
        }

        public void setClumpCharacteristic(String clumpCharacteristic) {
            ClumpCharacteristic = clumpCharacteristic;
        }
    }
}
