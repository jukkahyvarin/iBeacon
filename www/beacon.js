var beacon = {
    startRanging: function(successCallback, errorCallback) {
        cordova.exec(
            successCallback, // success callback function
            errorCallback, // error callback function
            'BeaconPlugin', // mapped to our native Java class called "Calendar"
            'ranging', // with this action name
        ); 
     }
}
module.exports = beacon;