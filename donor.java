
    document.getElementById("boxForm").addEventListener("submit", function(event) {
      event.preventDefault(); 

      
      let name = document.getElementById("name").value;
      let bloodType = document.getElementById("bloodType").value;
      let age = document.getElementById("age").value;
let disease = document.getElementById("disease").value;
let address = document.getElementById("address").value;

      
      let donor = {
        name: name,
        bloodType: bloodType,
        age: age,
        disease:disease,
        address:address,
      };

      
      document.getElementById("boxForm").reset();

      
      alert("Thank you for submitting the donor form!");

      

    });
 