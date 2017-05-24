package be.cegeka.battle;


public interface IHeadquarters {

    int ReportElistment(String soldierName);

    void ReportCasualty(int soldierId);

    void ReportVictory(int remaingNumberOfSoldiers);
}
