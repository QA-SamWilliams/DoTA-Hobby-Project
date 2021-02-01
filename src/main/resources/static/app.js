const getHeros = document.querySelector("#findAllHeros");
const createHero = document.querySelector("#createHero");
const regUsers = document.querySelector("#regUser");
const c_HeroName = document.querySelector("#c-HeroName");
const c_HeroLocalName = document.querySelector("#c-HeroLocalName");
const c_HeroAttr = document.querySelector("#c-HeroAttr");
const c_HeroItem = document.querySelector("c-HeroItem");

const retrieveData = () => {
    fetch("/hero/readAll")
    .then(response => response.json())
    .then(json => {
        console.log(json.data);
        for(let i = 0; i < json.data.length; i++) {
            let p = document.createElement("p");
            p.setAttribute("class", "hero");
            let info = document.createTextNode(json.data[i].name);
            p.appendChild(info);
            people.appendChild(p);
        }
    })
}

const createHero = () => {
    fetch("/hero/create",{
        method: "POST",
        body: JSON.stringify({
            name: c_HeroName.innerHTML,
            localizedName: c_HeroLocalName.innerHTML,
            primaryAttribute: c_HeroAttr.innerHTML,
            itemlist: c_HeroItem.innerHTML

        }),
        headers: {
            "Content-Type": "application/json"
        }
    }).then(response => response.json())
    .then(json => console.log(json))
    .catch(err => console.error("Something went wrong!"))
}

const registerSuccessful = () => {
    fetch("https://reqres.in/api/register", {
        method: "POST",
        body: JSON.stringify({
            email: "samwilliams180700@outlook.com",
            password: "root"
        }),
        headers:{
            "Content-Type": "application/json"
        }
    }).then(response => response.json())
        .then(json => console.log(json))
        .catch(err => console.error("Something went wrong!"))
}

const loginSuccessful = () => {
    fetch("https://reqres.in/api/login", {
        method: "POST",
        body: JSON.stringify({
            email: "samwilliams180700@outlook.com",
            password: "root"
        }),
        headers:{
            "Content-Type": "application/json"
        }
    }).then(response => response.json())
        .then(json => console.log(json))
        .catch(err => console.error("Something went wrong!"))
}

regUsers.addEventListener('click', registerSuccessful);
createHero.addEventListener('click', createHero);
getHeros.addEventListener('click', retrieveData);