public class Cat implements Contest_member {
    private String name;
    private int maxLength;
    private int maxHeight;
    private boolean success = true;


    public Cat(String name, int maxLength, int maxHeight) {
        this.name = name;
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }

    public String runStr (){
        return name + " может пробежать " + maxLength + " км.";
    }

    public String jumpStr (){
        return name + " может подпрыгнуть на " + maxHeight + " м.";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }
    public boolean getSuccess() {
        return success;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }
}
