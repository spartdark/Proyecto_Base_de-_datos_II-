/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function(){
    $("#guardar").click(function(){
        $.ajax({
            type:'post',
            url:'insertar-usuario',
            data:{
                id:$("#id").val(),
                nombre:$("#nombre").val(),
                sueldo:$("#sueldo").val()
            },
            success:function(respuesta){
                $("#respuesta").html(respuesta);
            }
            });
        });
    });



