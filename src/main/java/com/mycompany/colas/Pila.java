package com.mycompany.colas;

public class Pila<T> {
	private Nodo<T> inicio;
	private int tamano;
	public Pila()
	{
		inicio=null;
		tamano=0;
	}
	public boolean esVacia()
	{
		return inicio==null;
	}
	public int getTamano() 
	{
		return tamano;
	}
	public void apilar(T valor)
	{
		Nodo<T> nuevo=new Nodo<T>(valor);
		nuevo.setValor(valor);
		
		if(esVacia())
		{
			inicio=nuevo;
		}
		else
		{
			nuevo.setSiguiente(inicio);
			inicio=nuevo;
		}
		tamano++;
	}
	public boolean buscar(T referencia)
	{
		Nodo<T> aux = inicio;
		boolean existe=false;
		
		while(existe !=true && aux!=null)
		{
			if(referencia==aux.getValor())
			{
				existe=true;
			}
			else
			{
				aux=aux.getSiguiente();			
				}
		}
		return existe;
	}
	public void retirar()
	{
		if(!esVacia())
		{
			inicio=inicio.getSiguiente();
			tamano--;
		}
	}

	public void remover(T referencia)
	{
		if(buscar(referencia))
		{
			Nodo<T> pilaAux=null;
		
		while(referencia != inicio.getValor())
		{
			Nodo<T> temp=new Nodo<T>(null);
			temp.setValor(inicio.getValor());
			
			if(pilaAux == null)
			{
				pilaAux=temp;
			}
			else
			{
				temp.setSiguiente(pilaAux);
				pilaAux=temp;
			}
			retirar();
		}
		retirar();
		while(pilaAux!=null)
		{
			apilar((T) pilaAux.getValor());
			pilaAux=pilaAux.getSiguiente();
		}
		pilaAux=null;
	}
	}
	public void eliminar()
	{
		inicio=null;
		tamano=0;
	}
	public void listar()
	{
		Nodo<T> aux=inicio;
		
		while(aux!=null)
		{
			System.out.println(aux.getValor());
			aux=aux.getSiguiente();
		}
	}
}
