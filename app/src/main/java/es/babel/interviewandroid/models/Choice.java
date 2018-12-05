
package es.babel.interviewandroid.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Choice implements Parcelable
{

    @SerializedName("choice")
    @Expose
    private String choice;
    @SerializedName("value")
    @Expose
    private Boolean value;
    public final static Creator<Choice> CREATOR = new Creator<Choice>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Choice createFromParcel(Parcel in) {
            return new Choice(in);
        }

        public Choice[] newArray(int size) {
            return (new Choice[size]);
        }

    }
    ;

    protected Choice(Parcel in) {
        this.choice = ((String) in.readValue((String.class.getClassLoader())));
        this.value = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
    }

    public Choice() {
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public Boolean getValue() {
        return value;
    }

    public void setValue(Boolean value) {
        this.value = value;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(choice);
        dest.writeValue(value);
    }

    public int describeContents() {
        return  0;
    }

}
