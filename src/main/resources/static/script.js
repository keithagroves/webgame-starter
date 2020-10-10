const socket = new WebSocket('ws://localhost:8887');
console.log("hello");

// Connection opened
socket.addEventListener('open', function (event) {
    socket.send('Hello Server!');
});

// Listen for messages
socket.addEventListener('message', function (event) {
        console.log('Message from server ', event.data);
});

// Listen for messages
socket.addEventListener('message', function (event) {
        console.log('Message from main server ', event.data);
});


