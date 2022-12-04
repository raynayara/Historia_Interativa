import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner escolhas = new Scanner(System.in);

        System.out.println("EPISÓDIO 01\n");
        System.out.println("A busca para encontrar o grande vencedor do troféu masterchef amadores 2022, \n"+
                "está chegando na reta final. A disputa está acirrada entre os dois participantes,\ntheus e Maia. "+
                "que disputarão o troféu masterchef durante 4 provas de fogo.\n");

        person participante1 = new person();
        participante1.nome = "Theus";
        participante1.idade = "22 anos";
        participante1.cidade = "São Paulo";
        participante1.pts = 0;

        person participante2 = new person();
        participante2.nome = "Maia";
        participante2.idade = "20 anos";
        participante2.cidade = "Recife/PE";
        participante2.pts = 0;


        System.out.println("Apresentação dos participantes!");
        System.out.println("- "+participante1.nome+", "+participante1.idade+", "+participante1.cidade+".");
        System.out.println("- "+participante2.nome+", "+participante2.idade+", "+participante2.cidade+".\n");

        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Regras e Instruções:\n");
        System.out.println("-Será apresentado cada prova com suas instruções e com multi-escolhas, onde,\n" +
                "cada participante terá sua vez de jogada, podendo escolher apenas 1 opção por vez.\n");
        System.out.println("-Teremos um placar contendo a pontuação de cada participante,\n" +
                "onde o mesmo será atualizado ao decorrer das partidas.");
        System.out.println("----------------------------------------------------------------------------------");

        //inicio das provas
        System.out.println("Primeira prova (5pts) --> Para ganhar os 5 pts, é preciso que o participante\nacerte todos os ingrdientes presentes na receita original.\n");
        System.out.println("Petit Gâteau\n");
        System.out.println("Opção 1:");
        System.out.println("• 250g Manteiga sem sal;\n• 300g Chocolate 50% cacau;\n• 170g Açucar refinado;\n• 100g Farinha de trigo;\n• 5 ovos.\n");

        System.out.println("Opção 2:");
        System.out.println("• 200g Manteiga sem sal;\n• 200g chocolate 50% cacau;\n• 170g Açucar mascavo;\n• 100g farinha de trigo;\n• 3 ovos;\n• leite.\n");

        //condição para escolha das opções para o primeiro candidato
        System.out.println(participante1.nome+" Qual a sua resposta? opção 1 ou opção 2 ?");
        int escolha1 = escolhas.nextInt();

        if (escolha1 == 1){
            System.out.println("Parabéns "+participante1.nome+", você acertou a receita correta e ganhou 5 pontos. Aguarde a próxima fase!\n");
            participante1.pts = participante1.pts + 5;
        }
        else{
            System.out.println("Poxa, sinto muito. Mas a resposta correta seria a opção 1! Espero que consiga pontuar na próxima fase.\n");
        }

        //condição de escolha para o 2 candidato
        System.out.println(participante2.nome+" Qual a sua resposta? opção 1 ou opção 2 ?");
        int escolha2 = escolhas.nextInt();

        if (escolha2 == 1){
            System.out.println("Parabéns "+participante2.nome+", você acertou a receita correta e ganhou 5 pontos. Aguarde a próxima fase!\n");
            participante2.pts = participante2.pts + 5;
        }
        else {
            System.out.println("Poxa, sinto muito. Mas a resposta correta seria a opção 1! Espero que consiga pontuar na próxima fase.\n");
        }

        System.out.println("----------------------------------------------------------------------------------");

        System.out.println("Primeira prova encerrada. E a resposta correta seria a 1° opção:\n" +
                "• 250g Manteiga sem sal;\n• 300g Chocolate 50% cacau;\n• 170g Açucar refinado;\n• 100g Farinha de trigo;\n• 5 gemas de ovos.\n");
        System.out.println("segue placar com as seguintes pontuações:\n");
        System.out.println( participante1.nome+" = "+participante1.pts);
        System.out.println( participante2.nome+" = "+participante2.pts);
        System.out.println("----------------------------------------------------------------------------------");


        //2 prova com com novas opções
        System.out.println("Segunda prova (10 pts) --> Para ganahr os 10 pts, é preciso que o participante\nacerte todos os ingrdientes presentes na receita da massa.\n");
        System.out.println("Clássico francês bolo ópera");
        System.out.println("Opção 1:");
        System.out.println("• 70g de manteiga sem sal;\n• 340g de farinha de amêndoas;\n• 340g de açucar impalpável;\n• 90g de farinha de trigo;\n• 8 ovos;\n" +
                "• 9 claras;\n• 50g de açucar.\n");

        System.out.println("Opção 2:");
        System.out.println("• 70g de manteiga sem sal;\n• 200g de farinha de amêndoas;\n• 340g de açucar mascavo;\n• 150g de farinha de trigo;\n• 5 ovos;\n" +
                "• 8 claras;\n•60g de açucar.\n");

        //condição de escolha para o primeiro participante
        System.out.println(participante1.nome+" Qual a sua resposta? opção 1 ou opção 2 ?");
        int escolha3 = escolhas.nextInt();

        if (escolha3 == 1){
            System.out.println("Parabéns "+participante1.nome+", você acertou a receita correta e ganhou 10 pontos. Aguarde a próxima fase!\n");
            participante1.pts = participante1.pts + 10;
        }
        else {
            System.out.println("Poxa, sinto muito. Mas a resposta correta seria a opção 1! Espero que consiga pontuar na próxima fase.\n");

        }

        //condição de escolha para o segundo participante
        System.out.println(participante2.nome+" Qual a sua resposta? opção 1 ou opção 2 ?");
        int escolha4 = escolhas.nextInt();

        if (escolha4 == 1){
            System.out.println("Parabéns "+participante2.nome+", você acertou a receita correta e ganhou 10 pontos. Aguarde a próxima fase!\n");
            participante2.pts = participante2.pts + 10;
        }
        else {
            System.out.println("Poxa, sinto muito. Mas a resposta correta seria a opção 1! Espero que consiga pontuar na próxima fase.\n");

        }

        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Segunda prova encerrada. E a resposta correta seria a 1° opção:\n• 70g de manteiga sem sal;\n" +
                "• 200g de farinha de amêndoas;\n• 340g de açucar mascavo;\n• 150g de farinha de trigo;\n• 5 ovos;\n"+
                "• 8 claras;\n• 60g de açucar.\n");

        System.out.println("segue placar com as seguintes pontuações:\n");
        System.out.println( participante1.nome+" = "+participante1.pts);
        System.out.println( participante2.nome+" = "+participante2.pts+"\n");
        System.out.println("----------------------------------------------------------------------------------");


        //3 prova
        System.out.println("Terceira prova (15 pts) --> Nessa terceira fase, cada cozinheiro deve escolher uma opção,\nque monte corretamente a receita em questão.\n");
        System.out.println("Panna Cotta\n");
        System.out.println("Opção 1:");
        System.out.println("• 300ml creme de leite;\n• 200ml leite;\n• 90g açucar;\n• 5g gelatina;\n• 1 fava de baunilha;\n• 150ml leite condensado;\n• 50g de manteiga.\n");

        System.out.println("Opção 2:");
        System.out.println("• 500ml creme de leite;\n• 200ml leite;\n• 90g açucar;\n• 5g gelatina;\n• 1 fava de baunilha;\n");

        //condição de escolha para o 1 participante
        System.out.println(participante1.nome+" Qual a sua resposta? opção 1 ou opção 2 ?");
        int escolha5 = escolhas.nextInt();

        if (escolha5 == 2){
            System.out.println("Parabéns "+participante1.nome+", você acertou a receita correta e ganhou 15 pontos. Aguarde a próxima fase!\n");
            participante1.pts = participante1.pts + 15;
        }
        else {
            System.out.println("Poxa, sinto muito. Mas a resposta correta seria a opção 1! Espero que consiga pontuar na próxima fase.\n");
        }

        //condição de escolha para o segundo participante
        System.out.println(participante2.nome+" Qual a sua resposta? opção 1 ou opção 2 ?");
        int escolha6 = escolhas.nextInt();

        if (escolha6 == 2){
            System.out.println("Parabéns "+participante2.nome+", você acertou a receita correta e ganhou 15 pontos. Aguarde a próxima fase!\n");
            participante2.pts = participante2.pts + 15;
        }
        else {
            System.out.println("Poxa, sinto muito. Mas a resposta correta seria a opção 1! Espero que consiga pontuar na próxima fase.\n");
        }

        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Terceira prova encerrada. E a resposta correta seria a 2° opção:\n• 500ml creme de leite;\n• 200ml leite;\n" +
                "• 90g açucar;\n• 5g gelatina;\n• 1 fava de baunilha;\n");

        System.out.println("segue placar com as seguintes pontuações:\n");
        System.out.println( participante1.nome+" = "+participante1.pts);
        System.out.println( participante2.nome+" = "+participante2.pts+"\n");
        System.out.println("----------------------------------------------------------------------------------");

        //4 prova
        System.out.println("A quarta prova será divida em 5 perguntas classicas e que todo cozinheiro deve saber. cada pergunta valerá 5pts.\n" +
                "você deve digitar o número correspondente de cada alternativa.\n");
        //pergunta 1
        System.out.println("O QUE SIGNIFICA FLAMBAR?");
        System.out.println("• Usar azeite para fritar alimentos (1)\n• Colocar uma bebida alcoólica em uma concha de metal" +
                " e aquecê-la e depois despejar chamas sobre os ingredientes, até o fogo apagar.(2)\n• Passa farinha de trigo nos alimentos antes de fritar. (3)\n");

        System.out.println(participante1.nome+" Qual a sua resposta? opção 1, opção 2 ou opção 3 ?");
        int escolha7 = escolhas.nextInt();

        if (escolha7 == 2){
            System.out.println("Parabéns "+participante1.nome+", você respondeu corretamente. E somou 5 pts ao seu placar!\n");
            participante1.pts = participante1.pts + 5;
        }
        else{
            System.out.println("Poxa, sinto muito. Mas a resposta correta seria a opção 2! Espero que consiga acertar a próxima pergunta.\n");
        }

        //escolha do participante 2
        System.out.println(participante2.nome+" Qual a sua resposta? opção 1, opção 2 ou opção 3 ?");
        int opção7 = escolhas.nextInt();

        if (opção7 == 2){
            System.out.println("Parabéns "+participante2.nome+", você respondeu corretamente. E somou 5 pts ao seu placar!\n");
            participante2.pts = participante2.pts + 5;
        }
        else{
            System.out.println("Poxa, sinto muito. Mas a resposta correta seria a opção 2! Espero que consiga acertar a próxima pergunta.\n");
        }


        //pergunta 2
        System.out.println("O QUE SIGNIFICA BRANQUEAR?");
        System.out.println("• Mergulhar o alimento em água fervendo e depois resfriá-lo para parar o cozimento.(1)\n" +
                "• Misturar molho branco na carne.(2)\n• Passar o frango no ovo e depois na farinha.(3)\n");

        System.out.println(participante1.nome+" Qual a sua resposta? opção 1, opção 2 ou opção 3 ?");
        int escolha8 = escolhas.nextInt();

        if (escolha8 == 1){
            System.out.println("Parabéns "+participante1.nome+", você respondeu corretamente. E somou 5 pts ao seu placar!\n");
            participante1.pts = participante1.pts + 5;
        }
        else{
            System.out.println("Poxa, sinto muito. Mas a resposta correta seria a opção 1! Espero que consiga acertar a próxima pergunta.\n");
        }

        //escolha do participante 2
        System.out.println(participante2.nome+" Qual a sua resposta? opção 1, opção 2 ou opção 3 ?");
        int opção8 = escolhas.nextInt();

        if (opção8 == 1){
            System.out.println("Parabéns "+participante2.nome+", você respondeu corretamente. E somou 5 pts ao seu placar!\n");
            participante2.pts = participante2.pts + 5;
        }
        else{
            System.out.println("Poxa, sinto muito. Mas a resposta correta seria a opção 2! Espero que consiga acertar a próxima pergunta.\n");
        }


        //pergunta 3
        System.out.println("O QUE SIGNIFICA CORTAR OS VEGETAIS EM JULIENNE?");
        System.out.println("• Em cubos.(1)\n• Em rodelas.(2)\n• em fatias finas.(3)\n");

        System.out.println(participante1.nome+" Qual a sua resposta? opção 1, opção 2 ou opção 3 ?");
        int escolha9 = escolhas.nextInt();

        if (escolha9 == 3){
            System.out.println("Parabéns "+participante1.nome+", você respondeu corretamente. E somou 5 pts ao seu placar!\n");
            participante1.pts = participante1.pts + 5;
        }
        else{
            System.out.println("Poxa, sinto muito. Mas a resposta correta seria a opção 1! Espero que consiga acertar a próxima pergunta.\n");
        }

        //escolha do participante 2
        System.out.println(participante2.nome+" Qual a sua resposta? opção 1, opção 2 ou opção 3 ?");
        int opção9 = escolhas.nextInt();

        if (opção9 == 3){
            System.out.println("Parabéns "+participante2.nome+", você respondeu corretamente. E somou 5 pts ao seu placar!\n");
            participante2.pts = participante2.pts + 5;
        }
        else{
            System.out.println("Poxa, sinto muito. Mas a resposta correta seria a opção 2! Espero que consiga acertar a próxima pergunta.\n");
        }


        //pergunta 4
        System.out.println("SE A RECEITA PEDE PARA 'CLARIFICAR' UM CALDO, O QUE VOCÊ FAZ?");
        System.out.println("• Espera a água secar.(1)\n• Remove a espuma que se forma na superfície do caldo.(2)\n• Adiciona mais água.(3)");

        System.out.println(participante1.nome+" Qual a sua resposta? opção 1, opção 2 ou opção 3 ?");
        int escolha10 = escolhas.nextInt();

        if (escolha10 == 2){
            System.out.println("Parabéns "+participante1.nome+", você respondeu corretamente. E somou 5 pts ao seu placar!\n");
            participante1.pts = participante1.pts + 5;
        }
        else{
            System.out.println("Poxa, sinto muito. Mas a resposta correta seria a opção 1! Espero que consiga acertar a próxima pergunta.\n");
        }

        //escolha do participante 2
        System.out.println(participante2.nome+" Qual a sua resposta? opção 1, opção 2 ou opção 3 ?");
        int opção10 = escolhas.nextInt();

        if (opção10 == 2){
            System.out.println("Parabéns "+participante2.nome+", você respondeu corretamente. E somou 5 pts ao seu placar!\n");
            participante2.pts = participante2.pts + 5;
        }
        else{
            System.out.println("Poxa, sinto muito. Mas a resposta correta seria a opção 2! Espero que consiga acertar a próxima pergunta.\n");
        }


        //pergunta 5
        System.out.println("O QUE SIGNIFICA GRATINAR UM PRATO");
        System.out.println("• Temperar a comida com ervas.(1)\n• Levar o prato ao forno e deixar tostar.(2)\n• Salpicar queijo ralado em cima.(3)\n");

        System.out.println(participante1.nome+" Qual a sua resposta? opção 1, opção 2 ou opção 3 ?");
        int escolha11 = escolhas.nextInt();

        if (escolha11 == 2){
            System.out.println("Parabéns "+participante1.nome+", você respondeu corretamente. E somou 5 pts ao seu placar!\n");
            participante1.pts = participante1.pts + 5;
        }
        else{
            System.out.println("Poxa, sinto muito. Mas a resposta correta seria a opção 1! Espero que consiga acertar a próxima pergunta.\n");
        }

        //escolha do participante 2

        System.out.println(participante2.nome+" Qual a sua resposta? opção 1, opção 2 ou opção 3 ?");
        int opção11 = escolhas.nextInt();

        if (opção11 == 2){
            System.out.println("Parabéns "+participante2.nome+", você respondeu corretamente. E somou 5 pts ao seu placar!\n");
            participante2.pts = participante2.pts + 5;
        }
        else{
            System.out.println("Poxa, sinto muito. Mas a resposta correta seria a opção 2! Espero que consiga acertar a próxima pergunta.\n");
        }

        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("segue placar com as seguintes pontuações:\n");
        System.out.println( participante1.nome+" = "+participante1.pts);
        System.out.println( participante2.nome+" = "+participante2.pts+"\n");
        System.out.println("----------------------------------------------------------------------------------");


        //Resultado final
        System.out.println("Chegamos ao final do Episódio 01 da temporada 2022 masterchef amadores. Iremos calcular todos os pontos\n" +
                "obtidos por cada participante. e vamos descobrir quem será o grande vencedor dessa temporada!\n");

        if (participante1.pts > participante2.pts){
            System.out.println("O grande vencedor dessa temporada foi "+participante1.nome);
            System.out.println(participante1.nome+" obteve um total de "+participante1.pts+" pontos.\n");
        }
        if(participante2.pts > participante1.pts){
            System.out.println("O grande vencedor dessa temporada foi "+participante2.nome);
            System.out.println(participante2.nome+" obteve um total de "+participante2.pts+" pontos.\n");
        }

        if (participante1.pts == participante2.pts){
            System.out.println("Para a grande surpresa de todos, tivemos um empate entre "+participante1.nome+" e "+participante2.nome+
                    "\ne para desempatar iremos realizar um prova final valendo 30 pts.\n");
            System.out.println("PROVA FINAL (30 pts)\n");
            System.out.println("O QUE SIGNIFICA BESUNTAR UM PRATO?");
            System.out.println("• Pincelar um alimento com algum tipo de gordura.(1)\n• Jogar queijo ralado na comida depois de grelhar.(2)\n" +
                    "• Enrolar o alimento com papel alumínio.(3)\n");

            System.out.println(participante1.nome+" Qual a sua resposta? opção 1, opção 2 ou opção 3 ?");
            int escolha12 = escolhas.nextInt();

            if (escolha12 == 1){
                System.out.println("Parabéns "+participante1.nome+", você respondeu corretamente. E somou 30 pts ao seu placar!\n");
                participante1.pts = participante1.pts + 30;
            }
            else{
                System.out.println("Poxa, sinto muito. Mas a resposta correta seria a opção 1! Espero que consiga acertar a próxima pergunta.\n");
            }

            //escolha do participante2
            System.out.println(participante2.nome+" Qual a sua resposta? opção 1, opção 2 ou opção 3 ?");
            int opção12 = escolhas.nextInt();

            if (opção12 == 1){
                System.out.println("Parabéns "+participante2.nome+", você respondeu corretamente. E somou 30 pts ao seu placar!\n");
                participante2.pts = participante2.pts + 30;
            }
            else{
                System.out.println("Poxa, sinto muito. Mas a resposta correta seria a opção 1! Espero que consiga acertar a próxima pergunta.\n");
            }

        }
        if (participante1.pts > participante2.pts){
            System.out.println("O grande vencedor dessa temporada foi "+participante1.nome);
            System.out.println(participante1.nome+" obteve um total de "+participante1.pts+" pontos.\n");
        }


    }
}