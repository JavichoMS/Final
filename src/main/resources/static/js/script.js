let signUp = document.getElementsById("signUp");
let signIn = document.getElementById("singIn");
let nameInput = document.getElementsById("nameInput");
let title = document.getElementById("title");

signIn.onclick = function (){
    nameInput.style.maxHeight = "0";
    title.innerHTML = "Login";
    signUp.classList.add("disable");
    signIn.classList.remove("disable");
}

signUp.onclick = function (){
    nameInput.style.maxHeight = "60px";
    title.innerHTML = "Registro";
    signUp.classList.remove("disable");
    signIn.classList.add("disable");
}



//Parte de COLEGIO.HTML para ver los cursos de inicial y primaria
function showCourse(course) {
    let title = '';
    let description = '';
    let carouselDisplay = 'none';
    let images = '';

    // EDUCACION INICIAL
    switch(course) {
        case 'curso_inicial1':
            title = 'Desarrollo Personal y Social';
            description = 'Este curso introduce a los niños en el mundo de la lectura a través de cuentos y actividades interactivas.';
            images = `
                <div class="carousel-item active">
                    <img src="/images/inicial1.jpg" class="d-block w-100" alt="Lectura 1">
                </div>
                <div class="carousel-item">
                    <img src="/images/inicial2.jpg" class="d-block w-100" alt="Lectura 2">
                </div>
            `;
            carouselDisplay = 'block';
            break;

        case 'curso_inicial2':
            title = 'Comunicación';
            description = 'Un curso divertido para aprender conceptos básicos de Comunicación mediante juegos.';
            images = `
                <div class="carousel-item active">
                    <img src="/images/inicial3.jpg" class="d-block w-100" alt="Matemáticas 1">
                </div>
                <div class="carousel-item">
                    <img src="/images/inicial4.jpg" class="d-block w-100" alt="Matemáticas 2">
                </div>
            `;
            carouselDisplay = 'block';
            break;

        case 'curso_inicial3':
            title = 'Matemática';
            description = 'Exploramos el mundo natural a través de actividades prácticas y experimentos.';
            images = `
                <div class="carousel-item active">
                    <img src="/images/inicial5.jpg" class="d-block w-100" alt="Ciencias 1">
                </div>
                <div class="carousel-item">
                    <img src="/images/inicial6.jpg" class="d-block w-100" alt="Ciencias 2">
                </div>
            `;
            carouselDisplay = 'block';
            break;

        case 'curso_inicial4':
            title = 'Exploración del Entorno';
            description = 'Los niños aprenderán sobre su entorno a través de actividades prácticas y observaciones.';
            images = `
                <div class="carousel-item active">
                    <img src="/images/inicial7.jpeg" class="d-block w-100" alt="Exploración 1">
                </div>
                <div class="carousel-item">
                    <img src="/images/inicial8.jpg" class="d-block w-100" alt="Exploración 2">
                </div>
            `;
            carouselDisplay = 'block';
            break;

        case 'curso_inicial5':
            title = 'Educación Artística';
            description = 'Fomentamos la creatividad a través de actividades artísticas como pintura y música.';
            images = `
                <div class="carousel-item active">
                    <img src="/images/inicial9.jpeg" class="d-block w-100" alt="Arte 1">
                </div>
                <div class="carousel-item">
                    <img src="/images/inicial10.jpeg" class="d-block w-100" alt="Arte 2">
                </div>
            `;
            carouselDisplay = 'block';
            break;

        case 'curso_inicial6':
            title = 'Educación Física';
            description = 'Promovemos la actividad física y el trabajo en equipo a través de juegos y deportes.';
            images = `
                <div class="carousel-item active">
                    <img src="/images/inicial11.jpeg" class="d-block w-100" alt="Educación Física 1">
                </div>
                <div class="carousel-item">
                    <img src="/images/inicial12.jpeg" class="d-block w-100" alt="Educación Física 2">
                </div>
            `;
            carouselDisplay = 'block';
            break;

        case 'curso_inicial7':
            title = 'Educación en Tecnología';
            description = 'Introducción a la tecnología mediante actividades prácticas y el uso de herramientas digitales.';
            images = `
                <div class="carousel-item active">
                    <img src="/images/inicial13.jpg" class="d-block w-100" alt="Tecnología 1">
                </div>
                <div class="carousel-item">
                    <img src="/images/inicial14.jpg" class="d-block w-100" alt="Tecnología 2">
                </div>
            `;
            carouselDisplay = 'block';
            break;

        case 'curso_inicial8':
            title = 'Educación Religiosa';
            description = 'Exploramos valores y principios a través de historias y actividades interactivas.';
            images = `
                <div class="carousel-item active">
                    <img src="/images/inicial15.jpg" class="d-block w-100" alt="Religión 1">
                </div>
                <div class="carousel-item">
                    <img src="/images/inicial16.jpg" class="d-block w-100" alt="Religión 2">
                </div>
            `;
            carouselDisplay = 'block';
            break;

        // EDUCACION PRIMARIA
        case 'comunicacion':
            title = 'Comunicación';
            description = 'Desarrollo de habilidades comunicativas mediante la lectura, escritura y expresión oral.';
            images = `
                <div class="carousel-item active">
                    <img src="/images/primaria1.jpeg" class="d-block w-100" alt="Comunicación 1">
                </div>
                <div class="carousel-item">
                    <img src="/images/primaria2.jpg" class="d-block w-100" alt="Comunicación 2">
                </div>
            `;
            carouselDisplay = 'block';
            break;

        case 'ingles':
            title = 'Inglés';
            description = 'Desarrollo de habilidades en el idioma inglés a través de actividades interactivas y juegos.';
            images = `
                <div class="carousel-item active">
                    <img src="/images/primaria3.jpeg" class="d-block w-100" alt="Inglés 1">
                </div>
                <div class="carousel-item">
                    <img src="/images/primaria4.jpeg" class="d-block w-100" alt="Inglés 2">
                </div>
            `;
            carouselDisplay = 'block';
            break;

        case 'ciencias sociales':
            title = 'Ciencias Sociales';
            description = 'Estudiamos la historia, cultura y geografía a través de actividades prácticas y reflexiones.';
            images = `
                <div class="carousel-item active">
                    <img src="/images/primaria5.jpg" class="d-block w-100" alt="Ciencias Sociales 1">
                </div>
                <div class="carousel-item">
                    <img src="/images/primaria6.jpeg" class="d-block w-100" alt="Ciencias Sociales 2">
                </div>
            `;
            carouselDisplay = 'block';
            break;

        case 'matematicas':
            title = 'Matemáticas';
            description = 'Un enfoque en el desarrollo de habilidades matemáticas fundamentales a través de ejercicios prácticos.';
            images = `
                <div class="carousel-item active">
                    <img src="/images/primaria7.jpg" class="d-block w-100" alt="Matemáticas 1">
                </div>
                <div class="carousel-item">
                    <img src="/images/primaria8.jpeg" class="d-block w-100" alt="Matemáticas 2">
                </div>
            `;
            carouselDisplay = 'block';
            break;

        case 'historia':
            title = 'Historia';
            description = 'Aprendemos sobre eventos históricos y figuras importantes a través de relatos y proyectos.';
            images = `
                <div class="carousel-item active">
                    <img src="/images/primaria9.jpeg" class="d-block w-100" alt="Historia 1">
                </div>
                <div class="carousel-item">
                    <img src="/images/primaria10.jpg" class="d-block w-100" alt="Historia 2">
                </div>
            `;
            carouselDisplay = 'block';
            break;

        case 'educacion religiosa':
            title = 'Educación Religiosa';
            description = 'Exploramos valores éticos y morales a través de historias y actividades interactivas.';
            images = `
                <div class="carousel-item active">
                    <img src="/images/primaria11.jpg" class="d-block w-100" alt="Educación Religiosa 1">
                </div>
                <div class="carousel-item">
                    <img src="/images/primaria12.jpg" class="d-block w-100" alt="Educación Religiosa 2">
                </div>
            `;
            carouselDisplay = 'block';
            break;

        case 'arte':
            title = 'Arte';
            description = 'Fomentamos la creatividad y la expresión artística mediante diversas técnicas y materiales.';
            images = `
                <div class="carousel-item active">
                    <img src="/images/primaria13.jpg" class="d-block w-100" alt="Arte 1">
                </div>
                <div class="carousel-item">
                    <img src="/images/primaria14.jpg" class="d-block w-100" alt="Arte 2">
                </div>
            `;
            carouselDisplay = 'block';
            break;

        case 'ciencias naturales':
            title = 'Ciencias Naturales';
            description = 'Exploramos conceptos básicos de la naturaleza y los seres vivos a través de experimentos y observaciones.';
            images = `
                <div class="carousel-item active">
                    <img src="/images/primaria15.jpeg" class="d-block w-100" alt="Ciencias Naturales 1">
                </div>
                <div class="carousel-item">
                    <img src="/images/primaria16.jpg" class="d-block w-100" alt="Ciencias Naturales 2">
                </div>
            `;
            carouselDisplay = 'block';
            break;

        case 'educacion fisica':
            title = 'Educación Física';
            description = 'Promovemos la actividad física y la salud a través de juegos, deportes y ejercicios variados.';
            images = `
                <div class="carousel-item active">
                    <img src="/images/primaria17.jpg" class="d-block w-100" alt="Educación Física 1">
                </div>
                <div class="carousel-item">
                    <img src="/images/primaria18.jpg" class="d-block w-100" alt="Educación Física 2">
                </div>
            `;
            carouselDisplay = 'block';
            break;
    }

    document.getElementById('course-title').innerText = title;
    document.getElementById('course-def').innerText = description;
    document.getElementById('carousel-images').innerHTML = images;
    document.getElementById('course-carousel').style.display = carouselDisplay;
}

