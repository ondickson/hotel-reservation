// Get the social media logo container element
const socialMediaLogo = document.querySelector('.social-media-logo');

// Loop through all the social media icons
socialMediaLogo.querySelectorAll('i').forEach(icon => {

  // Get the icon class name
  const iconName = icon.classList[1];

  // Set the link based on the icon class name
  let link = '';
  if (iconName === 'fa-facebook-f') {
    link = 'https://web.facebook.com/ONDicksonBeatz/';
  } else if (iconName === 'fa-twitter') {
    link = 'https://twitter.com/JayKaps_?s=20';
  } else if (iconName === 'fa-instagram') {
    link = 'https://www.instagram.com/ondickson_/';
  }

  // Add a click event listener to the icon
  icon.addEventListener('click', () => {
    // Open the link in a new tab when the icon is clicked
    window.open(link);
  });
});

const economyOption = document.querySelector('.Economy.option');
const standardOption = document.querySelector('.Standard.option');
const deluxeOption = document.querySelector('.Deluxe.option');

economyOption.addEventListener('click', () => {
  window.location.href = './rooms/economy.html';
});

standardOption.addEventListener('click', () => {
  window.location.href = './rooms/standard.html';
});

deluxeOption.addEventListener('click', () => {
  window.location.href = './rooms/deluxe.html';
});