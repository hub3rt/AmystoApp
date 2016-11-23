$( document ).ready(function() {

  $('#icon-menu').click(function() {
    var state = $('.menu').data('state');
    if(state === 'close'){
      $('.menu').animate({     
        left: "0px"    
      }, 200);

      $('.menu').data('state', 'open');
    }else if(state === 'open'){
      $('.menu').animate({     
        left: "-200px"    
      }, 200);

      $('.menu').data('state', 'close');
    }
  });

});

