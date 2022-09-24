# AppRick_and_Morty
Aplicação desenvolvida por: Beatriz Pereira Campos e Felipe Cipriano de Andrade Ferreira.

O tema do nosso projeto foi especificamente sobre a série “Rick and Morty”, onde trabalhamos com o intuito de desenvolver uma aplicação diretamente focada em atrair os grandes espectadores da série, procurando levar informações e trazer diversas funcionalidades, exclusividades e entretenimento ao usuário, já que estamos falando de uma série em desenho animado. 
Por mais que a aplicação possua bastante funcionalidades, nós buscamos trazer facilidade de entendimento de uso do aplicativo ao usuário, introduzindo diversas imagens e caixas de texto entre as activities. Logo na inicialização da aplicação contamos com uma tela de Splash, a qual possuí um sensor de movimento durante sua execução, sendo ele o acelerômetro (o sensor acelerômetro é ativado quando o dispositivo retorna os valores captados, e caso ele seja maior que 25, ele executará a função que foi atribuída), o qual mudará de intent após o usuário “agitar” o dispositivo. A tela home é executada logo após o funcionamento da tela de splash, e nela são contidas diversas seções, como:
- Personagens: é atribuído uma activity para cada um dos principais personagens da série (ao todo contamos com 5 activities), descrevendo características e outras informações relevantes a ele.
- Temporadas: é atribuído uma activity para cada temporada (sendo 6 no total), onde são exibidos resumos e trailer sobre a respectiva temporada da série, contento também um button em cada uma delas, o qual possuí o método de intent implícita, direcionando o usuário para um site na web, onde ele poderá assistir a temporada completa.
Todas as activities possuem um button no canto superior da tela, direcionando o usuário ao menu, onde ele tem acesso à algumas outras activity que apresentam o uso da intente implícita e permissão dentre sua execução, sendo elas as activities de:
- Contato: nela o usuário pode enviar um e-mail de sugestão e crítica sobre a aplicação. Ela apresenta uma tela de inserção de dados. Entretanto, ao apertar em enviar o usuário será direcionado para algum app de e-mail presente no dispositivo dele.
- Localização: nela é necessário que o usuário permita que seja localizado o dispositivo atual. Após isso o usuário pode acessar a tela de localização, a qual apresenta um button, que ao apertá-lo será diretamente direcionado para algum aplicativo que use um mapa no dispositivo, ficando a critério de escolha do usuário seu local de execução.
