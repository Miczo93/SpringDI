package com.example.springexample;

//import org.springframework.boot.SpringApplication;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


@SpringBootApplication
public class Application {

    private static final String CONFIGURATION = "applicationContext.xml";
    private static final String TEST_BEAN = "first";
    private static final String DEPENDENCY_1A = "depinj1a";
    private static final String DEPENDENCY_1B = "depinj1b";
    private static final String DEPENDENCY_1C = "depinj1c";
    private static final String DEPENDENCY_1D = "depinj1d";
    private static final String DEPENDENCY_2 = "employee1";
    private static final String COLLECTION_1 = "collection1";
    private static final String COLLECTION_2 = "collection2";
    private static final String COLLECTION_3 = "collection3";
    private static final String COLLECTION_4 = "collection4";
    private static final String COLLECTION_5 = "collection5";
    private static final String COLLECTION_6 = "collection6";
    private static final String BEAN_PARENT = "beanParent";
    private static final String SETTER = "bySetter";
    private static final String BY_SETTER_INJECTION = "bySetterInjection";
    private static final String BY_SETTER_INJECTION_COLLECTION = "bySetterInjectionCollection";
    private static final String BY_SETTER_INJECTION_NON_STRING = "bySetterInjectionNonString";
    private static final String BY_SETTER_INJECTION_MAP_NON_STRING = "bySetterInjectionMapNonString";
    private static final String AUTOWIRE_BY_NAME = "byName";
    private static final String AUTOWIRE_BY_TYPE = "byType";
    private static final String AUTOWIRE_CONSTRUCTOR = "byConstructor";
    private static final String AUTOWIRE_NO_AUTOWIRE = "noAutowire";
    private static final String FACTORY_METHOD_1 = "factory1";
    private static final String FACTORY_METHOD_2 = "factory2";
    private static final String FACTORY_METHOD_3 = "factory3";

    static BeanFactory factory;


    public static void main(String[] args) {
        // SpringApplication.run(Application.class, args);
        BeanFactoryFunction();
        ApplicationContextFunction();

        Resource resource = new ClassPathResource(CONFIGURATION);
        factory = new XmlBeanFactory(resource);

        DependencyInjectionByConstructor();
        DependencyInjectionByObject();
        ConstructorWithCollection();
        ConstructorWithCollectionNonString();
        ConstructorWithCollectionMap();
        ConstructorWithCollectionListNonString();
        ConstructorWithMap();
        ConstructorWithMapNonString();
        InheritBean();
        DependencyInjectionBySetter();
        DependencyInjectionBySetterDependantObj();
        DependencyInjectionBySetterDependantObjCollection();
        DependencyInjectionBySetterDependantObjCollectionNonString();
        DependencyInjectionBySetterDependantObjCollectionMapNonString();
        Autowiring();
        FactoryMethod();
    }

    private static void BeanFactoryFunction() {
        System.out.println("BeanFactory");
        Resource resource = new ClassPathResource(CONFIGURATION);
        BeanFactory factory = new XmlBeanFactory(resource);
        Student student = (Student) factory.getBean(TEST_BEAN);
        student.displayInfo();
    }

    private static void ApplicationContextFunction() {
        System.out.println("ApplicationContext");
        ApplicationContext context = new ClassPathXmlApplicationContext(CONFIGURATION);
        Student student = (Student) context.getBean(TEST_BEAN);
        student.displayInfo();
    }

    private static void DependencyInjectionByConstructor() {
        System.out.println("Dependency Injection By Constructor");

        Employee s = (Employee) factory.getBean(DEPENDENCY_1A);
        s.showsimple();
        Employee s2 = (Employee) factory.getBean(DEPENDENCY_1B);
        s2.showsimple();
        Employee s3 = (Employee) factory.getBean(DEPENDENCY_1C);
        s3.showsimple();
        Employee s4 = (Employee) factory.getBean(DEPENDENCY_1D);
        s4.showsimple();
    }

    private static void DependencyInjectionByObject() {
        System.out.println("Dependency Injection By Dependent Object");

        Employee s = (Employee) factory.getBean(DEPENDENCY_2);
        s.show();
    }

    private static void ConstructorWithCollection() {
        System.out.println("Constructor With Collection");


        Question s = (Question) factory.getBean(COLLECTION_1);
        s.displayInfo();
    }

    private static void ConstructorWithCollectionNonString() {
        System.out.println("Constructor With Collection Non String");


        QuestionCollection s = (QuestionCollection) factory.getBean(COLLECTION_2);
        s.displayInfo();
    }

    private static void ConstructorWithCollectionMap() {
        System.out.println("Constructor With Collection Map");

        QuestionMap s = (QuestionMap) factory.getBean(COLLECTION_3);
        s.displayInfo();
    }

    private static void ConstructorWithCollectionListNonString() {
        System.out.println("Constructor With Collection List Non String");

        QuestionCollectionList s = (QuestionCollectionList) factory.getBean(COLLECTION_4);
        s.displayInfo();
    }

    private static void ConstructorWithMap() {
        System.out.println("Constructor With Map");

        QuestionMap s = (QuestionMap) factory.getBean(COLLECTION_5);
        s.displayInfo();
    }

    private static void ConstructorWithMapNonString() {
        System.out.println("Constructor With Map Non String");

        QuestionConstructorInjectiorMap s = (QuestionConstructorInjectiorMap) factory.getBean(COLLECTION_6);
        s.displayInfo();
    }

    private static void InheritBean() {
        System.out.println("Inherit With Parent Bean");

        Employee s = (Employee) factory.getBean(BEAN_PARENT);
        s.show();
    }

    private static void DependencyInjectionBySetter() {
        System.out.println("Dependency Injection By Setter");

        Employee s = (Employee) factory.getBean(SETTER);
        s.display();
    }

    private static void DependencyInjectionBySetterDependantObj() {
        System.out.println("Dependency Injection By Setter Dependant Object");

        Employee s = (Employee) factory.getBean(BY_SETTER_INJECTION);
        s.display();
    }

    private static void DependencyInjectionBySetterDependantObjCollection() {
        System.out.println("Dependency Injection By Setter Dependant Object Collection");

        Question s = (Question) factory.getBean(BY_SETTER_INJECTION_COLLECTION);
        s.displayInfo();
    }

    private static void DependencyInjectionBySetterDependantObjCollectionNonString() {
        System.out.println("Dependency Injection By Setter Dependant Object Collection Non String");

        QuestionCollection s = (QuestionCollection) factory.getBean(BY_SETTER_INJECTION_NON_STRING);
        s.displayInfo();
    }

    private static void DependencyInjectionBySetterDependantObjCollectionMapNonString() {
        System.out.println("Dependency Injection By Setter Dependant Object Collection Map Non String");

        QuestionConstructorInjectiorMap s = (QuestionConstructorInjectiorMap) factory.getBean(BY_SETTER_INJECTION_MAP_NON_STRING);
        s.displayInfo();
    }

    private static void Autowiring() {
        System.out.println("Autowiring");

        A a1 = factory.getBean(AUTOWIRE_BY_NAME, A.class);
        a1.display();
        A a2 = factory.getBean(AUTOWIRE_BY_TYPE, A.class);
        a2.display();
        A a3 = factory.getBean(AUTOWIRE_CONSTRUCTOR, A.class);
        a3.display();
        A a4 = factory.getBean(AUTOWIRE_NO_AUTOWIRE, A.class);
        a4.display();
    }

    private static void FactoryMethod() {
        System.out.println("Factory Method");

        A a1 = (A) factory.getBean(FACTORY_METHOD_1);
        a1.print();
        A a2 = (A) factory.getBean(FACTORY_METHOD_2);
        a2.print();
        A a3 = (A) factory.getBean(FACTORY_METHOD_3);
        a3.print();
    }


}
