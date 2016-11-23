$(document)
		.ready(
				function() {
					var map = new ol.Map({
						target : 'map',
						layers : [ new ol.layer.Tile({
							source : new ol.source.OSM()
						}) ],
						view : new ol.View({
							center : ol.proj.fromLonLat([ 17, 47 ]),
							zoom : 4
						})
					});

					var addEventPossible = false;

					$('#addEventOnMap')
							.click(
									function() {
										alert('Vous pouez maintenant cliquer sur la carte et ajouter un évènement');
										addEventPossible = true;
									})

					map.on('click', function(evt) {
						var lonlat = ol.proj.transform(evt.coordinate,
								'EPSG:3857', 'EPSG:4326');
						var lon = lonlat[0];
						var lat = lonlat[1];
						if (addEventPossible) {
							$('.form-signin').toggle();
							$('#eventForm').on('submit', function(e) {
								e.preventDefault();

								$('#inputLonEvent').val(lon);
								$('#inputLatEvent').val(lat);

								$.ajax({
									type : $this.attr('method'),
									data : $this.serialize(),
									success : function(results) {
										$('.form-signin').toggle();
									}
								})

							})
						}

					})

				});
