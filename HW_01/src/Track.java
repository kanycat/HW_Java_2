public class Track implements Barrier {

    private int length;

    public Track(int length) {
        this.length = length;
    }

    public String check(Contest_member contestMember) {
        contestMember.runStr();
        contestMember.setSuccess(contestMember.getMaxLength() >= length);
        if (contestMember.getSuccess()) {
            return "Участник " + contestMember.getName() + " проходит дистанцию длиной: " + length + " км";
        } else {
            return "Участник " + contestMember.getName() + " не проходит дистанцию длиной: " + length + " км";
        }
    }
}
