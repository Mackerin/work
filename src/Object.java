public class Object {
    public String nomination;
    public int sum;
    public String size;
    public String importanceDistrict;

    public Object(String nomination, int sum, String size, String importanceDistrict) {
        this.nomination = nomination;
        this.sum = sum;
        this.size = size;
        this.importanceDistrict = importanceDistrict;
    }

    @Override
    public String toString() {
        return "Недвижимость: " + nomination + ", цена: " + sum + ", площадь: " + size + ", важность района: " + importanceDistrict;
    }
}

