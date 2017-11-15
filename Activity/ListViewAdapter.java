package com.hattrick.ihyunbeom.hat_client;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by HyunBum on 2017. 7. 11..
 */

public class ListViewAdapter extends BaseAdapter {

    private static final int ITEM_VIEW_TYPE_PLAYER = 0;
    private static final int ITEM_VIEW_TYPE_GAMES = 1;
    private static final int ITEM_VIEW_TYPE_PLAYER_GOAL = 2;
    private static final int ITEM_VIEW_TYPE_STADIUM = 3;
    private static final int ITEM_VIEW_TYPE_MAX = 4;




    private ArrayList<ListViewItem> listViewItemList = new ArrayList<ListViewItem>() ;

    // ListViewAdapter의 생성자
    public ListViewAdapter() {

    }

    // Adapter에 사용되는 데이터의 개수를 리턴. : 필수 구현
    @Override
    public int getCount() {
        return listViewItemList.size() ;
    }

    @Override
    public int getViewTypeCount(){
        return ITEM_VIEW_TYPE_MAX;
    }

    @Override
    public int getItemViewType(int position){
        return listViewItemList.get(position).getType() ;
    }

    // position에 위치한 데이터를 화면에 출력하는데 사용될 View를 리턴. : 필수 구현
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Context context = parent.getContext();
        int viewType = getItemViewType(position) ;


        // "listview_item" Layout을 inflate하여 convertView 참조 획득.

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            ListViewItem listViewItem = listViewItemList.get(position);

            switch (viewType){
                case ITEM_VIEW_TYPE_PLAYER:
                    convertView = inflater.inflate(R.layout.listview_item_player, parent, false);

                    TextView nameTextView = (TextView) convertView.findViewById(R.id.textName) ;
                    TextView positionTextView = (TextView) convertView.findViewById(R.id.textPosition) ;
                    TextView goalTextView = (TextView) convertView.findViewById(R.id.textGoal) ;
                    TextView outingTextView = (TextView) convertView.findViewById(R.id.textOuting) ;

                    TextView titleTextView = (TextView) convertView.findViewById(R.id.textTitle) ;
                    TextView telephoneTextView = (TextView) convertView.findViewById(R.id.textTelephone) ;
                    TextView addressTextView = (TextView) convertView.findViewById(R.id.textAddress) ;
                    TextView RoadTextView = (TextView) convertView.findViewById(R.id.textRoad) ;

                    nameTextView.setText(listViewItem.getPlayerName());
                    positionTextView.setText(listViewItem.getPlayerPosition());
                    if(listViewItem.getPlayerPosition().equals("FW"))
                        positionTextView.setTextColor(Color.rgb(231,76,60));
                    else if(listViewItem.getPlayerPosition().equals("MF"))
                        positionTextView.setTextColor(Color.rgb(41,128,185));
                    else if(listViewItem.getPlayerPosition().equals("DF"))
                        positionTextView.setTextColor(Color.rgb(52,152,291));
                    else if(listViewItem.getPlayerPosition().equals("GK"))
                        positionTextView.setTextColor(Color.rgb(241,196,15));
                    goalTextView.setText(listViewItem.getPlayerGoal());
                    outingTextView.setText(listViewItem.getPlayerOuting());
                    break;
                case ITEM_VIEW_TYPE_GAMES:
                    convertView= inflater.inflate(R.layout.listview_item_game, parent, false);

                    TextView dateTextView = (TextView)convertView.findViewById(R.id.textDate);
                    TextView oppTextView = (TextView)convertView.findViewById(R.id.textOpp);
                    TextView scoreTextView = (TextView)convertView.findViewById(R.id.textScore);

                    if(listViewItem.getGameResult().equals("패"))
                        scoreTextView.setTextColor(Color.rgb(231,76,60));
                    else if(listViewItem.getGameResult().equals("승"))
                        scoreTextView.setTextColor(Color.rgb(41,128,185));
                    else if(listViewItem.getGameResult().equals("무"))
                        scoreTextView.setTextColor(Color.rgb(86,86,86));
                    if(listViewItem.getGameResult().equals("미정")) {
                        scoreTextView.setTextColor(Color.rgb(0, 0, 0));
                        scoreTextView.setTextSize(10);
                        scoreTextView.setText("점수를 입력하세요");
                    }else
                        scoreTextView.setText(listViewItem.getGameScore());

                    dateTextView.setText(listViewItem.getGameDate());
                    oppTextView.setText(listViewItem.getGameOpp());

                    break;
                case ITEM_VIEW_TYPE_PLAYER_GOAL:
                    convertView= inflater.inflate(R.layout.listview_item_outing, parent, false);

                    dateTextView = (TextView)convertView.findViewById(R.id.textDate);
                    oppTextView = (TextView)convertView.findViewById(R.id.textOpp);
                    scoreTextView = (TextView)convertView.findViewById(R.id.textScore);
                    goalTextView = (TextView)convertView.findViewById(R.id.textGoal);

                    if(listViewItem.getGameResult().equals("패"))
                        scoreTextView.setTextColor(Color.rgb(231,76,60));
                    else if(listViewItem.getGameResult().equals("승"))
                        scoreTextView.setTextColor(Color.rgb(41,128,185));
                    else if(listViewItem.getGameResult().equals("무"))
                        scoreTextView.setTextColor(Color.rgb(86,86,86));
                    else if(listViewItem.getGameResult().equals("미정"))
                        scoreTextView.setTextColor(Color.rgb(255,255,255));

                    dateTextView.setText(listViewItem.getGameDate());
                    oppTextView.setText(listViewItem.getGameOpp());
                    scoreTextView.setText(listViewItem.getGameScore());
                    goalTextView.setText(listViewItem.getPlayerGoal());
                    break;
                case ITEM_VIEW_TYPE_STADIUM:
                    convertView= inflater.inflate(R.layout.listview_item_stadium, parent, false);

                    titleTextView = (TextView) convertView.findViewById(R.id.textTitle) ;
                    telephoneTextView = (TextView) convertView.findViewById(R.id.textTelephone) ;
                    addressTextView = (TextView) convertView.findViewById(R.id.textAddress) ;
                    RoadTextView = (TextView) convertView.findViewById(R.id.textRoad) ;


                    titleTextView.setText(listViewItem.getStadTitle());

                    if(listViewItem.getStadTelephone().equals(""))
                        telephoneTextView.setTextSize(0);
                    else
                        telephoneTextView.setText(listViewItem.getStadTelephone());

                    if(listViewItem.getStadAddres().equals(""))
                        RoadTextView.setText(listViewItem.getStadRoad());
                    else
                        addressTextView.setText(listViewItem.getStadAddres());

                    break;
            }


        // 화면에 표시될 View(Layout이 inflate된)으로부터 위젯에 대한 참조 획득
        // 아이템 내 각 위젯에 데이터 반영

        return convertView;
    }

    // 지정한 위치(position)에 있는 데이터와 관계된 아이템(row)의 ID를 리턴. : 필수 구현
    @Override
    public long getItemId(int position) {
        return position ;
    }

    // 지정한 위치(position)에 있는 데이터 리턴 : 필수 구현
    @Override
    public Object getItem(int position) {
        return listViewItemList.get(position) ;
    }

    // 아이템 데이터 추가를 위한 함수. 개발자가 원하는대로 작성 가능.
    public void addItem(String name, String position, String goal, String outing) {
        ListViewItem item = new ListViewItem();

        item.setType(ITEM_VIEW_TYPE_PLAYER) ;
        item.setPlayerName(name);
        item.setPlayerPosition(position);
        item.setPlayerGoal(goal);
        item.setPlayerOuting(outing);

        listViewItemList.add(item);
    }

    public void addItem2(String date, String opp, String score, String result) {
        ListViewItem item = new ListViewItem();

        item.setType(ITEM_VIEW_TYPE_GAMES) ;
        item.setGameDate(date);
        item.setGameOpp(opp);
        item.setGameScore(score);
        item.setGameResult(result);
        //result => 0:패 1:무 2:승

        listViewItemList.add(item);
    }

    public void addItem3(String date, String opp, String score, String result, String goal) {
        ListViewItem item = new ListViewItem();

        item.setType(ITEM_VIEW_TYPE_PLAYER_GOAL) ;
        item.setGameDate(date);
        item.setGameOpp(opp);
        item.setGameScore(score);
        item.setGameResult(result);
        item.setPlayerGoal(goal);

        //result => 0:패 1:무 2:승

        listViewItemList.add(item);
    }

    public void addItem4(String title, String telephone, String address, String roadAddress) {
        ListViewItem item = new ListViewItem();

        item.setType(ITEM_VIEW_TYPE_STADIUM) ;
        item.setStadTitle(title);
        item.setStadTelephone(telephone);
        item.setStadAddres(address);
        item.setStadRoad(roadAddress);

        listViewItemList.add(item);
    }

}

//

