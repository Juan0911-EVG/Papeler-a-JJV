// script.js
document.addEventListener("DOMContentLoaded", () => {
  const learnMoreBtn = document.getElementById("learnMore");

  learnMoreBtn.addEventListener("click", () => {
    window.scrollTo({
      top: document.querySelector(".info").offsetTop,
      behavior: "smooth"
    });
  });
});
// navbar.js
document.addEventListener("DOMContentLoaded", () => {
  const menuToggle = document.getElementById("menuToggle");
  const navLinks = document.getElementById("navLinks");

  menuToggle.addEventListener("click", () => {
    navLinks.classList.toggle("show");
  });
});

 document.querySelector("form").addEventListener("submit", function(e) {
    e.preventDefault();
    const email = this.querySelector("input[type='email']").value;
    const telefono = this.querySelector(".telefono").value;
    const mensaje = this.querySelector("textarea").value;

    if(email && telefono && mensaje){
      alert("Mensaje enviado. ¡Gracias por contactarnos!");
      this.reset();
    } else {
      alert("Por favor, complete todos los campos.");
    }
  });
  function toggleInfo(button) {
  const info = button.nextElementSibling;
  if (info.style.display === "block") {
    info.style.display = "none";
    button.textContent = "Más información";
  } else {
    info.style.display = "block";
    button.textContent = "Menos información";
  }
}

function mostrarDetalles(boton) {
  const detalles = boton.nextElementSibling;
  if (detalles.style.display === 'block') {
    detalles.style.display = 'none';
    boton.textContent = 'Ver más';
  } else {
    detalles.style.display = 'block';
    boton.textContent = 'Ver menos';
  }
}

document.getElementById('formulario-contacto').addEventListener('submit', function(e) {
  e.preventDefault();

  const nombre = document.getElementById('nombre').value.trim();
  const email = document.getElementById('email').value.trim();
  const mensaje = document.getElementById('mensaje').value.trim();
  const estado = document.getElementById('mensaje-estado');

  if (nombre === '' || email === '' || mensaje === '') {
    estado.textContent = 'Por favor, completa todos los campos.';
    estado.style.color = 'red';
    return;
  }

  // Aquí podrías enviar los datos con fetch/AJAX si tuvieras backend
  estado.textContent = '¡Mensaje enviado correctamente!';
  estado.style.color = 'green';

  // Limpiar formulario
  this.reset();
});
function mostrarDetalles(boton) {
  const detalles = boton.nextElementSibling;
  if (detalles.style.display === "block") {
    detalles.style.display = "none";
    boton.textContent = "Ver detalles";
  } else {
    detalles.style.display = "block";
    boton.textContent = "Ocultar detalles";
  }
}