(function (){
  'use strict';

  var menu = $('menu'),
      openMenu = $('open-menu'),
      closeMenu = $('close-menu');

  openMenu.addEventListener('click', function () {
    menu.classList.add('mostrar');
  });

  closeMenu.addEventListener('click', function () {
    menu.classList.remove('mostrar');
  });

  function $(id) {
    return document.getElementById(id);
  }
})(document);
