package table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
@SuppressWarnings("unused")
public class MT_Table_UserInterface extends MT_TableBase {
	final String FILE_MD5_CODE = "8b656a584b9a79689e9c212b6eff584e";
    private String fileName = "";
    private HashMap<String,MT_Data_UserInterface> m_dataArray = new HashMap<String,MT_Data_UserInterface>();

    public MT_Table_UserInterface (String fileName) {
        this.fileName = fileName;
    }

    public void Initialize() throws Exception {
        m_dataArray.clear();
        byte[] buffer = TableUtil.GetBuffer(fileName);
        ByteBuffer reader = ByteBuffer.wrap(buffer).order(ByteOrder.LITTLE_ENDIAN);
        Integer iRow = reader.getInt();
        Integer iColums = reader.getInt();
        Integer iCodeNum = reader.getInt();

        String strMD5Code = TableUtil.ReadString(reader);
        if (!strMD5Code.equals(FILE_MD5_CODE))
            throw new Exception("文件" + fileName + "版本验证失败");
        for (Integer i = 0; i < iColums; ++i) {
            Integer index = reader.getInt();
            reader.getInt();
            if (index.equals(TableUtil.CLASS_VALUE))
            {
                TableUtil.ReadString(reader);
                Integer nCount = reader.getInt();
                for (Integer k=0; k < nCount; ++k){
                    reader.getInt();
                }
            }
        }
        for (Integer i = 0; i < iRow; ++i) {
            MT_Data_UserInterface pData = MT_Data_UserInterface.ReadMemory(reader, fileName);
            if (Contains(pData.ID()))
                throw new Exception("文件" + fileName + "有重复项 ID : " + pData.ID());
            else
                m_dataArray.put(pData.ID(),pData);
        }
    }
            
    @Override
    public Boolean Contains(String ID) {
        return m_dataArray.containsKey(ID);
    }

	public MT_Data_UserInterface GetElement(String ID) {
		if (Contains(ID))
			return m_dataArray.get(ID);
        TableUtil.Warning("MT_Data_UserInterface key is not exist " + ID);
		return null;
	}

    @Override
	public MT_DataBase GetValue(String ID) {
		return GetElement(ID);
	}

    @Override
	public Integer Count() {
		return m_dataArray.size();
	}

	public final HashMap<String,MT_Data_UserInterface> Datas() {
		return m_dataArray;
	}

}
