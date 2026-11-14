package Treinos;
public class main_Rotina_treinos {

   int escolha;
   int fullbody;
   int ABC;
   int exercicio_cardio;
   int musc;

        public int getEscolha() {
               
        if(escolha == 1){
            System.out.println("Musulação");
        } else if(escolha == 2){
            System.out.println("Aerobicos");
        }
            return escolha;
        }

        public void setEscolha(int escolha) {
            this.escolha = escolha;
        }




        public int getExercicio_cardio() {
            return exercicio_cardio;
        }

        public void setExercicio_cardio(int exercicio_cardio) {
            this.exercicio_cardio = exercicio_cardio;
        }

        public int getMusc() {
            escolha = musc;
            if(musc == 1){
                switch (fullbody) {
                    case 1:
                        System.out.println("\n[SEGUNDA-FEIRA] - Foco em Força Base & Membros Inferiores");
                        System.out.println("- Agachamento Livre: 3x de 6 a 8 reps");
                        System.out.println("- Supino Reto: 3x de 8 a 10 reps");
                        System.out.println("- Remada Curvada: 3x de 8 a 10 reps");
                        System.out.println("- Elevação Pélvica (Hip Thrust): 3x de 10 reps");
                        System.out.println("- Prancha Abdominal Isométrica: 3x de 45 seg");
                        break;
                    case 2:
                        System.out.println("\n[TERÇA-FEIRA] - Foco Unilateral & Explosão");
                        System.out.println("- Agachamento Búlgaro: 3x de 8 reps (por perna)");
                        System.out.println("- Desenvolvimento de Ombros: 3x de 10 reps");
                        System.out.println("- Puxada Alta na Polia: 3x de 10 a 12 reps");
                        System.out.println("- Stiff: 3x de 10 reps");
                        System.out.println("- Box Jumps (Saltos para Caixa): 3x de 6 reps");
                        break;
                    case 3:
                        System.out.println("\n[QUARTA-FEIRA] - Foco em Resistência (RML) & Core");
                        System.out.println("- Leg Press 45º: 3x de 12 reps");
                        System.out.println("- Supino Inclinado com Halteres: 3x de 10 a 12 reps");
                        System.out.println("- Remada Baixa: 3x de 12 reps");
                        System.out.println("- Cadeira Extensora + Flexora: 3x de 12 reps");
                        System.out.println("- Panturrilhas em Pé: 4x de 15 a 20 reps");
                        break;
                    case 4:
                        System.out.println("\n[QUINTA-FEIRA] - Foco em Potência & Articulações");
                        System.out.println("- Levantamento Terra Romeno (RDL): 3x de 8 a 10 reps");
                        System.out.println("- Flexões de Braço / Paralelas: 3x até à falha");
                        System.out.println("- Puxada com Pegada Neutra: 3x de 8 a 10 reps");
                        System.out.println("- Afundos (Lunges): 3x de 12 passos (por perna)");
                        System.out.println("- Prancha Lateral: 3x de 30 seg (por lado)");
                        break;
                    case 5:
                        System.out.println("\n[SEXTA-FEIRA] - Sessão Metabólica & Fecho de Semana");
                        System.out.println("- Goblet Squat com Halter Pesado: 3x de 12 reps");
                        System.out.println("- Desenvolvimento Arnold: 3x de 10 reps");
                        System.out.println("- Remada Serrote com Halter: 3x de 10 reps (por braço)");
                        System.out.println("- Mesa Flexora: 3x de 12 reps");
                        System.out.println("- Panturrilhas Sentado: 4x de 15 reps");
                        System.out.println("- Abdominal Infra / Remador: 3x de 12 a 15 reps");
                        System.out.println("========================================\n");
                        break;
                
                    default:
                        System.out.println("Parabéns, você terminou sua semana, agora você precisa descansar agora!");
                        break;
                }
            } else if(musc == 2){
                switch (ABC) {
                    case 1:
                       System.out.println("\n[TREINO A] - PUSH (Empurrar: Peito, Ombros e Tríceps)");
                       System.out.println("- Supino Reto com Barra: 4x de 8 a 10 reps");
                       System.out.println("- Supino Inclinado com Halteres: 3x de 10 reps");
                       System.out.println("- Desenvolvimento Militar com Halteres: 3x de 10 reps");
                       System.out.println("- Elevação Lateral: 4x de 12 a 15 reps");
                       System.out.println("- Tríceps na Polia com Corda: 3x de 12 reps");
                       break;
                    case 2:
                        System.out.println("\n[TREINO B] - PULL (Puxar: Costas, Posterior de Ombro e Bíceps)");
                        System.out.println("- Puxada Alta na Polia: 4x de 8 a 10 reps");
                        System.out.println("- Remada Curvada com Barra: 3x de 8 a 10 reps");
                        System.out.println("- Remada Baixa no Cabo: 3x de 12 reps");
                        System.out.println("- Crucifixo Inverso (Posterior de Ombro): 3x de 12 a 15 reps");
                        System.out.println("- Rosca Direta com Barra W: 3x de 10 a 12 reps");
                        break;
                    case 3:
                        System.out.println("\n[TREINO C] - LEGS (Pernas Completas e Core)");
                        System.out.println("- Agachamento Livre: 4x de 6 a 8 reps");
                        System.out.println("- Leg Press 45º: 3x de 10 a 12 reps");
                        System.out.println("- Stiff (Cadeia Posterior): 3x de 10 reps");
                        System.out.println("- Cadeira Extensora: 3x de 12 reps");
                        System.out.println("- Elevação de Panturrilhas em Pé: 4x de 15 a 20 reps");
                        System.out.println("- Prancha Abdominal: 3x de 45 seg");
                        break;
                    case 4:
                        System.out.println("\n[TREINO A] - PUSH (Empurrar: Peito, Ombros e Tríceps)");
                        System.out.println("- Supino Reto com Barra: 4x de 8 a 10 reps");
                        System.out.println("- Supino Inclinado com Halteres: 3x de 10 reps");
                        System.out.println("- Desenvolvimento Militar com Halteres: 3x de 10 reps");
                        System.out.println("- Elevação Lateral: 4x de 12 a 15 reps");
                        System.out.println("- Tríceps na Polia com Corda: 3x de 12 reps");
                        break;
                    case 5:
                        System.out.println("\n[TREINO B] - PULL (Puxar: Costas, Posterior de Ombro e Bíceps)");
                        System.out.println("- Puxada Alta na Polia: 4x de 8 a 10 reps");
                        System.out.println("- Remada Curvada com Barra: 3x de 8 a 10 reps");
                        System.out.println("- Remada Baixa no Cabo: 3x de 12 reps");
                        System.out.println("- Crucifixo Inverso (Posterior de Ombro): 3x de 12 a 15 reps");
                        System.out.println("- Rosca Direta com Barra W: 3x de 10 a 12 reps");
                        System.out.println("========================================\n");
                        break;
                
                    default:
                        break;
                }  
            }
            return musc;
        }

        public void setMusc(int musc) {
            this.musc = musc;
        }


    }

