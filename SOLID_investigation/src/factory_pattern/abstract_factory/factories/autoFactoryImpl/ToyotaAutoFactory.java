package factory_pattern.abstract_factory.factories.autoFactoryImpl;

import factory_pattern.abstract_factory.factories.AutoFactory;
import factory_pattern.abstract_factory.products.HatchbackAuto;
import factory_pattern.abstract_factory.products.SedanAuto;
import factory_pattern.abstract_factory.products.StationWagonAuto;
import factory_pattern.abstract_factory.products.autoImpl.ToyotaHatchbackAuto;
import factory_pattern.abstract_factory.products.autoImpl.ToyotaSedanAuto;
import factory_pattern.abstract_factory.products.autoImpl.ToyotaStationWagonAuto;

public class ToyotaAutoFactory implements AutoFactory {

    @Override
    public HatchbackAuto createHatchbackAuto() {
        return new ToyotaHatchbackAuto();
    }

    @Override
    public SedanAuto createSedanAuto() {
        return new ToyotaSedanAuto();
    }

    @Override
    public StationWagonAuto createStationWagonAuto() {
        return new ToyotaStationWagonAuto();
    }
}
