package info.androidhive.sqlite.database.model;

/**
 * Created by ravi on 20/02/18.
 */

public class Note {
    public static final String TABLE_NAME = "notes";

    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NOTE = "note";
    public static final String COLUMN_TIMESTAMP = "timestamp";
    public static final String COLUMN_DESC = "desc";


    private int id;
    private String note;
    private String timestamp;
    private String desc;


    // Create table SQL query
    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_NOTE + " TEXT,"
                    + COLUMN_TIMESTAMP + " DATETIME DEFAULT CURRENT_TIMESTAMP,"
                    + COLUMN_DESC + " TEXT"
                    + ")";

    public Note() {
    }

    public Note(int id, String note, String timestamp, String desc) {
        this.id = id;
        this.note = note;
        this.timestamp = timestamp;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public String getNote() {
        return note;
    }
    public String getDesc() {
        return desc;
    }

    public void setNote(String note) {
        this.note = note;
    }
    public void setDesc(String desc) {
        this.desc = desc ;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
