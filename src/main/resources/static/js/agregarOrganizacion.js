// Call the dataTables jQuery plugin
$(document).ready(function() {

});
async function registrarOrganizacion(){
    let datos = {};
    datos.nombre = document.getElementById('txtNombre').value;
    datos.efectivoOrganico = document.getElementById('txtEfectivoOrganico').value;
    datos.elementos = null;
    datos.personal = null;
    datos.latitud = document.getElementById('txtLatitud').value;
    datos.longitud = document.getElementById('txtLongitud').value;
    datos.status = document.getElementById('txtStatus').value;
    datos.elemento_superior_id = document.getElementById('txtElemSup').value;
    alert(datos.idOrg);

    const request = await fetch('/organizaciones', {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body : JSON.stringify(datos)
    });
    console.log(request);
    alert("Se agregó a la Organizacion con exito!");
    window.location.href = 'organizaciones.html';

}