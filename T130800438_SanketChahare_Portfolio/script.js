// Smooth skill animation when in view
document.addEventListener("scroll", () => {
    const skills = document.querySelectorAll(".bar");
    const triggerBottom = window.innerHeight * 0.8;

    skills.forEach(skill => {
        const skillTop = skill.getBoundingClientRect().top;
        if (skillTop < triggerBottom) {
            skill.style.width = skill.classList.contains("html") ? "90%" :
                                skill.classList.contains("css") ? "80%" : "70%";
        }
    });
});

// Contact form submission alert
document.getElementById("contactForm").addEventListener("submit", (e) => {
    e.preventDefault();
    alert("Thank you for contacting me!");
});
