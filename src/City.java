import java.util.Scanner;

public class City {
    public static Scanner ob = new Scanner(System.in);
    public String city;
    public info info;
    public City() {
        System.out.println("Введите название города");
        setCity (ob.next());
        info = new info();
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city=city;
    }
    public class info {
        int pr,st,sq;
        public info() {
            System.out.println("Количество проспектов в городе:");
            setPr(ob.nextInt());
            System.out.println("Количество улиц в городе:");
            setSt(ob.nextInt());
            System.out.println("Количество площадей в городе:");
            setSq(ob.nextInt());
        }
        public int getPr() {
            return pr;
        }
        public void setPr(int pr) {
            this.pr=pr;
        }
        public int getSt() {
            return st;
        }
        public void setSt(int st) {
            this.st=st;
        }
        public int getSq() {
            return sq;
        }
        public void setSq(int sq) {
            this.sq=sq;
        }
        public void print() {
            System.out.print("В городе "+getCity()+" "+getPr()+" проспектов,"+getSt()+" улиц и "+getSq()+" площадей");
        }
    }
    public static void main(String[] args) {
        City ct = new City();
        ct.info.print();
    }
}