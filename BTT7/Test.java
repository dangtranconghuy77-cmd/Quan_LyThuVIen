import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        ArrayList<SACH> danhSachSach = new ArrayList<>();
        SACH sach1 = new SACH(
            "S001",
            "Lập trình Java",
            "Nguyễn Văn A",
            2020,
            10,
            2020
        );
        danhSachSach.add(sach1);

        SACH sach2 = new SACH(
            "S002",
            "Cấu trúc dữ liệu và giải thuật",
            "Trần Thị B",
            2019,
            5,
            2019
        );
        danhSachSach.add(sach2);

        System.out.println("Danh sách sách:");
        for (SACH sach : danhSachSach) {
            sach.hienThiThongTinSach();
        }
    }
}