document.getElementById("boxForm").addEventListener("submit", function(event) {
      event.preventDefault(); 

      
      let details = document.getElementById("details").value;
      let bloodType = document.getElementById("bloodType").value;
      let hospital= document.getElementById("hospital").value;
let quantity = document.getElementById("quantity").value;
let address = document.getElementById("address").value;

      
      let donor = {
        details: details,
        bloodType: bloodType,
        hospital: hospital,
        quantity:quantity,
        address:address,
      };

      
      document.getElementById("boxForm").reset();

      
      alert("Thank you for submitting the donor form!");

      

    });