import java.util.*;

public class addLaptops {
    static Set<String> filterLaptops = new HashSet<>();

    static Set<Lenovo> lenovo = new HashSet<>();
    static Set<Samsung> samsung = new HashSet<>();
    static Set<Asus> asus = new HashSet<>();
    static Set<Acer> acer = new HashSet<>();
    static Set<MSI> msi = new HashSet<>();
    static Set<Apple> apple = new HashSet<>();

    private static void addLaps() {

        Lenovo Lenovo = new Lenovo(4, 128, "Windows", "White");
        lenovo.add(Lenovo);

        Samsung Samsung = new Samsung(8, 256, "Windows", "Blue");
        samsung.add(Samsung);

        Asus Asus = new Asus(12, 520, "DOS", "Golden");
        asus.add(Asus);

        Acer Acer = new Acer(8, 256, "Linux", "Red");
        acer.add(Acer);

        MSI MSI = new MSI(16, 1000, "DOS", "Black");
        msi.add(MSI);

        Apple Apple = new Apple(16, 256, "MacOS", "Grey");
        apple.add(Apple);

    }

    private static void searchLaps() {
        label:
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print('\n' + """
                    Добро пожаловать в меню выбора ноутбуков!
                    Для просмотра всего списка: /all;
                    Для остановки программы: /stop;
                    Для выбора параметров:
                    1 - количество ОЗУ;
                    2 - Объём ЖД;
                    3 - Операционная система;
                    Введите команду: """);
            String command = scan.next();
            switch (command) {
                case "/all":
                    System.out.println(lenovo);
                    System.out.println(samsung);
                    System.out.println(asus);
                    System.out.println(acer);
                    System.out.println(msi);
                    System.out.println(apple);
                    break;
                case "/stop":
                    break label;
                case "1":
                    ram();
                    System.out.println(filterLaptops);
                    break;
                case "2":
                    memory();
                    System.out.println(filterLaptops);
                    break;
                case "3":
                    oS();
                    System.out.println(filterLaptops);
                    break;
                default:
                    System.out.print("""
                            Для просмотра всего списка: /all;
                            Для остановки программы: /stop;
                            Для выбора параметров:
                            1 - количество ОЗУ;
                            2 - Объём ЖД;
                            3 - Операционная система;
                            Введите команду: """);
                    break;
            }
        }
    }

    private static void ram() {
        label:
        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("""
                    Выберите количество ОЗУ:  \s
                    1 - 4 ГБ
                    2 - 8 ГБ
                    3 - 12 ГБ
                    4 - 16 ГБ
                    Введите соответсвующий номер: """);
            String command = scan.next();
            switch (command) {
                case "1":
                    filterLaptops.add(lenovo.toString());
                    break label;
                case "2":
                    filterLaptops.add(samsung.toString());
                    filterLaptops.add(acer.toString());
                    break label;
                case "3":
                    filterLaptops.add(asus.toString());
                    break label;
                case "4":
                    filterLaptops.add(msi.toString());
                    filterLaptops.add(apple.toString());
                    break label;
                default:
                    System.out.println('\n' + "Выберите вариант из предложенных!");
                    break;
            }
        }
    }

    private static void memory(){
        label:
        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("""
                    Выберите количество ОЗУ:  \s
                    1 - 128 ГБ
                    2 - 256 ГБ
                    3 - 520 ГБ
                    4 - 1000 ГБ
                    Введите соответсвующий номер: """);
            String command = scan.next();
            switch (command) {
                case "1":
                    filterLaptops.add(lenovo.toString());
                    break label;
                case "2":
                    filterLaptops.add(samsung.toString());
                    filterLaptops.add(acer.toString());
                    filterLaptops.add(apple.toString());
                    break label;
                case "3":
                    filterLaptops.add(asus.toString());
                    break label;
                case "4":
                    filterLaptops.add(msi.toString());
                    break label;
                default:
                    System.out.println('\n' + "Выберите вариант из предложенных!");
                    break;
            }
        }
    }

    private static void oS(){
        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("""
                    Выберите количество Операционную систему:  \s
                    1 - Windows
                    2 - DOS
                    3 - Linux
                    4 - MacOS
                    Введите соответсвующий номер: """);
            String command = scan.next();
            if(command.equalsIgnoreCase("1")){
                filterLaptops.add(lenovo.toString());
                filterLaptops.add(samsung.toString());
                break;
            }else if(command.equalsIgnoreCase("2")){
                filterLaptops.add(asus.toString());
                filterLaptops.add(msi.toString());
                break;
            }else if(command.equalsIgnoreCase("3")){
                filterLaptops.add(acer.toString());
                break;
            }else if(command.equalsIgnoreCase("4")){
                filterLaptops.add(apple.toString());
                break;
            }else System.out.println('\n' + "Выберите вариант из предложенных!");
        }
    }

    public static void run(){
        addLaps();
        searchLaps();
    }
}
