package Programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class PrincipalData {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L * 60L * 9L);
		
		Date y1 = sdf1.parse("12/05/2019");
		Date y2 = sdf2.parse("12/05/2019 08:54:30");
		Date y3 = Date.from(Instant.parse("2019-05-12T15:42:07Z"));
		
		
		
		System.out.println("=====================================");
		System.out.println("X1: " + sdf2.format(x1));
		System.out.println("X2: " + sdf2.format(x2));
		System.out.println("X3: " + sdf2.format(x3));
		System.out.println("X4: " + sdf2.format(x4));
		System.out.println("Y1: " + sdf1.format(y1));
		System.out.println("Y2: " + sdf2.format(y2));
		System.out.println("Y3: " + sdf2.format(y3));
		System.out.println("=====================================");

		System.out.println("X1: " + sdf3.format(x1));
		System.out.println("X2: " + sdf3.format(x2));
		System.out.println("X3: " + sdf3.format(x3));
		System.out.println("X4: " + sdf3.format(x4));
		System.out.println("Y1: " + sdf3.format(y1));
		System.out.println("Y2: " + sdf3.format(y2));
		System.out.println("Y3: " + sdf3.format(y3));
		
		System.out.println("=============DATAS COM CALENDER ===================");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2019-05-12T09:33:07Z"));
		
		System.out.println("D: " + sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();

		System.out.println("D: " + sdf.format(d));
		
		System.out.println("============== Pegando uma Unidade ==================");
		
		int minuto = cal.get(Calendar.MINUTE);
		int mes = 1 + cal.get(Calendar.MONTH);
		
		System.out.println("O minutos s�o: " + minuto);
		System.out.println("O m�s �: " + mes);
		
		System.out.println("============== C�lculo entre datas ==================");
		
		//define datas
		Calendar dataCadastro = Calendar.getInstance();
		dataCadastro.set(2019, 3, 1);
		Calendar hoje = Calendar.getInstance();

		
		//calcula diferen�a
		int meses = (hoje.get(Calendar.YEAR) * 12 + hoje.get(Calendar.MONTH))
		        - (dataCadastro.get(Calendar.YEAR) * 12 + dataCadastro.get(Calendar.MONTH));
	
		System.out.println(meses);
	}
	

}
