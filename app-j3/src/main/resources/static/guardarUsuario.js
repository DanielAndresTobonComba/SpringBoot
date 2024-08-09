

document.querySelector('#frmData').addEventListener("submit", (e) => {
    e.preventDefault(); 

    let data = "";

    console.log("Entre a guardar");

    // Usa el selector correcto para obtener el valor de los campos
    let cedula = document.querySelector("#cedula").value;
    let nombre = document.querySelector("#nombre").value;
    let apellido = document.querySelector("#apellido").value;

    console.log(cedula); 
    console.log(nombre);
    console.log(apellido);

    data = {
        "nombre" : `${nombre}`,
        "apellido" : `${apellido}`,
        "cedula" : `${cedula}`
    }

    // Construye la URL con parámetros de consulta correctamente
    const url = `http://localhost:8080/formulario/guardarUsuario`;

    // Realiza la solicitud usando GET, ya que estás enviando parámetros en la URL
    fetch(url, {
        method: 'POST', // Cambia a 'POST' si decides enviar los datos en el cuerpo
        body:JSON.stringify(data),
        headers: {
            'Content-Type': 'application/json'
        },

        
    })
    .then(response => {
        if (!response.ok) {
            return response.text().then(text => {
                throw new Error(`HTTP error! Status: ${response.status}, Message: ${text}`);
            });
        } else {
            alert("Datos Guardados")
        }
        //return response.json();
    }).then(response => response.json())
    .catch(error => {
        console.error("Error al guardar los datos:", error);
    });
});



document.querySelector('#btnBuscar').addEventListener("click", async (e) => {
    e.preventDefault(); 

    console.log("Entre a buscar");

    const id = "1";
    const url = `http://localhost:8080/api/demovar/mostrarUsuario?id=${id}`;

    try {
        const response = await fetch(url, {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json'
            }
        });

        if (!response.ok) {
            throw new Error(`HTTP error! Status: ${response.status}`);
        }

        const result = await response.json();
        console.log("Datos Buscados:", result);
    } catch (error) {
        console.error("Error al buscar los datos:", error);
    }
});


/*     // Recopila los datos del formulario
    const datos = Object.fromEntries(new FormData(formulario).entries());
    console.log(JSON.stringify(datos));

    fetch(url, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(datos)
    })
    .then(response => {
        if (!response.ok) {
            return response.text().then(text => {
                throw new Error(`HTTP error! Status: ${response.status}, Message: ${text}`);
            });
        }
        return response.json();
    })
    .then(result => {
        console.log("Datos guardados:", result);
    })
    .catch(error => {
        console.error("Error al guardar los datos:", error);
    }); */


