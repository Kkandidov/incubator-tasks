package factory_pattern.abstract_factory;

import factory_pattern.abstract_factory.factories.AutoFactory;
import factory_pattern.abstract_factory.products.HatchbackAuto;
import factory_pattern.abstract_factory.products.SedanAuto;
import factory_pattern.abstract_factory.products.StationWagonAuto;

public class Client {
    private HatchbackAuto hatchbackAuto;
    private SedanAuto sedanAuto;
    private StationWagonAuto stationWagonAuto;

    public Client(AutoFactory autoFactory) {
        this.hatchbackAuto = autoFactory.createHatchbackAuto();
        this.sedanAuto = autoFactory.createSedanAuto();
        this.stationWagonAuto = autoFactory.createStationWagonAuto();
    }

    public void create(){
        hatchbackAuto.create();
        sedanAuto.create();
        stationWagonAuto.create();
    }
}
