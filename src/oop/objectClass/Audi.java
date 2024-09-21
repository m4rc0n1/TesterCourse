package oop.objectClass;

public class Audi {
    private String model;
    Audi(String model){
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString(){
        return "This is Audi " + this.getModel();
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        //type casting
        Audi audi = (Audi) o;
        if(model != audi.model) return false;
        return model !=null ? model.equals(audi.model) : audi.model ==null;
    }
}
