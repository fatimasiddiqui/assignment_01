package assignment_02;

public class connection {
	
static int number = 0;
String status[];
boolean commit = true;
String catalogName;
statement object;
String URL;
int minorversion = 0;  //initially 0
int majorversion = 0;  //initially 0
String propertyInfo;
void close(connection obj){
	obj.number = 0;
	obj.status = null;
	
}
void create(connection obj){
	int number1;
	number1 = number+1;
    obj.number = number1;
}
boolean isclosed(connection obj){
	if(obj.number == 0){
		return true;
	}
	else{
		return false;
	}
}
void commit(){
	//save to database
}

String[] rollback(connection obj){
	return obj.status;
}

void setautocommit(boolean c, connection obj){
	obj.commit = c;
}
boolean getautocommit(connection obj){
	return obj.commit;
}
void setcatalogname(String n, connection obj){
	obj.catalogName = n;
}
String getcatalogname(connection obj){
	return obj.catalogName;
}
statement createstatement(connection obj){
	return obj.object;
	
}
void seturl(connection obj, String url){
	obj.URL = url;
}
String geturl(connection obj){
	return obj.URL;
}
boolean connect(String url){
	connection obj;
	String url1 = url;
	int done = 0;
	if(done == 0){
		return false;
	}
	else{
		return true;
	}
}
void setminorversion(connection obj, int num){
	obj.minorversion = num;
}
void setmajorversion(connection obj, int num){
	obj.majorversion = num;
}
int getmajorversion(connection obj){
	return obj.majorversion;
}
int getminorversion(connection obj){
	return obj.minorversion;
}
void setPropertyInfo(connection obj, String info){
	obj.propertyInfo = info;
}
String getPropertyInfo(connection obj){
	return obj.propertyInfo;
}
}
