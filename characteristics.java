import java.util.Objects;

public class characteristics {
    protected String firm;
    protected int ram;
    protected int memory;
    protected String system;
    protected String color;

    public characteristics(int ram, int memory, String system, String color){
        this.firm = getClass().getSimpleName();
        this.ram = ram;
        this.memory = memory;
        this.system = system;
        this.color = color;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        characteristics that = (characteristics) o;
        return ram == that.ram && memory == that.memory && Objects.equals(firm, that.firm)
                && Objects.equals(system, that.system) && Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firm, ram, memory, system, color);
    }

    @Override
    public String toString() {
        return  firm + ':' +
                " ram = " + ram + ',' +
                " memory = " + memory + ',' +
                " system = '" + system + '\'' +  ',' +
                " color = '" + color + '\'';
    }
}
