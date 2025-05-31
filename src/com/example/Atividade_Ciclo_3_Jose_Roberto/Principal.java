package com.example.Atividade_Ciclo_3_Jose_Roberto;
import  javax.swing.JOptionPane;

public class Principal {

	public static void main(String[]args) {
		Pessoa individuo = new Pessoa();
		int x,y;
		String resp1,resp2;
		
		individuo.nome = JOptionPane.showInputDialog("Digite seu nome: ");
		resp1 = JOptionPane.showInputDialog("Digite seu peso em kg: ");
		individuo.peso = Double.parseDouble(resp1);
		resp2= JOptionPane.showInputDialog("Digite seu altura em metros: ");
		individuo.altura = Double.parseDouble(resp2);
		individuo.imc = individuo.peso/(individuo.altura*individuo.altura);
		if(individuo.imc<17)
		{
			JOptionPane.showMessageDialog(null,"Situação"+ individuo.nome +"Muito abaixo do peso - " + individuo.imc +"kg/m^2");
		}
		else {
			if(individuo.imc>=17 && individuo.imc<18.49) {
				JOptionPane.showMessageDialog(null,"Situação"+ individuo.nome +"Abaixo do peso - " + individuo.imc +"kg/m^2");
			}
			else {
				if(individuo.imc>=18.5 && individuo.imc<24.99)
				{
					JOptionPane.showMessageDialog(null,"Situação"+ individuo.nome +"Peso normal - " + individuo.imc +"kg/m^2");
				}
				else {
					if(individuo.imc>=25 && individuo.imc<29.99) {
						JOptionPane.showMessageDialog(null,"Situação"+ individuo.nome +"Acima do peso - " + individuo.imc +"kg/m^2");
					}
					else {
						if(individuo.imc>=30 && individuo.imc<34.99) {
							JOptionPane.showMessageDialog(null,"Situação"+ individuo.nome +"Obesidade I - " + individuo.imc +"kg/m^2");
						}
						else {
							if(individuo.imc>=35 && individuo.imc<39.99) {
								JOptionPane.showMessageDialog(null,"Situação"+ individuo.nome +"Obesidade II (severa)- " + individuo.imc +"kg/m^2");
							}
							else {
								JOptionPane.showMessageDialog(null,"Situação"+ individuo.nome +"Obesidade III (mórbida)- " + individuo.imc +"kg/m^2");
							}
						}
					}
				}
			}
		}
		
		
	}
}
