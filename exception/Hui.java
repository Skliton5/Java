package exception;

public class Hui {
		private String getName(int id) {
			if(id==100) {
				return "liton";
			}else if(id==101) {
				return "Ani";
			}else {
				throw new YoFoundException("invalid id");
			}
		}
		
		public static void main(String[] args) {
			Hui h = new Hui();
			h.getName(200);
		}
	}


