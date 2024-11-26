package pe.edu.cibertec.spring_data_jpa_lym;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.cibertec.spring_data_jpa_lym.entity.Customer;
import pe.edu.cibertec.spring_data_jpa_lym.repository.CustomerRepository;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

@SpringBootApplication
public class SpringDataJpaLymApplication implements CommandLineRunner {

	@Autowired
	CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaLymApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/**
		 * save() guarda un nuevo customer
		 */
//        Customer customer = new Customer(null, 1, "César", "Torres", "torres@mail.com", 1, 1, new Date(), new Date());
//        customerRepository.save(customer);

		/**
		 * findById() - get() trae lo que buscamo por id
		 */
//        Optional<Customer> optional = customerRepository.findById(589);
//        Customer customer = optional.get();
//        System.out.println(customer);

		/**
		 * findById() - orElse() con esto si regresa null no se cuelga
		 */
//        Optional<Customer> optional = customerRepository.findById(632);
//        Customer customer = optional.orElse(null);
//        System.out.println(customer);

		/**
		 * findById() - orElseGet()
		 */
//        Optional<Customer> optional = customerRepository.findById(631);
//        Customer customer = optional.orElseGet(() -> {
//            LocalDate today = LocalDate.now();
//            System.out.println("Customer not found: " + today);
//            return null;
//        });
//        System.out.println(customer);

		/**
		 * findById() - orElseThrow()
		 */
//        Optional<Customer> optional = customerRepository.findById(632);
////        Customer customer = optional.orElseThrow(() -> {
////            return new IllegalArgumentException("customer not fount");
////        });
//        Customer customer = optional.orElseThrow(IllegalArgumentException::new);
//        System.out.println(customer);

		/**
		 * isPresent() si la respuesta de la consulta esta presente
		 */
//        Optional<Customer> optional = customerRepository.findById(632);
//        if (optional.isPresent()) {
//            System.out.println(optional.get());
//        } else {
//            System.out.println("Customer not found");
//        }

		/**
		 * ifPresent() si esta presente lo que buscamos
		 */
//        Optional<Customer> optional = customerRepository.findById(600);
//        optional.ifPresent((customer) -> {
//            LocalDate today = LocalDate.now();
//            System.out.println("Fecha: " + today);
//            System.out.println(customer.getFirst_name() + " " + customer.getLast_name());
//        });

		/**
		 * ifPresentOrElse() si no esta presente lo que buscamos
		 */
//        Optional<Customer> optional = customerRepository.findById(601);
//        optional.ifPresentOrElse(
//                (item) -> {
//                    System.out.println(String.format("Customer is %s", item.getEmail()));
//                },
//                () -> {
//                    System.out.println("Customer not found");
//                }
//        );

		/**
		 * existById() consulta directa a la base de datos y nos dira si existe o no
		 */
//        if (customerRepository.existsById(600)) {
//            System.out.println("Customer exist");
//        } else {
//            System.out.println("Customer not exist");
//        }

		/**
		 * findAll()
		 */
//        Iterable<Customer> iterable = customerRepository.findAll();

//		 for clasico
//        for (Customer customer : iterable) {
//            System.out.println(customer);
//        }

//		 forEach - Referencia al metodo
//        iterable.forEach(System.out::println);

//		 forEach - Referencia al metodo
//        iterable.forEach((variable) -> {
//            System.out.println(variable.getLast_name());
//        });

		/**
		 * List.copyOf()
		 */
//        List<Customer> lista = List.copyOf((Collection<Customer>) iterable);

		/**
		 * findAllById() creamos iterable y buscamos por indicacion de id(varios)
		 */
//        Iterable<Integer> ids = List.of(600, 599, 598);
//        Iterable<Customer> iterable = customerRepository.findAllById(ids);
//        iterable.forEach(System.out::println);

		/**
		 * deleteById() eliminar por id con ejemplo de validar si existe o no lo que quermos eliminar
		 */
//        int id = 600;
//        if (customerRepository.existsById(id)) {
//            customerRepository.deleteById(id);
//        } else {
//            System.out.println("Customer with id " + id + " does not exist");
//        }

		/**
		 * deleteAllById() eliminar por varios id
		 */
//        List<Integer> lista = List.of(621, 622, 623);
//					//        lista.stream().filter((item) -> {
//					//            return customerRepository.existsById(item);
//					//        }).collect(Collectors.toList());
//        lista.stream().filter(customerRepository::existsById).collect(Collectors.toList());
//
//        customerRepository.deleteAllById(lista);

		/**
		 * delete()
		 */
//        Optional<Customer> optional = customerRepository.findById(620);
//        optional.ifPresentOrElse(
//                (customer) -> {
//                    customerRepository.delete(customer);
//                },
//                () -> {
//                    System.out.println("Customer not found");
//                });

		/**
		 * deleteAll() eliminar varios
		 */
//		Iterable<Customer> iterable = customerRepository.findAllById(List.of(618, 619, 620, 621));
//		customerRepository.deleteAll(iterable);

	}

}