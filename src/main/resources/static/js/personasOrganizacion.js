// Call the dataTables jQuery plugin
$(document).ready(function() {
  consultarPersonasDeLaOrganizacion(localStorage.id, localStorage.token);
  alert(localStorage.id)
  $('#personasOrganizacion').DataTable();
});
async function consultarPersonasDeLaOrganizacion(id, token){

alert(id)

    const request = await fetch('/organizaciones/'+ id +'/personas' , {
        method: 'GET',
        headers: getHeaders()
    });
    const persona = await request.json();


        let org = "<tr><th>"+persona.id+"</th><th>"+persona.id+"</th><th>"+persona.id+"</th><th>"+persona.id+"</th><th><th></tr>";



    console.log(personasOrganizacion);

    document.querySelector('#personasOrganizacion tbody').outerHTML = org;
    function getHeaders() {
        return {
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': token
        };
    }
}