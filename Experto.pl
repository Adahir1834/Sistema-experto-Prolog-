% Base de conocimientos sobre síntomas y enfermedades
sintoma(fiebre).
sintoma(tos).
sintoma(dolor_garganta).
sintoma(cansancio).
sintoma(dolor_cabeza).
sintoma(nauseas).
sintoma(diarrea).
sintoma(estornudos).
sintoma(picazon_ojos).
sintoma(mareos).
sintoma(vomitos).
sintoma(dolor_abdominal).
sintoma(sensibilidad_luz).
sintoma(dolor_muscular).
sintoma(palpitaciones).
sintoma(dificultad_respiratoria).
sintoma(inflamacion_articular).
sintoma(sangrado_encias).
sintoma(ulceras_orales).
sintoma(petequias).
sintoma(convulsiones).
sintoma(paralisis_muscular).
sintoma(palidez).
sintoma(taquipnea).
sintoma(dolor_pecho).
sintoma(perdida_peso).
sintoma(poliuria).
sintoma(polidipsia).
sintoma(oliguria).
sintoma(confusion_mental).
sintoma(hemorragia_nasal).
sintoma(dificultad_tragar).

% Reglas que relacionan síntomas con enfermedades y tratamientos

enfermedad(resfriado, [tos, dolor_garganta, cansancio]).
enfermedad(gripe, [fiebre, tos, cansancio]).
enfermedad(infeccion_respiratoria, [tos, fiebre, dolor_garganta]).
enfermedad(alergia, [estornudos, picazon_ojos, cansancio]).
enfermedad(indigestion, [nauseas, dolor_cabeza, cansancio]).
enfermedad(intoxicacion_alimentaria, [diarrea, fiebre, cansancio]).
enfermedad(conjuntivitis, [picazon_ojos, estornudos, dolor_cabeza]).
enfermedad(vertigo, [mareos, nauseas, sensibilidad_luz]).
enfermedad(gastroenteritis, [vomitos, dolor_abdominal, cansancio]).
enfermedad(gripe_estomacal, [vomitos, fiebre, dolor_muscular]).
enfermedad(arritmia, [palpitaciones, cansancio, dolor_cabeza]).
enfermedad(asma, [dificultad_respiratoria, tos, cansancio]).
enfermedad(insomnio, [cansancio, dificultad_respiratoria, dolor_cabeza]).
enfermedad(artritis_reumatoide, [inflamacion_articular, cansancio, dolor_muscular]).
enfermedad(enfermedad_periodontal, [sangrado_encias, dolor_abdominal, ulceras_orales]).
enfermedad(leucemia, [cansancio, petequias, dolor_muscular]).
enfermedad(epilepsia, [convulsiones, mareos, dolor_cabeza]).
enfermedad(esclerosis_multiple, [fatiga, dificultad_respiratoria, paralisis_muscular]).
enfermedad(hipotiroidismo, [cansancio, piel_seca, sensibilidad_frio]).
enfermedad(enfermedad_celiaca, [diarrea, dolor_abdominal, cansancio]).
enfermedad(hipertension_arterial, [mareos, dolor_cabeza, palpitaciones]).
enfermedad(enfermedad_coronaria, [dolor_pecho, cansancio, palpitaciones]).
enfermedad(diabetes, [perdida_peso, poliuria, polidipsia]).
enfermedad(insuficiencia_renal, [oliguria, cansancio, confusion_mental]).
enfermedad(anemia, [palidez, cansancio, mareos]).
enfermedad(hipertiroidismo, [taquipnea, nerviosismo, perdida_peso]).
enfermedad(enfermedad_pulmonar_obstructiva_cronica, [dificultad_respiratoria, tos, cansancio]).
enfermedad(hemorragia_nasal, [hemorragia_nasal, palidez, cansancio]).
enfermedad(disfagia, [dificultad_tragar, dolor_garganta, perdida_peso]).
enfermedad(pancreatitis, [dolor_abdominal, nauseas, vomitos]).



% Regla para obtener el nombre de la enfermedad y su tratamiento
diagnosticar_enfermedad(Sintomas, Enfermedad, Tratamiento) :-
    length(Sintomas, Longitud),
    Longitud =:= 3,
    enfermedad(Enfermedad, SintomasEnfermedad),
    subset(SintomasEnfermedad, Sintomas),
    tratamiento(Enfermedad, Tratamiento).

% Tratamientos para las enfermedades
tratamiento(resfriado, 'Descanso y liquidos').
tratamiento(gripe, 'Descanso, liquidos y medicamentos para aliviar los sintomas').
tratamiento(infeccion_respiratoria, 'Descanso y antibioticos si es necesario').
tratamiento(alergia, 'Antihistaminicos y evitar alérgenos').
tratamiento(indigestion, 'Descanso y dieta ligera').
tratamiento(intoxicacion_alimentaria, 'Reposo y mucha hidratacion').
tratamiento(conjuntivitis, 'Lavado ocular y medicamentos para los sintomas').
tratamiento(vertigo, 'Descanso y medicamentos para el mareo').
tratamiento(gastroenteritis, 'Reposo y dieta blanda').
tratamiento(gripe_estomacal, 'Reposo y medicamentos para aliviar los sintomas gastrointestinales').
tratamiento(arritmia, 'Tratamiento especifico segun el tipo de arritmia').
tratamiento(asma, 'Inhaladores y control de desencadenantes').
tratamiento(insomnio, 'Cambio de habitos de sueño y terapia cognitivo-conductual').
tratamiento(artritis_reumatoide, 'Medicamentos antiinflamatorios y fisioterapia').
tratamiento(enfermedad_periodontal, 'Higiene dental adecuada y tratamiento periodontal').
tratamiento(leucemia, 'Quimioterapia y trasplante de mdula osea en casos graves').
tratamiento(epilepsia, 'Anticonvulsivos y atencion medica especializada').
tratamiento(esclerosis_multiple, 'Medicamentos inmunomoduladores y fisioterapia').
tratamiento(hipotiroidismo, 'Hormona tiroidea sintetica y seguimiento medico').
tratamiento(enfermedad_celiaca, 'Dieta libre de gluten y control de sintomas'). 
tratamiento(hipertension_arterial, 'Medicamentos antihipertensivos y cambios en el estilo de vida').
tratamiento(enfermedad_coronaria, 'Aspirina, estatinas y procedimientos medicos segun sea necesario').
tratamiento(diabetes, 'Insulina o medicamentos hipoglucemiantes orales y cambios en la dieta').
tratamiento(insuficiencia_renal, 'Dialisis o trasplante renal según la gravedad').
tratamiento(anemia, 'Suplementos de hierro y cambios en la dieta').
tratamiento(hipertiroidismo, 'Antitiroideos y, en algunos casos, yodo radioactivo o cirugia').
tratamiento(enfermedad_pulmonar_obstructiva_cronica, 'Broncodilatadores y esteroides inhalados').
tratamiento(hemorragia_nasal, 'Compresion nasal y, en casos graves, procedimientos médicos').
tratamiento(disfagia, 'Tratamiento especifico para la causa subyacente y terapia de deglucion').
tratamiento(pancreatitis, 'Ayuno, medicamentos para el dolor y cambios en la dieta').  

