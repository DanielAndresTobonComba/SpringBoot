
const formulario = document.querySelector('#frmData');

document.querySelector('#btnGuardar').addEventListener("click", async (e) => {
    e.preventDefault(); 

    const datos = Object.fromEntries(new FormData(formulario).entries());
    

    console.log(JSON.stringify(datos));

    const url = 'http://localhost:8080/api/demovar/guardarDatos';

    try {
        const response = await fetch(url, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(datos)
        });

        if (!response.ok) {
            throw new Error(`HTTP error! Status: ${response.status}`);
        }

        const result = await response.json();
        console.log("Datos guardados:", result);
    } catch (error) {
        console.error("Error al guardar los datos:", error);
    }

    console.log("Hola");
});
