/*global cordova, module*/

module.exports = {
    initCasty: function (successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Utility", "initCasty", []);
    },
	isConnectedCasty: function (successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Utility", "isConnectedCasty", []);
    },
	discoverCasty: function (successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Utility", "discoverCasty", []);
    }
	
};
