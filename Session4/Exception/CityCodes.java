package Exception;

public enum CityCodes {
    TEH(1),ISF(2),QOM(3),MHD(4),SHZ(5);
    int num;

    CityCodes(int num){
        this.num = num;
    }

    public static CityCodes getCodeByNum(int num){
        if(num == 1)
            return TEH;
        if(num == 2)
            return ISF;
        if(num == 3)
            return QOM;
        if(num == 4)
            return MHD;
        return SHZ;
    }
}
