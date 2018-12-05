
package es.babel.interviewandroid.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Question implements Parcelable
{

    @SerializedName("choices")
    @Expose
    private List<Choice> choices = null;
    @SerializedName("question")
    @Expose
    private String question;
    @SerializedName("type")
    @Expose
    private String type;
    public final static Creator<Question> CREATOR = new Creator<Question>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Question createFromParcel(Parcel in) {
            return new Question(in);
        }

        public Question[] newArray(int size) {
            return (new Question[size]);
        }

    }
    ;

    protected Question(Parcel in) {
        in.readList(this.choices, (Choice.class.getClassLoader()));
        this.question = ((String) in.readValue((String.class.getClassLoader())));
        this.type = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Question() {
    }

    public List<Choice> getChoices() {
        return choices;
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(choices);
        dest.writeValue(question);
        dest.writeValue(type);
    }

    public int describeContents() {
        return  0;
    }

}
