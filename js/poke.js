async function SearchPokemon(){
    const poke_api = "https://pokeapi.co/api/v2/pokemon/";
    let nome = document.getElementById("pokemon").value;
    let response =  await fetch (poke_api +nome);
    let pokemon = await response.json(); 

    if (!response.ok){
        throw new Error ("Pokemon Nao Encontrado")
    }

    else{
    document.getElementById("result").innerHTML = `<h2>${pokemon.name}</h2>
    <img src ="${pokemon.sprites.front_default}">`;
}
}