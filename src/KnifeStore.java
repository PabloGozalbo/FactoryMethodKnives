public abstract class KnifeStore {
    public Knife orderKnife(String type){
        Knife knife = null;

        knife = createKnife(type);

        knife.sharpen();
        knife.polish();
        knife.wrapp();

        return knife;
    }

    abstract Knife createKnife(String type);
}

class EuropeanKnifeStore extends KnifeStore{
    @Override
    Knife createKnife(String type) {
        if (type.equals("chef"))
            return new EuropeChefKnife();
        else if (type.equals("steak"))
            return new EuropeSteakKnife();
        else return null;
    }
}

class USKnifeStore extends KnifeStore{
    @Override
    Knife createKnife(String type) {
        if (type.equals("chef"))
            return new ChefKnife();
        else if (type.equals("steak"))
            return new SteakKnife();
        else return null;
    }
}

interface Knife{
    void sharpen();
    void polish();
    void wrapp();
}
class ChefKnife implements Knife{
    @Override
    public void sharpen() {

    }

    @Override
    public void polish() {

    }

    @Override
    public void wrapp() {

    }
}
class SteakKnife implements Knife{
    @Override
    public void sharpen() {

    }

    @Override
    public void polish() {

    }

    @Override
    public void wrapp() {

    }
}
class EuropeChefKnife implements Knife{
    @Override
    public void sharpen() {

    }

    @Override
    public void polish() {

    }

    @Override
    public void wrapp() {

    }
}
class EuropeSteakKnife implements Knife{
    @Override
    public void sharpen() {

    }

    @Override
    public void polish() {

    }

    @Override
    public void wrapp() {

    }
}