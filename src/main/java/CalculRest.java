import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/calcul")
@Produces(MediaType.APPLICATION_JSON)
public class CalculRest {

    private Calculatrice calculatrice = new Calculatrice();

    // Addition
    @GET
    @Path("/addition")
    public Operation addition(
            @QueryParam("a") double a,
            @QueryParam("b") double b) {

        double resultat = calculatrice.addition(a, b);

        return new Operation("addition", a, b, resultat);
    }

    // Soustraction
    @GET
    @Path("/soustraction")
    public Operation soustraction(
            @QueryParam("a") double a,
            @QueryParam("b") double b) {

        double resultat = calculatrice.soustraction(a, b);

        return new Operation("soustraction", a, b, resultat);
    }

    // Multiplication
    @GET
    @Path("/multiplication")
    public Operation multiplication(
            @QueryParam("a") double a,
            @QueryParam("b") double b) {

        double resultat = calculatrice.multiplication(a, b);

        return new Operation("multiplication", a, b, resultat);
    }

    // Division
    @GET
    @Path("/division")
    public jakarta.ws.rs.core.Response division(
            @QueryParam("a") double a,
            @QueryParam("b") double b) {

        if (b == 0) {
            return jakarta.ws.rs.core.Response
                    .status(400)
                    .entity("{\"erreur\":\"Division par zéro impossible\"}")
                    .type(MediaType.APPLICATION_JSON)
                    .build();
        }

        double resultat = calculatrice.division(a, b);

        return jakarta.ws.rs.core.Response
                .ok(new Operation("division", a, b, resultat))
                .build();
    }
}
