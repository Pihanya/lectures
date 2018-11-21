public class SimpleMessage implements Message {
    private String textMessage;

    @Override
    public void setTextMessage(String textMessage) {
        this.textMessage = textMessage;
    }

    @Override
    public String getTextMessage() {
        return textMessage;
    }

    public String toString(){
        return "Text message: " + textMessage;
    }
}
