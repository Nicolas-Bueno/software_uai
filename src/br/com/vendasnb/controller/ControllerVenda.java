/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.vendasnb.controller;

import br.com.vendasnb.dao.DAOVenda;
import br.com.vendasnb.model.ModelVenda;
import java.util.ArrayList;

/**
 *
 * @author Nicolas
 */
public class ControllerVenda {
    
    private DAOVenda daoVenda = new DAOVenda();
    
    /***
     * Salva Venda
     * @param pModelVenda
     * @return int
     */
    public int salvarVendaController(ModelVenda pModelVenda){
        return this.daoVenda.salvarVendasDAO(pModelVenda);
    }
    
    /***
     * Recupera uma venda
     * @param pCodigo
     * @return 
     */
    
    public ModelVenda getVendaController(int pCodigo){
        return this.daoVenda.retornarVendaDAO(pCodigo);
    }
    
    /***
     * Recupera lista de vendas
     * @return ArrayList<ModelVenda>
     */
    public ArrayList<ModelVenda> getListaVendaController(){
        return this.daoVenda.retornaListaVendas();
    }
    
    /***
     * Atualiaza venda
     * @param pModelVenda
     * @return 
     */
    public boolean atualiazarVendaController(ModelVenda pModelVenda){
        return this.daoVenda.alterarVendaDAO(pModelVenda);
    }
    
    /***
     * exclui venda
     * @param pCodigo
     * @return 
     */
    
    public boolean excluiiVendaController(int pCodigo){
        return this.daoVenda.excluirVendaDAO(pCodigo);
    }
}
