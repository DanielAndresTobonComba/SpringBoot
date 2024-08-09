document.querySelector("#formBuscar").addEventListener("submit", (e) => {
    e.preventDefault(); 

    console.log("entre");

    let id = document.querySelector("#id").value;
    console.log(id);

    const url = `http://localhost:8080/api/formulario/buscarUsuario/${id}`;

    fetch(url, {
        method: 'GET', 
        headers: {
            'Content-Type': 'application/json'
        },
    })
    .then(response => {
        if (!response.ok) {
            return response.text().then(text => {
                throw new Error(`HTTP error! Status: ${response.status}, Message: ${text}`);
            });
        }
        return response.text();  // Cambiado a `response.text()` para manejar respuestas de texto
    }).then(response => response.json())
    .then(data => {
        console.log("Datos recibidos:", data);  // Aquí puedes manejar el string recibido
        console.log("Datos Encontrados");  // Muestra un mensaje al usuario
    })
    .catch(error => {
        console.error("Error al buscar los datos:", error);
        console.log("Error al buscar los datos.");  // Notifica al usuario en caso de error
    });
});
