public Flag seychells(){

	Flag f= new Flag();
	
	Polygon p1 = new Polygon(0,200,0,0,150,0,4,200);
	Polygon p2 = new Polygon(4,200,150,0,300,0,8,200);
	Polygon p3 = new Polygon(8,200,300,0,300,120,16,200);
	Polygon p4 = new Polygon(16,200,300,120,300,160,28,200);
	Polygon p5 = new Polygon(28,200,300,160,300,200);
	
	p1.setFill(Color.MEDIUMBLUE);
	p2.setFill(Color.YELLOW);
	p3.setFill(Color.RED);
	p4.setFill(Color.WHITE);
	p5.setFill(Color.GREEN);
	
	f.getChildren().addAll(p1,p2,p3,p4,p5);
	
	return f;	
}