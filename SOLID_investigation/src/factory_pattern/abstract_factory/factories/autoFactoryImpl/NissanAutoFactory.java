package factory_pattern.abstract_factory.factories.autoFactoryImpl;

import factory_pattern.abstract_factory.factories.AutoFactory;
import factory_pattern.abstract_factory.products.HatchbackAuto;
import factory_pattern.abstract_factory.products.SedanAuto;
import factory_pattern.abstract_factory.products.StationWagonAuto;
import factory_pattern.abstract_factory.products.autoImpl.NissanHatchbackAuto;
import factory_pattern.abstract_factory.products.autoImpl.NissanSedanAuto;
import factory_pattern.abstract_factory.products.autoImpl.NissanStationWagonAuto;

public class NissanAutoFactory implements AutoFactory {

    @Override
    public HatchbackAuto createHatchbackAuto() {
        return new NissanHatchbackAuto();
    }

    @Override
    public SedanAuto createSedanAuto() {
        return new NissanSedanAuto();
    }

    @Override
    public StationWagonAuto createStationWagonAuto() {
        return new NissanStationWagonAuto();
    }
}
