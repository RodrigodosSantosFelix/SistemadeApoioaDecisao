CREATE TABLE Mineral(
	Cod_Plant INT IDENTITY NOT NULL,
	Name_Plant VARCHAR(40) NOT NULL,
	Ferro decimal(8,6) null,
	Magnesio decimal(8,6) null,
	Oxigenio decimal(8,6) null,
	Nitrogenio decimal(8,6) null,
	Enxofre decimal(8,6) null,
	P2O5 decimal(8,6) null,
	K2O decimal(8,6) null,
	Calcio decimal(8,6) null,
	Boro decimal(8,6) null,
	Cloro decimal(8,6) null,
	Molibdenio decimal(8,6) null,
	Cobre decimal(8,6) null,
	Manganes decimal(8,6) null,
	Zinco decimal(8,6) null,
	Cobalto decimal(8,6) null,
	Aluminio decimal(8,6) null,
	Potassio decimal(8,6) null,
	Fosforo decimal(8,6) null,

	CONSTRAINT PK_Mineral PRIMARY KEY(Cod_Plant)
)

INSERT INTO Mineral VALUES ('Soja',0.07,6.7,null,83,15.4,15.4,38,12.2,0.02,0.26,
	0.007,0.01,0.03,0.04,null,0.187,18.8,5.88)