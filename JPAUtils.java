package cn.itcast.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//EntityManagerFactory => SessionFactory
//EntityManager => Session
public class JPAUtils {
	private static EntityManagerFactory emf;
	static{
		//加载配置文件.指定加载哪套配置
		 emf = Persistence.createEntityManagerFactory("abc");
	}

	public static EntityManager getEntityManager(){
		return  emf.createEntityManager();//openSession
	}
	public static void main(String[] args) {
		System.out.println(emf.createEntityManager()==emf.createEntityManager());
	}
}
