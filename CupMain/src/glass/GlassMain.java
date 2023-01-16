package glass;
import java.util.Scanner;
public class GlassMain {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int volumeGlassA=0,volumeGlassB=0,waterGlassA=0,waterGlassB=0;
        
        System.out.print("Set volume of glass A ==> ");
        volumeGlassA = kb.nextInt();
        System.out.print("Set volume of glass B ==> ");
        volumeGlassB = kb.nextInt();
        System.out.println("\nVolume of glass A : "+volumeGlassA+"\nVolume of glass B : "+volumeGlassB);
        
        while(1>0){
            System.out.print("\nSelect mode.\n 1.Set volume of glass\n 2.Add water\n 3.Pour water\n 4.Check status\n 0.Eec\n==> ");
            int mode = kb.nextInt();
            switch(mode){
                case 1:{
                    int a=1;
                    while(a==1){
                        System.out.print("\nSelect mode set volume of glass.\n 1.Glass A\n 2.Glass B\n 0.<-----\n==> ");
                        int modeSet = kb.nextInt();
                        switch(modeSet){
                            case 1:{
                                System.out.print("\nSet volume of glass A\n current:"+volumeGlassA+"\n new:");
                                int volumeNew = kb.nextInt();
                                while(volumeNew<0){
                                    System.out.print("\n!!! The value entered cannot be negative. !!!\nSet volume of glass A\n current:"+volumeGlassA+"\n new:");
                                    volumeNew = kb.nextInt();
                                }
                                volumeGlassA=volumeNew;
                                break;
                            }
                            case 2:{
                                System.out.print("\nSet volume of glass B\n current:"+volumeGlassB+"\n new:");
                                int volumeNew = kb.nextInt();
                                while(volumeNew<0){
                                    System.out.print("\n!!! The value entered cannot be negative. !!!\nSet volume of glass B\n current:"+volumeGlassB+"\n new:");
                                    volumeNew = kb.nextInt();
                                }
                                volumeGlassB=volumeNew;
                                break;
                            }
                            case 0:{
                                a--;
                            }
                        }
                    }
                    break;
                }
                case 2:{
                    int a=1;
                    while(a==1){
                        System.out.print("\nSelect mode add water\n1.Add water to glass A\n2.Add water to glass B\n0.<-----\n==> ");
                        int modeAddWater = kb.nextInt();
                        switch(modeAddWater){
                            case 1:{
                                int b=1,amount = 0;
                                while(b==1){
                                    System.out.print("\nAdd water to glass A max:"+waterGlassA+"/"+volumeGlassA+"\nAmount ==> ");
                                    amount = kb.nextInt();
                                    if(amount+waterGlassA<=volumeGlassA){
                                        if(amount>=0){
                                            b=0;
                                        }
                                    }
                                }
                                waterGlassA=waterGlassA+amount;
                                System.out.println("\nGlass A : "+waterGlassA+"/"+volumeGlassA);
                                System.out.println("Glass B : "+waterGlassB+"/"+volumeGlassB);
                                break;
                            }
                            case 2:{
                                int b=1,amount = 0;
                                while(b==1){
                                    System.out.print("\nAdd water to glass B max:"+waterGlassB+"/"+volumeGlassB+"\nAmount ==> ");
                                    amount = kb.nextInt();
                                    if(amount+waterGlassB<=volumeGlassB){
                                        if(amount>=0){
                                            b=0;
                                        }
                                    }
                                }
                                waterGlassB=waterGlassB+amount;
                                System.out.println("\nGlass A : "+waterGlassA+"/"+volumeGlassA);
                                System.out.println("Glass B : "+waterGlassB+"/"+volumeGlassB);
                                break;
                            }
                            case 0:{
                                a--;
                            }
                        }
                    }
                    break;
                }
                case 3:{
                    int a=1;
                    while(a==1){
                    System.out.print("\nSelect mode pour water.\n 1.pour water on the floor.\n 2.Pour water into another glass.\n 0.<-----\n==> ");
                    int modePourWater = kb.nextInt();
                    switch(modePourWater){
                        case 1:{
                            int b=1;
                            while(b==1){
                                System.out.print("\nMode pour water on the floor.\n 1.Glass A\n 2.Glass B\n 0.<-----\n==> ");
                                modePourWater = kb.nextInt();
                                switch(modePourWater){
                                    case 1:{
                                         int c=1;
                                        while(c==1){
                                            System.out.print("\nGlass A max:"+waterGlassA+"/"+volumeGlassA+"\nPour glass A:");
                                            modePourWater = kb.nextInt();
                                            if(modePourWater>=0){
                                                if(modePourWater<=waterGlassA){
                                                    c=0;
                                                }else System.out.print("\n!!! Can't pour more than the amount of water. !!!\n");
                                            }else if(modePourWater<0)
                                                System.out.print("\n!!! The value entered cannot be negative. !!!\n");
                                        }
                                       
                                        waterGlassA=waterGlassA-modePourWater;
                                        break;
                                    }
                                    case 2:{
                                        int c=1;
                                        while(c==1){
                                            System.out.print("\nGlass B max:"+waterGlassB+"/"+volumeGlassB+"\nPour glass B:");
                                            modePourWater = kb.nextInt();
                                            if(modePourWater>=0){
                                                if(modePourWater<=waterGlassB){
                                                    c=0;
                                                }else System.out.print("\n!!! Can't pour more than the amount of water. !!!\n");
                                            }else if(modePourWater<0){
                                                System.out.print("\n!!! The value entered cannot be negative. !!!\n");
                                            }
                                        }
                                       
                                        waterGlassB=waterGlassB-modePourWater;
                                        break;
                                    }
                                    case 0:{
                                        b--;
                                    }
                                }
                            }
                            
                            
                            break;
                        }
                        case 2:{
                            int b=1;
                            while(b==1){
                                System.out.print("\nSelect mode pour water into another glass\n 1.Glass A to Glass B\n 2.Glass B to Glass A\n 0.<-----\n==> ");
                                int modePourToGlass = kb.nextInt();
                                switch(modePourToGlass){
                                    case 1:{
                                        int c=1;
                                        while(c==1){
                                            int emptyVolumeGlassB=volumeGlassB-waterGlassB;
                                            System.out.print("\nGlass A to Glass B\n Glass A max:"+waterGlassA+"/"+volumeGlassA+"\n Glass B max:"+waterGlassB+"/"+volumeGlassB+" can add:"+emptyVolumeGlassB+"\n==> ");
                                            modePourToGlass = kb.nextInt();
                                            if(modePourToGlass<=waterGlassA){
                                                if(modePourToGlass<=(volumeGlassB-waterGlassB)){
                                                    if(modePourToGlass>=0){
                                                        c=0;
                                                    }else System.out.print("\n!!! The value entered cannot be negative. !!!\n");
                                                }else System.out.print("\n!!! Can't pour more than the amount of water. !!!\n");
                                            }else System.out.print("\n!!! Not enough water, can't pour water. !!!\n");
                                        }
                                        waterGlassB=waterGlassB+modePourToGlass;
                                        waterGlassA=waterGlassA-modePourToGlass;
                                        System.out.print("\nGlass A max:"+waterGlassA+"/"+volumeGlassA+"\nGlass B max:"+waterGlassB+"/"+volumeGlassB);
                                        
                                        break;
                                    }
                                    case 2:{
                                        int c=1;
                                        while(c==1){
                                            int emptyVolumeGlassA=volumeGlassA-waterGlassA;
                                            System.out.print("\nGlass B to Glass A\n Glass B max:"+waterGlassB+"/"+volumeGlassB+"\n Glass A max:"+waterGlassA+"/"+volumeGlassA+" can add:"+emptyVolumeGlassA+"\n==> ");
                                            modePourToGlass = kb.nextInt();
                                            if(modePourToGlass<=waterGlassB){
                                                if(modePourToGlass<=(volumeGlassA-waterGlassA)){
                                                    if(modePourToGlass>=0){
                                                        c=0;
                                                    }else System.out.print("\n!!! The value entered cannot be negative. !!!\n");
                                                }else System.out.print("\n!!! Can't pour more than the amount of water. !!!\n");
                                            }else System.out.print("\n!!! Not enough water, can't pour water. !!!\n");
                                        }
                                        waterGlassA=waterGlassA+modePourToGlass;
                                        waterGlassB=waterGlassB-modePourToGlass;
                                        System.out.print("\nGlass B max:"+waterGlassB+"/"+volumeGlassB+"\nGlass A max:"+waterGlassA+"/"+volumeGlassA);
                                        break;
                                    }
                                    case 0:{
                                        b=0;
                                        break;
                                    }
                                }
                            
                            }
                            break;
                        }
                        case 0:{
                            a--;
                            break;
                        }
                    }  
                    }   
                    break;
                }
                case 4:{
                    System.out.println("\nStatus\n Glass A max:"+waterGlassA+"/"+volumeGlassA+"\n Glass B max:"+waterGlassB+"/"+volumeGlassB);
                    break;
                }
                case 0:{
                    return;
                }
            }
        }
    }
}
