/*CONTROL ACCIONES PAGINA PRINCIPAL*/

$(document).ready(function(){
    //CONTROL INGRESO MEDICAMENTOS
    ingresoMedicamentos();
});

//CONTROL INGRESO MEDICAMENTOS
function ingresoMedicamentos(){

    $("#iMed").on("click",function(){
        //MODAL APERTURA
        $("#controlModal").modal();
        //MOSTRAR DENOMINACION MODAL
        $("#controlTitulo").text("Ingreso de Medicamentos");
        //MOSTRAR CONTENIDO
        $("#contenidoImed").css({"display":"block"});

    });

};