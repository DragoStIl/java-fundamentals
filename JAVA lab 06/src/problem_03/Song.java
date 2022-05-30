package problem_03;

public class Song {



    private String typeList;
    private String name;
    private String time;

    public Song (String typeList, String songName, String songDuration) {
        this.typeList = typeList;
        this.name = songName;
        this.time = songDuration;
    }

    public String getTypeList() {
        return typeList;
    }

    @Override
    public String toString() {

        return this.name;
    }
}
