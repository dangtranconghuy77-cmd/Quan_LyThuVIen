import java.util.ArrayList;
import java.util.Scanner;

public class Quanlysachthuvien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] soLuongMang = new int[5];
        ArrayList<String> danhSachMa = new ArrayList<>();
        ArrayList<String> danhSachSach = new ArrayList<>();
        int chon;
        do {
            System.out.println("MENU QUAN LY SACH ");
            System.out.println("1. Nhap mang so luong 5 cuon sach");
            System.out.println("2. Them ma sach");
            System.out.println("3. Hien thi ma sach");
            System.out.println("4. Tim ma sach");
            System.out.println("5. Xoa ma sach");
            System.out.println("6. Them sach");
            System.out.println("7. Hien thi sach");
            System.out.println("8. Tim sach");
            System.out.println("9. Xoa sach");
            System.out.println("10. Sua sach");
            System.out.println("11. Tinh tong so luong sach");
            System.out.println("12. Tinh tong gia tri sach");
            System.out.println("13. Thoat");
            System.out.print("Nhap lua chon: ");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                // BAI 1: NHAP MANG 5 CUON SACH
                case 1: {
                    for (int i = 0; i < 5; i++) {
                        System.out.print("Nhap so luong sach thu " + (i + 1) + ": ");
                        soLuongMang[i] = sc.nextInt();
                    }
                    System.out.println("\n DANH SACH SO LUONG ");
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Sach thu " + (i + 1) + ": " + soLuongMang[i]);
                    }
                    // Tinh tong so luong
                    int tong = 0;
                    for (int i = 0; i < 5; i++) {
                        tong = tong + soLuongMang[i];
                    }
                    System.out.println("Tong so luong: " + tong);
                    // Tim so luong lon nhat
                    int max = soLuongMang[0];
                    for (int i = 1; i < 5; i++) {
                        if (soLuongMang[i] > max) {
                            max = soLuongMang[i];
                        }
                    }
                    System.out.println("So luong lon nhat: " + max);
                    sc.nextLine();
                    break;
                }
                // BAI 2: THEM MA SACH
                case 2: {
                    System.out.print("Nhap ma sach can them: ");
                    String ma = sc.nextLine();

                    danhSachMa.add(ma);

                    System.out.println("Da them ma sach thanh cong!");
                    break;
                }
                // BAI 2: HIEN THI MA SACH
                case 3: {
                    if (danhSachMa.size() == 0) {
                        System.out.println("Danh sach ma sach dang trong!");
                    } else {
                        System.out.println("\n===== DANH SACH MA SACH =====");

                        for (int i = 0; i < danhSachMa.size(); i++) {
                            System.out.println(danhSachMa.get(i));
                        }
                    }
                    break;
                }
                // BAI 2: TIM MA SACH
                case 4: {
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();

                    if (danhSachMa.contains(maTim)) {
                        System.out.println("Tim thay ma sach!");
                    } else {
                        System.out.println("Khong tim thay ma sach!");
                    }
                    break;
                }
                // BAI 2: XOA MA SACH
                case 5: {
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();

                    if (danhSachMa.remove(maXoa)) {
                        System.out.println("Da xoa ma sach thanh cong!");
                    } else {
                        System.out.println("Khong tim thay ma sach can xoa!");
                    }
                    break;
                }
                // BAI 3 VA BAI 4: THEM SACH
                case 6: {
                    String maSach, tenSach, tacGia;
                    int namXuatBan, soLuong;
                    double donGia;
                    System.out.print("Nhap ma sach: ");
                    maSach = sc.nextLine();
                    System.out.print("Nhap ten sach: ");
                    tenSach = sc.nextLine();
                    System.out.print("Nhap tac gia: ");
                    tacGia = sc.nextLine();
                    System.out.print("Nhap nam xuat ban: ");
                    namXuatBan = sc.nextInt();
                    System.out.print("Nhap don gia: ");
                    donGia = sc.nextDouble();
                    System.out.print("Nhap so luong: ");
                    soLuong = sc.nextInt();
                    sc.nextLine();
                    String sach = maSach + ";" + tenSach + ";" +
                                  tacGia + ";" + namXuatBan + ";" +
                                  donGia + ";" + soLuong;
                    danhSachSach.add(sach);
                    System.out.println("Da them sach thanh cong!");
                    break;
                }
                // BAI 3 VA BAI 4: HIEN THI SACH
                case 7: {
                    if (danhSachSach.size() == 0) {
                        System.out.println("Danh sach sach dang trong!");
                    } else {
                        System.out.println("\n===== DANH SACH SACH =====");

                        // Duyet danh sach sach
                        for (int i = 0; i < danhSachSach.size(); i++) {

                            // Tach thong tin sach thanh cac phan
                            String[] thongTin = danhSachSach.get(i).split(";");

                            System.out.println("\nSach thu " + (i + 1));
                            System.out.println("Ma sach: " + thongTin[0]);
                            System.out.println("Ten sach: " + thongTin[1]);
                            System.out.println("Tac gia: " + thongTin[2]);
                            System.out.println("Nam xuat ban: " + thongTin[3]);
                            System.out.println("Don gia: " + thongTin[4]);
                            System.out.println("So luong: " + thongTin[5]);
                        }
                    }
                    break;
                }
                // BAI 3 VA BAI 4: TIM SACH THEO MA
                case 8: {
                    System.out.print("Nhap ma sach can tim: ");
                    String maCanTim = sc.nextLine();
                    boolean timThay = false;
                    for (int i = 0; i < danhSachSach.size(); i++) {
                        String[] thongTin = danhSachSach.get(i).split(";");

                        if (thongTin[0].equalsIgnoreCase(maCanTim)) {
                            System.out.println("\n===== THONG TIN SACH TIM THAY =====");
                            System.out.println("Ma sach: " + thongTin[0]);
                            System.out.println("Ten sach: " + thongTin[1]);
                            System.out.println("Tac gia: " + thongTin[2]);
                            System.out.println("Nam xuat ban: " + thongTin[3]);
                            System.out.println("Don gia: " + thongTin[4]);
                            System.out.println("So luong: " + thongTin[5]);

                            timThay = true;
                            break;
                        }
                    }
                    if (timThay == false) {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;
                }
                // BAI 3 VA BAI 4: XOA SACH
                case 9: {
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();

                    boolean daXoa = false;
                    for (int i = 0; i < danhSachSach.size(); i++) {
                        String[] thongTin = danhSachSach.get(i).split(";");
                        if (thongTin[0].equalsIgnoreCase(maXoa)) {
                            danhSachSach.remove(i);
                            daXoa = true;
                            System.out.println("Da xoa sach thanh cong!");
                            break;
                        }
                    }
                    if (daXoa == false) {
                        System.out.println("Khong tim thay sach can xoa!");
                    }
                    break;
                }
                // BAI 3 VA BAI 4: SUA SACH
                case 10: {
                    System.out.print("Nhap ma sach can sua: ");
                    String maSua = sc.nextLine();
                    boolean daSua = false;
                    for (int i = 0; i < danhSachSach.size(); i++) {
                        String[] thongTin = danhSachSach.get(i).split(";");
                        if (thongTin[0].equalsIgnoreCase(maSua)) {
                            System.out.println("Nhap thong tin moi:");
                            System.out.print("Nhap ten sach moi: ");
                            String tenSach = sc.nextLine();
                            System.out.print("Nhap tac gia moi: ");
                            String tacGia = sc.nextLine();
                            System.out.print("Nhap nam xuat ban moi: ");
                            int namXuatBan = sc.nextInt();
                            System.out.print("Nhap don gia moi: ");
                            double donGia = sc.nextDouble();
                            System.out.print("Nhap so luong moi: ");
                            int soLuong = sc.nextInt();
                            sc.nextLine();
                            String sachMoi = thongTin[0] + ";" +
                                             tenSach + ";" +
                                             tacGia + ";" +
                                             namXuatBan + ";" +
                                             donGia + ";" +
                                             soLuong;
                            danhSachSach.set(i, sachMoi);
                            daSua = true;
                            System.out.println("Da sua sach thanh cong!");
                            break;
                        }
                    }
                    if (daSua == false) {
                        System.out.println("Khong tim thay sach can sua!");
                    }
                    break;
                }
                // BAI 4: TINH TONG SO LUONG SACH
                case 11: {
                    int tongSoLuong = 0;
                    for (int i = 0; i < danhSachSach.size(); i++) {
                        String[] thongTin = danhSachSach.get(i).split(";");

                        tongSoLuong = tongSoLuong +
                                      Integer.parseInt(thongTin[5]);
                    }
                    System.out.println("Tong so luong sach: " + tongSoLuong);
                    break;
                }
                // BAI 4: TINH TONG GIA TRI SACH
                case 12: {
                    double tongGiaTri = 0;

                    for (int i = 0; i < danhSachSach.size(); i++) {
                        String[] thongTin = danhSachSach.get(i).split(";");

                        double donGia = Double.parseDouble(thongTin[4]);
                        int soLuong = Integer.parseInt(thongTin[5]);

                        tongGiaTri = tongGiaTri + donGia * soLuong;
                    }
                    System.out.println("Tong gia tri sach: " + tongGiaTri);
                    break;
                }
                case 13:
                    System.out.println("Da thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 13);
        sc.close();
    }
}
