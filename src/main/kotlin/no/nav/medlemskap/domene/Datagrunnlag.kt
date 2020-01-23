package no.nav.medlemskap.domene

import java.time.LocalDate

data class Datagrunnlag (
        val soknadsperiode: Periode,
        val soknadstidspunkt: LocalDate,
        val personhistorikk: Personhistorikk,
        val medlemskapsunntak: List<Medlemskapsunntak>?,
        val arbeidsforhold: List<Arbeidsforhold>?,
        val inntekt: List<Inntekt>?
)

data class Periode (
        val fom: LocalDate,
        val tom: LocalDate
)
