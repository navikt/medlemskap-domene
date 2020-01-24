package no.nav.medlemskap.domene

import java.time.YearMonth

data class Arbeidsforhold (
        val periode: Periode,
        val utenlandsopphold: List<Utenlandsopphold>,
        val arbeidsgiver: Arbeidsgiver
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
