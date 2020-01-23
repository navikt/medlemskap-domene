package no.nav.medlemskap.domene

import java.time.YearMonth

data class Arbeidsforhold(
        val utenlandsopphold: List<Utenlandsopphold>
)

data class Utenlandsopphold (
        val landkode: String,
        val periode: Periode?,
        val rapporteringsperiode: YearMonth
)
