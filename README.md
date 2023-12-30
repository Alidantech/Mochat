# Java Chat App README

## Overview

Welcome to the Java Chat App! This application provides a simple and interactive chat platform where users can communicate in real-time. The application is built using Java, offering a robust and scalable solution for messaging needs.

## Features

1. **Real-time Messaging:** Engage in instant conversations with other users.
2. **User Authentication:** Securely log in with your credentials to access the chat.
3. **User Presence:** See the online status of other users.
4. **Group Chats:** Create and participate in group conversations.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your machine.
- IDE (Integrated Development Environment) like IntelliJ or Eclipse.

### Setup

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/java-chat-app.git
   ```
2. Open the project in your preferred IDE.

3. Build and run the application.

### Usage
1. Launch the application.

2. Register or log in with your credentials.

3. Start chatting with other users.

4. Create or join group chats for collaborative discussions.

## Technology Stack
- Java: Core programming language.
- Socket Programming: For real-time communication.
- Swing: GUI library for the graphical user interface.
## Project Structure
The project is structured as follows:
```
java-chat-app/
|-- src/
|   |-- com.example.chatapp/
|       |-- client/
|           |-- Client.java
|           |-- GUI/
|               |-- ChatWindow.java
|               |-- LoginWindow.java
|       |-- server/
|           |-- Server.java
|-- resources/
|   |-- application.properties
|-- README.md
```
## Configuration
You can customize the application by modifying the application.properties file in the resources directory.

### properties

# application.properties

# Server configuration
server.host=localhost
server.port=8080

# Database configuration
db.url=jdbc:mysql://localhost:3306/chatapp
db.username=root
db.password=password
Contributions
Contributions are welcome! Feel free to fork the repository and submit pull requests to improve the functionality, fix bugs, or add new features.

## License
This project is licensed under the MIT License - see the LICENSE file for details.

## Acknowledgments
Special thanks to the Java community and the developers of libraries used in this project.
**Happy chatting! 🚀**
