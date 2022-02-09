

var fConnect = (function(){

    return {

        connection : function(name, numero){
            var url = 'http://localhost:4567/convertir/' + name + '/' + numero
            var heroku = "https://hidden-caverns-65840.herokuapp.com/"
                        fetch(url, {
                            mode: 'no-cors',
                            method: 'GET',
                            headers: {
                                "Content-type": "application/json"
                            }
                        })
                            .then(response => response.json())
                            .then(json => $('#respuesta').html(json.respuesta))
        }
    }
})();