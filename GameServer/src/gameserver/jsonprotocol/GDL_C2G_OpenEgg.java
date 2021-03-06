package gameserver.jsonprotocol;
import java.util.List;
import java.util.ArrayList;
import com.commons.util.JsonUtil;
import com.commons.network.websock.JsonPacket;

public final class GDL_C2G_OpenEgg extends JsonPacket {
	public int getProtocolId() { return 400; }
	Integer a;
	public Integer getEggid() { return this.a;}  // 
	public void setEggid(Integer a) { this.a = a;}

	public static GDL_C2G_OpenEgg parse(String data) {
		 return JsonUtil.JsonToObject(data, GDL_C2G_OpenEgg.class); 
	}

	public String json() {
		 return JsonUtil.ObjectToJson(this); 
	}

}
