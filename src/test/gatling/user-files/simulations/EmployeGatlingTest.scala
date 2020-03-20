import _root_.io.gatling.core.scenario.Simulation
import ch.qos.logback.classic.{Level, LoggerContext}
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import org.slf4j.LoggerFactory

import scala.concurrent.duration._

/**
 * Performance test for the Employe entity.
 */
class EmployeGatlingTest extends Simulation {

    val context: LoggerContext = LoggerFactory.getILoggerFactory.asInstanceOf[LoggerContext]
    // Log all HTTP requests
    //context.getLogger("io.gatling.http").setLevel(Level.valueOf("TRACE"))
    // Log failed HTTP requests
    //context.getLogger("io.gatling.http").setLevel(Level.valueOf("DEBUG"))

    val baseURL = Option(System.getProperty("baseURL")) getOrElse """http://localhost:8080"""

    val httpConf = http
        .baseUrl(baseURL)
        .inferHtmlResources()
        .acceptHeader("*/*")
        .acceptEncodingHeader("gzip, deflate")
        .acceptLanguageHeader("fr,fr-fr;q=0.8,en-us;q=0.5,en;q=0.3")
        .connectionHeader("keep-alive")
        .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.10; rv:33.0) Gecko/20100101 Firefox/33.0")
        .silentResources // Silence all resources like css or css so they don't clutter the results

    val headers_http = Map(
        "Accept" -> """application/json"""
    )

    val headers_http_authentication = Map(
        "Content-Type" -> """application/json""",
        "Accept" -> """application/json"""
    )

    val headers_http_authenticated = Map(
        "Accept" -> """application/json""",
        "Authorization" -> "${access_token}"
    )

    val scn = scenario("Test the Employe entity")
        .exec(http("First unauthenticated request")
        .get("/api/account")
        .headers(headers_http)
        .check(status.is(401))
        ).exitHereIfFailed
        .pause(10)
        .exec(http("Authentication")
        .post("/api/authenticate")
        .headers(headers_http_authentication)
        .body(StringBody("""{"username":"admin", "password":"admin"}""")).asJson
        .check(header("Authorization").saveAs("access_token"))).exitHereIfFailed
        .pause(2)
        .exec(http("Authenticated request")
        .get("/api/account")
        .headers(headers_http_authenticated)
        .check(status.is(200)))
        .pause(10)
        .repeat(2) {
            exec(http("Get all employes")
            .get("/api/employes")
            .headers(headers_http_authenticated)
            .check(status.is(200)))
            .pause(10 seconds, 20 seconds)
            .exec(http("Create new employe")
            .post("/api/employes")
            .headers(headers_http_authenticated)
            .body(StringBody("""{
                "id":null
                , "rechercheEmploye":"SAMPLE_TEXT"
                , "nomEmploye":"SAMPLE_TEXT"
                , "prenomEmploye":"SAMPLE_TEXT"
                , "sexe":"SAMPLE_TEXT"
                , "etatCivil":"SAMPLE_TEXT"
                , "dateNaissance":"2020-01-01T00:00:00.000Z"
                , "numRegNaiss":"SAMPLE_TEXT"
                , "nomPere":"SAMPLE_TEXT"
                , "prenomPere":"SAMPLE_TEXT"
                , "nomMere":"SAMPLE_TEXT"
                , "prenomMere":"SAMPLE_TEXT"
                , "nationalite":"SAMPLE_TEXT"
                , "typePieceIdentite":"SAMPLE_TEXT"
                , "nin":"SAMPLE_TEXT"
                , "ninCedeao":"SAMPLE_TEXT"
                , "numPieceIdentite":"SAMPLE_TEXT"
                , "delivreLe":"SAMPLE_TEXT"
                , "lieuDelivrance":"SAMPLE_TEXT"
                , "expireLe":"SAMPLE_TEXT"
                , "villeNaissance":"SAMPLE_TEXT"
                , "paysNaissance":"SAMPLE_TEXT"
                , "employeurPrec":"SAMPLE_TEXT"
                , "pays":"SAMPLE_TEXT"
                , "region":"SAMPLE_TEXT"
                , "department":"SAMPLE_TEXT"
                , "arondissement":"SAMPLE_TEXT"
                , "commune":"SAMPLE_TEXT"
                , "qartier":"SAMPLE_TEXT"
                , "address":"SAMPLE_TEXT"
                , "boitePostale":"SAMPLE_TEXT"
                , "typeMouvement":"SAMPLE_TEXT"
                , "natureContrat":"SAMPLE_TEXT"
                , "dateDebutContrat":"2020-01-01T00:00:00.000Z"
                , "dateFinContrat":"2020-01-01T00:00:00.000Z"
                , "profession":"SAMPLE_TEXT"
                , "emploi":"SAMPLE_TEXT"
                , "nonCadre":"SAMPLE_TEXT"
                , "ouiCadre":"SAMPLE_TEXT"
                , "conventionApplicable":"SAMPLE_TEXT"
                , "salaireContractuel":"0"
                , "tempsTravail":"0"
                , "categorie":"SAMPLE_TEXT"
                , "motifSortie":"SAMPLE_TEXT"
                , "totSalAssCssPf1":"0"
                , "totSalAssCssAtmp1":"0"
                , "totSalAssIpresRg1":"0"
                , "totSalAssIpresRcc1":"0"
                , "salaireBrut1":"0"
                , "nombreJours1":"0"
                , "nombreHeures1":"0"
                , "tempsTravail1":"SAMPLE_TEXT"
                , "trancheTravail1":"SAMPLE_TEXT"
                , "regimeGeneral1":"SAMPLE_TEXT"
                , "regimCompCadre1":"SAMPLE_TEXT"
                , "dateEffetRegimeCadre1":"2020-01-01T00:00:00.000Z"
                , "totSalAssCssPf2":"0"
                , "totSalAssCssAtmp2":"0"
                , "totSalAssIpresRg2":"0"
                , "totSalAssIpresRcc2":"0"
                , "salaireBrut2":"0"
                , "nombreJours2":"0"
                , "nombreHeures2":"0"
                , "tempsTravail2":"SAMPLE_TEXT"
                , "trancheTravail2":"SAMPLE_TEXT"
                , "regimeGeneral2":"SAMPLE_TEXT"
                , "regimCompCadre2":"SAMPLE_TEXT"
                , "dateEffetRegimeCadre2":"2020-01-01T00:00:00.000Z"
                , "totSalAssCssPf3":"0"
                , "totSalAssCssAtmp3":"0"
                , "totSalAssIpresRg3":"0"
                , "totSalAssIpresRcc3":"0"
                , "salaireBrut3":"0"
                , "nombreJours3":"0"
                , "nombreHeures3":"0"
                , "tempsTravail3":"SAMPLE_TEXT"
                , "trancheTravail3":"SAMPLE_TEXT"
                , "regimeGeneral3":"SAMPLE_TEXT"
                , "regimCompCadre3":"SAMPLE_TEXT"
                , "dateEffetRegimeCadre3":"2020-01-01T00:00:00.000Z"
                }""")).asJson
            .check(status.is(201))
            .check(headerRegex("Location", "(.*)").saveAs("new_employe_url"))).exitHereIfFailed
            .pause(10)
            .repeat(5) {
                exec(http("Get created employe")
                .get("${new_employe_url}")
                .headers(headers_http_authenticated))
                .pause(10)
            }
            .exec(http("Delete created employe")
            .delete("${new_employe_url}")
            .headers(headers_http_authenticated))
            .pause(10)
        }

    val users = scenario("Users").exec(scn)

    setUp(
        users.inject(rampUsers(Integer.getInteger("users", 100)) during (Integer.getInteger("ramp", 1) minutes))
    ).protocols(httpConf)
}
