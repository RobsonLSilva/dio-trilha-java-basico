import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Banco banco = new Banco();
        Cliente cliente = new Cliente();
        List<Conta> contas = new ArrayList<>();
        int aux = 0;

        banco.setNome("DioBank");

        System.out.println("==============================================================");
        System.out.printf("=============== SEJA BEM VINDO(ª) AO %s =================\n", banco.getNome());
        System.out.println("==============================================================\n");
        System.out.println(
                """
                *** MENU ***
                ============
                1 - Conta
                2 - Deposito
                3 - Saque
                4 - Tranferência
                0 - sair
                """
        );
        System.out.println("Escolha a opção desejada: ");
        int escolha = Integer.parseInt(reader.readLine());

        if (escolha == 1 || escolha == 2 || escolha == 3 || escolha == 4 || escolha == 0) {
            while (escolha != 0) {
                switch (escolha) {
                    case 1: {
                        System.out.println("""
                                ****** CONTAS ******
                                1 - ABRIR CONTA
                                0 - VOLTAR MENU""");
                        System.out.println("Escolha a opção desejada: ");
                        int opcao = Integer.parseInt(reader.readLine());

                        if (opcao == 1) {
                            System.out.println("\nDigite o nome do titular da conta:");
                            cliente.setNome(reader.readLine());

                            System.out.println("Digite o Saldo da conta:");
                            double saldo = Double.parseDouble(reader.readLine());

                            System.out.println("""
                                    Qual o tipo de conta o cliente deseja?
                                    0 - Conta Poupança
                                    1 - Conta Corrente""");
                            int tipoConta = Integer.parseInt(reader.readLine());

                            switch (tipoConta) {
                                case 0:
                                    contas.add(new ContaPoupanca(cliente, saldo));
                                    aux++;
                                    break;
                                case 1:
                                    contas.add(new ContaCorrente(cliente, saldo));
                                    aux++;
                                    break;
                            }
                            System.out.printf("\nConta criada!\nNumero da conta = %d\n", contas.get(aux--).getNumero());
                        } else if (opcao == 0) {
                            escolha = 5;
                        } else {
                            System.out.println("OPÇÃO INVALIDA");
                        }
                        continue;
                    }
                    case 2: {
                        if (!contas.isEmpty()) {
                            System.out.println("""
                                    ****** DEPOSITO ******
                                    1 - DEPOSITAR
                                    0 - VOLTAR MENU""");
                            System.out.println("Escolha a opção desejada: ");
                            int opcao = Integer.parseInt(reader.readLine());
                            if (opcao == 1) {
                                System.out.println("Digite o numero da conta:");
                                int numConta = Integer.parseInt(reader.readLine());
                                numConta--;

                                System.out.println("Digite o valor do deposito:");
                                double saldo = Double.parseDouble(reader.readLine());

                                contas.get(numConta).depositar(saldo);

                                System.out.printf("\nDeposito realizado com sucesso!\nSaldo atual: %.2f\n", contas.get(numConta).getSaldo());
                                escolha = 2;

                            }else if (opcao == 0) {
                                escolha = 5;
                            } else {
                                System.out.println("OPÇÃO INVALIDA");
                            }
                        } else {
                            System.out.println("\nNão existe nenhuma conta cadastrada, imposivel Fazer depositos.\n");
                            escolha = 5;
                        }
                        continue;
                    }
                    case 3: {

                    }
                    case 4: {

                    }
                    case 5: {
                        System.out.println(
                                """
                                ***** MENU *****
                                ================
                                1 - Abrir Conta
                                2 - Deposito
                                3 - Saque
                                4 - Tranferência
                                0 - sair
                                """
                        );
                        System.out.println("Escolha a opção desejada: ");
                        escolha = Integer.parseInt(reader.readLine());
                        break;
                    }


                    //conta.depositar(100);
                    //cc.transferir(cp,100);


                    //contas.add(cc);
                    //contas.add(cp);
                    //banco.setContas(contas);

                    //cc.imprimirExtrato();
                    //cp.imprimirExtrato();

                    //System.out.println(banco);

                }

            }

        }
        System.out.println("\n\n" + aux);
        reader.close();
    }
}