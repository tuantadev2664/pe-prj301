/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.net.IDN;

/**
 *
 * @author FPTSHOP
 */
public class Major {
    private String majorId;
    private String majorName;
    private String leaderName;

    public Major() {
    }

    public Major(String majorId, String majorName, String leaderName) {
        this.majorId = majorId;
        this.majorName = majorName;
        this.leaderName = leaderName;
    }

    public String getMajorId() {
        return majorId;
    }

    public void setMajorId(String majorId) {
        this.majorId = majorId;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }
    
    
}
