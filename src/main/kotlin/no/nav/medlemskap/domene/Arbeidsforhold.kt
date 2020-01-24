package no.nav.medlemskap.domene

import java.time.YearMonth

data class Arbeidsforhold (
        val periode: Periode,
        val utenlandsopphold: List<Utenlandsopphold>,
        val arbeidsgiver: Arbeidsgiver,
        val arbeidsfolholdstype: Arbeidsforholdstype
)

data class Arbeidsavtale (
        val periode: Periode,
        val yrkeskode: String,
        val skipsregister: String?,
        val stillingsprosent: Double?
)

data class Arbeidsgiver (
        val type: String,
        val identifikator: String,
        val landkode: String // Må kanskje hentes fra https://data.brreg.no/enhetsregisteret/api/docs/index.html#enheter-oppslag
)

data class Utenlandsopphold (
        val landkode: String,
        val periode: Periode?,
        val rapporteringsperiode: YearMonth
)

enum class Arbeidsforholdstype (val navn: String) {
    FRILANSER("frilanserOppdragstakerHonorarPersonerMm"),
    MARITIM("maritimtArbeidsforhold"),
    NORMALT("ordinaertArbeidsforhold"),
    FORENKLET("forenkletOppgjoersordning"),
    ANDRE("pensjonOgAndreTyperYtelserUtenAnsettelsesforhold")
}
