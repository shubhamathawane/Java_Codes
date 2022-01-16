import java.util.*;

public class SMS2 {
    // int choice;
    private int rollno;
    String name;
    static String School_name;
    String address;
    String course;

    static {
        School_name = "CMSMM";
    }

    SMS2() {

    }

    SMS2 add(int l) {
        SMS2 o = new SMS2();
        if (l > 1000) {
            System.out.println("Over flow");
        } else {
            try {
                System.out.println("\t________________");
                Scanner sc = new Scanner(System.in);
                System.out.print("\tEnter name : ");
                o.name = sc.next();
                System.out.print("\tEnter address : ");
                o.address = sc.next();
                System.out.print("\tEnter Course : ");
                o.course = sc.next();
                System.out.print("\tEnter rollno : ");
                o.rollno = sc.nextInt();
            } catch (Exception e) {
                System.out.println(e);
                e.getMessage();
            }

        }
        return (o);
    }

    void search(int rollno, int l, SMS2 s[]) {
        for (int i = 0; i < l; i++) {
            if (s[i].rollno == rollno) {
                s[i].display(s[i]);
            }
        }
    }

    boolean delete(int rollno, SMS2 o[], int l) {
        boolean t = false;
        for (int i = 0; i < l; i++) {
            if (rollno == o[i].rollno) {
                for (int j = i; j < l - 1; j++) {
                    o[j] = o[j + 1];
                }
                t = true;
                return (t);
            }
        }
        return (t);
    }

    boolean update(int rollno, SMS2 obj[], int l) {
        boolean t = false;

        for (int i = 0; i < l; i++) {
            if (rollno == obj[i].rollno) {
                try {
                    System.out.println("\t________________");
                    Scanner sc = new Scanner(System.in);
                    System.out.print("\tEnter name : ");
                    obj[i].name = sc.next();
                    System.out.print("\tEnter Address : ");
                    obj[i].address = sc.next();
                    System.out.print("\tEnter Course : ");
                    obj[i].course = sc.next();

                    t = true;
                    return (t);
                } catch (Exception e) {
                    System.out.println(e);
                    e.getMessage();

                }
            }
        }
        return (t);
    }

    void display(SMS2 s) {
        System.out.println("\t________________");
        System.out.println("\tName :" + s.name);
        System.out.println("\tAddress :" + s.address);
        System.out.println("\tCourse :" + s.course);
        System.out.println("\trollno :" + s.rollno);
    }

    void show(int l, SMS2 s[]) {
        for (int i = 0; i < l; i++) {
            System.out.println("\t___________________");
            System.out.println("\tName      :" + s[i].name);
            System.out.println("\tAddress   :" + s[i].address);
            System.out.println("\tCourse    :" + s[i].course);
            System.out.println("\trollno    :" + s[i].rollno);
        }

    }

    public static void main(String[] args) {
        SMS2 obj[] = new SMS2[1000];
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        // String f = "y";
        int l = 0;
        int r;
        SMS2 o = new SMS2();
        
        do {
            try {
                System.out.println("\t#### WELCOME ####");
                System.out.println("\t1)....Add");
                System.out.println("\t2)....Delete");
                System.out.println("\t3)....Search");
                System.out.println("\t4)....Update");
                System.out.println("\t5)....Display");
                System.out.println("\t6)....Exit");
                System.out.print("\tEnter your choice : ");
                choice = sc.nextInt();
                try {
                    switch (choice) {
                        case 1:
                            obj[l] = o.add(l);
                            l++;
                            break;
                        case 2:
                            System.out.println("\tEnter rollno. for deletetion");
                            r = sc.nextInt();
                            boolean b = o.delete(r, obj, l);
                            if (b = true) {
                                l--;
                                System.out.println("\tSuccessfully Deleted ");
                            } else {
                                System.out.println("\trollno not found ");
                            }
                            break;
                        case 3:
                            System.out.print("\tEnter rollno. to search student : ");
                            r = sc.nextInt();
                            o.search(r, l, obj);
                            break;
                        case 4:
                            System.out.println("\tEnter rollno. for update : ");
                            r = sc.nextInt();
                            boolean c = o.update(r, obj, l);
                            if (c = true) {
                                System.out.println("\tSuccesfully Updated");
                            } else {
                                System.out.println("\trollno. not found");
                            }
                            break;
                        case 5:
                            o.show(l, obj);
                            break;
                        default:
                            System.out.println("\tEnter the right choice : ");
                    }
                } catch (Exception m) {
                    System.out.println(m);
                }

            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("\t======================");
            // f = sc.next();
        } while(choice!=6);
    }

}
