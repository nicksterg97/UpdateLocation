# UpdateLocation


<h2>Port: 8082</h2>


<h2>EndPoints</h2>


<h4>UserLocation Object</h4>

    String lat;
    String lon;
    int user_id;



<h5>POST UserLocation + JWT </h5>

    /android/update/userlocation
    
   Payload:
   
   
    {
        "lat":"37.09975"
        "lon":"21.80686"
        "user_id":331
    }
    
<h5>GET User , JWT required </h5>

    /android/receive/userlocation
    
   Response:
    
    returns User object
    maybe return UserLocation object?
    
<h5>Authenticate</h5>

<h5>POST AuthenticationRequest </h5>

    /authenticate/android
    
    returns jwt


    
   
