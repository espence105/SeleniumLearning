/**
 * Created by Eric on 1/26/2015.
 */
public class labels {
    public labels(String labelName, String keyInput) {
        this.labelName = labelName;
        this.keyInput = keyInput;
    }

    private String labelName;

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public String getKeyInput() {
        return keyInput;
    }

    public void setKeyInput(String keyInput) {
        this.keyInput = keyInput;
    }

    private String keyInput;
}
