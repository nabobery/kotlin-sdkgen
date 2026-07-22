package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterBodyX0eb767bbBranch {
    Branch1,
    InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf1AnyOf2X74011fbe,
}

public sealed class InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterBodyX0eb767bbDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterBodyX0eb767bbNoMatchException(
    message: String,
) : InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterBodyX0eb767bbDecodingException(message)

internal data class InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterBodyX0eb767bbInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf1AnyOf2X74011fbe: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf1AnyOf2X74011fbe,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1personalization_designs~1{personalization_design}/post/requestBody
 * /content/application~1x-www-form-urlencoded/schema/properties/carrier_text/anyOf/0/properties/footer_body.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1personalization_designs~1{personalization_design}/post/requestBody
 * /content/application~1x-www-form-urlencoded/schema/properties/carrier_text/anyOf/0/properties/footer_body
 */
@Serializable(with = InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterBodyX0eb767bb.Serializer::class)
public class InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterBodyX0eb767bb internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterBodyX0eb767bbInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf1AnyOf2X74011fbe:
        InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf1AnyOf2X74011fbe? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf1AnyOf2X74011fbe) {
                json
                    .decodeFromJsonElement<InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf1AnyOf2X74011fbe>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterBodyX0eb767bbBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterBodyX0eb767bbBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf1AnyOf2X74011fbe) {
                    add(
                        InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterBodyX0eb767bbBranch.InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf1AnyOf2X74011fbe,
                    )
                }
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterBodyX0eb767bb {
            val inspection = inspectInlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterBodyX0eb767bb(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterBodyX0eb767bbNoMatchException(
                    "InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterBodyX0eb767bb matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterBodyX0eb767bb(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterBodyX0eb767bb> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterBodyX0eb767bb {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterBodyX0eb767bb",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterBodyX0eb767bb,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterBodyX0eb767bb",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterBodyX0eb767bb(
    element: JsonElement,
): InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterBodyX0eb767bbInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf1AnyOf2X74011fbe =
        element
            .isJsonDecodable<InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf1AnyOf2X74011fbe>()
    return InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterBodyX0eb767bbInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf1AnyOf2X74011fbe = matchesInlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf1AnyOf2X74011fbe,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf1AnyOf2X74011fbe) {
                    add(
                        "InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf1AnyOf2X74011fbe: value does not match InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf1AnyOf2X74011fbe",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
