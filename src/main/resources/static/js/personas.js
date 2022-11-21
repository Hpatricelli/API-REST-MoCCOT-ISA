// Call the dataTables jQuery plugin
$(document).ready(function() {

  cargarPersonas();
  $('#personas').DataTable();
});
async function cargarPersonas(){

    const request = await fetch('personas', {
      method: 'GET',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      }
    });
    const listPersonas = await request.json();
    let listadoHtml = '';
    for (let persona of listPersonas){
        let usuario = "<tr><th>"+persona.id+"</th><th>"+persona.grado+"</th><th>"+persona.nombre+"</th><th>"+persona.apellido+"</th><th>"+persona.status+"</th><th><a href=\"#\" onclick=\"eliminarPersona("+ persona.id + ")\" class=\"btn btn-danger btn-circle btn-sm\"><i class=\"fas fa-trash\"></i></a></th></>";


    listadoHtml+= usuario
    }



    console.log(listPersonas);

    document.querySelector('#personas tbody').outerHTML = listadoHtml;

}
async function eliminarPersona(id) {

    if (!confirm('¿Desea eliminar esta persona?')) {
        return;
    }

    const request = await fetch('/personas/' + id+'?status=false', {
        method: 'PATCH',
        headers:{
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }
    });

    location.reload()
}