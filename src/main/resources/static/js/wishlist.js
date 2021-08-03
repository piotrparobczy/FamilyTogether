document.addEventListener("DOMContentLoaded", function () {

    const jsonDataElement = document.getElementById("jsonData")
    let jsonDataElementValue = jsonDataElement.attributes.item(2).nodeValue
    let jsonObjects = JSON.parse(jsonDataElementValue)

    const addNewButton = document.getElementById("new")

    const insert = document.getElementById("insert")


    jsonObjects.forEach(function (object){
        let div = insert.appendChild(document.createElement("div"))
        let textarea = div.appendChild(document.createElement("textarea"))
        let deleteButton = div.appendChild(document.createElement("button"))

        textarea.classList.add("toCollectOld")
        textarea.id = 'data-wishlist-id-' + object.id
        textarea.innerText = object.iWant
        deleteButton.innerText = "Usuń"
        textarea.readOnly = true

        deleteButton.addEventListener('click',function (){
            div.parentNode.removeChild(div)
        })
    })

    addNewButton.addEventListener('click',function (){
        let div = insert.appendChild(document.createElement("div"))
        let textarea = div.appendChild(document.createElement("textarea"))
        let deleteButton = div.appendChild(document.createElement("button"))

        textarea.classList.add("toCollectNew")
        textarea.innerText = 'Wpisz przedmiot'
        deleteButton.innerText = "Usuń"

        deleteButton.addEventListener('click',function (){
            div.parentNode.removeChild(div)
        })
    })



});
