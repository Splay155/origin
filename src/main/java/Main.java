

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AKSAL
 */
public class Main {
    
    public static void main(String[] args){
        
        
//        1. membuat 5 User
        User aqshal = new User("Aqshal","Splay","155");
        User jefta= new User("Jefta","StevenFS","342");
        User fatih = new User("Fatih","Gogatsuboy","153");
        User ridwan = new User("Ridwan","Iwang","212");
        User farrel = new User("Farrel","pargoy","756");
        
        User.usernameList.add("Splay");
        User.usernameList.add("StevenFS");
        User.usernameList.add("Gogatsuboy");
        User.usernameList.add("Iwang");
        User.usernameList.add("pargoy");
        
        User.userList.add(aqshal);
        User.userList.add(jefta);
        User.userList.add(fatih);
        User.userList.add(ridwan);
        User.userList.add(farrel);
        
//        2. Ubah 2 username yang ada
        aqshal.setUserName("Splay155");
        jefta.setUserName("Steven");
        System.out.println();

////        3. Mengganti 1 username dengan username yang sudah ada
        ridwan.setUserName("pargoy");
        System.out.println();
        
////        4. Mengganti 2 username yang lain dengan username yang sudah ada
        fatih.setUserName("Iwang");
        farrel.setUserName("Gogatsuboy");
        System.out.println();
//        
////        5. Cetak seluruh activity yang ada
        Activity.printAllActivities();
        System.out.println();

////        6. Cetak seluruh activity pada hari ini
        Activity.printTodaysActivities();
        System.out.println();
        
////        7. Login 2 kali dengan user yang berbeda
        fatih.logIn("Gogatsuboy", "153");
        ridwan.logIn("Iwang", "212");
        System.out.println();
//        
////        8. Gagal login 2 kali dengan user yang berbeda
        jefta.logIn("st3ven", "333");
        farrel.logIn("parg0y", "002");
        System.out.println();
//        
////        9. Cek seluruh activity oleh 2 user tertentu
        Activity.printUserActivities("Gogatsuboy");
        Activity.printUserActivities("Splay");
        System.out.println();
//        
////        10. Cetak 10 activity terakhir
        aqshal.setUserName("1");
        aqshal.setUserName("2");
        aqshal.setUserName("3");
        aqshal.setUserName("4");
        aqshal.setUserName("5");
        aqshal.setUserName("6");
        aqshal.setUserName("7");
        aqshal.setUserName("8");
        aqshal.setUserName("9");
        aqshal.setUserName("10");
        
        Activity.printLastTenActivities();
        
        
    }
    
}
