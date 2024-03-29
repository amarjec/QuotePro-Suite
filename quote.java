import java.util.Scanner;

public class Quotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pump_price, cable_price, pipe_price, rope_price, accessories, mechanic_charge = 500, panel_price;
        double pump_type, pump_hp, pump_stage, pipe_type, pipe_size, pipe_length, cable_guage, cable_length, rope_thickness, rope_length;
        int pump_profit, cable_profit, pipe_profit, rope_profit, accessories_profit, panel_profit;

        System.out.print("HP of Submersible Pump = ");
        pump_hp = sc.nextDouble();
        System.out.print("Stage of Submersible Pump = ");
        pump_stage = sc.nextInt();
        System.out.print("Enter Length of Pipe (in ft) = ");
        pipe_length = sc.nextInt();
        System.out.print("Enter Length of Cable (in Ft) = ");
        cable_length = sc.nextInt();
        System.out.print("Enter Length of Rope (in ft) = ");
        rope_length = sc.nextInt();

        if (pump_stage <= 12) {
           pump_type = 6;
        }
        else {
            pump_type = 4;
        }

        // pump price and others price predefined
        if (pump_type == 6) { // for v6
            cable_guage = 6;
            cable_price = (int) (80/3.28); // 6mm
            cable_profit = (int) ((23/3.28) * cable_length);
            rope_thickness = 12;
            rope_price = 4.5;
            rope_profit = (int) (0.96 * rope_length);
            panel_price = 1600;
            panel_profit = 500;
            pipe_size = 2;
            if (pump_stage == 6) { // for 6 stage
                if (pump_hp == 3) { // for 3hp
                    pump_price = 16500; // 3/06
                    pump_profit = 4900;
                } else if (pump_hp == 4) { // for 4hp
                    pump_price = 17500;
                    pump_profit = 4900;
                } else { // for 5hp
                    pump_price = 18500;
                    pump_profit = 5300;
                }
            } else if (pump_stage == 8) {
                if (pump_hp == 3) { // for 3hp
                    pump_price = 17000; // 3/08
                    pump_profit = 4800;
                } else if (pump_hp == 4) { // for 4hp
                    pump_price = 18000;
                    pump_profit = 4800;
                } else { // for 5hp
                    pump_price = 19000;
                    pump_profit = 5200;
                }
            } else { // for v6 10 stage
                if (pump_hp == 3) { // for 3hp
                    pump_price = 17500;
                    pump_profit = 4700;
                } else if (pump_hp == 4) { // for 4hp
                    pump_price = 18500;
                    pump_profit = 4700;
                } else { //for 5hp
                    pump_price = 19500;
                    pump_profit = 5100;
                }
            }
        } else { // for v4 pump

            if (pump_hp == 1) {
                pump_price =8500;
                cable_guage = 4;
                cable_price = (int) (60/3.28); // 6mm
                rope_thickness = 10;
                rope_price = 3.5;
                panel_price = 900;
                pipe_size = 1;
                pump_profit = 2800;
                cable_profit = (int) ((23/3.28)*cable_length);
                rope_profit = (int) (1.01 * rope_length);
                panel_profit = 200;

            } else if (pump_hp == 1.5) {
                pump_price = 11000;
                cable_guage = 4;
                cable_price = (int) (60/3.28); // 6mm
                rope_thickness = 10;
                rope_price = 3.5;
                panel_price = 900;
                pump_profit = 4300;
                cable_profit = (int) ((23/3.28)*cable_length);
                rope_profit = (int) (1.01 * rope_length);
                panel_profit = 200;
                pipe_size = 1;
            } else if (pump_hp == 3) { // for 3hp 20 stage
                pump_price = 14500;
                cable_guage = 6;
                cable_price = (int) (80/3.28); // 6mm
                rope_thickness = 12;
                rope_price = 4.5;
                panel_price = 1600;
                pipe_size = 1.5;
                pump_profit = 3900;
                cable_profit = (int) ((23/3.28)*cable_length);
                rope_profit = (int) (0.96 * rope_length);
                panel_profit = 500;
            } else { // for 5hp 20 stage
                pump_price = 17000;
                cable_guage = 6;
                cable_price = (int)(80/3.28); // 6mm
                rope_thickness = 12;
                rope_price = 4.5;
                panel_price = 1600;
                pipe_size = 1.5;
                pump_profit = 4400;
                cable_profit = (int) ((23/3.28)*cable_length);
                rope_profit = (int) (0.96 * rope_length);
                panel_profit = 500;
            }
        }

        //pipe
        System.out.print("Pipe (for hdpe = 1 / for column = 2) = ");
        pipe_type = sc.nextInt();
        if (pipe_type == 1) { // for hdpe
            if (pump_type == 4 && pump_hp == 1 || pump_hp == 1.5) { //1"
                pipe_price = 13;
                pipe_size = 1;
                accessories = 900;
                pipe_profit = (int) (2.6 * pipe_length);
                accessories_profit = 300;
            } else if (pump_type == 4 && pump_hp == 3 || pump_hp == 5) { // 1.5"
                pipe_price = 20;
                pipe_size = 1.5;
                accessories = 1200;
                pipe_profit = (int) (2.9 * pipe_length);
                accessories_profit = 400;
            }
            else { // 2"
                pipe_price = 27;
                pipe_size = 2;
                accessories = 1400;
                pipe_profit = (int) (3.2 * pipe_length);
                accessories_profit = 400;
            }
        }
        else { // for column
            if (pump_type == 4 && pump_hp == 1 || pump_hp == 1.5) { // 1"
                pipe_price = 30;
                pipe_size = 1;
                accessories = 1200;
                pipe_profit = (int) (6 * pipe_length);
                accessories_profit = 300;
            } else if (pump_type == 4 && pump_hp == 3 || pump_hp == 5) { // 1.5"
                pipe_price = 45;
                pipe_size = 1.5;
                accessories = 1500;
                pipe_profit = (int) (8 * pipe_length);
                accessories_profit = 400;
            }
            else { // 2"
                pipe_price = 65;
                pipe_size = 2;
                accessories = 1700;
                pipe_profit = (int) (16 * pipe_length);
                accessories_profit = 400;
            }
        }

        int total_profit = pump_profit + pipe_profit + cable_profit + rope_profit + accessories_profit + panel_profit;

        System.out.println();
        System.out.println();
        System.out.println("     " + "QUOTATION No. - " + total_profit/10 + "     ");
        System.out.println((int)pump_hp + "HP " + (int)pump_stage + "Stage Pump = " + (int)pump_price);
        if (pipe_type == 1) {
            System.out.println((int)pipe_length + "Ft Hdpe Pipe = " + (int) (pipe_price * pipe_length) );
        }else {
            System.out.println((int)pipe_length + "Ft Coloumn Pipe = " + (int) (pipe_price * pipe_length) );
        }
        System.out.println(cable_guage + "mm " + (int)cable_length + "Ft Cable = " + (int) (cable_price * cable_length));
        System.out.println((int)rope_thickness + "mm " + (int)rope_length + "Ft Rope = " + (int) (rope_price * rope_length));
        System.out.println("Pump Accessories = " + (int)accessories);
        System.out.println("Panel for Pump = " + (int)panel_price);
        System.out.println("Mechanic Charge = " + (int)mechanic_charge);
        System.out.println();
        System.out.println("Total Bill  = " + ((int)(pump_price + (int) (pipe_price * pipe_length) + (int) (cable_price * cable_length) + (int) (rope_price * rope_length) + accessories + panel_price + mechanic_charge)));
        System.out.println();
        System.out.println("Regards, Agrawal Machinery");
    }
}
