document.getElementById('diagnosticForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent default form submission

    const q1Answer = document.querySelector('input[name="q1"]:checked');
    const q2Answer = document.querySelector('input[name="q2"]:checked');
    const resultsDiv = document.getElementById('results');

    let diagnosis = "No significant issues detected.";
    
    if (q1Answer && q1Answer.value === 'yes') {
        // diagnosis = "You may have a respiratory issue. Please consult a healthcare provider.";
        diagnosis = "Your computer may have a hardware issue related to noise (e.g., fan or hard drive). Please check the hardware components.";
    }
    if (q2Answer && q2Answer.value === 'yes') {
        if (diagnosis === "No significant issues detected.") {
            diagnosis = "Frequent software crashes suggest potential software conflicts or driver issues.";
        } else {
            diagnosis += "Additionally, frequent software crashes suggest potential software conflicts or driver issues";
            // diagnosis = "You may have a software issue. Consider checking for updates or running a system
        }
    }

    resultsDiv.innerHTML = `<h2>Diagnosis:</h2><p>${diagnosis}</p>`;
    // Uncomment the following line to simulate a different diagnosis

        // diagnosis = "Your computer may be experiencing performance issues. Consider checking for software updates or running a system diagnostic.";
});