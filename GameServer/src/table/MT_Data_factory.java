package table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
@SuppressWarnings("unused")
public class MT_Data_factory extends MT_DataBase {
    public static String MD5 = "1171a5a0b00da895178128958db98f61";
    private Integer m_nLevel ;
    /** 等级 */
    public Integer Level() { return m_nLevel; }
    public Integer getM_nLevel() {return m_nLevel; }
    /** 等级 */
    public Integer ID() { return m_nLevel; }
    private String m_sFile ;
    /** 路径 */
    public String File() { return m_sFile; }
    public String getM_sFile() {return m_sFile; }
    private Int2 m_Volume ;
    /** 体积 */
    public Int2 Volume() { return m_Volume; }
    public Int2 getM_Volume() {return m_Volume; }
    private String m_sName ;
    /** 名字 */
    public String Name() { return m_sName; }
    public String getM_sName() {return m_sName; }
    private Integer m_nMax ;
    /** 生产上限 */
    public Integer Max() { return m_nMax; }
    public Integer getM_nMax() {return m_nMax; }
    private Integer m_nDelete ;
    /** 是否可拆除 */
    public Integer Delete() { return m_nDelete; }
    public Integer getM_nDelete() {return m_nDelete; }
    private Integer m_nNeedPlayerLv ;
    /** 升级所需玩家等级 */
    public Integer NeedPlayerLv() { return m_nNeedPlayerLv; }
    public Integer getM_nNeedPlayerLv() {return m_nNeedPlayerLv; }
    private Int2 m_NeedBuild ;
    /** 升级所需建筑 */
    public Int2 NeedBuild() { return m_NeedBuild; }
    public Int2 getM_NeedBuild() {return m_NeedBuild; }
    private ArrayList<Int2> m_arrayNeedResource = new ArrayList<Int2>();
    /** 升级所需资源 */
    public ArrayList<Int2> NeedResource() { return m_arrayNeedResource; }
    public ArrayList<Int2> getM_arrayNeedResource() {return m_arrayNeedResource; }
    private Integer m_nUpgradeTimer ;
    /** 升级时间(秒) */
    public Integer UpgradeTimer() { return m_nUpgradeTimer; }
    public Integer getM_nUpgradeTimer() {return m_nUpgradeTimer; }
    private Integer m_nTimerType ;
    /** 生产时间缩短类型 */
    public Integer TimerType() { return m_nTimerType; }
    public Integer getM_nTimerType() {return m_nTimerType; }
    private Integer m_nTimer ;
    /** 缩短时间 */
    public Integer Timer() { return m_nTimer; }
    public Integer getM_nTimer() {return m_nTimer; }
    private ArrayList<Integer> m_arrayCorps = new ArrayList<Integer>();
    /** 生产兵种 */
    public ArrayList<Integer> Corps() { return m_arrayCorps; }
    public ArrayList<Integer> getM_arrayCorps() {return m_arrayCorps; }
    private ArrayList<Float3> m_arrayModelPos = new ArrayList<Float3>();
    /** 生产界面模型位置 */
    public ArrayList<Float3> ModelPos() { return m_arrayModelPos; }
    public ArrayList<Float3> getM_arrayModelPos() {return m_arrayModelPos; }
    private ArrayList<Float2> m_arrayModelSocal = new ArrayList<Float2>();
    /** 生产界面模型缩放 */
    public ArrayList<Float2> ModelSocal() { return m_arrayModelSocal; }
    public ArrayList<Float2> getM_arrayModelSocal() {return m_arrayModelSocal; }
    private Integer m_nLevelUpExp ;
    /** 升级加成 */
    public Integer LevelUpExp() { return m_nLevelUpExp; }
    public Integer getM_nLevelUpExp() {return m_nLevelUpExp; }
    public static MT_Data_factory ReadMemory ( ByteBuffer reader, String fileName ) {
        MT_Data_factory Data = new MT_Data_factory();

        Integer count;
		Data.m_nLevel = reader.getInt();
		Data.m_sFile = TableUtil.ReadString(reader);
		Data.m_Volume = Int2.ReadMemory(reader, fileName);
		Data.m_sName = TableUtil.ReadLString(reader, fileName,"Name",Data.ID());
		Data.m_nMax = reader.getInt();
		Data.m_nDelete = reader.getInt();
		Data.m_nNeedPlayerLv = reader.getInt();
		Data.m_NeedBuild = Int2.ReadMemory(reader, fileName);
		
        count = reader.getInt();
        for (Integer i = 0;i < count; ++i) 
        {
            Data.m_arrayNeedResource.add(Int2.ReadMemory(reader, fileName));
        }

		Data.m_nUpgradeTimer = reader.getInt();
		Data.m_nTimerType = reader.getInt();
		Data.m_nTimer = reader.getInt();
		
        count = reader.getInt();
        for (Integer i = 0;i < count; ++i) 
        {
            Data.m_arrayCorps.add(reader.getInt());
        }

		
        count = reader.getInt();
        for (Integer i = 0;i < count; ++i) 
        {
            Data.m_arrayModelPos.add(Float3.ReadMemory(reader, fileName));
        }

		
        count = reader.getInt();
        for (Integer i = 0;i < count; ++i) 
        {
            Data.m_arrayModelSocal.add(Float2.ReadMemory(reader, fileName));
        }

		Data.m_nLevelUpExp = reader.getInt();
		return Data;
	}
    @Override
    public boolean IsInvalid () {
        if (!TableUtil.IsInvalid(this.m_nLevel)) return false;
        if (!TableUtil.IsInvalid(this.m_sFile)) return false;
        if (!TableUtil.IsInvalid(this.m_Volume)) return false;
        if (!TableUtil.IsInvalid(this.m_sName)) return false;
        if (!TableUtil.IsInvalid(this.m_nMax)) return false;
        if (!TableUtil.IsInvalid(this.m_nDelete)) return false;
        if (!TableUtil.IsInvalid(this.m_nNeedPlayerLv)) return false;
        if (!TableUtil.IsInvalid(this.m_NeedBuild)) return false;
        if (this.m_arrayNeedResource.size() > 0) return false;
        if (!TableUtil.IsInvalid(this.m_nUpgradeTimer)) return false;
        if (!TableUtil.IsInvalid(this.m_nTimerType)) return false;
        if (!TableUtil.IsInvalid(this.m_nTimer)) return false;
        if (this.m_arrayCorps.size() > 0) return false;
        if (this.m_arrayModelPos.size() > 0) return false;
        if (this.m_arrayModelSocal.size() > 0) return false;
        if (!TableUtil.IsInvalid(this.m_nLevelUpExp)) return false;
        return true;
    }
    @Override
    public Object GetDataByString ( String str ) throws Exception {
        if (str.equals("Level"))
            return Level();
        if (str.equals("File"))
            return File();
        if (str.equals("Volume"))
            return Volume();
        if (str.equals("Name"))
            return Name();
        if (str.equals("Max"))
            return Max();
        if (str.equals("Delete"))
            return Delete();
        if (str.equals("NeedPlayerLv"))
            return NeedPlayerLv();
        if (str.equals("NeedBuild"))
            return NeedBuild();
        if (str.equals("NeedResource"))
            return NeedResource();
        if (str.equals("UpgradeTimer"))
            return UpgradeTimer();
        if (str.equals("TimerType"))
            return TimerType();
        if (str.equals("Timer"))
            return Timer();
        if (str.equals("Corps"))
            return Corps();
        if (str.equals("ModelPos"))
            return ModelPos();
        if (str.equals("ModelSocal"))
            return ModelSocal();
        if (str.equals("LevelUpExp"))
            return LevelUpExp();
            return null;
    }
    @Override
    public String toString ( ) {
        String str = "";
        str += ("Level =" + Level() + '\n');
        str += ("File =" + File() + '\n');
        str += ("Volume =" + Volume() + '\n');
        str += ("Name =" + Name() + '\n');
        str += ("Max =" + Max() + '\n');
        str += ("Delete =" + Delete() + '\n');
        str += ("NeedPlayerLv =" + NeedPlayerLv() + '\n');
        str += ("NeedBuild =" + NeedBuild() + '\n');
        str += ("NeedResource =" + NeedResource() + '\n');
        str += ("UpgradeTimer =" + UpgradeTimer() + '\n');
        str += ("TimerType =" + TimerType() + '\n');
        str += ("Timer =" + Timer() + '\n');
        str += ("Corps =" + Corps() + '\n');
        str += ("ModelPos =" + ModelPos() + '\n');
        str += ("ModelSocal =" + ModelSocal() + '\n');
        str += ("LevelUpExp =" + LevelUpExp() + '\n');
        return str;
    }
}