package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Message {
    private int id;
    private String title;
    private String text;
    private LocalDateTime time;

    public Message(int id, String title, String text, LocalDateTime time) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}

public class MessageController {
    private List<Message> messages;

    public MessageController() {
        messages = new ArrayList<>();
    }

    public void createMessage(int id, String title, String text, LocalDateTime time) {
        Message message = new Message(id, title, text, time);
        messages.add(message);
    }

    public Message readMessage(int id) {
        for (Message message : messages) {
            if (message.getId() == id) {
                return message;
            }
        }
        return null;
    }

    public void updateMessage(int id, String title, String text, LocalDateTime time) {
        for (Message message : messages) {
            if (message.getId() == id) {
                message.setTitle(title);
                message.setText(text);
                message.setTime(time);
                return;
            }
        }
    }

    public void deleteMessage(int id) {
        for (Message message : messages) {
            if (message.getId() == id) {
                messages.remove(message);
                return;
            }
        }
    }
    public class Person {
        private int id;
        private String title;
        private String text;
        private LocalDateTime time;

        public Person(int id, String title, String text, LocalDateTime time) {
            this.id = id;
            this.title = title;
            this.text = text;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public LocalDateTime getTime() {
            return time;
        }

        public void setTime(LocalDateTime time) {
            this.time = time;
        }
    }

    public class PersonController {
        private List<Message> messages;

        public PersonController() {
            messages = new ArrayList<>();
        }

        public void createPerson(int id, String title, String text, LocalDateTime time) {
            Message message = new Message(id, title, text, time);
            messages.add(message);
        }

        public Person readPerson(int id) {
            for (Message message : messages) {
                if (message.getId() == id) {
                    return Person;
                }
            }
            return null;
        }

        public void PersonMessage(int id, String title, String text, LocalDateTime time) {
            for (Message message : messages) {
                if (message.getId() == id) {
                    message.setTitle(title);
                    message.setText(text);
                    message.setTime(time);
                    return;
                }
            }
        }

        public void deleteMessage(int id) {
            for (Message message : messages) {
                if (message.getId() == id) {
                    messages.remove(message);
                    return;
                }
            }
        }
    }
}
