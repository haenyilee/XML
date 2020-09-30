package com.sist.xml;
/*
	<JAXB>
	1. xml�� �ڹ� Ŭ������ ��ȯ�ϴ� ���� '�𸶼�'�̶�� ��
	2. java class�� xml�� ��ȯ�ϴ� ���� '����'�̶�� ��
	
	news => naver
	
	
	�±� �ؿ� �±װ� ������ Ŭ������
	�±� �ؿ� �����Ͱ� ������ ������
	
	<rss> => Ŭ������
		<channel> => Ŭ������
			<item>
				<title></title>  => ������
				<description></description>
				<author></author>
			</item>
			<item>
				<title>aaa</title>
				<description>aaa</description>
				<author>aaa</author>
				<link>aaa</link>
			</item>
			
			
			<member> => class Member
				<list> => class List
						  {
						  	private String name
						  	private String sex						  
						  }
					<name>aaa</name>
					<sex>aaa</sex>
				</list>
			</member>
 */

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Rss {
	
	// Rss���� channel �±װ� �ִ�....
	
	private Channel channel = new Channel();

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}
	

}
