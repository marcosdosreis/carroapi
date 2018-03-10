package br.com.marcosreis.carroapi.service

import br.com.marcosreis.carroapi.entity.Carro
import br.com.marcosreis.carroapi.repository.CarroRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CarroService {

    @Autowired
    lateinit var carroRepository: CarroRepository

    fun buscarTodosCarros() : List<Carro> {
        return carroRepository.findAll()
    }
    fun buscarCarroPorMarca(marca: String): List<Carro> {
        return carroRepository.findByMarcaContaining(marca)
    }

    fun buscarCarroPorAno(ano: Int): List<Carro> {
        return carroRepository.findByAno(ano)
    }

    fun buscarCarroPorPlaca(placa: String): Carro {
        return carroRepository.findByPlaca(placa)
    }

    fun salvar(carro: Carro) {
        carroRepository.save(carro)
    }
}