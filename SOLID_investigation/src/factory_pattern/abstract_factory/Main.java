package factory_pattern.abstract_factory;

import factory_pattern.abstract_factory.enums.ModelAutoName;
import factory_pattern.abstract_factory.factories.AutoFactory;
import factory_pattern.abstract_factory.factories.autoFactoryImpl.MercedesAutoFactory;
import factory_pattern.abstract_factory.factories.autoFactoryImpl.NissanAutoFactory;
import factory_pattern.abstract_factory.factories.autoFactoryImpl.ToyotaAutoFactory;

public class Main {

    public static void main(String[] args) {
        Client client1;
        Client client2;
        Client client3;

        AutoFactory nissanFactory = createFactory(ModelAutoName.NISSAN);
        AutoFactory mercedesFactory = createFactory(ModelAutoName.MERCEDES);
        AutoFactory toyotaFactory = createFactory(ModelAutoName.TOYOTA);

        client1 = new Client(nissanFactory);
        client2 = new Client(mercedesFactory);
        client3 = new Client(toyotaFactory);

        client1.create();
        System.out.println();

        client2.create();
        System.out.println();

        client3.create();
    }

    public static AutoFactory createFactory(ModelAutoName modelAutoName) {
        AutoFactory autoFactory;
        switch (modelAutoName) {
            case NISSAN:
                autoFactory = new NissanAutoFactory();
                break;
            case TOYOTA:
                autoFactory = new ToyotaAutoFactory();
                break;
            default:
                autoFactory = new MercedesAutoFactory();
                break;
        }
        return autoFactory;
    }
}
