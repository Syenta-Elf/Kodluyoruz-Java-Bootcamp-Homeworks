/*
         * Manav dükkanı açmak isteyen bir adam hal'den bir miktar elma, bir miktar armut, bir miktar kiraz
         * alacaktır. Mallar dükkana gelmiştir. Kullanıcı bu malları ayrı odalarda saklayacaktır.
         *
         *Her bir odadaki elma, armut ve kirazın kg cinsinden değerini bulalım.
         *
         * Manav'dan online alışveriş yapılıyor. Müşteri Ve 1 kg elma, 2 kg armut almak istedi.
         * Malları alsın. depo guncellensin.
         * 
         * Online satışta müşteri depoda kalan maldan fazla bir miktarda mal almak istedi.
         * Bunu kullanıcıya bildir.
*/


public class Greengrocer {
    public static void main(String[] args) {
        
        Fruit apple = Apple.createApple();
        Fruit pear = Pear.createPear();
        Fruit cherry = Cherry.createCherry();

        System.out.println("--------------------------------------");
        apple.storage();
        cherry.storage();
        pear.storage();
        System.out.println("--------------------------------------\n");

        System.out.println("--------------------------------------");
        apple.selling(1);
        pear.selling(2);
        cherry.selling(100);
        cherry.selling(15);
        System.out.println("--------------------------------------\n");

        System.out.println("--------------------------------------");
        apple.storage();
        cherry.storage();
        pear.storage();
        System.out.println("--------------------------------------\n");
    }
}
