public class Main {

    public static void main(String[] args) {
	// class ların ilk ve temel özelliği gruplama yapmaktır
        //src:(source)kaynak klasörümüz
        //class lar birbirlerini kullanılır
        CustomerManager customerManager=new CustomerManager();
        //bellekte CustomerManager türünde bir nesne oluşturmuş oluruz
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();
        //class lar (reference type) referans tiptir.
        //stack: kümelemek,istif etmek ana sınıf   //heap: kümelemek,yüklemek
        //class ın kullanabilmesi için new lwnmiş olmalı
        //heap: kümelemek,yüklemek

        //value :değer tipi
        int sayi1= 10;
        int sayi2 =20;
        sayi2=sayi1;
        sayi1= 30;
        System.out.println(sayi2);

        int[] sayilar1 = new int[] {1,2,3};
        int[] sayilar2 =  {4,5,6};
sayilar2=sayilar1;
sayilar1[0]=9;
System.out.println(sayilar2[0]);
//diziler referans tiptir.
    }
}
