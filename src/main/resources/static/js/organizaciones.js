// Call the dataTables jQuery plugin
$(document).ready(function() {
  cargarOrganizaciones(localStorage.token);
  $('#organizaciones').DataTable();
});
async function cargarOrganizaciones() {

    const request = await fetch('/organizaciones', {
      method: 'GET',
      headers: getHeaders()
    });
    const listOrganizaciones = await request.json();
    let listadoHtml = '';

    for (let organizacion of listOrganizaciones) {

        let org = "<tr><th>"+organizacion.organizacionResponseId+"</th><th>"+organizacion.nombre+"</th><th>"+organizacion.efectivoOrganico+"</th><th>"+organizacion.status+"</th><th><a onclick= \"guardarId("+ organizacion.organizacionResponseId+ ")\"  href='organizacion.html' \"btn btn-info btn-circle\">\n" +
            "                                        <i class=\"fas fa-info-circle\"></i>\n" +
            "                                    </a><a onclick=\"eliminarOrganizacion("+ organizacion.organizacionResponseId+ ")\" class=\"btn btn-danger btn-circle btn-sm\"><i class=\"fas fa-trash\"></i></a></th></>";

        listadoHtml+= org
    }

    console.log(listOrganizaciones);

    document.querySelector('#organizaciones tbody').outerHTML = listadoHtml;

}
function guardarId(id) {
    localStorage.id = id;
    localStorage.token = localStorage.token;
}
async function eliminarOrganizacion(id) {

    if (!confirm('¿Desea eliminar esta organización?')) {
        return;
    }


    const request = await fetch('/organizaciones/' + id +'?status=false', {

        method: 'PATCH',
            headers:getHeaders()

    });
    alert('Organización eliminada');


    location.reload()

    function getHeaders() {
        return {
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': localStorage.token
        };
    }
}
