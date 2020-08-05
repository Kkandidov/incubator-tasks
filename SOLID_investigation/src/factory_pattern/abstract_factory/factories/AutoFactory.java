package factory_pattern.abstract_factory.factories;

import factory_pattern.abstract_factory.products.HatchbackAuto;
import factory_pattern.abstract_factory.products.SedanAuto;
import factory_pattern.abstract_factory.products.StationWagonAuto;

public interface AutoFactory {

    HatchbackAuto createHatchbackAuto();
    SedanAuto createSedanAuto();
    StationWagonAuto createStationWagonAuto();
}
