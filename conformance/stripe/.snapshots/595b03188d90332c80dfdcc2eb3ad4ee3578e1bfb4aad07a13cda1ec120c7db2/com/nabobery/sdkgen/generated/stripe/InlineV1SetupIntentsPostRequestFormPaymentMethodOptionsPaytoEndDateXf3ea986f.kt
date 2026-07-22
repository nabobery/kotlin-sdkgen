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

public enum class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoEndDateXf3ea986fBranch {
    Branch1,
    InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X75da0fe5,
}

public sealed class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoEndDateXf3ea986fDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoEndDateXf3ea986fNoMatchException(
    message: String,
) : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoEndDateXf3ea986fDecodingException(message)

internal data class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoEndDateXf3ea986fInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X75da0fe5: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X75da0fe5,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/payto/properties/mandate_options/properties/end_date.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/payto/properties/mandate_options/properties/end_date
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoEndDateXf3ea986f.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoEndDateXf3ea986f internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoEndDateXf3ea986fInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X75da0fe5:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X75da0fe5? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X75da0fe5) {
                json
                    .decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X75da0fe5>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoEndDateXf3ea986fBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoEndDateXf3ea986fBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X75da0fe5) {
                    add(
                        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoEndDateXf3ea986fBranch.InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X75da0fe5,
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
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoEndDateXf3ea986f {
            val inspection = inspectInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoEndDateXf3ea986f(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoEndDateXf3ea986fNoMatchException(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoEndDateXf3ea986f matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoEndDateXf3ea986f(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoEndDateXf3ea986f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoEndDateXf3ea986f {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoEndDateXf3ea986f",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoEndDateXf3ea986f,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoEndDateXf3ea986f",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoEndDateXf3ea986f(
    element: JsonElement,
): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoEndDateXf3ea986fInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X75da0fe5 =
        element
            .isJsonDecodable<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X75da0fe5>()
    return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoEndDateXf3ea986fInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X75da0fe5 = matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X75da0fe5,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X75da0fe5) {
                    add(
                        "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X75da0fe5: value does not match InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X75da0fe5",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
