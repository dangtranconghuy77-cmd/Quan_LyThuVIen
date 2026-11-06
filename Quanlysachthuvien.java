
import java.util.Scanner;
public class Quanlysachthuvien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int chon;
        String[] maSach = null;
        String[] tenSach = null;
        String[] tacGia = null;
        int[] namXuatBan = null;
        double[] donGia = null;
        int[] soLuong = null;
        // Câu 3: Tao menu lap den khi chon thoat
        do {
            System.out.println(" MENU QUAN LY SACH ");
            System.out.println("1. Nhap danh sach sach");
            System.out.println("2. Tinh tong so luong va tong gia tri sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("4. Thoat");
            System.out.print("Nhap lua chon: ");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                // Câu 1: Nhap n cuon sach
                case 1:
                    System.out.print("Nhap so luong sach can nhap: ");
                    n = sc.nextInt();
                    sc.nextLine();
                    maSach = new String[n];
                    tenSach = new String[n];
                    tacGia = new String[n];
                    namXuatBan = new int[n];
                    donGia = new double[n];
                    soLuong = new int[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("\nNhap thong tin sach thu " + (i + 1));
                        System.out.print("Nhap ma sach: ");
                        maSach[i] = sc.nextLine();
                        System.out.print("Nhap ten sach: ");
                        tenSach[i] = sc.nextLine();
                        System.out.print("Nhap tac gia: ");
                        tacGia[i] = sc.nextLine();
                        System.out.print("Nhap nam xuat ban: ");
                        namXuatBan[i] = sc.nextInt();
                        System.out.print("Nhap don gia: ");
                        donGia[i] = sc.nextDouble();
                        System.out.print("Nhap so luong: ");
                        soLuong[i] = sc.nextInt();
                        sc.nextLine();
                    }
                    System.out.println("\nDa nhap xong danh sach sach!");
                    break;
                // Câu 2: Tinh tong so luong va tong gia tri sach
                case 2:
                    if (maSach == null) {
                        System.out.println("Vui long nhap danh sach sach truoc!");
                    } else {
                        int tongSoLuong = 0;
                        double tongGiaTri = 0;

                        for (int i = 0; i < n; i++) {
                            tongSoLuong = tongSoLuong + soLuong[i];
                            tongGiaTri = tongGiaTri + donGia[i] * soLuong[i];
                        }
                        System.out.println("\n===== THONG KE SACH =====");
                        System.out.println("Tong so luong sach: " + tongSoLuong);
                        System.out.println("Tong gia tri sach: " + tongGiaTri);
                    }
                    break;
                // Câu 4: Tim sach theo ma
                case 3:
                    if (maSach == null) {
                        System.out.println("Vui long nhap danh sach sach truoc!");
                    } else {
                        String maCanTim;
                        boolean timThay = false;
                        System.out.print("Nhap ma sach can tim: ");
                        maCanTim = sc.nextLine();
                        for (int i = 0; i < n; i++) {
                            if (maSach[i].equalsIgnoreCase(maCanTim)) {
                                System.out.println(" THONG TIN SACH TIM THAY ");
                                System.out.println("Ma sach: " + maSach[i]);
                                System.out.println("Ten sach: " + tenSach[i]);
                                System.out.println("Tac gia: " + tacGia[i]);
                                System.out.println("Nam xuat ban: " + namXuatBan[i]);
                                System.out.println("Don gia: " + donGia[i]);
                                System.out.println("So luong: " + soLuong[i]);

                                timThay = true;
                                break;
                            }
                        }
                        if (timThay == false) {
                            System.out.println("Khong tim thay sach co ma: " + maCanTim);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Da thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 4);
        sc.close();
    }
}
