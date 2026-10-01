package com.example.decifra.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.example.decifra.*
import com.example.decifra.Navigation.Login

@Composable
fun AppNavigation(navController: NavHostController, modifier: Modifier = Modifier){
    NavHost(
        navController = navController,
        startDestination = Inicial
    ){
        composable<Inicial>{
            TelaInicial(
                onJogarClick = {
                    navController.navigate(Login)
                }
            )
        }

        composable<Login> {
            TelaLogin(
                onEntrarClick = {
                    navController.navigate(Instrucoes) // Após logar, vai para as instruções
                },
                onCriarContaClick = {
                    navController.navigate(CriarConta) // Vai para a tela de registro
                }
            )
        }

        composable<CriarConta> {
            TelaCriarConta(

            )
        }

        composable<Instrucoes> {
            TelaInstrucoes(
                onContinuarClick = {
                    navController.navigate(EscolhaTema)
                }
            )
        }

        composable<EscolherTema> {

            TelaEscolhaTema(

                onTemaSelecionado = { temaEscolhido ->

                    // Navega para a rota de Jogo passando o tema selecionado

                    navController.navigate(Jogo(tema = temaEscolhido))

                }

            )

        }

        composable<Jogo> { backStackEntry ->

            // Recupera o tema passado na rota

            val args = backStackEntry.toRoute<Jogo>()

            TelaJogo(

                tema = args.tema, // Passa o tema recuperado para a tela

                onJogoFinalizado = { palavraCerta, pontosGanhos ->

                    navController.navigate(Acerto(palavra = palavraCerta, pontos = pontosGanhos))

                }

            )

        }


        composable<Acerto> { back ->
            // Recupera os parâmetros enviados na rota (igual o professor fez com a rota ProdutoDetalhes)
            val rota = back.toRoute<Acerto>()

            TelaAcerto(
                palavra = rota.palavra,
                pontos = rota.pontos,
                onReiniciarClick = {
                    // Volta para a escolha de tema para jogar de novo
                    navController.navigate(EscolhaTema) {
                        popUpTo(EscolhaTema) { inclusive = true }
                    }
                }
            )
        }
    }
}