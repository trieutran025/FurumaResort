package src.service;


import src.models.Facility;

import java.util.Set;

public interface FacilityService extends Service {
    Set<Facility> displayFacility();

    void addNewHouse(Facility o);
    void addNewVilla(Facility o);
    void addNewRoom(Facility o);

    void displayFacilityMaintenance();
}
