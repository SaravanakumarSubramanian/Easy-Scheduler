package com.ofs.ofmc.meetingroom.model;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by saravana.subramanian on 12/8/16.
 */

public class Schedule  extends RealmObject {

    @PrimaryKey
    private int id;
    private String mBookieName;
    private String mBookieDesignation;
    private String mBookieTeam;
    private String mMeetingType;
    private String mDate;
    private String mMeetingStartTime;
    private String mMeetingEndTime;
    private String mMeetingRoomName;
    private boolean istentative;
    private RealmList<MeetingRoom> mMeetingRoomsList;
    private MeetingRoom mMeetingRoom;



    public Schedule(){}

    public Schedule(int id,String mBookieName, String mBookieDesignation, String mBookieTeam,
                    String mMeetingType, String mMeetingStartTime,String mMeetingEndTime) {
        this.id = id;
        this.mBookieName = mBookieName;
        this.mBookieDesignation = mBookieDesignation;
        this.mBookieTeam = mBookieTeam;
        this.mMeetingType = mMeetingType;
        this.mMeetingStartTime = mMeetingStartTime;
        this.mMeetingEndTime = mMeetingEndTime;
    }

    public Schedule(int id,String mBookieName, String mBookieDesignation, String mBookieTeam,
                    String mMeetingType,boolean istentative,String mDate, String mMeetingStartTime,
                    String mMeetingEndTime, MeetingRoom mMeetingRoom) {
        this.id = id;
        this.mBookieName = mBookieName;
        this.mBookieDesignation = mBookieDesignation;
        this.mBookieTeam = mBookieTeam;
        this.mMeetingType = mMeetingType;
        this.istentative = istentative;
        this.mDate = mDate;
        this.mMeetingStartTime = mMeetingStartTime;
        this.mMeetingEndTime = mMeetingEndTime;
        this.mMeetingRoom = mMeetingRoom;
    }

    public Schedule(int id,String mBookieName, String mBookieDesignation, String mBookieTeam,
                    String mMeetingType,boolean istentative,String mDate, String mMeetingStartTime,
                    String mMeetingEndTime,String mMeetingRoomName, MeetingRoom mMeetingRoom) {
        this.id = id;
        this.mBookieName = mBookieName;
        this.mBookieDesignation = mBookieDesignation;
        this.mBookieTeam = mBookieTeam;
        this.mMeetingType = mMeetingType;
        this.mMeetingRoomName = mMeetingRoomName;
        this.istentative = istentative;
        this.mDate = mDate;
        this.mMeetingStartTime = mMeetingStartTime;
        this.mMeetingEndTime = mMeetingEndTime;
        this.mMeetingRoom = mMeetingRoom;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getmBookieName() {
        return mBookieName;
    }

    public void setmBookieName(String mBookieName) {
        this.mBookieName = mBookieName;
    }

    public String getmBookieDesignation() {
        return mBookieDesignation;
    }

    public void setmBookieDesignation(String mBookieDesignation) {
        this.mBookieDesignation = mBookieDesignation;
    }

    public String getmMeetingType() {
        return mMeetingType;
    }

    public void setmMeetingType(String mMeetingType) {
        this.mMeetingType = mMeetingType;
    }

    public String getmBookieTeam() {
        return mBookieTeam;
    }

    public void setmBookieTeam(String mBookieTeam) {
        this.mBookieTeam = mBookieTeam;
    }

    public String getmMeetingStartTime() {
        return mMeetingStartTime;
    }

    public void setmMeetingStartTime(String mMeetingStartTime) {
        this.mMeetingStartTime = mMeetingStartTime;
    }

    public String getmMeetingEndTime() {
        return mMeetingEndTime;
    }

    public void setmMeetingEndTime(String mMeetingEndTime) {
        this.mMeetingEndTime = mMeetingEndTime;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    public MeetingRoom getmMeetingRoom() {
        return mMeetingRoom;
    }

    public void setmMeetingRoom(MeetingRoom mMeetingRoom) {
        this.mMeetingRoom = mMeetingRoom;
    }

    public boolean istentative() {
        return istentative;
    }

    public void setIstentative(boolean istentative) {
        this.istentative = istentative;
    }

    public RealmList<MeetingRoom> getmMeetingRoomsList() {
        return mMeetingRoomsList;
    }

    public void setmMeetingRoomsList(RealmList<MeetingRoom> mMeetingRoomsList) {
        this.mMeetingRoomsList = mMeetingRoomsList;
    }

    public String getmMeetingRoomName() {
        return mMeetingRoomName;
    }

    public void setmMeetingRoomName(String mMeetingRoomName) {
        this.mMeetingRoomName = mMeetingRoomName;
    }
}
