// $(document).ready(function () {
//    $('.forgot-pass').click(function(event) {
//      $(".pr-wrap").toggleClass("show-pass-reset");
//    }); 
//    
//    $('.pass-reset-submit').click(function(event) {
//      $(".pr-wrap").removeClass("show-pass-reset");
//    }); 
//});
// 
// function loadLoginInfo( form ) {
//		console.log("there is login part" + this);
//		var data = $(form).serializeArray().reduce(function(m,o) {
//			m[o.name] = o.value;
//			return m;
//		}, {});
//		console.log(data);
//		if (data.user_id == 'guoxi') {
//			console.log('bingo');
//			window.location.replace('http://localhost:8080/Titan/welcom.html');
////			$('#provement').display('none');
//		}
//		return true;
//	}