package net.hananet.bns2.sungdongrecyclerview;

public class StorageItem { //RecyclerView 아이템의 데이터를 저장하기 위한 클래스
    private String title;
    private int num;
    private String creator;
    private String detail;
    private boolean checked;

    public StorageItem(String title, int num, String creator, String detail, boolean checked) {
        this.title = title;
        this.num = num;
        this.creator = creator;
        this.detail = detail;
        this.checked = checked;
    }

    public String getTitle() {
        return title;
    }

    public int getNum() {
        return num;
    }

    public String getCreator() {
        return creator;
    }

    public String getDetail() {
        return detail;
    }

    public boolean isChecked() {
        return checked;
    }
}
