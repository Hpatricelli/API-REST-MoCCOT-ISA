// Call the dataTables jQuery plugin
$(document).ready(function() {
  consultarPersonasDeLaOrganizacion(localStorage.id);
  alert(localStorage.id)
  $('#personasOrganizacion').DataTable();
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
    const persona = await request.json();


        let org = "<tr><th>"+persona.id+"</th><th>"+persona.id+"</th><th>"+persona.id+"</th><th>"+persona.id+"</th><th><th></tr>";



    console.log(personasOrganizacion);

    document.querySelector('#personasOrganizacion tbody').outerHTML = org;

}