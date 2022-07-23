import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String userName,password;
        int right=3,select;
        int balance =1500;

        Scanner input=new Scanner(System.in);

        while (right >0){

            System.out.print("Kullanıcı Adınız : ");
            userName=input.nextLine();
            System.out.print("Şifreniz : ");
            password=input.nextLine();

            if (userName.equals("patika")&& password.equals("1234")){
                System.out.println("Merhaba,Kodluyoruz Bankasına hoşgeldiniz.");
                do {
                    System.out.println("\n 1 - Para Çekme \n "+"2 - Para Yatırma \n"+"3 - Bakiye Sorgualama \n"+" 4 - Çıkış");
                    System.out.print("Lütfen Yapmak İstediğiniz işlemi Seçiniz : ");
                    select=input.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Çekmek İstediğiniz Tutarı Giriniz :");
                            int price = input.nextInt();
                            if ((price > balance) || (price < 0)){
                                System.out.println("Bakiyeniz Yetersiz!");
                            }else {
                                balance -=price;
                                System.out.println("İşlem Başarılı! Çekilen Tutar : "+price + " TL");
                                System.out.println("Yeni Bakiyeniz : "+balance + " TL");
                            }

                            break;
                        case 2:
                            System.out.print("Yatırmak İstediğiniz Tutarı Giriniz : ");
                            price =input.nextInt();
                            if ((price < 0)){
                                System.out.println("Hatalı bir tutar girdiniz");
                            }else {
                                balance +=price;
                                System.out.println("İşlem Başarılı! Yatırılan Tutar : "+price + " TL");
                                System.out.println("Yeni Bakiyeniz : "+balance + " TL");
                            }



                            break;
                        case 3:
                            System.out.print("Bakiyeniz : " + balance + " TL");

                            break;

                    }

                }while (select !=4);
                break;
            }else {
               right--;
                System.out.println("Hatalı Giriş Yaptınız.");

                if (right==0){
                    System.out.println("Hesabınız bloke olmuştur.Lütfen bankanızla iletişime geçiniz");
                }else {
                    System.out.println("Kalan hakkınız :"+ right);
                }

            }

        }
        System.out.println("Çıkış Yaptınız.Tekrar Görüşmek Üzere ...");


    }
}
