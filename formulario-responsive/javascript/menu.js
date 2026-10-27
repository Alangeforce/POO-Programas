const menuButton = document.querySelector('.menu-toggle');
const navigation = document.querySelector('.site-nav');

if (menuButton && navigation) {
  menuButton.addEventListener('click', () => {
    const isOpen = navigation.classList.toggle('is-open');
    menuButton.setAttribute('aria-expanded', String(isOpen));
    menuButton.setAttribute('aria-label', isOpen ? 'Cerrar menú' : 'Abrir menú');
  });

  navigation.querySelectorAll('a').forEach((link) => {
    link.addEventListener('click', () => {
      navigation.classList.remove('is-open');
      menuButton.setAttribute('aria-expanded', 'false');
      menuButton.setAttribute('aria-label', 'Abrir menú');
    });
  });
}

const genderSelect = document.querySelector('#genero');
const otherGenderGroup = document.querySelector('#otro-genero-group');
const otherGenderInput = document.querySelector('#otro-genero');

if (genderSelect && otherGenderGroup && otherGenderInput) {
  const updateOtherGender = () => {
    const isOther = genderSelect.value === 'O';
    otherGenderGroup.hidden = !isOther;
    otherGenderInput.required = isOther;
    if (!isOther) otherGenderInput.value = '';
  };

  genderSelect.addEventListener('change', updateOtherGender);
  updateOtherGender();
}
