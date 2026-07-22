package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/tipping/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/tipping/anyOf/0
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xfdd00b49.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xfdd00b49(
    public val aed: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1AedX2aa35b44? = null,
    public val aud: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1AudX2d5797e1? = null,
    public val cad: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1CadX2de79cdb? = null,
    public val chf: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1ChfX1112c37c? = null,
    public val czk: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1CzkXdb0dd172? = null,
    public val dkk: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1DkkX8bcba30e? = null,
    public val eur: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1EurX2029fbcb? = null,
    public val gbp: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1GbpXe322ca5c? = null,
    public val gip: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1GipX7e87eaae? = null,
    public val hkd: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1HkdX6e34f8de? = null,
    public val huf: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1HufX75d02f67? = null,
    public val jpy: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1JpyXe6c944e5? = null,
    public val mxn: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1MxnXfdaf74e7? = null,
    public val myr: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1MyrXefe8232b? = null,
    public val nok: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1NokXaa375330? = null,
    public val nzd: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1NzdXa8efc9a3? = null,
    public val pln: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1PlnX2b0d4268? = null,
    public val ron: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1RonXce3f377a? = null,
    public val sek: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1SekX0476b03a? = null,
    public val sgd: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1SgdXb95aa5d6? = null,
    public val usd: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1UsdX27df6f17? = null,
) {
    public class Builder {
        public var aed: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1AedX2aa35b44? = null

        public var aud: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1AudX2d5797e1? = null

        public var cad: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1CadX2de79cdb? = null

        public var chf: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1ChfX1112c37c? = null

        public var czk: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1CzkXdb0dd172? = null

        public var dkk: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1DkkX8bcba30e? = null

        public var eur: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1EurX2029fbcb? = null

        public var gbp: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1GbpXe322ca5c? = null

        public var gip: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1GipX7e87eaae? = null

        public var hkd: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1HkdX6e34f8de? = null

        public var huf: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1HufX75d02f67? = null

        public var jpy: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1JpyXe6c944e5? = null

        public var mxn: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1MxnXfdaf74e7? = null

        public var myr: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1MyrXefe8232b? = null

        public var nok: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1NokXaa375330? = null

        public var nzd: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1NzdXa8efc9a3? = null

        public var pln: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1PlnX2b0d4268? = null

        public var ron: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1RonXce3f377a? = null

        public var sek: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1SekX0476b03a? = null

        public var sgd: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1SgdXb95aa5d6? = null

        public var usd: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1UsdX27df6f17? = null

        public fun build(): InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xfdd00b49 =
            InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xfdd00b49(
                aed = aed,
                aud = aud,
                cad = cad,
                chf = chf,
                czk = czk,
                dkk = dkk,
                eur = eur,
                gbp = gbp,
                gip = gip,
                hkd = hkd,
                huf = huf,
                jpy = jpy,
                mxn = mxn,
                myr = myr,
                nok = nok,
                nzd = nzd,
                pln = pln,
                ron = ron,
                sek = sek,
                sgd = sgd,
                usd = usd,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xfdd00b49 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xfdd00b49> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xfdd00b49 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xfdd00b49",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xfdd00b49 must be a JSON object",
                    )
            return InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xfdd00b49(
                aed =
                    rawObject["aed"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1AedX2aa35b44>(
                                it,
                            )
                    },
                aud =
                    rawObject["aud"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1AudX2d5797e1>(
                                it,
                            )
                    },
                cad =
                    rawObject["cad"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1CadX2de79cdb>(
                                it,
                            )
                    },
                chf =
                    rawObject["chf"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1ChfX1112c37c>(
                                it,
                            )
                    },
                czk =
                    rawObject["czk"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1CzkXdb0dd172>(
                                it,
                            )
                    },
                dkk =
                    rawObject["dkk"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1DkkX8bcba30e>(
                                it,
                            )
                    },
                eur =
                    rawObject["eur"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1EurX2029fbcb>(
                                it,
                            )
                    },
                gbp =
                    rawObject["gbp"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1GbpXe322ca5c>(
                                it,
                            )
                    },
                gip =
                    rawObject["gip"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1GipX7e87eaae>(
                                it,
                            )
                    },
                hkd =
                    rawObject["hkd"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1HkdX6e34f8de>(
                                it,
                            )
                    },
                huf =
                    rawObject["huf"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1HufX75d02f67>(
                                it,
                            )
                    },
                jpy =
                    rawObject["jpy"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1JpyXe6c944e5>(
                                it,
                            )
                    },
                mxn =
                    rawObject["mxn"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1MxnXfdaf74e7>(
                                it,
                            )
                    },
                myr =
                    rawObject["myr"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1MyrXefe8232b>(
                                it,
                            )
                    },
                nok =
                    rawObject["nok"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1NokXaa375330>(
                                it,
                            )
                    },
                nzd =
                    rawObject["nzd"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1NzdXa8efc9a3>(
                                it,
                            )
                    },
                pln =
                    rawObject["pln"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1PlnX2b0d4268>(
                                it,
                            )
                    },
                ron =
                    rawObject["ron"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1RonXce3f377a>(
                                it,
                            )
                    },
                sek =
                    rawObject["sek"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1SekX0476b03a>(
                                it,
                            )
                    },
                sgd =
                    rawObject["sgd"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1SgdXb95aa5d6>(
                                it,
                            )
                    },
                usd =
                    rawObject["usd"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1UsdX27df6f17>(
                                    it,
                                )
                        },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xfdd00b49,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xfdd00b49",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.aed?.let { put("aed", json.encodeToJsonElement(it)) }
                    value.aud?.let { put("aud", json.encodeToJsonElement(it)) }
                    value.cad?.let { put("cad", json.encodeToJsonElement(it)) }
                    value.chf?.let { put("chf", json.encodeToJsonElement(it)) }
                    value.czk?.let { put("czk", json.encodeToJsonElement(it)) }
                    value.dkk?.let { put("dkk", json.encodeToJsonElement(it)) }
                    value.eur?.let { put("eur", json.encodeToJsonElement(it)) }
                    value.gbp?.let { put("gbp", json.encodeToJsonElement(it)) }
                    value.gip?.let { put("gip", json.encodeToJsonElement(it)) }
                    value.hkd?.let { put("hkd", json.encodeToJsonElement(it)) }
                    value.huf?.let { put("huf", json.encodeToJsonElement(it)) }
                    value.jpy?.let { put("jpy", json.encodeToJsonElement(it)) }
                    value.mxn?.let { put("mxn", json.encodeToJsonElement(it)) }
                    value.myr?.let { put("myr", json.encodeToJsonElement(it)) }
                    value.nok?.let { put("nok", json.encodeToJsonElement(it)) }
                    value.nzd?.let { put("nzd", json.encodeToJsonElement(it)) }
                    value.pln?.let { put("pln", json.encodeToJsonElement(it)) }
                    value.ron?.let { put("ron", json.encodeToJsonElement(it)) }
                    value.sek?.let { put("sek", json.encodeToJsonElement(it)) }
                    value.sgd?.let { put("sgd", json.encodeToJsonElement(it)) }
                    value.usd?.let { put("usd", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xfdd00b49(
    block: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xfdd00b49.Builder.() -> Unit,
): InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xfdd00b49 =
    InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xfdd00b49.build(block)
