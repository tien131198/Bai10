/* Welcome to project
    @author: tienb
    Date: 11/6/2022
    Time: 10:56 PM
    
    ProjectName: Bai10
*/public class VanBan {
    private String st;

    public VanBan(String st) {
        this.st = st;
    }

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    // Đếm số từ văn bản
    public int demSoTu() {
        String trim = this.st.trim();
        if (!trim.isEmpty())
            return (int) trim.split("\\s+").length;
        return 0;
    }

    // Đếm số kí tự A không phân biệt hoa thường
    public int demKiTu() {
        String s1 = this.st.replace("A", "");
        String s2 = s1.replace("a", "");
        return this.st.length() - s2.length();
    }

    // Chuẩn hóa văn bản
    public String chuanHoaVB() {
        String s1 = this.st.trim();
        String s2 = s1.replaceAll("\\s+", " ");
        return s2;
    }

    public static void main(String[] args) {
        String str = "hAllo         1     hah    ghh Aaww";
        VanBan s = new VanBan(str);
        System.out.println(s.demSoTu());
        System.out.println(s.demKiTu());
        System.out.println(s.chuanHoaVB());
    }
}
