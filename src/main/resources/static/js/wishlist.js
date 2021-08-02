document.addEventListener("DOMContentLoaded", function () {

    const save = document.getElementById("save")
    const idList = document.getElementById("id")
    const insert = document.getElementById("insert")
    const textarea = document.getElementById("list")
    let testValue = textarea.attributes.item(2).nodeValue
    let splitTestValue = testValue.replaceAll("[", "")
        .replaceAll("]", "")
        .replaceAll(" ", "")
        .split(",")

    let iterator = 0

    let idValue = idList.attributes.item(2).nodeValue
    let splitIdValue = idValue.replaceAll("[", "")
        .replaceAll("]", "")
        .replaceAll(" ", "")
        .split(",")

    splitTestValue.forEach(function (element){
        let div = insert.appendChild(document.createElement("div"))
        let text = div.appendChild(document.createElement("textarea"))
        let btn = div.appendChild(document.createElement("button"))

        text.classList.add("toCollectOld")
        text.id = splitIdValue[iterator]
        text.innerText = element
        btn.innerText = "Usuń"

        iterator ++
        btn.addEventListener('click',function (){
            div.parentNode.removeChild(div)
        })
    })

    save.addEventListener('click',function (){
        let toCheck = document.getElementsByClassName("toCollectOld")
        for (let i = 0; i < toCheck.length; i++) {
            let oldValue = toCheck[i].getAttribute("defaultValue")
            let newValue = toCheck[i].getAttribute("value")
            if (oldValue != newValue){
                //deleteOld
                //to insert
            }
        }
    })

});
