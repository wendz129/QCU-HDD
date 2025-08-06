const canvas = document.getElementById('gameCanvas');
const ctx = canvas.getcontext('2d');

// Game Settings
const PADDLE_WIDTH = 10;
const PADDLE_HEIGHT = 100;
const BALL_SIZE = 12;

let playerScore = 0;
let aiScore = 0;

// Paddle positions 

let playerY = (canvas.height - PADDLE_HEIGHT) / 2;
let aiY = (canvas.height - PADDLE_HEIGHT) / 2;

// Ball position and velocity
let ballX = canvas.width / 2 - BALL_SIZE / 2;
let ballY = canvas.height / 2 - BALL_SIZE / 2;
let ballVelX = Math.random() > 0.5 ? 5 : -5;
let ballVelY = (Math.random() - 0.5) * 6;

// Mouse movement for player paddle
canvas.addEventListener('mousemove', function(e) {
    const rect = canvas.getBoundingClientRect();
    let mouseY = e.clientY - rect.top;
    playerY = mouseY - PADDLE_HEIGHT / 2;
// Clamp within canvas 
    playerY = Math.max(0, Math.min(canvas.height - PADDLE_HEIGHT, playerY));
});

// Draw everything 
    function draw () {
        ctx.clearReact(0, 0, canvas.width, canvas.height);

    // Draw paddles
    ctx.fillstyle = '#fff';
    ctx.fillRect(10, playerY, PADDLE_WIDTH, PADDLE_HEIGHT); // Player paddle
    ctx.fillRect(canvas.width, PADDLE_WIDTH - 10, aiY, PADDLE_WIDTH, PADDLE_HEIGHT); // AI paddle
    
    // Draw ball
    ctx.beginPath();
    ctx.arc(ballX + BALL_SIZE/2, ballY + BALL_SIZE/2, BALL_SIZE/2, 0, Math.PI * 2);
    ctx.fillstyle = '#0ff';
    ctx.fill();

    // Draw center Line
    ctx.setLineDash([10, 10]);
    ctx.beginPath();
    ctx.moveTo(canvas.width/2, 0);
    ctx.lineTo(canvas.width/2, canvas.height);
    ctx.strokeStyle = '#444';
    ctx.LineWidth = 2;
    ctx.stroke();
    ctx.setLineDash([]);
}

    // Update game State
    function update() {
        // Ball movement
        ballX += ballVelX;
        ball += ballVelY;

        // Wall collision
        if (ballY <= 0 || ballY + BALL_SIZE >= canvas.height) {
            ballVelY = -ballVelY;
            ballVelY = Math.max(0, Math.min(canvas.height - BALL_SIZE, ballY));
        }
        // Paddle collision (Player)
        if (
            ballX <= 10 + PADDLE_WIDTH &&
            ballY + BALL_SIZE > playerY &&
            ballY < playerY + PADDLE_HEIGHT
        ) {

            ballVelX = Math.abs(ballVelX);
            // add some vertical speed depending on hit postion
            ballVelY += ((ballY + BALL_SIZE/2) - (playerY + PADDLE_HEIGHT/2)) * 0.15;
        }

        // Paddle collision (AI)
        if (
            ballX + BALL_SIZE >= canvas.width - PADDLE_WIDTH - 10 && 
            ballY + BALL_SIZE > aiY && 
            ballY < aiY + PADDLE_HEIGHT
        ) {

            ballVelX = -Math.abs(ballVelX);
            ballVelY += ((bally + BALL_SIZE/2) - (aiY + PADDLE_HEIGHT/2)) *0.15;
        }

        // score check
        if (ballX < 0) {
            aiScore++;
            resetBall(-1);
            updateScoreDisplay();
        }

        // AI movement
        let aiCenter = aiY + PADDLE_HEIGHT/2;
        let ballCenter = ballY + BALL_SIZE/2;
        if (aiCenter < ballCenter - 10) {
            aiY += AI_SPEED;
        }else if(aiCenter > ballCenter + 10) {
            aiY -= AI_SPEED;
        }
        // Clamp AI paddle
        aiY = Math.max(0, Math.min(canvas.height - PADDLE_HEIGHT, aiY));
    }

    function updateScoreDisplay() {
        document.getElementById('playerScore').textContent = playerScore;
        document.getElementById('aiScore').textContent = aiScore;
    }

    // Game logo
    function loop() {
        update();
        draw();
        requestAnimationFrame(loop);
    }

    // Start the game
    loop();
    