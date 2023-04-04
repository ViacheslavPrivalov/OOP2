public abstract class Vehicle {
    private String modelName;
    private int wheelsCount;

    public void updateTyre() {

        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {

        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {

        System.out.println("Проверяем прицеп");
    }

    public void check() {
        System.out.println("Обслуживаем " + modelName);
        for (int i = 0; i < wheelsCount; i++) {
            this.updateTyre();
        }
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
}
