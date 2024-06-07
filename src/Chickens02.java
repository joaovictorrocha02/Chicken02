public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here

       int qntdOvosSeg, qntdOvosTer, qntdOvosQua; //Quantidade de ovos durante os dias
       double dailyAverage, monthlyProfit, monthlyAverage; 
       //Total de média diária, lucro mensal e média mensal de ovos
    
     //Segunda Feira  
     qntdOvosSeg = 100;
     //Terça Feira
     qntdOvosTer = 121;
     //Quarta Feira
     qntdOvosQua = 117;
    
    
    dailyAverage = (qntdOvosSeg + qntdOvosTer + qntdOvosQua) / 3.0;
    //Média diária de ovos 
    
     monthlyAverage = dailyAverage * 30;
     //Média do lucro mensal de ovos
    
    monthlyProfit = monthlyAverage * 0.18;
    //Lucro mensal
    
    
    
        System.out.println("Daily Average :  " +dailyAverage);
        System.out.println("monthly Average : " +monthlyAverage);
        System.out.println("monthly Profit :  $" +monthlyProfit);
    
    

    }   
}
