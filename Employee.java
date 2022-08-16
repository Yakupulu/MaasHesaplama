public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    double tax;
    int bonus;
    int year = 2021;
    int howYear;
    double raise = 0.0;


    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    /*tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
    Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
    Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
     */

    void tax() {
        if (this.salary > 1000) {
            tax = salary * 0.03;
        } else
            tax = 0;
    }

    /*bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı
      her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.*/

    void bonus() {
        if (workHours > 40) {
            bonus = (workHours - 40) * 30;
        } else
            bonus = 0;
    }

    /*raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır.
                        Şuan ki yılı 2021 olarak alın.
                        Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
                        Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
                        Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.

     */

    void raiseSalary() {
        howYear = year - hireYear;
        if (howYear < 10) {
            raise = this.salary * 0.05;
        } else if (howYear >= 10 && howYear < 20) {
            raise = this.salary * 0.1;
        } else if (howYear >= 20) {
            raise = this.salary * 0.15;
        }
    }

    //toString() : Çalışana ait bilgileri ekrana bastıracaktır.

    void toprint(){
        System.out.println("Adi\t\t\t\t:"+this.name);
        System.out.println("Maas\t\t\t:"+this.salary);
        System.out.println("Calisma saati\t:"+this.workHours);
        System.out.println("Baslangic yili\t:"+this.hireYear);
        System.out.println("Vergisi\t\t\t:" + tax);
        System.out.println("Bonus\t\t\t:" + bonus);
        System.out.println("zam\t\t\t\t:" + raise);
        System.out.println("Toplam maas\t:"+(salary+bonus+raise-tax));
        System.out.println("=============================================");
    }


}





