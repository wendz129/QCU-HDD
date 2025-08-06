const zones = [
    { id: "utc", tz: "UTC" },
    { id: "newyork", tz: "America/New York" },
    { id: "london", tz: "Europe/London" },
    { id: "tokyo", tz: "Asia/Tokyo" }
];

function updateClocks() {
    const now = new Date();
    zones.forEach(zone => {
        const timeStr = now.toLocateTimeString("en-US", {
            hour: "2-digit",
            minute: "2-digit",
            second: "2-digit",
            hour12: false,
            timeZone: zone.tz
        });
        document.querySelector(`#${zone.id} .time`) .textContent = timeStr;
    });
}
    setInterval(updateClocks, 1000);
    updateClocks();