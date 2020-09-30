package com.sist.dao;
import java.util.*;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.lf5.util.Resource;

import java.io.*;
/*
	Ŭ������ �����ϸ�
	���α׷��� ¥�� �� �Ѱ��� �ۿ� ����
	�װ� �ٷ� �����͸� �����ϴ� �����
	�����͸� �����Ϸ��� �����͸� �����ؾ� �ϴµ� ������ �����͸� �����ִ� ������ ���α׷��̴�.
	
	�����͸� ������ ������ �ʱⰪ�� �ο��ؾ� �ϴµ� �̶� 3���� ����� �ִ�. 
	1. ����� �ʱ�ȭ
		private int a=10;
	2. �ʱ�ȭ ���
		1) �ν��Ͻ� ���
		2) static ���
	3. ������ : �ڵ� �νĵ��� �ʰ�, ȣ���ؾ����� ������ �ʱ�ȭ�ȴ�.
		ȣ���� : new ������()
	
	
 */



public class MusicDAO {
	private static SqlSessionFactory ssf;
	// ssf�� xml�� �о�ͼ� �����͸� �����ϴ� ������ �����Ѵ�.
	/* 
		����Ŭ�� �о���� ���� JDBC��� �ϰ�, 
		XML�� �о���� ���� �Ľ��̶�� �Ѵ�.
		html�� �о���� ���� ũ�Ѹ��̶�� �Ѵ�.
		
		Jsoup�� html�� �ļ�
	*/
	
	static {
		
		// �ڵ� �ʱ�ȭ�� ������
		try {
			Reader reader=Resources.getResourceAsReader("config.xml");
			// XML�Ľ�
			ssf= new SqlSessionFactoryBuilder().build(reader);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static List<MusicVO> musicAllData()
	{
		// music.xml�� <select>�� ������ ID���� �Ʒ� ������ �־���� �Ѵ�.
		return ssf.openSession().selectList("musicAllData");
	}
}
