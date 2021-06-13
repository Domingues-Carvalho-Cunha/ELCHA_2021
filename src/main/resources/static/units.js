window.onload = async function() {
    try {
        let units = await $.ajax({ 
            url: "/api/units",
            method: "get",
            dataType: "json"
        });
        let html = "";
        for (let unit of units) {
            html+=`<section onclick='openUnit(${unit.id})'>
                    <h2>${unit.name}</h>
                    <p>${unit.credits} credits</p>
                    </section>`
        }
        document.getElementById("units").innerHTML = html;
    } catch(err) {
        console.log(err);
    }
}

function openUnit(id) {
    sessionStorage.setItem("unitId",id);
    window.location = "unit.html";
}