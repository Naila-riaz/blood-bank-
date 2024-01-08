javascript

const signupForm = document.querySelector('#signupForm');


signupForm.addEventListener('submit', function(event) {
  event.preventDefault(); 

  
  const userName = document.querySelector('#userName').value;
  const email = document.querySelector('#email').value;
  const password = document.querySelector('#password').value;

  
  signupForm.reset();
});

