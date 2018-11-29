import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BordSpel {
	Speler speler = new Speler();	
	
	static int [] a = {1,2,3,4,5,6};
	static int [] b = {1,2,3,4,5,6};
	static int [] c = {1,2,3,4,5,6};
	static int [] d = {1,2,3,4,5,6};
	static int [] e = {1,2,3,4,5,6};
	static int [] f = {1,2,3,4,5,6};
	static int [] g = {1,2,3,4,5,6};
	
	
	static void PrintArray() {
		
//		DE ARRAY WORDT GEPRINT
		
//		System.out.println("");
//		System.out.println((a[5])+" "+(b[5])+" "+(c[5])+" "+(d[5])+" "+(e[5])+" "+(f[5])+" "+(g[5]));
//		System.out.println((a[4])+" "+(b[4])+" "+(c[4])+" "+(d[4])+" "+(e[4])+" "+(f[4])+" "+(g[4]));
//		System.out.println((a[3])+" "+(b[3])+" "+(c[3])+" "+(d[3])+" "+(e[3])+" "+(f[3])+" "+(g[3]));
//		System.out.println((a[2])+" "+(b[2])+" "+(c[2])+" "+(d[2])+" "+(e[2])+" "+(f[2])+" "+(g[2]));
//		System.out.println((a[1])+" "+(b[1])+" "+(c[1])+" "+(d[1])+" "+(e[1])+" "+(f[1])+" "+(g[1]));
//		System.out.println((a[0])+" "+(b[0])+" "+(c[0])+" "+(d[0])+" "+(e[0])+" "+(f[0])+" "+(g[0]));
//		System.out.println("");
	}
	
	public static void main(String[] args) {
		
		getBeurt();
		PrintArray();
		Welkom();
		BeurtGeelEnRood();
		CheckVierOpEenRij();
		
	}

		static void Welkom() {
			System.out.println("Welkom bij Vier op een rij");
			System.out.println("Wat is je naam?");
			Scanner scan = new Scanner(System.in);
			String naam = scan.nextLine();
			System.out.println("Welkom " + naam);
		}
		
		 static void CheckVierOpEenRij() {
			
//			CHECK OP HORIZONTALE LIJNEN
			if (true) {
			if (((a[0] == a[1] && a[1] == a[2] && a[2] == a[3]) 
					
					|| (a[1] == a[2] && a[2] == a[3] && a[3] == a[4])) 
						||((a[2] == a[3] && a[3] == a[4] && a[4] == a[5]))) 
										
				if (((b[0] == b[1] && b[1] == b[2] && b[2] == b[3]) 
						|| (b[1] == b[2] && b[2] == b[3] && b[3] == b[4])) 
							||((b[2] == b[3] && b[3] == b[4] && b[4] == b[5]))) 
								
					if (((c[0] == c[1] && c[1] == c[2] && c[2] == c[3]) 
							|| (c[1] == c[2] && c[2] == c[3] && c[3] == c[4])) 
								||((c[2] == c[3] && c[3] == c[4] && c[4] == c[5]))) 
						
						if (((d[0] == d[1] && d[1] == d[2] && d[2] == d[3]) 
								|| (d[1] == d[2] && d[2] == d[3] && d[3] == d[4])) 
									||((d[2] == d[3] && d[3] == d[4] && d[4] == d[5]))) 
						
							if (((e[0] == e[1] && e[1] == e[2] && e[2] == e[3]) 
									|| (e[1] == e[2] && e[2] == e[3] && e[3] == e[4])) 
										||((e[2] == e[3] && e[3] == e[4] && e[4] == e[5]))) 
							
								if (((f[0] == f[1] && f[1] == f[2] && f[2] == f[3]) 
										|| (f[1] == f[2] && f[2] == f[3] && f[3] == f[4])) 
											||((f[2] == f[3] && f[3] == f[4] && f[4] == f[5]))) 
							
									if (((g[0] == g[1] && g[1] == g[2] && g[2] == g[3]) 
											|| (g[1] == g[2] && g[2] == g[3] && g[3] == g[4])) 
												||((g[2] == g[3] && g[3] == g[4] && g[4] == g[5])))
			
													System.out.println("Vier op een rij");
											}	
			
//						CHECK OP VERTICALE LIJNEN
					
						if ((a[0] == b[0] && b[0] == c[0] && c[0] == d[0]) 
								|| (b[0] == c[0] && c[0] == d[0] && d[0] == e[0]) 
									|| (c[0] == d[0] && d[0] == e[0] && e[0] == f[0]) 
									    ||(d[0] == e[0] && e[0] == f[0] && f[0] == g[0])) 
											
							if ((a[1] == b[1] && b[1] == c[1] && c[1] == d[1]) 
									|| (b[1] == c[1] && c[1] == d[1] && d[1] == e[1]) 
										|| (c[1] == d[1] && d[1] == e[1] && e[1] == f[1]) 
											||(d[1] == e[1] && e[1] == f[1] && f[1] == g[1])) 
												
								if ((a[2] == b[2] && b[2] == c[2] && c[2] == d[2]) 
										|| (b[2] == c[2] && c[2] == d[2] && d[2] == e[2]) 
											|| (c[2] == d[2] && d[2] == e[2] && e[2] == f[2]) 
												||(d[2] == e[2] && e[2] == f[2] && f[2] == g[2])) 

									if ((a[3] == b[3] && b[3] == c[3] && c[3] == d[3]) 
											|| (b[3] == c[3] && c[3] == d[3] && d[3] == e[3]) 
												|| (c[3] == d[3] && d[3] == e[3] && e[3] == f[3]) 
													||(d[3] == e[3] && e[3] == f[3] && f[3] == g[3])) 

										if ((a[4] == b[4] && b[4] == c[4] && c[4] == d[4]) 
												|| (b[4] == c[4] && c[4] == d[4] && d[4] == e[4]) 
													|| (c[4] == d[4] && d[4] == e[4] && e[4] == f[4]) 
														||(d[4] == e[4] && e[4] == f[4] && f[4] == g[4])) 
															
											if ((a[5] == b[5] && b[5] == c[5] && c[5] == d[5]) 
													|| (b[5] == c[5] && c[5] == d[5] && d[5] == e[5]) 
														|| (c[5] == d[5] && d[5] == e[5] && e[5] == f[5]) 
															||(d[5] == e[5] && e[5] == f[5] && f[5] == g[5])) {
																System.out.println("Vier op een rij");
																
											}					
										}
		 static void getBeurt(){
		        int r = (int) (Math.random());
		        String name = new String [] {"Rood", "Geel"}[r];
		        
		        System.out.println(name);
		 }
		 
		  static void BeurtGeelEnRood() {
				
			 while(true) {
					
					System.out.println("");
					System.out.println("   A "+ "  B "+"  C  "+" D "+"  E "+"  F "+"  G ");
					System.out.println(" -----------------------------");
					System.out.println(" | "+(a[5])+" | "+(b[5])+" | "+(c[5])+" | "+(d[5])+" | "+(e[5])+" | "+(f[5])+" | "+(g[5])+" |");
					System.out.println(" | "+(a[4])+" | "+(b[4])+" | "+(c[4])+" | "+(d[4])+" | "+(e[4])+" | "+(f[4])+" | "+(g[4])+" |");
					System.out.println(" | "+(a[3])+" | "+(b[3])+" | "+(c[3])+" | "+(d[3])+" | "+(e[3])+" | "+(f[3])+" | "+(g[3])+" |");
					System.out.println(" | "+(a[2])+" | "+(b[2])+" | "+(c[2])+" | "+(d[2])+" | "+(e[2])+" | "+(f[2])+" | "+(g[2])+" |");
					System.out.println(" | "+(a[1])+" | "+(b[1])+" | "+(c[1])+" | "+(d[1])+" | "+(e[1])+" | "+(f[1])+" | "+(g[1])+" |");
					System.out.println(" | "+(a[0])+" | "+(b[0])+" | "+(c[0])+" | "+(d[0])+" | "+(e[0])+" | "+(f[0])+" | "+(g[0])+" |");
					System.out.println(" -----------------------------");
				
					System.out.println("Kan Rood aangeven in welke kolom hij zijn steen wilt gooien");
					Scanner scan = new Scanner(System.in);
						String keuzeRood = scan.next();
					
						System.out.println("Kan Geel aangeven in welke kolom hij zijn steen wilt gooien");
							String keuzeGeel = scan.next();
							
							
							
					
//					KEUZE VAN ROOD
					
					if (keuzeRood.equalsIgnoreCase("A")) {
						if (a[0] > 0) {
							a[0] = -1;
						}else if (a[1] > 0) {
							a[1] = -1;
						}else if (a[2] > 0) {
							a[2] = -1;
						}else if (a[3] > 0) {
							a[3] = -1;
						}else if (a[4] > 0) {
							a[4] = -1;
						}else if (a[5] > 0) {
							a[5] = -1;
						
							
						if (keuzeRood.equalsIgnoreCase("B")) {
							if (b[0] > 0) {
								b[0] = -1;
							}else if (b[1] > 0) {
								b[1] = -1;
							}else if (b[2] > 0) {
								b[2] = -1;
							}else if (b[3] > 0) {
								b[3] = -1;
							}else if (b[4] > 0) {
								b[4] = -1;
							}else if (b[5] > 0) {
								b[5] = -1;
							}
						
							if (keuzeRood.equalsIgnoreCase("C")) {
								if (c[0] > 0) {
									c[0] = -1;
								}else if (c[1] > 0) {
									c[1] = -1;
								}else if (c[2] > 0) {
									c[2] = -1;
								}else if (c[3] > 0) {
									c[3] = -1;
								}else if (c[4] > 0) {
									c[4] = -1;
								}else if (c[5] > 0) {
									c[5] = -1;
								}
								
								if (keuzeRood.equalsIgnoreCase("D")) {
									if (d[0] > 0) {
										d[0] = -1;
									}else if (d[1] > 0) {
										d[1] = -1;
									}else if (d[2] > 0) {
										d[2] = -1;
									}else if (d[3] > 0) {
										d[3] = -1;
									}else if (d[4] > 0) {
										d[4] = -1;
									}else if (d[5] > 0) {
										d[5] = -1;
									}
							
									if (keuzeRood.equalsIgnoreCase("E")) {
										if (e[0] > 0) {
											e[0] = -1;
										}else if (e[1] > 0) {
											e[1] = -1;
										}else if (e[2] > 0) {
											e[2] = -1;
										}else if (e[3] > 0) {
											e[3] = -1;
										}else if (e[4] > 0) {
											e[4] = -1;
										}else if (e[5] > 0) {
											e[5] = -1;
										}
									
										if (keuzeRood.equalsIgnoreCase("F")) {
											if (f[0] > 0) {
												f[0] = -1;
											}else if (f[1] > 0) {
												f[1] = -1;
											}else if (f[2] > 0) {
												f[2] = -1;
											}else if (f[3] > 0) {
												f[3] = -1;
											}else if (f[4] > 0) {
												f[4] = -1;
											}else if (f[5] > 0) {
												f[5] = -1;
											}
											
											if (keuzeRood.equalsIgnoreCase("G")) {
												if (g[0] > 0) {
													g[0] = -1;
												}else if (g[1] > 0) {
													g[1] = -1;
												}else if (g[2] > 0) {
													g[2] = -1;
												}else if (g[3] > 0) {
													g[3] = -1;
												}else if (g[4] > 0) {
													g[4] = -1;
												}else if (g[5] > 0) {
													g[5] = -1;
												}
										
							
//												KEUZE VAN GEEL
												
												if (keuzeGeel.equalsIgnoreCase("A")) {
													if (a[0] > 0) {
														a[0] = -2;
													}else if (a[1] > 0) {
														a[1] = -2;
													}else if (a[2] > 0) {
														a[2] = -2;
													}else if (a[3] > 0) {
														a[3] = -2;
													}else if (a[4] > 0) {
														a[4] = -2;
													}else if (a[5] > 0) {
														a[5] = -2;
													}
														
													if (keuzeGeel.equalsIgnoreCase("B")) {
														if (b[0] > 0) {
															b[0] = -2;
														}else if (b[1] > 0) {
															b[1] = -2;
														}else if (b[2] > 0) {
															b[2] = -2;
														}else if (b[3] > 0) {
															b[3] = -2;
														}else if (b[4] > 0) {
															b[4] = -2;
														}else if (b[5] > 0) {
															b[5] = -2;
														}
													
														if (keuzeGeel.equalsIgnoreCase("C")) {
															if (c[0] > 0) {
																c[0] = -2;
															}else if (c[1] > 0) {
																c[1] = -2;
															}else if (c[2] > 0) {
																c[2] = -2;
															}else if (c[3] > 0) {
																c[3] = -2;
															}else if (c[4] > 0) {
																c[4] = -2;
															}else if (c[5] > 0) {
																c[5] = -2;
															}
															
															if (keuzeGeel.equalsIgnoreCase("D")) {
																if (d[0] > 0) {
																	d[0] = -2;
																}else if (d[1] > 0) {
																	d[1] = -2;
																}else if (d[2] > 0) {
																	d[2] = -2;
																}else if (d[3] > 0) {
																	d[3] = -2;
																}else if (d[4] > 0) {
																	d[4] = -2;
																}else if (d[5] > 0) {
																	d[5] = -2;
																}
														
																if (keuzeGeel.equalsIgnoreCase("E")) {
																	if (e[0] > 0) {
																		e[0] = -2;
																	}else if (e[1] > 0) {
																		e[1] = -2;
																	}else if (e[2] > 0) {
																		e[2] = -2;
																	}else if (e[3] > 0) {
																		e[3] = -2;
																	}else if (e[4] > 0) {
																		e[4] = -2;
																	}else if (e[5] > 0) {
																		e[5] = -2;
																	}
																
																	if (keuzeGeel.equalsIgnoreCase("F")) {
																		if (f[0] > 0) {
																			f[0] = -2;
																		}else if (f[1] > 0) {
																			f[1] = -2;
																		}else if (f[2] > 0) {
																			f[2] = -2;
																		}else if (f[3] > 0) {
																			f[3] = -2;
																		}else if (f[4] > 0) {
																			f[4] = -2;
																		}else if (f[5] > 0) {
																			f[5] = -2;
																		}
																		
																		if (keuzeGeel.equalsIgnoreCase("G")) {
																			if (g[0] > 0) {
																				g[0] = -2;
																			}else if (g[1] > 0) {
																				g[1] = -2;
																			}else if (g[2] > 0) {
																				g[2] = -2;
																			}else if (g[3] > 0) {
																				g[3] = -2;
																			}else if (g[4] > 0) {
																				g[4] = -2;
																			}else if (g[5] > 0) {
																				g[5] = -2;
																			}
								
							
																		
																			}
																		}	
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
		  		}
		  	}
		}
	
														
			

