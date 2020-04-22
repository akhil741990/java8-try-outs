package com.soul.java8.lambda;

public class LambdaExpressionExample {

	public static void main(String args[]) {
		
		new Thread(()->
		{
			System.out.println("Thread started via lambda exp");
		}).start(); 
	}
}
// here we  r assigning lambda exp to a functional interface
// https://www.infoq.com/articles/Java-8-Lambdas-A-Peek-Under-the-Hood

/*
 * int total = invoices.stream()
                    .filter(inv -> inv.getMonth() == Month.JULY)
                    .mapToInt(Invoice::getAmount)
                    .sum();
                    
                    
                    
   int total = invoices.stream()
                    .filter(new Predicate<Invoice>() {
                        @Override
                        public boolean test(Invoice inv) {
                            return inv.getMonth() == Month.JULY;
                        }
                    })
                    .mapToInt(new ToIntFunction<Invoice>() {
                        @Override
                        public int applyAsInt(Invoice inv) {
                            return inv.getAmount();
                        }
                    })
                    .sum();                 
 */
*/