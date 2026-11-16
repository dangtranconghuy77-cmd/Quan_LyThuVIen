import java.time.Year;
public class SACH {

    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int nhaXuatBan;
    private int soLuong;
    private int namXuatBan;

    //getters and setters
    public String getMasach() {
        return maSach;
    }
    public void setMasach(String maSach) {
        this.maSach = maSach;
    }

    public String getTieude() {
        return tieuDe;
    }
    public void setTieude(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getTacgia() {
        return tacGia;
    }
    public void setTacgia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNhaXuatban() {
        return nhaXuatBan;
    }
    public void setNhaXuatban(int nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        if (soLuong >=0) {
            this.soLuong = soLuong;
        } else {
            System.out.println("So Luong khong duoc am!");
        }
    }

    public int getNamXuatban() {
        return namXuatBan;
    }
    public void setNamXuatban(int namXuatBan) {
        int currentYear = Year.now().getValue(); //lấy năm hiện tại
        //kiêm tra năm xuất bản có hợp lệ không
        if (namXuatBan > 0 && namXuatBan <= currentYear) {
            this.namXuatBan = namXuatBan;
        } else {
            System.out.println("Năm xuất bản không hợp lệ. Vui lòng nhập lại.");
        }
    }

    public SACH(String maSach, String tieuDe, String tacGia, int nhaXuatBan, int soLuong, int namXuatBan) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.nhaXuatBan = nhaXuatBan;
        this.soLuong = soLuong;
        this.namXuatBan = namXuatBan;

        setNamXuatban(namXuatBan); // gọi phương thức set để kiểm tra năm xuất bản
        setSoLuong(soLuong); // gọi phương thức set để kiểm tra số lượng
    }

    public void hienThiThongTinSach() {
        System.out.println("Mã sách: " + this.maSach);
        System.out.println("Tiêu đề: " + this.tieuDe);
        System.out.println("Tác giả: " + this.tacGia);
        System.out.println("Nhà xuất bản: " + this.nhaXuatBan);
        System.out.println("Số lượng: " + this.soLuong);
        System.out.println("Năm xuất bản: " + this.namXuatBan);
    }
}
