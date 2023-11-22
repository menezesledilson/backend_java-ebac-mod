import reflections.Produto;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) {
        Class<?> clazz = Produto.class; // A partir do nome da classe Clazz
        System.out.println(clazz);

//        Produto prod = new Produto(); // Aqui é a partir da instância prod
//        Class<?> clazz1 = prod.getClass();
//        System.out.println(clazz1);

//        try {
//            Constructor<?> cons = clazz.getConstructor();
//            Produto prod1 = (Produto) cons.newInstance();
//            System.out.println(cons);
//            System.out.println(prod1);
//
//            Field[] fields = prod1.getClass().getDeclaredFields();
//            for (Field field : fields) {
//                Class<?> type = field.getType();
//
//                String nome = field.getName();
//                System.out.println(type);
//                System.out.println(nome);
//            }
//
//            Method[] methods = prod1.getClass().getDeclaredMethods();
//            for (Method m : methods) {
//                Class<?> returnType = m.getReturnType();
//                String methodName = m.getName();
//                System.out.println(returnType);
//                System.out.println(methodName);
//
//                System.out.println("Executando métodos");
//                if (methodName.startsWith("get")) {
//                    System.out.println(m.invoke(prod1));
//                } else {
//                    Class<?>[] parameterTypes = m.getParameterTypes();
//                    Object[] arguments = new Object[parameterTypes.length];
//
//                    for (int i = 0; i < parameterTypes.length; i++) {
//                        Class<?> parameterType = parameterTypes[i];
//                        if (parameterType.equals(String.class)) {
//                            arguments[i] = "Rodrigo";
//                        } else if (parameterType.equals(Long.class)) {
//                            arguments[i] = 1L;
//                        } else {
//                            arguments[i] = 2d;
//                        }
//                    }
//
//                    System.out.println(m.invoke(prod1, arguments));
//                }
//            }
//        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException
//                 | InvocationTargetException e) {
//            e.printStackTrace();
//        }
    }

    private static class Produto {
    }
}
