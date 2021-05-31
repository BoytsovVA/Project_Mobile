package com.example.Recipes.model_note;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Note implements Parcelable {
  @PrimaryKey(autoGenerate = true)
  public int uid;

  @ColumnInfo(name = "text")
  public String text;

  @ColumnInfo(name = "timestamp")
  public long timestamp;

  public Note(Parcel in) {
    uid = in.readInt();
    text = in.readString();
    timestamp = in.readLong();
  }

  public Note() {}

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Note note = (Note) o;
    if (uid != note.uid) return false;
    if (timestamp != note.timestamp) return false;
    return text != null ? text.equals(note.text) : note.text == null;
  }

  @Override
  public int hashCode() {
    int result = uid;
    result = 31 * result + (text != null ? text.hashCode() : 0);
    result = 31 * result + (int) (timestamp ^ (timestamp >>> 32));
    return result;
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(Parcel dest, int flags) {
    dest.writeInt(uid);
    dest.writeString(text);
    dest.writeLong(timestamp);
  }

  public static final Creator<Note> CREATOR =
      new Creator<Note>() {
        @Override
        public Note createFromParcel(Parcel in) {
          return new Note(in);
        }

        @Override
        public Note[] newArray(int size) {
          return new Note[size];
        }
      };
}