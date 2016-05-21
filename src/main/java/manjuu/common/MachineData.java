package manjuu.common;

import java.util.Date;

public class MachineData {

    private Date date;

    private String machineNo;

    private String machineName;

    private int games;

    public int getGames() {
        return games;
    }

    public void setGames(final int games) {
        this.games = games;
    }

    int samai;

    public Date getDate() {
        return date;
    }

    public void setDate(final Date date) {
        this.date = date;
    }

    public String getMachineNo() {
        return machineNo;
    }

    public void setMachineNo(final String machineNo) {
        this.machineNo = machineNo;
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(final String machineName) {
        this.machineName = machineName;
    }

    public int getSamai() {
        return samai;
    }

    public void setSamai(final int samai) {
        this.samai = samai;
    }

}
