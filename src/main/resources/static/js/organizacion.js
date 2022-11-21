// Call the dataTables jQuery plugin
$(document).ready(function() {
    consultarPersonasDeLaOrganizacion(localStorage.id);
    alert(localStorage.id)
    $('#organizacion').DataTable();
});
async function consultarPersonasDeLaOrganizacion(id){

    alert(id)

    const request = await fetch('/organizaciones/'+ id +'/personas' , {
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }
    });
    const personas = await request.json();

    let personasOrganizacion = "";
    for (let persona of personas) {
        let org = "<tr><th>" + persona.id + "</th><th>" + persona.grado + "</th><th>" + persona.nombre + "</th><th>" + persona.apellido + "</th><th>" + persona.status + "</th></tr>";
        personasOrganizacion += org;
    }



    console.log(organizacion);

    document.querySelector('#organizacion tbody').outerHTML = personasOrganizacion;

}