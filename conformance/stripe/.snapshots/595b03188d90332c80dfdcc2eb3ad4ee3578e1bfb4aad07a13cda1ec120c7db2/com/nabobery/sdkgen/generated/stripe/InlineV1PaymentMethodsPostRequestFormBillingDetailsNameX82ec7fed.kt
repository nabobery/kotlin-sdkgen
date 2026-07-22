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

public enum class InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX82ec7fedBranch {
    Branch1,
    InlineV1PaymentMethodsPostRequestFormBillingDetailsNameAnyOf2Xabe36a65,
}

public sealed class InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX82ec7fedDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX82ec7fedNoMatchException(
    message: String,
) : InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX82ec7fedDecodingException(message)

internal data class InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX82ec7fedInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsNameAnyOf2Xabe36a65: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsNameAnyOf2Xabe36a65,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/billing_details/properties/name.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/billing_details/properties/name
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX82ec7fed.Serializer::class)
public class InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX82ec7fed internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX82ec7fedInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1PaymentMethodsPostRequestFormBillingDetailsNameAnyOf2Xabe36a65:
        InlineV1PaymentMethodsPostRequestFormBillingDetailsNameAnyOf2Xabe36a65? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsNameAnyOf2Xabe36a65) {
                json
                    .decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormBillingDetailsNameAnyOf2Xabe36a65>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX82ec7fedBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX82ec7fedBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsNameAnyOf2Xabe36a65) {
                    add(
                        InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX82ec7fedBranch.InlineV1PaymentMethodsPostRequestFormBillingDetailsNameAnyOf2Xabe36a65,
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
        ): InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX82ec7fed {
            val inspection = inspectInlineV1PaymentMethodsPostRequestFormBillingDetailsNameX82ec7fed(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX82ec7fedNoMatchException(
                    "InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX82ec7fed matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX82ec7fed(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX82ec7fed> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX82ec7fed {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX82ec7fed",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX82ec7fed,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX82ec7fed",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentMethodsPostRequestFormBillingDetailsNameX82ec7fed(
    element: JsonElement,
): InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX82ec7fedInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsNameAnyOf2Xabe36a65 =
        element
            .isJsonDecodable<InlineV1PaymentMethodsPostRequestFormBillingDetailsNameAnyOf2Xabe36a65>()
    return InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX82ec7fedInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsNameAnyOf2Xabe36a65 = matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsNameAnyOf2Xabe36a65,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsNameAnyOf2Xabe36a65) {
                    add(
                        "InlineV1PaymentMethodsPostRequestFormBillingDetailsNameAnyOf2Xabe36a65: value does not match InlineV1PaymentMethodsPostRequestFormBillingDetailsNameAnyOf2Xabe36a65",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
