document.addEventListener("DOMContentLoaded", function () {



    const textarea = document.getElementById("test")
    let testValue = textarea.attributes.item(2).nodeValue
    textarea.parentNode.removeChild(textarea)
    let splitTestValue = testValue.replaceAll("[", "")
        .replaceAll("]", "")
        .replaceAll(" ", "")
        .split(",")

});
