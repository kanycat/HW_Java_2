public class Wall implements Barrier{

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public String check(Contest_member contestMember) {
        contestMember.runStr();
        contestMember.setSuccess(contestMember.getMaxLength() >= height);
        if (contestMember.getSuccess()) {
            return "Участник " + contestMember.getName() + " перепрыгивает стену высотой: " + height + " м";
        } else {
            return "Участник " + contestMember.getName() + " не перепрыгивает стену высотой: " + height + " м";
        }
    }
}
