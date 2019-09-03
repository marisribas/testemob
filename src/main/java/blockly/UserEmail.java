package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class UserEmail {

public static final int TIMEOUT = 300;

/**
 *
 * @param user
 * @return Var
 */
// UserEmail
public static Var atualizar(Var user) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    System.out.println(user.getObjectAsString());
    cronapi.database.Operations.insert(Var.valueOf("app.entity.User"),user);
    if (cronapi.logic.Operations.isNullOrEmpty(cronapi.database.Operations.getField(user, Var.valueOf("email"))).negate().getObjectAsBoolean()) {
        cronapi.database.Operations.insert(Var.valueOf("app.entity.ListaEmails"),Var.valueOf("id",cronapi.util.Operations.generateUUID()),Var.valueOf("email",cronapi.database.Operations.getField(user, Var.valueOf("email"))));
    }
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param user
 * @return Var
 */
// UserEmail
public static Var filtrar(Var user) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    System.out.println(user.getObjectAsString());
    cronapi.database.Operations.insert(Var.valueOf("app.entity.User"),user);
    if (cronapi.logic.Operations.isNullOrEmpty(cronapi.database.Operations.getField(user, Var.valueOf("email"))).negate().getObjectAsBoolean()) {
        cronapi.database.Operations.insert(Var.valueOf("app.entity.ListaEmails"),Var.valueOf("id",cronapi.util.Operations.generateUUID()),Var.valueOf("email",cronapi.database.Operations.getField(user, Var.valueOf("email"))));
    }
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param user
 * @return Var
 */
// UserEmail
public static Var inserir(Var user) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    System.out.println(user.getObjectAsString());
    cronapi.database.Operations.insert(Var.valueOf("app.entity.User"),user);
    if (cronapi.logic.Operations.isNullOrEmpty(cronapi.database.Operations.getField(user, Var.valueOf("email"))).negate().getObjectAsBoolean()) {
        cronapi.database.Operations.insert(Var.valueOf("app.entity.ListaEmails"),Var.valueOf("id",cronapi.util.Operations.generateUUID()),Var.valueOf("email",cronapi.database.Operations.getField(user, Var.valueOf("email"))));
    }
    return user;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var contar() throws Exception {
 return new Callable<Var>() {

   private Var x = Var.VAR_NULL;
   private Var user = Var.VAR_NULL;

   public Var call() throws Exception {
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param x
 */
// Descreva esta função...
public static void deletar(Var x) throws Exception {
  new Callable<Var>() {

   public Var call() throws Exception {
    System.out.println(Var.valueOf("deletar").getObjectAsString());
    System.out.println(x.getObjectAsString());
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var obter() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    System.out.println(Var.valueOf("Obter").getObjectAsString());
    return cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select u from User u"));
   }
 }.call();
}

}

