public class Main {

  public static void main(String[] args) {
    Blockchain blockchain = new Blockchain(4);
    blockchain.addBlock(blockchain.newBlock("Criaçao de Blockchain"));
    blockchain.addBlock(blockchain.newBlock("Trabalho de Estrutura de Dados"));
    blockchain.addBlock(blockchain.newBlock("Ethereum"));

    System.out.println("Blockchain valid ? " + blockchain.isBlockChainValid());
    System.out.println(blockchain);

  
  }
	
}