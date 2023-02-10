package com.app.mochat;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.annotation.NonNull;

public class DatabaseHelper {


        //users database table
        private int user_id;
        private String user_name;
        private String user_password;
        private String phone_number;
       /* //message database table
        private int sender_id;
        private String sender_name;
        private int receiver_id;
        private String message_body;
        private String send_time;
        */
        //Constructors
                //users
        public DatabaseHelper(int user_id, String user_name, String profile_photo, String user_password, String phone_number) {
                this.user_id = user_id;
                this.user_name = user_name;
                this.user_password = user_password;
                this.phone_number = phone_number;
        }
       /*         //messages
        public DatabaseHelper(int sender_id, String sender_name, int receiver_id, String message_body, String send_time) {
                this.sender_id = sender_id;
                this.sender_name = sender_name;
                this.receiver_id = receiver_id;
                this.message_body = message_body;
                this.send_time = send_time;
        }
                //empty constructor

        */
        public DatabaseHelper() {}

        //to string methods for printing the contexts of the class objects.
        @NonNull
        @Override
        public String toString() {
                return "DatabaseHelper{" +
                        "user_id=" + user_id +
                        ", user_name='" + user_name + '\'' +
                        ", user_password='" + user_password + '\'' +
                        ", phone_number='" + phone_number + '\'' +
                      '}';
        }

        //This are the senders and getters for the users table
        public int getUser_id() {
                return user_id;
        }
        public void setUser_id(int user_id) {
                this.user_id = user_id;
        }
        public String getUser_name() {
                return user_name;
        }
        public void setUser_name(String user_name) {
                this.user_name = user_name;
        }
       public String getUser_password() {
                return user_password;
        }
        public void setUser_password(String user_password) {
                this.user_password = user_password;
        }
        public String getPhone_number() {
                return phone_number;
        }
        public void setPhone_number(String phone_number) {
                this.phone_number = phone_number;
        }
    /*    //This are the senders and getters for the messages table
        public int getSender_id() {
                return sender_id;
        }
        public void setSender_id(int sender_id) {
                this.sender_id = sender_id;
        }
        public String getSender_name() {
                return sender_name;
        }
        public void setSender_name(String sender_name) {
                this.sender_name = sender_name;
        }
        public int getReceiver_id() {
                return receiver_id;
        }
        public void setReceiver_id(int receiver_id) {
                this.receiver_id = receiver_id;
        }
        public String getMessage_body() {
                return message_body;
        }
        public void setMessage_body(String message_body) {
                this.message_body = message_body;
        }
        public String getSend_time() {
                return send_time;
        }
        public void setSend_time(String send_time) {
                this.send_time = send_time;
        }
*/
}
