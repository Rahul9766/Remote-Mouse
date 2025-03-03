# Remote Mouse 🖱️

A modern, gesture-controlled remote mouse application built with Spring Boot and WebSocket. Control your computer's mouse from any device with a touchscreen or trackpad!

## 🌟 Features

- 🎯 **Precise Mouse Control**
  - Single finger movement for cursor control
  - Smooth cursor tracking with screen scaling
  - Cursor bounds checking to prevent off-screen movement

- 👆 **Gesture Support**
  - Double-tap to click
  - Two-finger pinch to zoom in/out
  - Two-finger scroll
  - Left and right click buttons

- 🎨 **Modern UI**
  - Beautiful gradient background
  - Glass-morphism design
  - Visual feedback with emoji animations
  - Responsive layout for all screen sizes

- 🔌 **Real-time Connection**
  - WebSocket-based communication
  - Connection status indicator
  - Instant response to gestures

## 🛠️ Tech Stack

- **Backend**
  - Java 17
  - Spring Boot
  - Spring WebSocket
  - Java AWT Robot

- **Frontend**
  - HTML5
  - CSS3
  - JavaScript


## 🚀 Getting Started

### Prerequisites

- Java 17 or higher
- Maven
- A device with a touchscreen or trackpad

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/remote-mouse.git
   cd remote-mouse
   ```

2. Build the project:
   ```bash
   mvn clean install
   ```

3. Run the application:
   ```bash
   mvn spring:boot run
   ```

4. Open your browser and navigate to:
   ```
   http://localhost:8080
   ```

## 🎮 Usage

### Basic Controls

- **Move Mouse**: Use single finger to move the cursor
- **Click**: Double-tap anywhere on the trackpad
- **Right Click**: Use the right-click button
- **Zoom**: Use two fingers to pinch in/out
- **Scroll**: Use two fingers to scroll up/down

### Gesture Guide

- 👆 **Double-tap**: Left click
- 🖖 **Right-click button**: Right click
- 🔍 **Pinch out**: Zoom in
- 🔎 **Pinch in**: Zoom out
- 🔄 **Two-finger scroll**: Scroll up/down

## 🔧 Configuration

The application can be configured through `application.properties`:

```properties
# Server port
server.port=8080

# WebSocket endpoint
websocket.endpoint=/remote-mouse
```



