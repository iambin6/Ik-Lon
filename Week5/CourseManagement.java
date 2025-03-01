package Week5;

public class OnlineCourse extends Course {
    private String platform;
    private String instructor;
    private String note;

    public OnlineCourse() {
        super();
        this.platform = "";
        this.instructor = "";
        this.note = "";
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void inputAll(String id, String name, int credits, String platform, String instructor, String note) {
        setCourseID(id);
        setCourseName(name);
        setCredits(credits);
        this.platform = platform;
        this.instructor = instructor;
        this.note = note;
    }

    @Override
    public String toString() {
        return super.toString() + "OnlineCourse{" + "platform=" + platform + ", instructor=" + instructor + ", note=" + note + '}';
    }
}
