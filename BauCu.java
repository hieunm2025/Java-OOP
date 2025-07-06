import java.util.*;
/**
 * Đề bài: Bầu cử
 * 
 * Mô tả: Tìm ứng viên có số phiếu bầu cao thứ hai trong cuộc bầu cử
 * 
 * Input:
 * - Dòng 1: n (số người bỏ phiếu) và m (số ứng viên)
 * - Dòng 2: n số nguyên đại diện cho phiếu bầu của từng người
 * 
 * Output:
 * - Số hiệu ứng viên có phiếu bầu cao thứ hai
 * - "NONE" nếu không tồn tại ứng viên như vậy
 * 
 * Ràng buộc: 1 ≤ n, m ≤ 10⁵, 1 ≤ aᵢ ≤ m
 * 
 * Thuật toán:
 * 1. Đếm số phiếu bầu của từng ứng viên
 * 2. Sắp xếp ứng viên theo số phiếu giảm dần, số hiệu tăng dần
 * 3. Loại bỏ tất cả ứng viên có số phiếu cao nhất
 * 4. Trả về ứng viên đầu tiên còn lại hoặc "NONE"
 */
public class BauCu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        //Dem so phieu bau cho tung ung vien
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i = 0;i < n; i++){
            int candidate = sc.nextInt();
            mp.put(candidate,mp.getOrDefault(candidate,0) + 1);
        }
        //Tao danh sach cac ung vien va sap xep
        List<Integer> candidates = new ArrayList<>(mp.keySet());
        candidates.sort((x,y)->{
            int voteCompare = Integer.compare(mp.get(y),mp.get(x));
            if(voteCompare!=0){
                return voteCompare;
            }
            //Neu so phieu bang nhau, sap xep theo so hieu tang dan
            return Integer.compare(x,y);
        });
        
        //Tim so phieu Bau cao nhat
        int maxVotes = mp.get(candidates.get(0));
        // Loai bo tat ca ung vien co so phieu cao nhat
        while(!candidates.isEmpty() && mp.get(candidates.get(0))==maxVotes){
            candidates.remove(0);
        }
        if(candidates.isEmpty()){
            System.out.println("NONE");
        } else {
            System.out.println(candidates.get(0));
        }
    }
}
