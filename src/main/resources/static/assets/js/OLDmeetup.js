// meetup modal
var modal = document.getElementById('simpleModal');
var modalBtn = document.getElementById('modalBtn');
var closeBtn = document.getElementsByClassName('closeBtn')[0];


modalBtn.addEventListener('click', openModal);
closeBtn.addEventListener('click', closeModal);
window.addEventListener('click', outsideClick);

var form_modal = document.getElementById('form');
var modalFormBtn = document.getElementById('formBtn');
var closeFormBtn = document.getClassName('closeFormBtn')[0];

modalFormBtn.addEventListener('click', openFormModal);
closeFormBtn.addEventListener('click', closeFormModal);
window.addEventListener('click', outsideFormClick);

function openModal(){
    modal.style.display = 'block';
}

function closeModal(){
    modal.style.display = 'none';
}

function outsideClick(e){
    if (e.target == modal)
    {
        modal.style.display = 'none';
    }
}

function openFormModal(){
    form_modal.style.display = 'block';
}

function closeFormModal(){
    form_modal.style.display = 'none';
}

function outsideFormClick(e){
    if (e.target == form_modal)
    {
        form_modal.style.display = 'none';
    }
}