package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    //atributo
    private Set<Contato> contatoSet;

    public AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Ema", 123456);
        agendaContatos.adicionarContato("Ema", 0);
        agendaContatos.adicionarContato("Ema Buonamici", 111111);
        agendaContatos.adicionarContato("Ema Castro", 789101);
        agendaContatos.adicionarContato("Maria josé", 111111);


        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Vanessa"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Maria josé", 222222));

        agendaContatos.exibirContato();
    }
}
