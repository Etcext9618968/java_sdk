
import org.json.JSONObject;
import com.youtu.*;

public class Demo {

	// appid, secretid secretkey�뵽http://open.youtu.qq.com/ע��
	// ��������APP_ID��SECRET_ID��SECRET_KEY�������Լ������ݣ�����������Ѿ�������
	public static final String APP_ID = "1000234";
	public static final String SECRET_ID = "AKIDUIsdfDlPDt5mZutfr46sdNT0GisFcQh1nMOox";
	public static final String SECRET_KEY = "ind5yAd55ZspBc7MCANcxsdEjuXi8YU8RL";

	public static void main(String[] args) {

		try {
			Youtu faceYoutu = new Youtu(APP_ID, SECRET_ID, SECRET_KEY);
			
			JSONObject respose = faceYoutu.DetectFace("test.jpg");
			//get respose 
			System.out.println(respose);
			//get detail info
			if(respose.getInt("errorcode")==0){
				
				System.out.println(respose.get("image_height"));
				System.out.println(respose.get("face"));
				System.out.println(respose.getJSONArray("face").getJSONObject(0).get("yaw"));
				System.out.println(respose.getInt("errorcode"));
				System.out.println(respose.get("errormsg"));
				
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
