package com.RenanMartins.apirestfulv1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.RenanMartins.apirestfulv1.model.Genero;
import com.RenanMartins.apirestfulv1.model.Filme;
import com.RenanMartins.apirestfulv1.model.Cliente;
import com.RenanMartins.apirestfulv1.repository.GeneroRepository;
import com.RenanMartins.apirestfulv1.repository.FilmeRepository;
import com.RenanMartins.apirestfulv1.repository.ClienteRepository;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootApplication
public class Apirestfulv1Application implements CommandLineRunner {

	@Autowired
	private ClienteRepository usuarioRepository;

	@Autowired
	private FilmeRepository produtoRepository;

	@Autowired
	private GeneroRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(Apirestfulv1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Cliente usuario = new Cliente("admin", "desweb");
		usuarioRepository.save(usuario);

		Genero fruta = new Genero("Fruta", "frutas");
		categoriaRepository.save(fruta);

		Genero legume = new Genero("Legume", "legumes");
		categoriaRepository.save(legume);

		Genero verdura = new Genero("Verdura", "verduras");
		categoriaRepository.save(verdura);

		Filme produto = new Filme(
				"abacate.png",
				"Abacate",
				"abacate",
				"1 unidade aprox. 750g",
				true,
				100,
				BigDecimal.valueOf(2.45),
				LocalDate.of(2023, 4, 26),
				fruta);
		produtoRepository.save(produto);

		produto = new Filme(
				"abobrinha.png",
				"Abobrinha",
				"abobrinha",
				"1 unidade aprox. 250g",
				false,
				500,
				BigDecimal.valueOf(1.1),
				LocalDate.of(2023, 5, 22),
				legume);
		produtoRepository.save(produto);

		produto = new Filme(
				"abobora.png",
				"Abóbora",
				"abobora",
				"1 unidade aprox. 1,9kg",
				true,
				400,
				BigDecimal.valueOf(4.7),
				LocalDate.of(2023, 3, 24),
				legume);
		produtoRepository.save(produto);

		produto = new Filme(
				"acelga.png",
				"Acelga",
				"acelga",
				"1 maço de aprox. 400g",
				true,
				120,
				BigDecimal.valueOf(4.99),
				LocalDate.of(2023, 3, 12),
				verdura);
		produtoRepository.save(produto);

		produto = new Filme(
				"agriao.png",
				"Agrião",
				"agriao",
				"1 maço de aprox. 200g",
				true,
				340,
				BigDecimal.valueOf(2.5),
				LocalDate.of(2023, 5, 17),
				verdura);
		produtoRepository.save(produto);

		produto = new Filme(
				"alface.png",
				"Alface",
				"alface",
				"1 maço de aprox. 200g",
				true,
				220,
				BigDecimal.valueOf(4.99),
				LocalDate.of(2023, 5, 14),
				verdura);
		produtoRepository.save(produto);

		produto = new Filme(
				"banana.png",
				"Banana",
				"banana",
				"1 unidade aprox. 165g",
				true,
				350,
				BigDecimal.valueOf(1.05),
				LocalDate.of(2023, 2, 22),
				fruta);
		produtoRepository.save(produto);

		produto = new Filme(
				"beringela.png",
				"Beringela",
				"beringela",
				"1 unidade aprox. 370g",
				true,
				720,
				BigDecimal.valueOf(1.85),
				LocalDate.of(2023, 2, 23),
				legume);
		produtoRepository.save(produto);

		produto = new Filme(
				"brocolis.png",
				"Brócolis",
				"brocolis",
				"1 unidade aprox. 300g",
				true,
				600,
				BigDecimal.valueOf(5.39),
				LocalDate.of(2023, 3, 28),
				verdura);
		produtoRepository.save(produto);

		produto = new Filme(
				"cebola.png",
				"Cebola",
				"cebola",
				"1 unidade aprox. 200g",
				true,
				95,
				BigDecimal.valueOf(0.56),
				LocalDate.of(2023, 4, 30),
				legume);
		produtoRepository.save(produto);

		produto = new Filme(
				"cenoura.png",
				"Cenoura",
				"cenoura",
				"1 unidade aprox. 180g",
				true,
				350,
				BigDecimal.valueOf(1.01),
				LocalDate.of(2023, 5, 29),
				legume);
		produtoRepository.save(produto);

		produto = new Filme(
				"cereja.png",
				"Cereja",
				"cereja",
				"1 unidade aprox. 250g",
				true,
				240,
				BigDecimal.valueOf(11.23),
				LocalDate.of(2023, 5, 11),
				fruta);
		produtoRepository.save(produto);

		produto = new Filme(
				"abacate.png",
				"Abacate",
				"abacate",
				"1 unidade aprox. 750g",
				true,
				100,
				BigDecimal.valueOf(2.45),
				LocalDate.of(2023, 4, 26),
				fruta);
		produtoRepository.save(produto);

		produto = new Filme(
				"abobrinha.png",
				"Abobrinha",
				"abobrinha",
				"1 unidade aprox. 250g",
				false,
				500,
				BigDecimal.valueOf(1.1),
				LocalDate.of(2023, 5, 22),
				legume);
		produtoRepository.save(produto);

		produto = new Filme(
				"abobora.png",
				"Abóbora",
				"abobora",
				"1 unidade aprox. 1,9kg",
				true,
				400,
				BigDecimal.valueOf(4.7),
				LocalDate.of(2023, 3, 24),
				legume);
		produtoRepository.save(produto);

		produto = new Filme(
				"acelga.png",
				"Acelga",
				"acelga",
				"1 maço de aprox. 400g",
				true,
				120,
				BigDecimal.valueOf(4.99),
				LocalDate.of(2023, 3, 12),
				verdura);
		produtoRepository.save(produto);

		produto = new Filme(
				"agriao.png",
				"Agrião",
				"agriao",
				"1 maço de aprox. 200g",
				true,
				340,
				BigDecimal.valueOf(2.5),
				LocalDate.of(2023, 5, 17),
				verdura);
		produtoRepository.save(produto);

		produto = new Filme(
				"alface.png",
				"Alface",
				"alface",
				"1 maço de aprox. 200g",
				true,
				220,
				BigDecimal.valueOf(4.99),
				LocalDate.of(2023, 5, 14),
				verdura);
		produtoRepository.save(produto);

		produto = new Filme(
				"banana.png",
				"Banana",
				"banana",
				"1 unidade aprox. 165g",
				true,
				350,
				BigDecimal.valueOf(1.05),
				LocalDate.of(2023, 2, 22),
				fruta);
		produtoRepository.save(produto);

		produto = new Filme(
				"beringela.png",
				"Beringela",
				"beringela",
				"1 unidade aprox. 370g",
				true,
				720,
				BigDecimal.valueOf(1.85),
				LocalDate.of(2023, 2, 23),
				legume);
		produtoRepository.save(produto);

		produto = new Filme(
				"brocolis.png",
				"Brócolis",
				"brocolis",
				"1 unidade aprox. 300g",
				true,
				600,
				BigDecimal.valueOf(5.39),
				LocalDate.of(2023, 3, 28),
				verdura);
		produtoRepository.save(produto);

		produto = new Filme(
				"cebola.png",
				"Cebola",
				"cebola",
				"1 unidade aprox. 200g",
				true,
				95,
				BigDecimal.valueOf(0.56),
				LocalDate.of(2023, 4, 30),
				legume);
		produtoRepository.save(produto);

		produto = new Filme(
				"cenoura.png",
				"Cenoura",
				"cenoura",
				"1 unidade aprox. 180g",
				true,
				350,
				BigDecimal.valueOf(1.01),
				LocalDate.of(2023, 5, 29),
				legume);
		produtoRepository.save(produto);

		produto = new Filme(
				"cereja.png",
				"Cereja",
				"cereja",
				"1 unidade aprox. 250g",
				true,
				240,
				BigDecimal.valueOf(11.23),
				LocalDate.of(2023, 5, 11),
				fruta);
		produtoRepository.save(produto);

		produto = new Filme(
				"abacate.png",
				"Abacate",
				"abacate",
				"1 unidade aprox. 750g",
				true,
				100,
				BigDecimal.valueOf(2.45),
				LocalDate.of(2023, 4, 26),
				fruta);
		produtoRepository.save(produto);

		produto = new Filme(
				"abobrinha.png",
				"Abobrinha",
				"abobrinha",
				"1 unidade aprox. 250g",
				false,
				500,
				BigDecimal.valueOf(1.1),
				LocalDate.of(2023, 5, 22),
				legume);
		produtoRepository.save(produto);

		produto = new Filme(
				"abobora.png",
				"Abóbora",
				"abobora",
				"1 unidade aprox. 1,9kg",
				true,
				400,
				BigDecimal.valueOf(4.7),
				LocalDate.of(2023, 3, 24),
				legume);
		produtoRepository.save(produto);

		produto = new Filme(
				"acelga.png",
				"Acelga",
				"acelga",
				"1 maço de aprox. 400g",
				true,
				120,
				BigDecimal.valueOf(4.99),
				LocalDate.of(2023, 3, 12),
				verdura);
		produtoRepository.save(produto);

		produto = new Filme(
				"agriao.png",
				"Agrião",
				"agriao",
				"1 maço de aprox. 200g",
				true,
				340,
				BigDecimal.valueOf(2.5),
				LocalDate.of(2023, 5, 17),
				verdura);
		produtoRepository.save(produto);

		produto = new Filme(
				"alface.png",
				"Alface",
				"alface",
				"1 maço de aprox. 200g",
				true,
				220,
				BigDecimal.valueOf(4.99),
				LocalDate.of(2023, 5, 14),
				verdura);
		produtoRepository.save(produto);

		produto = new Filme(
				"banana.png",
				"Banana",
				"banana",
				"1 unidade aprox. 165g",
				true,
				350,
				BigDecimal.valueOf(1.05),
				LocalDate.of(2023, 2, 22),
				fruta);
		produtoRepository.save(produto);

		produto = new Filme(
				"beringela.png",
				"Beringela",
				"beringela",
				"1 unidade aprox. 370g",
				true,
				720,
				BigDecimal.valueOf(1.85),
				LocalDate.of(2023, 2, 23),
				legume);
		produtoRepository.save(produto);

		produto = new Filme(
				"brocolis.png",
				"Brócolis",
				"brocolis",
				"1 unidade aprox. 300g",
				true,
				600,
				BigDecimal.valueOf(5.39),
				LocalDate.of(2023, 3, 28),
				verdura);
		produtoRepository.save(produto);

		produto = new Filme(
				"cebola.png",
				"Cebola",
				"cebola",
				"1 unidade aprox. 200g",
				true,
				95,
				BigDecimal.valueOf(0.56),
				LocalDate.of(2023, 4, 30),
				legume);
		produtoRepository.save(produto);

		produto = new Filme(
				"cenoura.png",
				"Cenoura",
				"cenoura",
				"1 unidade aprox. 180g",
				true,
				350,
				BigDecimal.valueOf(1.01),
				LocalDate.of(2023, 5, 29),
				legume);
		produtoRepository.save(produto);

		produto = new Filme(
				"cereja.png",
				"Cereja",
				"cereja",
				"1 unidade aprox. 250g",
				true,
				240,
				BigDecimal.valueOf(11.23),
				LocalDate.of(2023, 5, 11),
				fruta);
		produtoRepository.save(produto);

		produto = new Filme(
				"abacate.png",
				"Abacate",
				"abacate",
				"1 unidade aprox. 750g",
				true,
				100,
				BigDecimal.valueOf(2.45),
				LocalDate.of(2023, 4, 26),
				fruta);
		produtoRepository.save(produto);

		produto = new Filme(
				"abobrinha.png",
				"Abobrinha",
				"abobrinha",
				"1 unidade aprox. 250g",
				false,
				500,
				BigDecimal.valueOf(1.1),
				LocalDate.of(2023, 5, 22),
				legume);
		produtoRepository.save(produto);

		produto = new Filme(
				"abobora.png",
				"Abóbora",
				"abobora",
				"1 unidade aprox. 1,9kg",
				true,
				400,
				BigDecimal.valueOf(4.7),
				LocalDate.of(2023, 3, 24),
				legume);
		produtoRepository.save(produto);

		produto = new Filme(
				"acelga.png",
				"Acelga",
				"acelga",
				"1 maço de aprox. 400g",
				true,
				120,
				BigDecimal.valueOf(4.99),
				LocalDate.of(2023, 3, 12),
				verdura);
		produtoRepository.save(produto);

		produto = new Filme(
				"agriao.png",
				"Agrião",
				"agriao",
				"1 maço de aprox. 200g",
				true,
				340,
				BigDecimal.valueOf(2.5),
				LocalDate.of(2023, 5, 17),
				verdura);
		produtoRepository.save(produto);

		produto = new Filme(
				"alface.png",
				"Alface",
				"alface",
				"1 maço de aprox. 200g",
				true,
				220,
				BigDecimal.valueOf(4.99),
				LocalDate.of(2023, 5, 14),
				verdura);
		produtoRepository.save(produto);

		produto = new Filme(
				"banana.png",
				"Banana",
				"banana",
				"1 unidade aprox. 165g",
				true,
				350,
				BigDecimal.valueOf(1.05),
				LocalDate.of(2023, 2, 22),
				fruta);
		produtoRepository.save(produto);

		produto = new Filme(
				"beringela.png",
				"Beringela",
				"beringela",
				"1 unidade aprox. 370g",
				true,
				720,
				BigDecimal.valueOf(1.85),
				LocalDate.of(2023, 2, 23),
				legume);
		produtoRepository.save(produto);

		produto = new Filme(
				"brocolis.png",
				"Brócolis",
				"brocolis",
				"1 unidade aprox. 300g",
				true,
				600,
				BigDecimal.valueOf(5.39),
				LocalDate.of(2023, 3, 28),
				verdura);
		produtoRepository.save(produto);

		produto = new Filme(
				"cebola.png",
				"Cebola",
				"cebola",
				"1 unidade aprox. 200g",
				true,
				95,
				BigDecimal.valueOf(0.56),
				LocalDate.of(2023, 4, 30),
				legume);
		produtoRepository.save(produto);

		produto = new Filme(
				"cenoura.png",
				"Cenoura",
				"cenoura",
				"1 unidade aprox. 180g",
				true,
				350,
				BigDecimal.valueOf(1.01),
				LocalDate.of(2023, 5, 29),
				legume);
		produtoRepository.save(produto);

		produto = new Filme(
				"cereja.png",
				"Cereja",
				"cereja",
				"1 unidade aprox. 250g",
				true,
				240,
				BigDecimal.valueOf(11.23),
				LocalDate.of(2023, 5, 11),
				fruta);
		produtoRepository.save(produto);

		produto = new Filme(
				"abacate.png",
				"Abacate",
				"abacate",
				"1 unidade aprox. 750g",
				true,
				100,
				BigDecimal.valueOf(2.45),
				LocalDate.of(2023, 4, 26),
				fruta);
		produtoRepository.save(produto);

		produto = new Filme(
				"abobrinha.png",
				"Abobrinha",
				"abobrinha",
				"1 unidade aprox. 250g",
				false,
				500,
				BigDecimal.valueOf(1.1),
				LocalDate.of(2023, 5, 22),
				legume);
		produtoRepository.save(produto);

		produto = new Filme(
				"abobora.png",
				"Abóbora",
				"abobora",
				"1 unidade aprox. 1,9kg",
				true,
				400,
				BigDecimal.valueOf(4.7),
				LocalDate.of(2023, 3, 24),
				legume);
		produtoRepository.save(produto);

		produto = new Filme(
				"acelga.png",
				"Acelga",
				"acelga",
				"1 maço de aprox. 400g",
				true,
				120,
				BigDecimal.valueOf(4.99),
				LocalDate.of(2023, 3, 12),
				verdura);
		produtoRepository.save(produto);

		produto = new Filme(
				"agriao.png",
				"Agrião",
				"agriao",
				"1 maço de aprox. 200g",
				true,
				340,
				BigDecimal.valueOf(2.5),
				LocalDate.of(2023, 5, 17),
				verdura);
		produtoRepository.save(produto);

		produto = new Filme(
				"alface.png",
				"Alface",
				"alface",
				"1 maço de aprox. 200g",
				true,
				220,
				BigDecimal.valueOf(4.99),
				LocalDate.of(2023, 5, 14),
				verdura);
		produtoRepository.save(produto);

		produto = new Filme(
				"banana.png",
				"Banana",
				"banana",
				"1 unidade aprox. 165g",
				true,
				350,
				BigDecimal.valueOf(1.05),
				LocalDate.of(2023, 2, 22),
				fruta);
		produtoRepository.save(produto);

		produto = new Filme(
				"beringela.png",
				"Beringela",
				"beringela",
				"1 unidade aprox. 370g",
				true,
				720,
				BigDecimal.valueOf(1.85),
				LocalDate.of(2023, 2, 23),
				legume);
		produtoRepository.save(produto);

		produto = new Filme(
				"brocolis.png",
				"Brócolis",
				"brocolis",
				"1 unidade aprox. 300g",
				true,
				600,
				BigDecimal.valueOf(5.39),
				LocalDate.of(2023, 3, 28),
				verdura);
		produtoRepository.save(produto);

		produto = new Filme(
				"cebola.png",
				"Cebola",
				"cebola",
				"1 unidade aprox. 200g",
				true,
				95,
				BigDecimal.valueOf(0.56),
				LocalDate.of(2023, 4, 30),
				legume);
		produtoRepository.save(produto);

		produto = new Filme(
				"cenoura.png",
				"Cenoura",
				"cenoura",
				"1 unidade aprox. 180g",
				true,
				350,
				BigDecimal.valueOf(1.01),
				LocalDate.of(2023, 5, 29),
				legume);
		produtoRepository.save(produto);

		produto = new Filme(
				"cereja.png",
				"Cereja",
				"cereja",
				"1 unidade aprox. 250g",
				true,
				240,
				BigDecimal.valueOf(11.23),
				LocalDate.of(2023, 5, 11),
				fruta);
		produtoRepository.save(produto);

		produto = new Filme(
				"abacate.png",
				"Abacate",
				"abacate",
				"1 unidade aprox. 750g",
				true,
				100,
				BigDecimal.valueOf(2.45),
				LocalDate.of(2023, 4, 26),
				fruta);
		produtoRepository.save(produto);

		produto = new Filme(
				"abobrinha.png",
				"Abobrinha",
				"abobrinha",
				"1 unidade aprox. 250g",
				false,
				500,
				BigDecimal.valueOf(1.1),
				LocalDate.of(2023, 5, 22),
				legume);
		produtoRepository.save(produto);

		produto = new Filme(
				"abobora.png",
				"Abóbora",
				"abobora",
				"1 unidade aprox. 1,9kg",
				true,
				400,
				BigDecimal.valueOf(4.7),
				LocalDate.of(2023, 3, 24),
				legume);
		produtoRepository.save(produto);

		produto = new Filme(
				"acelga.png",
				"Acelga",
				"acelga",
				"1 maço de aprox. 400g",
				true,
				120,
				BigDecimal.valueOf(4.99),
				LocalDate.of(2023, 3, 12),
				verdura);
		produtoRepository.save(produto);

		produto = new Filme(
				"agriao.png",
				"Agrião",
				"agriao",
				"1 maço de aprox. 200g",
				true,
				340,
				BigDecimal.valueOf(2.5),
				LocalDate.of(2023, 5, 17),
				verdura);
		produtoRepository.save(produto);

		produto = new Filme(
				"alface.png",
				"Alface",
				"alface",
				"1 maço de aprox. 200g",
				true,
				220,
				BigDecimal.valueOf(4.99),
				LocalDate.of(2023, 5, 14),
				verdura);
		produtoRepository.save(produto);

		produto = new Filme(
				"banana.png",
				"Banana",
				"banana",
				"1 unidade aprox. 165g",
				true,
				350,
				BigDecimal.valueOf(1.05),
				LocalDate.of(2023, 2, 22),
				fruta);
		produtoRepository.save(produto);

		produto = new Filme(
				"beringela.png",
				"Beringela",
				"beringela",
				"1 unidade aprox. 370g",
				true,
				720,
				BigDecimal.valueOf(1.85),
				LocalDate.of(2023, 2, 23),
				legume);
		produtoRepository.save(produto);

		produto = new Filme(
				"brocolis.png",
				"Brócolis",
				"brocolis",
				"1 unidade aprox. 300g",
				true,
				600,
				BigDecimal.valueOf(5.39),
				LocalDate.of(2023, 3, 28),
				verdura);
		produtoRepository.save(produto);

		produto = new Filme(
				"cebola.png",
				"Cebola",
				"cebola",
				"1 unidade aprox. 200g",
				true,
				95,
				BigDecimal.valueOf(0.56),
				LocalDate.of(2023, 4, 30),
				legume);
		produtoRepository.save(produto);

		produto = new Filme(
				"cenoura.png",
				"Cenoura",
				"cenoura",
				"1 unidade aprox. 180g",
				true,
				350,
				BigDecimal.valueOf(1.01),
				LocalDate.of(2023, 5, 29),
				legume);
		produtoRepository.save(produto);

		produto = new Filme(
				"cereja.png",
				"Cereja",
				"cereja",
				"1 unidade aprox. 250g",
				true,
				240,
				BigDecimal.valueOf(11.23),
				LocalDate.of(2023, 5, 11),
				fruta);
		produtoRepository.save(produto);

	}
}
