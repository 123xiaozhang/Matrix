import Calculator.Matrix;
import RandomGen.Genner;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        Matrix maxi = Genner.matrixGenner(EasyerScan.nextInt());
        maxi.showMatrix();
        EasyerScan.nextInt();
        System.out.println(maxi.getdet());
    }
}