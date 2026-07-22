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

public enum class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsStartDateX1254da9fBranch {
    Branch1,
    InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X20442c45,
}

public sealed class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsStartDateX1254da9fDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsStartDateX1254da9fNoMatchException(
    message: String,
) : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsStartDateX1254da9fDecodingException(message)

internal data class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsStartDateX1254da9fInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X20442c45: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X20442c45,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/payto/properties/mandate_options/properties/sta
 * rt_date.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/payto/properties/mandate_options/properties/sta
 * rt_date
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsStartDateX1254da9f.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsStartDateX1254da9f internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsStartDateX1254da9fInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X20442c45:
        InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X20442c45? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X20442c45) {
                json
                    .decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X20442c45>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsStartDateX1254da9fBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsStartDateX1254da9fBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X20442c45) {
                    add(
                        InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsStartDateX1254da9fBranch.InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X20442c45,
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
        ): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsStartDateX1254da9f {
            val inspection =
                inspectInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsStartDateX1254da9f(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsStartDateX1254da9fNoMatchException(
                    "InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsStartDateX1254da9f matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsStartDateX1254da9f(
                raw,
                json,
                inspection,
            )
        }
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsStartDateX1254da9f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsStartDateX1254da9f {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsStartDateX1254da9f",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsStartDateX1254da9f,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsStartDateX1254da9f",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsStartDateX1254da9f(
    element: JsonElement,
): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsStartDateX1254da9fInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X20442c45 =
        element
            .isJsonDecodable<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X20442c45>()
    return InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsStartDateX1254da9fInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X20442c45 = matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X20442c45,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X20442c45) {
                    add(
                        "InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X20442c45: value does not match InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X20442c45",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
