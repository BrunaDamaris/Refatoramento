# Refatoramento
- Como Executar(Original): Foi necessário inicializar um novo projeto na IDE e então adicionar o arquivo "Project" ao novo projeto como "Project3".
- Como Executar(Refatorado): O Projeto foi dividido em classes de acordo com sua funcionalidade. É executável pela IDE.
- Padrão 1: Command
	- Motivação: Permite parametrizar, enfileirar ou fazer registro de solicitações, encapsulando uma solicitação como um objeto.
	- Solução: Foi utilizado em algumas classes para executar ações que antes estavam sendo acessadas por meio de switch cases, resolvendo problemas como Long Methods e melhorando o entendimento de partes do código. Em casos como o acesso a formas de menus de escolhas no código onde para cada solicitação escolhida seria necessária utilização de if else ou switch case, ao usar o Command foi possivel encapsular essas solicitações e evitar tais problemas.
- Padrão 2: Strategy
	- Motivação: Fornecem uma maneira de configurar uma classe com um dentre muitos comportamentos. Também simplifica casos de lógica condicional no código.
	- Solução: Para métodos onde já se tinham uma prévia informação de que tipo de objeto iria ser tratado referente a ação escolhida pelo usuário, foi utilizado Strategy já que o comportamento da ação iria variar dependendo desse tipo proposto. Foi utilizado em Long Methods para o caso apresentado e melhorou a maneira que o código faz essas variações de comportamento para devido tipo, permitindo a eliminação de switch cases para cada tipo e comportamento. Facilitou também a organização e manutenção do código.
- Padrão 3: Iterator
	- Motivação: Permite acesso sequencial aos elementos de um objeto agregado sem expor sua estrutura interna.
	- Solução: Utilizado em diversos métodos para melhor iteração em lista, suportando vários percursos e mantendo controle.
- Classes e Métodos Afetados:
    - Command: 
      Project3:
      - Foram retirados switch cases na main para o menu de escolhas.
       Food:
      - Retirados switch cases do construtor e do método order.
       Hotel:
      - Retirados switch cases de alguns métodos que tinham menus de escolhas, ou seja, métodos CustDetails, bookroom e availability.
      - Classes adicionadas: MainCommand, MainInvoker, AvailableCommand, BookroomCommand, DeallocateCommand, FeaturesCommand, OrderCommand, FoodCommand, FoodInvoker, CokeCommand, PastaCommand, SandwichCommand, NoodlesCommand, RoomsCommand, RoomsInvoker, DoubleLCommand, DoubleDCommand,SingleLCommand, SingleDCommand.
    - Strategy:
      Hotel:
      - Utilizado nos métodos que já se tinha o tipo a ser tratado, ao seja, no método deallocate para tratar de diferentes comportamentos de acordo com o tipo do quarto desejado e bills para tratar como seria calculada para cada tipo de quarto.
      - Classes adicionadas: RoomsStrategy, RoomsType.
    - Iterator:
      Rooms:
      - Método getRoom utiliza Iterator.
      - Classes adicionadas: RoomsIterator, IteratorArrayRooms.
    - Observações: Foi substituida a Data Class holder por um ArrayList numa classe principal. Foram substituidas as Lazy Class Singleroom e Doubleroom por somente uma classe Rooms, já que as mesmas eram semelhantes e não cumpriam seus devidos papeis ao máximo. Alguns métodos foram mudados de classes já que suas implementações tinham mais ligação com outra classe.
- Funcionalidades Afetadas:
	- Algumas exceções foram adicionadas ao código.
