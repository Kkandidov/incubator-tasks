package factory_pattern.abstract_factory.factories.autoFactoryImpl;

import factory_pattern.abstract_factory.factories.AutoFactory;
import factory_pattern.abstract_factory.products.HatchbackAuto;
import factory_pattern.abstract_factory.products.SedanAuto;
import factory_pattern.abstract_factory.products.StationWagonAuto;
import factory_pattern.abstract_factory.products.autoImpl.MercedesHatchbackAuto;
import factory_pattern.abstract_factory.products.autoImpl.MercedesSedanAuto;
import factory_pattern.abstract_factory.products.autoImpl.MercedesStationWagonAuto;

public class MercedesAutoFactory implements AutoFactory {

    @Override
    public HatchbackAuto createHatchbackAuto() {
        return new MercedesHatchbackAuto();
    }

    @Override
    public SedanAuto createSedanAuto() {
        return new MercedesSedanAuto();
    }

    @Override
    public StationWagonAuto createStationWagonAuto() {
        return new MercedesStationWagonAuto();
    }
}
