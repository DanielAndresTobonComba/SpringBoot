document.querySelector("#formBuscar").addEventListener("submit", (e) => {
    e.preventDefault(); 

    console.log("entre");

    let id = document.querySelector("#id").value;
    console.log(id);

    const url = `http://localhost:8080/formulario/buscarUsuario/${id}`;

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
    })//.then(response => response.json())
    .then(data => {
        
        console.log("Datos recibidos:", data);  // Aquí puedes manejar el string recibido
        const obj = JSON.parse(data); 

        const cedulaContainer = document.querySelector("#cedulaContenedor")
        const nombreContainer = document.querySelector("#nombreContenedor")
        const apellidoContainer = document.querySelector("#apellidoContenedor")

        let nombre = obj.nombre;
        let apellido = obj.apellido; 
        let cedula = obj.cedula;    

        if (data != null) {
            
            if (nombre != null && nombre.trim() != "") {
                nombreContainer.textContent = nombre;
            } else {
                nombreContainer.textContent = "No Disponible";
            }

            if (apellido != null && apellido.trim()!= "") {
                apellidoContainer.textContent = apellido;
            } else {
                apellidoContainer.textContent = "No Disponible";
            }


            if (cedula != null && cedula.trim()!= "" ) {
                cedulaContainer.textContent = cedula;
            } else {
                cedulaContainer.textContent = "No Disponible";
            }
            
           
        } 
    })
    .catch(error => {
        console.error("Error al buscar los datos:", error);
        console.log("Error al buscar los datos.");  // Notifica al usuario en caso de error
    });
});
