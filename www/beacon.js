var beacon = {
    startRanging: function(message, successCallback, errorCallback) {
        cordova.exec(
            successCallback, // success callback function
            errorCallback, // error callback function
            'BeaconPlugin', // mapped to our native Java class called "Calendar"
            'ranging', // with this action name
             [{                  // and this array of custom arguments to create our entry
                 "message": message
             }]
        ); 
     }
}
module.exports = beacon;