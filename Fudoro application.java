import java.util.Scanner;
class ubereats
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)throws Exception
	{
		System.out.println("\t\t\tWelcome to UBER EATS.........!");
		System.out.println("Select the Hotel");
		System.out.println("---------------------------------");
		System.out.println("1.Buhari\n2.Taj Hotel\n3.Sheriff Bhai\n4.A2B");
		System.out.println("\t\t\tSelect Your Choice:");
		int hotel_selection=sc.nextInt();
		System.out.println("\t\t\tProcessing........");
		Thread.sleep(3000);
		
		switch (hotel_selection)
		{
		case 1-> {
			System.out.println("\t\t\tGreetings from Buhari");
			System.out.println("\t\t\tBuhari Menu Card");
			System.out.println("\t\t\t---------------------");
			System.out.println("\t\t\t1.Mutton Biryani");
			System.out.println("\t\t\t2.Chicken Biryani");
			System.out.println("\t\t\t3.Prawn Biryani");
			System.out.println("\t\t\t4.Chiken Tikka");
			System.out.println("\t\t\t5.Chiken Grill");
			System.out.println("\t\t\t6.Shawarma Roll");
			int food=sc.nextInt();
			
			switch (food)
			{
			case 1->{//MB
				double price=460;
				System.out.println("\t\t\tEnter the Quantity:");
				int qty=sc.nextInt();
				double bill=qty*price;
				System.out.println("\t\t\tTotal Bill:"+bill);
				System.out.println("1.Continue with Order\n2.Cancel");
				int order_confirmation=sc.nextInt();
				if (order_confirmation==1)
				{
					//continue
					System.out.println("\t\t\tRedirecting to Payment gateway...");
					Thread.sleep(3000);
					System.out.println("\t\t\tSelect the Payment Mode");
					System.out.println("\t\t\t---------------------------");
					System.out.println("\t\t\t1.Gpay");
					System.out.println("\t\t\t2.Phonepay");
					int payment=sc.nextInt();
					if (payment==1)
					{
						//Gpay
							System.out.println("\t\t\tEnter Bill Amount:");
							double user_bill_amount=sc.nextDouble();
							if(bill==user_bill_amount)
		
							{
								//Bill Amount Matches
								//OTP
								System.out.println("\t\t\tEnter the OTP:");
								Thread.sleep(3000);
								int sys_otp=(int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								int user_otp=sc.nextInt();
								if(user_otp==sys_otp){
									//payment Success
									System.out.println("\t\t\tProcessing Payment....");
									Thread.sleep(3000);
									System.out.println("\t\t\tYipppieee Order Placed....");
									System.out.println("\t\t\tWill be delivered within 30 minutes.... :)");
									}else{
										//Payment Fail
										}
							            }
										else{
											//Bill Amount Not Match
										}
				                     	}
									     else if(payment==2)
										{
										//Phonepay
										}
										else
										{
											//Invalid Payment Selection
			 							}
		                          		}   
		 								else if(order_confirmation==2)
				                      	{
											//Display Order Cancelled
										}
										else
										{
											//Invalid Selection
										}
			                        	}//MB
				case 2->{//CB
				double price=230;
				System.out.println("\t\t\tEnter the Quantity:");
				int qty=sc.nextInt();
				double bill=qty*price;
				System.out.println("\t\t\tTotal Bill:"+bill);
				System.out.println("1.Continue with Order\n2.Cancel");
				int order_confirmation=sc.nextInt();
				if (order_confirmation==1)
				{
					//continue
					System.out.println("\t\t\tRedirecting to Payment gateway...");
					Thread.sleep(3000);
					System.out.println("\t\t\tSelect the Payment Mode");
					System.out.println("\t\t\t---------------------------");
					System.out.println("\t\t\t1.Gpay");
					System.out.println("\t\t\t2.Phonepay");
					int payment=sc.nextInt();
					if (payment==1)
					{
						//Gpay
							System.out.println("\t\t\tEnter Bill Amount:");
							double user_bill_amount=sc.nextDouble();
							if(bill==user_bill_amount)
		
							{
								//Bill Amount Matches
								//OTP
								System.out.println("\t\t\tEnter the OTP:");
								Thread.sleep(3000);
								int sys_otp=(int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								int user_otp=sc.nextInt();
								if(user_otp==sys_otp){
									//payment Success
									System.out.println("\t\t\tProcessing Payment....");
									Thread.sleep(3000);
									System.out.println("\t\t\tYipppieee Order Placed....");
									System.out.println("\t\t\tWill be delivered within 30 minutes.... :)");
									}else{
										//Payment Fail
										}
							            }
										else{
											//Bill Amount Not Match
										}
				                     	}
									     else if(payment==2)
										{
										//Phonepay
										}
										else
										{
											//Invalid Payment Selection
			 							}
		                          		}   
		 								else if(order_confirmation==2)
				                      	{
											//Display Order Cancelled
										}
										else
										{
											//Invalid Selection
										}
			                        	}//CB
			   case 3->{//PB
				double price=460;
				System.out.println("\t\t\tEnter the Quantity:");
				int qty=sc.nextInt();
				double bill=qty*price;
				System.out.println("\t\t\tTotal Bill:"+bill);
				System.out.println("1.Continue with Order\n2.Cancel");
				int order_confirmation=sc.nextInt();
				if (order_confirmation==1)
				{
					//continue
					System.out.println("\t\t\tRedirecting to Payment gateway...");
					Thread.sleep(3000);
					System.out.println("\t\t\tSelect the Payment Mode");
					System.out.println("\t\t\t---------------------------");
					System.out.println("\t\t\t1.Gpay");
					System.out.println("\t\t\t2.Phonepay");
					int payment=sc.nextInt();
					if (payment==1)
					{
						//Gpay
							System.out.println("\t\t\tEnter Bill Amount:");
							double user_bill_amount=sc.nextDouble();
							if(bill==user_bill_amount)
		
							{
								//Bill Amount Matches
								//OTP
								System.out.println("\t\t\tEnter the OTP:");
								Thread.sleep(3000);
								int sys_otp=(int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								int user_otp=sc.nextInt();
								if(user_otp==sys_otp){
									//payment Success
									System.out.println("\t\t\tProcessing Payment....");
									Thread.sleep(3000);
									System.out.println("\t\t\tYipppieee Order Placed....");
									System.out.println("\t\t\tWill be delivered within 30 minutes.... :)");
									}else{
										//Payment Fail
										}
							            }
										else{
											//Bill Amount Not Match
										}
				                     	}
									     else if(payment==2)
										{
										//Phonepay
										}
										else
										{
											//Invalid Payment Selection
			 							}
		                          		}   
		 								else if(order_confirmation==2)
				                      	{
											//Display Order Cancelled
										}
										else
										{
											//Invalid Selection
										}
			                        	}//PB
				 case 4->{//CT
				double price=160;
				System.out.println("\t\t\tEnter the Quantity:");
				int qty=sc.nextInt();
				double bill=qty*price;
				System.out.println("\t\t\tTotal Bill:"+bill);
				System.out.println("1.Continue with Order\n2.Cancel");
				int order_confirmation=sc.nextInt();
				if (order_confirmation==1)
				{
					//continue
					System.out.println("\t\t\tRedirecting to Payment gateway...");
					Thread.sleep(3000);
					System.out.println("\t\t\tSelect the Payment Mode");
					System.out.println("\t\t\t---------------------------");
					System.out.println("\t\t\t1.Gpay");
					System.out.println("\t\t\t2.Phonepay");
					int payment=sc.nextInt();
					if (payment==1)
					{
						//Gpay
							System.out.println("\t\t\tEnter Bill Amount:");
							double user_bill_amount=sc.nextDouble();
							if(bill==user_bill_amount)
		
							{
								//Bill Amount Matches
								//OTP
								System.out.println("\t\t\tEnter the OTP:");
								Thread.sleep(3000);
								int sys_otp=(int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								int user_otp=sc.nextInt();
								if(user_otp==sys_otp){
									//payment Success
									System.out.println("\t\t\tProcessing Payment....");
									Thread.sleep(3000);
									System.out.println("\t\t\tYipppieee Order Placed....");
									System.out.println("\t\t\tWill be delivered within 30 minutes.... :)");
									}else{
										//Payment Fail
										}
							            }
										else{
											//Bill Amount Not Match
										}
				                     	}
									     else if(payment==2)
										{
										//Phonepay
										}
										else
										{
											//Invalid Payment Selection
			 							}
		                          		}   
		 								else if(order_confirmation==2)
				                      	{
											//Display Order Cancelled
										}
										else
										{
											//Invalid Selection
										}
			                        	}//CT
				 case 5->{//CG
				double price=420;
				System.out.println("\t\t\tEnter the Quantity:");
				int qty=sc.nextInt();
				double bill=qty*price;
				System.out.println("\t\t\tTotal Bill:"+bill);
				System.out.println("1.Continue with Order\n2.Cancel");
				int order_confirmation=sc.nextInt();
				if (order_confirmation==1)
				{
					//continue
					System.out.println("\t\t\tRedirecting to Payment gateway...");
					Thread.sleep(3000);
					System.out.println("\t\t\tSelect the Payment Mode");
					System.out.println("\t\t\t---------------------------");
					System.out.println("\t\t\t1.Gpay");
					System.out.println("\t\t\t2.Phonepay");
					int payment=sc.nextInt();
					if (payment==1)
					{
						//Gpay
							System.out.println("\t\t\tEnter Bill Amount:");
							double user_bill_amount=sc.nextDouble();
							if(bill==user_bill_amount)
		
							{
								//Bill Amount Matches
								//OTP
								System.out.println("\t\t\tEnter the OTP:");
								Thread.sleep(3000);
								int sys_otp=(int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								int user_otp=sc.nextInt();
								if(user_otp==sys_otp){
									//payment Success
									System.out.println("\t\t\tProcessing Payment....");
									Thread.sleep(3000);
									System.out.println("\t\t\tYipppieee Order Placed....");
									System.out.println("\t\t\tWill be delivered within 30 minutes.... :)");
									}else{
										//Payment Fail
										}
							            }
										else{
											//Bill Amount Not Match
										}
				                     	}
									     else if(payment==2)
										{
										//Phonepay
										}
										else
										{
											//Invalid Payment Selection
			 							}
		                          		}   
		 								else if(order_confirmation==2)
				                      	{
											//Display Order Cancelled
										}
										else
										{
											//Invalid Selection
										}
			                        	}//CG
					case 6->{//CR
				double price=90;
				System.out.println("\t\t\tEnter the Quantity:");
				int qty=sc.nextInt();
				double bill=qty*price;
				System.out.println("\t\t\tTotal Bill:"+bill);
				System.out.println("1.Continue with Order\n2.Cancel");
				int order_confirmation=sc.nextInt();
				if (order_confirmation==1)
				{
					//continue
					System.out.println("\t\t\tRedirecting to Payment gateway...");
					Thread.sleep(3000);
					System.out.println("\t\t\tSelect the Payment Mode");
					System.out.println("\t\t\t---------------------------");
					System.out.println("\t\t\t1.Gpay");
					System.out.println("\t\t\t2.Phonepay");
					int payment=sc.nextInt();
					if (payment==1)
					{
						//Gpay
							System.out.println("\t\t\tEnter Bill Amount:");
							double user_bill_amount=sc.nextDouble();
							if(bill==user_bill_amount)
		
							{
								//Bill Amount Matches
								//OTP
								System.out.println("\t\t\tEnter the OTP:");
								Thread.sleep(3000);
								int sys_otp=(int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								int user_otp=sc.nextInt();
								if(user_otp==sys_otp){
									//payment Success
									System.out.println("\t\t\tProcessing Payment....");
									Thread.sleep(3000);
									System.out.println("\t\t\tYipppieee Order Placed....");
									System.out.println("\t\t\tWill be delivered within 30 minutes.... :)");
									}else{
										//Payment Fail
										}
							            }
										else{
											//Bill Amount Not Match
										}
				                     	}
									     else if(payment==2)
										{
										//Phonepay
										}
										else
										{
											//Invalid Payment Selection
			 							}
		                          		}   
		 								else if(order_confirmation==2)
				                      	{
											//Display Order Cancelled
										}
										else
										{
											//Invalid Selection
										}
			                        	}//SR
										default->{}//Invalid Buhari Food Selection
											     
			
			}
			
		}
			//Buhari
			
			case 2-> {
			System.out.println("\t\t\tGreetings from Taj Hotel");
			System.out.println("\t\t\tTaj Hotel Menu Card");
			System.out.println("\t\t\t---------------------");
			System.out.println("\t\t\t1.Mutton Biryani");
			System.out.println("\t\t\t2.Chicken Biryani");
			System.out.println("\t\t\t3.Prawn Biryani");
			System.out.println("\t\t\t4.Beef Biryani");
			System.out.println("\t\t\t5.Chiken Tikka");
			System.out.println("\t\t\t6.Chiken Grill");
			System.out.println("\t\t\t7.Shawarma Plate");
			int food=sc.nextInt();
			
			switch (food)
			{
				case 1->{//MB
				double price=570;
				System.out.println("\t\t\tEnter the Quantity:");
				int qty=sc.nextInt();
				double bill=qty*price;
				System.out.println("\t\t\tTotal Bill:"+bill);
				System.out.println("1.Continue with Order\n2.Cancel");
				int order_confirmation=sc.nextInt();
				if (order_confirmation==1)
				{
					//continue
					System.out.println("\t\t\tRedirecting to Payment gateway...");
					Thread.sleep(3000);
					System.out.println("\t\t\tSelect the Payment Mode");
					System.out.println("\t\t\t---------------------------");
					System.out.println("\t\t\t1.Gpay");
					System.out.println("\t\t\t2.Phonepay");
					int payment=sc.nextInt();
					if (payment==1)
					{
						//Gpay
							System.out.println("\t\t\tEnter Bill Amount:");
							double user_bill_amount=sc.nextDouble();
							if(bill==user_bill_amount)
		
							{
								//Bill Amount Matches
								//OTP
								System.out.println("\t\t\tEnter the OTP:");
								Thread.sleep(3000);
								int sys_otp=(int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								int user_otp=sc.nextInt();
								if(user_otp==sys_otp){
									//payment Success
									System.out.println("\t\t\tProcessing Payment....");
									Thread.sleep(3000);
									System.out.println("\t\t\tYipppieee Order Placed....");
									System.out.println("\t\t\tWill be delivered within 30 minutes.... :)");
									}else{
										//Payment Fail
										}
							            }
										else{
											//Bill Amount Not Match
										}
				                     	}
									     else if(payment==2)
										{
										//Phonepay
										}
										else
										{
											//Invalid Payment Selection
			 							}
		                          		}   
		 								else if(order_confirmation==2)
				                      	{
											//Display Order Cancelled
										}
										else
										{
											//Invalid Selection
										}
			                        	}//MB
					case 2->{//CB
				double price=250;
				System.out.println("\t\t\tEnter the Quantity:");
				int qty=sc.nextInt();
				double bill=qty*price;
				System.out.println("\t\t\tTotal Bill:"+bill);
				System.out.println("1.Continue with Order\n2.Cancel");
				int order_confirmation=sc.nextInt();
				if (order_confirmation==1)
				{
					//continue
					System.out.println("\t\t\tRedirecting to Payment gateway...");
					Thread.sleep(3000);
					System.out.println("\t\t\tSelect the Payment Mode");
					System.out.println("\t\t\t---------------------------");
					System.out.println("\t\t\t1.Gpay");
					System.out.println("\t\t\t2.Phonepay");
					int payment=sc.nextInt();
					if (payment==1)
					{
						//Gpay
							System.out.println("\t\t\tEnter Bill Amount:");
							double user_bill_amount=sc.nextDouble();
							if(bill==user_bill_amount)
		
							{
								//Bill Amount Matches
								//OTP
								System.out.println("\t\t\tEnter the OTP:");
								Thread.sleep(3000);
								int sys_otp=(int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								int user_otp=sc.nextInt();
								if(user_otp==sys_otp){
									//payment Success
									System.out.println("\t\t\tProcessing Payment....");
									Thread.sleep(3000);
									System.out.println("\t\t\tYipppieee Order Placed....");
									System.out.println("\t\t\tWill be delivered within 30 minutes.... :)");
									}else{
										//Payment Fail
										}
							            }
										else{
											//Bill Amount Not Match
										}
				                     	}
									     else if(payment==2)
										{
										//Phonepay
										}
										else
										{
											//Invalid Payment Selection
			 							}
		                          		}   
		 								else if(order_confirmation==2)
				                      	{
											//Display Order Cancelled
										}
										else
										{
											//Invalid Selection
										}
			                        	}//CB
			  case 3->{//PB
				double price=380;
				System.out.println("\t\t\tEnter the Quantity:");
				int qty=sc.nextInt();
				double bill=qty*price;
				System.out.println("\t\t\tTotal Bill:"+bill);
				System.out.println("1.Continue with Order\n2.Cancel");
				int order_confirmation=sc.nextInt();
				if (order_confirmation==1)
				{
					//continue
					System.out.println("\t\t\tRedirecting to Payment gateway...");
					Thread.sleep(3000);
					System.out.println("\t\t\tSelect the Payment Mode");
					System.out.println("\t\t\t---------------------------");
					System.out.println("\t\t\t1.Gpay");
					System.out.println("\t\t\t2.Phonepay");
					int payment=sc.nextInt();
					if (payment==1)
					{
						//Gpay
							System.out.println("\t\t\tEnter Bill Amount:");
							double user_bill_amount=sc.nextDouble();
							if(bill==user_bill_amount)
		
							{
								//Bill Amount Matches
								//OTP
								System.out.println("\t\t\tEnter the OTP:");
								Thread.sleep(3000);
								int sys_otp=(int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								int user_otp=sc.nextInt();
								if(user_otp==sys_otp){
									//payment Success
									System.out.println("\t\t\tProcessing Payment....");
									Thread.sleep(3000);
									System.out.println("\t\t\tYipppieee Order Placed....");
									System.out.println("\t\t\tWill be delivered within 30 minutes.... :)");
									}else{
										//Payment Fail
										}
							            }
										else{
											//Bill Amount Not Match
										}
				                     	}
									     else if(payment==2)
										{
										//Phonepay
										}
										else
										{
											//Invalid Payment Selection
			 							}
		                          		}   
		 								else if(order_confirmation==2)
				                      	{
											//Display Order Cancelled
										}
										else
										{
											//Invalid Selection
										}
			                        	}//PB
										
										
			  case 4->{//BB
				double price=460;
				System.out.println("\t\t\tEnter the Quantity:");
				int qty=sc.nextInt();
				double bill=qty*price;
				System.out.println("\t\t\tTotal Bill:"+bill);
				System.out.println("1.Continue with Order\n2.Cancel");
				int order_confirmation=sc.nextInt();
				if (order_confirmation==1)
				{
					//continue
					System.out.println("\t\t\tRedirecting to Payment gateway...");
					Thread.sleep(3000);
					System.out.println("\t\t\tSelect the Payment Mode");
					System.out.println("\t\t\t---------------------------");
					System.out.println("\t\t\t1.Gpay");
					System.out.println("\t\t\t2.Phonepay");
					int payment=sc.nextInt();
					if (payment==1)
					{
						//Gpay
							System.out.println("\t\t\tEnter Bill Amount:");
							double user_bill_amount=sc.nextDouble();
							if(bill==user_bill_amount)
		
							{
								//Bill Amount Matches
								//OTP
								System.out.println("\t\t\tEnter the OTP:");
								Thread.sleep(3000);
								int sys_otp=(int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								int user_otp=sc.nextInt();
								if(user_otp==sys_otp){
									//payment Success
									System.out.println("\t\t\tProcessing Payment....");
									Thread.sleep(3000);
									System.out.println("\t\t\tYipppieee Order Placed....");
									System.out.println("\t\t\tWill be delivered within 30 minutes.... :)");
									}else{
										//Payment Fail
										}
							            }
										else{
											//Bill Amount Not Match
										}
				                     	}
									     else if(payment==2)
										{
										//Phonepay
										}
										else
										{
											//Invalid Payment Selection
			 							}
		                          		}   
		 								else if(order_confirmation==2)
				                      	{
											//Display Order Cancelled
										}
										else
										{
											//Invalid Selection
										}
			                        	}//BB
										
			  case 5->{//CT
				double price=180;
				System.out.println("\t\t\tEnter the Quantity:");
				int qty=sc.nextInt();
				double bill=qty*price;
				System.out.println("\t\t\tTotal Bill:"+bill);
				System.out.println("1.Continue with Order\n2.Cancel");
				int order_confirmation=sc.nextInt();
				if (order_confirmation==1)
				{
					//continue
					System.out.println("\t\t\tRedirecting to Payment gateway...");
					Thread.sleep(3000);
					System.out.println("\t\t\tSelect the Payment Mode");
					System.out.println("\t\t\t---------------------------");
					System.out.println("\t\t\t1.Gpay");
					System.out.println("\t\t\t2.Phonepay");
					int payment=sc.nextInt();
					if (payment==1)
					{
						//Gpay
							System.out.println("\t\t\tEnter Bill Amount:");
							double user_bill_amount=sc.nextDouble();
							if(bill==user_bill_amount)
		
							{
								//Bill Amount Matches
								//OTP
								System.out.println("\t\t\tEnter the OTP:");
								Thread.sleep(3000);
								int sys_otp=(int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								int user_otp=sc.nextInt();
								if(user_otp==sys_otp){
									//payment Success
									System.out.println("\t\t\tProcessing Payment....");
									Thread.sleep(3000);
									System.out.println("\t\t\tYipppieee Order Placed....");
									System.out.println("\t\t\tWill be delivered within 30 minutes.... :)");
									}else{
										//Payment Fail
										}
							            }
										else{
											//Bill Amount Not Match
										}
				                     	}
									     else if(payment==2)
										{
										//Phonepay
										}
										else
										{
											//Invalid Payment Selection
			 							}
		                          		}   
		 								else if(order_confirmation==2)
				                      	{
											//Display Order Cancelled
										}
										else
										{
											//Invalid Selection
										}
			                        	}//CT
										 
										 
			  case 6->{//CG
				double price=510;
				System.out.println("\t\t\tEnter the Quantity:");
				int qty=sc.nextInt();
				double bill=qty*price;
				System.out.println("\t\t\tTotal Bill:"+bill);
				System.out.println("1.Continue with Order\n2.Cancel");
				int order_confirmation=sc.nextInt();
				if (order_confirmation==1)
				{
					//continue
					System.out.println("\t\t\tRedirecting to Payment gateway...");
					Thread.sleep(3000);
					System.out.println("\t\t\tSelect the Payment Mode");
					System.out.println("\t\t\t---------------------------");
					System.out.println("\t\t\t1.Gpay");
					System.out.println("\t\t\t2.Phonepay");
					int payment=sc.nextInt();
					if (payment==1)
					{
						//Gpay
							System.out.println("\t\t\tEnter Bill Amount:");
							double user_bill_amount=sc.nextDouble();
							if(bill==user_bill_amount)
		
							{
								//Bill Amount Matches
								//OTP
								System.out.println("\t\t\tEnter the OTP:");
								Thread.sleep(3000);
								int sys_otp=(int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								int user_otp=sc.nextInt();
								if(user_otp==sys_otp){
									//payment Success
									System.out.println("\t\t\tProcessing Payment....");
									Thread.sleep(3000);
									System.out.println("\t\t\tYipppieee Order Placed....");
									System.out.println("\t\t\tWill be delivered within 30 minutes.... :)");
									}else{
										//Payment Fail
										}
							            }
										else{
											//Bill Amount Not Match
										}
				                     	}
									     else if(payment==2)
										{
										//Phonepay
										}
										else
										{
											//Invalid Payment Selection
			 							}
		                          		}   
		 								else if(order_confirmation==2)
				                      	{
											//Display Order Cancelled
										}
										else
										{
											//Invalid Selection
										}
			                        	}//CG
										
			  case 7->{//SP
				double price=170;
				System.out.println("\t\t\tEnter the Quantity:");
				int qty=sc.nextInt();
				double bill=qty*price;
				System.out.println("\t\t\tTotal Bill:"+bill);
				System.out.println("1.Continue with Order\n2.Cancel");
				int order_confirmation=sc.nextInt();
				if (order_confirmation==1)
				{
					//continue
					System.out.println("\t\t\tRedirecting to Payment gateway...");
					Thread.sleep(3000);
					System.out.println("\t\t\tSelect the Payment Mode");
					System.out.println("\t\t\t---------------------------");
					System.out.println("\t\t\t1.Gpay");
					System.out.println("\t\t\t2.Phonepay");
					int payment=sc.nextInt();
					if (payment==1)
					{
						//Gpay
							System.out.println("\t\t\tEnter Bill Amount:");
							double user_bill_amount=sc.nextDouble();
							if(bill==user_bill_amount)
		
							{
								//Bill Amount Matches
								//OTP
								System.out.println("\t\t\tEnter the OTP:");
								Thread.sleep(3000);
								int sys_otp=(int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								int user_otp=sc.nextInt();
								if(user_otp==sys_otp){
									//payment Success
									System.out.println("\t\t\tProcessing Payment....");
									Thread.sleep(3000);
									System.out.println("\t\t\tYipppieee Order Placed....");
									System.out.println("\t\t\tWill be delivered within 30 minutes.... :)");
									}else{
										//Payment Fail
										}
							            }
										else{
											//Bill Amount Not Match
										}
				                     	}
									     else if(payment==2)
										{
										//Phonepay
										}
										else
										{
											//Invalid Payment Selection
			 							}
		                          		}   
		 								else if(order_confirmation==2)
				                      	{
											//Display Order Cancelled
										}
										else
										{
											//Invalid Selection
										}
			                        	}//SP
										default->{}//Invalid Taj Hotel Food Selection
			
			}
		}//Taj Hotels
		
		
			case 3-> {
			System.out.println("\t\t\tGreetings from Sheriff Bhai");
			System.out.println("\t\t\tSheriff Bhai Menu Card");
			System.out.println("\t\t\t---------------------");
			System.out.println("\t\t\t1.Mutton Biryani");
			System.out.println("\t\t\t2.Chicken Biryani");
			System.out.println("\t\t\t3.Prawn Biryani");
			System.out.println("\t\t\t4.Beef Biryani");
			System.out.println("\t\t\t5.Chiken Tikka");
			System.out.println("\t\t\t6.Chiken Grill");
			System.out.println("\t\t\t7.Shawarma Plate");
			int food=sc.nextInt();
			
			switch (food)
			{
				case 1->{//MB
				double price=590;
				System.out.println("\t\t\tEnter the Quantity:");
				int qty=sc.nextInt();
				double bill=qty*price;
				System.out.println("\t\t\tTotal Bill:"+bill);
				System.out.println("1.Continue with Order\n2.Cancel");
				int order_confirmation=sc.nextInt();
				if (order_confirmation==1)
				{
					//continue
					System.out.println("\t\t\tRedirecting to Payment gateway...");
					Thread.sleep(3000);
					System.out.println("\t\t\tSelect the Payment Mode");
					System.out.println("\t\t\t---------------------------");
					System.out.println("\t\t\t1.Gpay");
					System.out.println("\t\t\t2.Phonepay");
					int payment=sc.nextInt();
					if (payment==1)
					{
						//Gpay
							System.out.println("\t\t\tEnter Bill Amount:");
							double user_bill_amount=sc.nextDouble();
							if(bill==user_bill_amount)
		
							{
								//Bill Amount Matches
								//OTP
								System.out.println("\t\t\tEnter the OTP:");
								Thread.sleep(3000);
								int sys_otp=(int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								int user_otp=sc.nextInt();
								if(user_otp==sys_otp){
									//payment Success
									System.out.println("\t\t\tProcessing Payment....");
									Thread.sleep(3000);
									System.out.println("\t\t\tYipppieee Order Placed....");
									System.out.println("\t\t\tWill be delivered within 30 minutes.... :)");
									}else{
										//Payment Fail
										}
							            }
										else{
											//Bill Amount Not Match
										}
				                     	}
									     else if(payment==2)
										{
										//Phonepay
										}
										else
										{
											//Invalid Payment Selection
			 							}
		                          		}   
		 								else if(order_confirmation==2)
				                      	{
											//Display Order Cancelled
										}
										else
										{
											//Invalid Selection
										}
			                        	}//MB
					case 2->{//CB
				double price=260;
				System.out.println("\t\t\tEnter the Quantity:");
				int qty=sc.nextInt();
				double bill=qty*price;
				System.out.println("\t\t\tTotal Bill:"+bill);
				System.out.println("1.Continue with Order\n2.Cancel");
				int order_confirmation=sc.nextInt();
				if (order_confirmation==1)
				{
					//continue
					System.out.println("\t\t\tRedirecting to Payment gateway...");
					Thread.sleep(3000);
					System.out.println("\t\t\tSelect the Payment Mode");
					System.out.println("\t\t\t---------------------------");
					System.out.println("\t\t\t1.Gpay");
					System.out.println("\t\t\t2.Phonepay");
					int payment=sc.nextInt();
					if (payment==1)
					{
						//Gpay
							System.out.println("\t\t\tEnter Bill Amount:");
							double user_bill_amount=sc.nextDouble();
							if(bill==user_bill_amount)
		
							{
								//Bill Amount Matches
								//OTP
								System.out.println("\t\t\tEnter the OTP:");
								Thread.sleep(3000);
								int sys_otp=(int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								int user_otp=sc.nextInt();
								if(user_otp==sys_otp){
									//payment Success
									System.out.println("\t\t\tProcessing Payment....");
									Thread.sleep(3000);
									System.out.println("\t\t\tYipppieee Order Placed....");
									System.out.println("\t\t\tWill be delivered within 30 minutes.... :)");
									}else{
										//Payment Fail
										}
							            }
										else{
											//Bill Amount Not Match
										}
				                     	}
									     else if(payment==2)
										{
										//Phonepay
										}
										else
										{
											//Invalid Payment Selection
			 							}
		                          		}   
		 								else if(order_confirmation==2)
				                      	{
											//Display Order Cancelled
										}
										else
										{
											//Invalid Selection
										}
			                        	}//CB
			  case 3->{//PB
				double price=280;
				System.out.println("\t\t\tEnter the Quantity:");
				int qty=sc.nextInt();
				double bill=qty*price;
				System.out.println("\t\t\tTotal Bill:"+bill);
				System.out.println("1.Continue with Order\n2.Cancel");
				int order_confirmation=sc.nextInt();
				if (order_confirmation==1)
				{
					//continue
					System.out.println("\t\t\tRedirecting to Payment gateway...");
					Thread.sleep(3000);
					System.out.println("\t\t\tSelect the Payment Mode");
					System.out.println("\t\t\t---------------------------");
					System.out.println("\t\t\t1.Gpay");
					System.out.println("\t\t\t2.Phonepay");
					int payment=sc.nextInt();
					if (payment==1)
					{
						//Gpay
							System.out.println("\t\t\tEnter Bill Amount:");
							double user_bill_amount=sc.nextDouble();
							if(bill==user_bill_amount)
		
							{
								//Bill Amount Matches
								//OTP
								System.out.println("\t\t\tEnter the OTP:");
								Thread.sleep(3000);
								int sys_otp=(int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								int user_otp=sc.nextInt();
								if(user_otp==sys_otp){
									//payment Success
									System.out.println("\t\t\tProcessing Payment....");
									Thread.sleep(3000);
									System.out.println("\t\t\tYipppieee Order Placed....");
									System.out.println("\t\t\tWill be delivered within 30 minutes.... :)");
									}else{
										//Payment Fail
										}
							            }
										else{
											//Bill Amount Not Match
										}
				                     	}
									     else if(payment==2)
										{
										//Phonepay
										}
										else
										{
											//Invalid Payment Selection
			 							}
		                          		}   
		 								else if(order_confirmation==2)
				                      	{
											//Display Order Cancelled
										}
										else
										{
											//Invalid Selection
										}
			                        	}//PB
										
										
			  case 4->{//BB
				double price=470;
				System.out.println("\t\t\tEnter the Quantity:");
				int qty=sc.nextInt();
				double bill=qty*price;
				System.out.println("\t\t\tTotal Bill:"+bill);
				System.out.println("1.Continue with Order\n2.Cancel");
				int order_confirmation=sc.nextInt();
				if (order_confirmation==1)
				{
					//continue
					System.out.println("\t\t\tRedirecting to Payment gateway...");
					Thread.sleep(3000);
					System.out.println("\t\t\tSelect the Payment Mode");
					System.out.println("\t\t\t---------------------------");
					System.out.println("\t\t\t1.Gpay");
					System.out.println("\t\t\t2.Phonepay");
					int payment=sc.nextInt();
					if (payment==1)
					{
						//Gpay
							System.out.println("\t\t\tEnter Bill Amount:");
							double user_bill_amount=sc.nextDouble();
							if(bill==user_bill_amount)
		
							{
								//Bill Amount Matches
								//OTP
								System.out.println("\t\t\tEnter the OTP:");
								Thread.sleep(3000);
								int sys_otp=(int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								int user_otp=sc.nextInt();
								if(user_otp==sys_otp){
									//payment Success
									System.out.println("\t\t\tProcessing Payment....");
									Thread.sleep(3000);
									System.out.println("\t\t\tYipppieee Order Placed....");
									System.out.println("\t\t\tWill be delivered within 30 minutes.... :)");
									}else{
										//Payment Fail
										}
							            }
										else{
											//Bill Amount Not Match
										}
				                     	}
									     else if(payment==2)
										{
										//Phonepay
										}
										else
										{
											//Invalid Payment Selection
			 							}
		                          		}   
		 								else if(order_confirmation==2)
				                      	{
											//Display Order Cancelled
										}
										else
										{
											//Invalid Selection
										}
			                        	}//BB
										
			  case 5->{//CT
				double price=190;
				System.out.println("\t\t\tEnter the Quantity:");
				int qty=sc.nextInt();
				double bill=qty*price;
				System.out.println("\t\t\tTotal Bill:"+bill);
				System.out.println("1.Continue with Order\n2.Cancel");
				int order_confirmation=sc.nextInt();
				if (order_confirmation==1)
				{
					//continue
					System.out.println("\t\t\tRedirecting to Payment gateway...");
					Thread.sleep(3000);
					System.out.println("\t\t\tSelect the Payment Mode");
					System.out.println("\t\t\t---------------------------");
					System.out.println("\t\t\t1.Gpay");
					System.out.println("\t\t\t2.Phonepay");
					int payment=sc.nextInt();
					if (payment==1)
					{
						//Gpay
							System.out.println("\t\t\tEnter Bill Amount:");
							double user_bill_amount=sc.nextDouble();
							if(bill==user_bill_amount)
		
							{
								//Bill Amount Matches
								//OTP
								System.out.println("\t\t\tEnter the OTP:");
								Thread.sleep(3000);
								int sys_otp=(int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								int user_otp=sc.nextInt();
								if(user_otp==sys_otp){
									//payment Success
									System.out.println("\t\t\tProcessing Payment....");
									Thread.sleep(3000);
									System.out.println("\t\t\tYipppieee Order Placed....");
									System.out.println("\t\t\tWill be delivered within 30 minutes.... :)");
									}else{
										//Payment Fail
										}
							            }
										else{
											//Bill Amount Not Match
										}
				                     	}
									     else if(payment==2)
										{
										//Phonepay
										}
										else
										{
											//Invalid Payment Selection
			 							}
		                          		}   
		 								else if(order_confirmation==2)
				                      	{
											//Display Order Cancelled
										}
										else
										{
											//Invalid Selection
										}
			                        	}//CT
										 
										 
			  case 6->{//CG
				double price=530;
				System.out.println("\t\t\tEnter the Quantity:");
				int qty=sc.nextInt();
				double bill=qty*price;
				System.out.println("\t\t\tTotal Bill:"+bill);
				System.out.println("1.Continue with Order\n2.Cancel");
				int order_confirmation=sc.nextInt();
				if (order_confirmation==1)
				{
					//continue
					System.out.println("\t\t\tRedirecting to Payment gateway...");
					Thread.sleep(3000);
					System.out.println("\t\t\tSelect the Payment Mode");
					System.out.println("\t\t\t---------------------------");
					System.out.println("\t\t\t1.Gpay");
					System.out.println("\t\t\t2.Phonepay");
					int payment=sc.nextInt();
					if (payment==1)
					{
						//Gpay
							System.out.println("\t\t\tEnter Bill Amount:");
							double user_bill_amount=sc.nextDouble();
							if(bill==user_bill_amount)
		
							{
								//Bill Amount Matches
								//OTP
								System.out.println("\t\t\tEnter the OTP:");
								Thread.sleep(3000);
								int sys_otp=(int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								int user_otp=sc.nextInt();
								if(user_otp==sys_otp){
									//payment Success
									System.out.println("\t\t\tProcessing Payment....");
									Thread.sleep(3000);
									System.out.println("\t\t\tYipppieee Order Placed....");
									System.out.println("\t\t\tWill be delivered within 30 minutes.... :)");
									}else{
										//Payment Fail
										}
							            }
										else{
											//Bill Amount Not Match
										}
				                     	}
									     else if(payment==2)
										{
										//Phonepay
										}
										else
										{
											//Invalid Payment Selection
			 							}
		                          		}   
		 								else if(order_confirmation==2)
				                      	{
											//Display Order Cancelled
										}
										else
										{
											//Invalid Selection
										}
			                        	}//CG
										
			  case 7->{//SP
				double price=230;
				System.out.println("\t\t\tEnter the Quantity:");
				int qty=sc.nextInt();
				double bill=qty*price;
				System.out.println("\t\t\tTotal Bill:"+bill);
				System.out.println("1.Continue with Order\n2.Cancel");
				int order_confirmation=sc.nextInt();
				if (order_confirmation==1)
				{
					//continue
					System.out.println("\t\t\tRedirecting to Payment gateway...");
					Thread.sleep(3000);
					System.out.println("\t\t\tSelect the Payment Mode");
					System.out.println("\t\t\t---------------------------");
					System.out.println("\t\t\t1.Gpay");
					System.out.println("\t\t\t2.Phonepay");
					int payment=sc.nextInt();
					if (payment==1)
					{
						//Gpay
							System.out.println("\t\t\tEnter Bill Amount:");
							double user_bill_amount=sc.nextDouble();
							if(bill==user_bill_amount)
		
							{
								//Bill Amount Matches
								//OTP
								System.out.println("\t\t\tEnter the OTP:");
								Thread.sleep(3000);
								int sys_otp=(int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								int user_otp=sc.nextInt();
								if(user_otp==sys_otp){
									//payment Success
									System.out.println("\t\t\tProcessing Payment....");
									Thread.sleep(3000);
									System.out.println("\t\t\tYipppieee Order Placed....");
									System.out.println("\t\t\tWill be delivered within 30 minutes.... :)");
									}else{
										//Payment Fail
										}
							            }
										else{
											//Bill Amount Not Match
										}
				                     	}
									     else if(payment==2)
										{
										//Phonepay
										}
										else
										{
											//Invalid Payment Selection
			 							}
		                          		}   
		 								else if(order_confirmation==2)
				                      	{
											//Display Order Cancelled
										}
										else
										{
											//Invalid Selection
										}
			                        	}//SP
										default->{}//Invalid Sheriff Bhai Food Selection
			
			}
		}//Sheriff Bhai
		
		
		    case 4-> {
			System.out.println("\t\t\tGreetings from A2B");
			System.out.println("\t\t\tA2B Bhai Menu Card");
			System.out.println("\t\t\t---------------------");
			System.out.println("\t\t\t1.Idly");
			System.out.println("\t\t\t2.Dosa");
			System.out.println("\t\t\t3.Poori");
			System.out.println("\t\t\t4.Chappathi");
			System.out.println("\t\t\t5.Upma");
			System.out.println("\t\t\t6.Brinji");
			System.out.println("\t\t\t7.Pongal");
			int food=sc.nextInt();
			
			switch (food)
			{
				case 1->{//Idly
				double price=70;
				System.out.println("\t\t\tEnter the Quantity:");
				int qty=sc.nextInt();
				double bill=qty*price;
				System.out.println("\t\t\tTotal Bill:"+bill);
				System.out.println("1.Continue with Order\n2.Cancel");
				int order_confirmation=sc.nextInt();
				if (order_confirmation==1)
				{
					//continue
					System.out.println("\t\t\tRedirecting to Payment gateway...");
					Thread.sleep(3000);
					System.out.println("\t\t\tSelect the Payment Mode");
					System.out.println("\t\t\t---------------------------");
					System.out.println("\t\t\t1.Gpay");
					System.out.println("\t\t\t2.Phonepay");
					int payment=sc.nextInt();
					if (payment==1)
					{
						//Gpay
							System.out.println("\t\t\tEnter Bill Amount:");
							double user_bill_amount=sc.nextDouble();
							if(bill==user_bill_amount)
		
							{
								//Bill Amount Matches
								//OTP
								System.out.println("\t\t\tEnter the OTP:");
								Thread.sleep(3000);
								int sys_otp=(int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								int user_otp=sc.nextInt();
								if(user_otp==sys_otp){
									//payment Success
									System.out.println("\t\t\tProcessing Payment....");
									Thread.sleep(3000);
									System.out.println("\t\t\tYipppieee Order Placed....");
									System.out.println("\t\t\tWill be delivered within 30 minutes.... :)");
									}else{
										//Payment Fail
										}
							            }
										else{
											//Bill Amount Not Match
										}
				                     	}
									     else if(payment==2)
										{
										//Phonepay
										}
										else
										{
											//Invalid Payment Selection
			 							}
		                          		}   
		 								else if(order_confirmation==2)
				                      	{
											//Display Order Cancelled
										}
										else
										{
											//Invalid Selection
										}
			                        	}//Idly
					case 2->{//Dosa
				double price=140;
				System.out.println("\t\t\tEnter the Quantity:");
				int qty=sc.nextInt();
				double bill=qty*price;
				System.out.println("\t\t\tTotal Bill:"+bill);
				System.out.println("1.Continue with Order\n2.Cancel");
				int order_confirmation=sc.nextInt();
				if (order_confirmation==1)
				{
					//continue
					System.out.println("\t\t\tRedirecting to Payment gateway...");
					Thread.sleep(3000);
					System.out.println("\t\t\tSelect the Payment Mode");
					System.out.println("\t\t\t---------------------------");
					System.out.println("\t\t\t1.Gpay");
					System.out.println("\t\t\t2.Phonepay");
					int payment=sc.nextInt();
					if (payment==1)
					{
						//Gpay
							System.out.println("\t\t\tEnter Bill Amount:");
							double user_bill_amount=sc.nextDouble();
							if(bill==user_bill_amount)
		
							{
								//Bill Amount Matches
								//OTP
								System.out.println("\t\t\tEnter the OTP:");
								Thread.sleep(3000);
								int sys_otp=(int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								int user_otp=sc.nextInt();
								if(user_otp==sys_otp){
									//payment Success
									System.out.println("\t\t\tProcessing Payment....");
									Thread.sleep(3000);
									System.out.println("\t\t\tYipppieee Order Placed....");
									System.out.println("\t\t\tWill be delivered within 30 minutes.... :)");
									}else{
										//Payment Fail
										}
							            }
										else{
											//Bill Amount Not Match
										}
				                     	}
									     else if(payment==2)
										{
										//Phonepay
										}
										else
										{
											//Invalid Payment Selection
			 							}
		                          		}   
		 								else if(order_confirmation==2)
				                      	{
											//Display Order Cancelled
										}
										else
										{
											//Invalid Selection
										}
			                        	}//Dosa
			  case 3->{//Poori
				double price=90;
				System.out.println("\t\t\tEnter the Quantity:");
				int qty=sc.nextInt();
				double bill=qty*price;
				System.out.println("\t\t\tTotal Bill:"+bill);
				System.out.println("1.Continue with Order\n2.Cancel");
				int order_confirmation=sc.nextInt();
				if (order_confirmation==1)
				{
					//continue
					System.out.println("\t\t\tRedirecting to Payment gateway...");
					Thread.sleep(3000);
					System.out.println("\t\t\tSelect the Payment Mode");
					System.out.println("\t\t\t---------------------------");
					System.out.println("\t\t\t1.Gpay");
					System.out.println("\t\t\t2.Phonepay");
					int payment=sc.nextInt();
					if (payment==1)
					{
						//Gpay
							System.out.println("\t\t\tEnter Bill Amount:");
							double user_bill_amount=sc.nextDouble();
							if(bill==user_bill_amount)
		
							{
								//Bill Amount Matches
								//OTP
								System.out.println("\t\t\tEnter the OTP:");
								Thread.sleep(3000);
								int sys_otp=(int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								int user_otp=sc.nextInt();
								if(user_otp==sys_otp){
									//payment Success
									System.out.println("\t\t\tProcessing Payment....");
									Thread.sleep(3000);
									System.out.println("\t\t\tYipppieee Order Placed....");
									System.out.println("\t\t\tWill be delivered within 30 minutes.... :)");
									}else{
										//Payment Fail
										}
							            }
										else{
											//Bill Amount Not Match
										}
				                     	}
									     else if(payment==2)
										{
										//Phonepay
										}
										else
										{
											//Invalid Payment Selection
			 							}
		                          		}   
		 								else if(order_confirmation==2)
				                      	{
											//Display Order Cancelled
										}
										else
										{
											//Invalid Selection
										}
			                        	}//Poori
										
										
			  case 4->{//Chappathi
				double price=80;
				System.out.println("\t\t\tEnter the Quantity:");
				int qty=sc.nextInt();
				double bill=qty*price;
				System.out.println("\t\t\tTotal Bill:"+bill);
				System.out.println("1.Continue with Order\n2.Cancel");
				int order_confirmation=sc.nextInt();
				if (order_confirmation==1)
				{
					//continue
					System.out.println("\t\t\tRedirecting to Payment gateway...");
					Thread.sleep(3000);
					System.out.println("\t\t\tSelect the Payment Mode");
					System.out.println("\t\t\t---------------------------");
					System.out.println("\t\t\t1.Gpay");
					System.out.println("\t\t\t2.Phonepay");
					int payment=sc.nextInt();
					if (payment==1)
					{
						//Gpay
							System.out.println("\t\t\tEnter Bill Amount:");
							double user_bill_amount=sc.nextDouble();
							if(bill==user_bill_amount)
		
							{
								//Bill Amount Matches
								//OTP
								System.out.println("\t\t\tEnter the OTP:");
								Thread.sleep(3000);
								int sys_otp=(int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								int user_otp=sc.nextInt();
								if(user_otp==sys_otp){
									//payment Success
									System.out.println("\t\t\tProcessing Payment....");
									Thread.sleep(3000);
									System.out.println("\t\t\tYipppieee Order Placed....");
									System.out.println("\t\t\tWill be delivered within 30 minutes.... :)");
									}else{
										//Payment Fail
										}
							            }
										else{
											//Bill Amount Not Match
										}
				                     	}
									     else if(payment==2)
										{
										//Phonepay
										}
										else
										{
											//Invalid Payment Selection
			 							}
		                          		}   
		 								else if(order_confirmation==2)
				                      	{
											//Display Order Cancelled
										}
										else
										{
											//Invalid Selection
										}
			                        	}//Chappathi
										
			  case 5->{//Upma
				double price=50;
				System.out.println("\t\t\tEnter the Quantity:");
				int qty=sc.nextInt();
				double bill=qty*price;
				System.out.println("\t\t\tTotal Bill:"+bill);
				System.out.println("1.Continue with Order\n2.Cancel");
				int order_confirmation=sc.nextInt();
				if (order_confirmation==1)
				{
					//continue
					System.out.println("\t\t\tRedirecting to Payment gateway...");
					Thread.sleep(3000);
					System.out.println("\t\t\tSelect the Payment Mode");
					System.out.println("\t\t\t---------------------------");
					System.out.println("\t\t\t1.Gpay");
					System.out.println("\t\t\t2.Phonepay");
					int payment=sc.nextInt();
					if (payment==1)
					{
						//Gpay
							System.out.println("\t\t\tEnter Bill Amount:");
							double user_bill_amount=sc.nextDouble();
							if(bill==user_bill_amount)
		
							{
								//Bill Amount Matches
								//OTP
								System.out.println("\t\t\tEnter the OTP:");
								Thread.sleep(3000);
								int sys_otp=(int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								int user_otp=sc.nextInt();
								if(user_otp==sys_otp){
									//payment Success
									System.out.println("\t\t\tProcessing Payment....");
									Thread.sleep(3000);
									System.out.println("\t\t\tYipppieee Order Placed....");
									System.out.println("\t\t\tWill be delivered within 30 minutes.... :)");
									}else{
										//Payment Fail
										}
							            }
										else{
											//Bill Amount Not Match
										}
				                     	}
									     else if(payment==2)
										{
										//Phonepay
										}
										else
										{
											//Invalid Payment Selection
			 							}
		                          		}   
		 								else if(order_confirmation==2)
				                      	{
											//Display Order Cancelled
										}
										else
										{
											//Invalid Selection
										}
			                        	}//Upma
										 
										 
			  case 6->{//Brinji
				double price=110;
				System.out.println("\t\t\tEnter the Quantity:");
				int qty=sc.nextInt();
				double bill=qty*price;
				System.out.println("\t\t\tTotal Bill:"+bill);
				System.out.println("1.Continue with Order\n2.Cancel");
				int order_confirmation=sc.nextInt();
				if (order_confirmation==1)
				{
					//continue
					System.out.println("\t\t\tRedirecting to Payment gateway...");
					Thread.sleep(3000);
					System.out.println("\t\t\tSelect the Payment Mode");
					System.out.println("\t\t\t---------------------------");
					System.out.println("\t\t\t1.Gpay");
					System.out.println("\t\t\t2.Phonepay");
					int payment=sc.nextInt();
					if (payment==1)
					{
						//Gpay
							System.out.println("\t\t\tEnter Bill Amount:");
							double user_bill_amount=sc.nextDouble();
							if(bill==user_bill_amount)
		
							{
								//Bill Amount Matches
								//OTP
								System.out.println("\t\t\tEnter the OTP:");
								Thread.sleep(3000);
								int sys_otp=(int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								int user_otp=sc.nextInt();
								if(user_otp==sys_otp){
									//payment Success
									System.out.println("\t\t\tProcessing Payment....");
									Thread.sleep(3000);
									System.out.println("\t\t\tYipppieee Order Placed....");
									System.out.println("\t\t\tWill be delivered within 30 minutes.... :)");
									}else{
										//Payment Fail
										}
							            }
										else{
											//Bill Amount Not Match
										}
				                     	}
									     else if(payment==2)
										{
										//Phonepay
										}
										else
										{
											//Invalid Payment Selection
			 							}
		                          		}   
		 								else if(order_confirmation==2)
				                      	{
											//Display Order Cancelled
										}
										else
										{
											//Invalid Selection
										}
			                        	}//Brinji
										
			  case 7->{//Pongal
				double price=85;
				System.out.println("\t\t\tEnter the Quantity:");
				int qty=sc.nextInt();
				double bill=qty*price;
				System.out.println("\t\t\tTotal Bill:"+bill);
				System.out.println("1.Continue with Order\n2.Cancel");
				int order_confirmation=sc.nextInt();
				if (order_confirmation==1)
				{
					//continue
					System.out.println("\t\t\tRedirecting to Payment gateway...");
					Thread.sleep(3000);
					System.out.println("\t\t\tSelect the Payment Mode");
					System.out.println("\t\t\t---------------------------");
					System.out.println("\t\t\t1.Gpay");
					System.out.println("\t\t\t2.Phonepay");
					int payment=sc.nextInt();
					if (payment==1)
					{
						//Gpay
							System.out.println("\t\t\tEnter Bill Amount:");
							double user_bill_amount=sc.nextDouble();
							if(bill==user_bill_amount)
		
							{
								//Bill Amount Matches
								//OTP
								System.out.println("\t\t\tEnter the OTP:");
								Thread.sleep(3000);
								int sys_otp=(int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								int user_otp=sc.nextInt();
								if(user_otp==sys_otp){
									//payment Success
									System.out.println("\t\t\tProcessing Payment....");
									Thread.sleep(3000);
									System.out.println("\t\t\tYipppieee Order Placed....");
									System.out.println("\t\t\tWill be delivered within 30 minutes.... :)");
									}else{
										//Payment Fail
										}
							            }
										else{
											//Bill Amount Not Match
										}
				                     	}
									     else if(payment==2)
										{
										//Phonepay
										}
										else
										{
											//Invalid Payment Selection
			 							}
		                          		}   
		 								else if(order_confirmation==2)
				                      	{
											//Display Order Cancelled
										}
										else
										{
											//Invalid Selection
										}
			                        	}//Pongal
										default->{}//Invalid A2B Food Selection
			
			}
		}//A2B
		 

               
		}
	}
}
