// 30 - 03 - 2018
package test;

public class MainClass {
    
    static Splash loading = new Splash();
    static Home welcome = new Home();
    
    public static void main(String[] args) {
        
        loading.setVisible(true);
        
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(50);// just break between - running numbers
                loading.updateNumberes.setText( Integer.toString(i) + "%");
                loading.updateProgressBar.setValue(i);
                
                // For Desplaying another Frame OR Window
                if( i == 100 ){
                    Thread.sleep(1000);
                    loading.setVisible(false);
                    welcome.setVisible(true);
                    Thread.sleep(2000);
                    i = 0 ;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
