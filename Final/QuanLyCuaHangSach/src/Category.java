public enum Category {
    SACHTIENGVIET("Sách tiếng việt"), SACHTIENGANH("Sách tiếng anh"), EBOOK("Sách điện tử");

    private String value;

    private Category(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
