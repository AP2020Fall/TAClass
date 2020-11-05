package Enum;

public enum CompanyName {
    APPLE(1978),SAMSUNG(2000),LG(1990),HUAWEI(2005),XIAOMI(2015);
    private int found;

    CompanyName(int found){
        this.found = found;
    }

    public int getFound() {
        return found;
    }
}
