package builder_message;

public class MessageBuilder {
    private MessageType messageType;
    private String content;
    private String sender;
    private String recipient;
    private boolean isDelivered;
    private long timestamp;

    private MessageBuilder(Builder builder){ //This is the constructor
        this.messageType=builder.getMessage();
        this.content=builder.getContent();
        this.sender=builder.getSender();
        this.recipient=builder.getRecipient();
        this.isDelivered=builder.getIsDelivered();
        this.timestamp=builder.getTimestamp();
    }
    public static class Builder{
        private MessageType messageType;
        private String content;
        private String sender;
        private String recipient;
        private boolean isDelivered;
        private long timestamp;

        public MessageType getMessage(){
            return this.messageType;
        }
        public  String getContent(){
            return this.content;
        }
        public String getSender(){
            return this.sender;
        }
        public String getRecipient(){
            return this.recipient;
        }
        public boolean getIsDelivered(){
            return this.isDelivered;
        }
        public long getTimestamp(){
            return this.timestamp;
        }

        public Builder setmessageType(MessageType type){
            this.messageType=type;
            return this;

        }

        public Builder setcontent(String content){
            this.content=content;
            return this;
        }

        public Builder setsender(String sender){
            this.sender=sender;
            return this;
        }

        public Builder setrecipient(String recipient){
            this.recipient=recipient;
            return this;
        }

        public Builder setisDelivered(boolean isDelivered){
            this.isDelivered=isDelivered;
            return this;
        }

        public Builder settimestamp(long timestamp){
            this.timestamp=timestamp;
            return this;
        }

        public MessageBuilder build(){
            return new MessageBuilder(this); //Only passed the object because we have provided the seperate methods
        }
    }

}

/*
PROBLEM STATEMENT:

You are developing a messaging application with support for various message types,
including text, images, audio, and video. Each message type can have additional
attributes and settings, such as delivery status and timestamps.
The current approach of creating message objects using multiple overloaded constructors
has become error-prone and challenging to maintain. You should streamline the creation of
message objects with different configurations and immutable objects.

 */

//Alternate solution for above problem exactly similar to the design
