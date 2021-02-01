const getHeros = document.querySelector("#findAllHeros");
const createUsers = document.querySelector("#createUser");
const regUsers = document.querySelector("#regUser");
const c_HeroName = document.querySelector("#c-HeroName");

const retrieveData = () => {
    fetch("https://localhost:8080/hero/readAll")
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
    fetch("https://localhost:8080/hero/create",{
        method: "POST",
        body: JSON.stringify({
            email: "samwilliams180700@outlook.com",
            password: "root"
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
createUsers.addEventListener('click', createUser);
getHeros.addEventListener('click', retrieveData);