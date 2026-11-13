import java.util.ArrayList;
public class Test {
    public static void main(String[] args){
        ArrayList<SACH> danhSachSach = new ArrayList<>();
        SACH sach1 = new SACH();
        sach1.maSach = "S001";
        sach1.tieuDe = "Lập trình Java";    
        sach1.tacGia = "Nguyễn Văn A";
        sach1.nhaXuatBan = 2020;
        sach1.soLuong = 10;
        sach1.hienThiThongTinSach();
        danhSachSach.add(sach1);

        SACH sach2 = new SACH();
        sach2.maSach = "S002";
        sach2.tieuDe = "Cấu trúc dữ liệu và giải thuật";
        sach2.tacGia = "Trần Thị B";
        sach2.nhaXuatBan = 2019;
        sach2.soLuong = 5;
        sach2.hienThiThongTinSach();
        danhSachSach.add(sach2);

        System.out.println("Danh sách sách:");
        for (SACH sach : danhSachSach) {
            sach.hienThiThongTinSach();
        }
    }
}