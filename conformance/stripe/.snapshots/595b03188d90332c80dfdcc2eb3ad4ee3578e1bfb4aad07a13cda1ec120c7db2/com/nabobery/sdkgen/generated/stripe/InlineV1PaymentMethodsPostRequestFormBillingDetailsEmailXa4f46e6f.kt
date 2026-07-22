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

public enum class InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailXa4f46e6fBranch {
    Branch1,
    InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailAnyOf2Xc48d18dd,
}

public sealed class InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailXa4f46e6fDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailXa4f46e6fNoMatchException(
    message: String,
) : InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailXa4f46e6fDecodingException(message)

internal data class InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailXa4f46e6fInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsEmailAnyOf2Xc48d18dd: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsEmailAnyOf2Xc48d18dd,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods~1{payment_method}/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/billing_details/properties/email.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods~1{payment_method}/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/billing_details/properties/email
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailXa4f46e6f.Serializer::class)
public class InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailXa4f46e6f internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailXa4f46e6fInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1PaymentMethodsPostRequestFormBillingDetailsEmailAnyOf2Xc48d18dd:
        InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailAnyOf2Xc48d18dd? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsEmailAnyOf2Xc48d18dd) {
                json
                    .decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailAnyOf2Xc48d18dd>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailXa4f46e6fBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailXa4f46e6fBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsEmailAnyOf2Xc48d18dd) {
                    add(
                        InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailXa4f46e6fBranch.InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailAnyOf2Xc48d18dd,
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
        ): InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailXa4f46e6f {
            val inspection = inspectInlineV1PaymentMethodsPostRequestFormBillingDetailsEmailXa4f46e6f(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailXa4f46e6fNoMatchException(
                    "InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailXa4f46e6f matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailXa4f46e6f(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailXa4f46e6f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailXa4f46e6f {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailXa4f46e6f",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailXa4f46e6f,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailXa4f46e6f",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentMethodsPostRequestFormBillingDetailsEmailXa4f46e6f(
    element: JsonElement,
): InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailXa4f46e6fInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsEmailAnyOf2Xc48d18dd =
        element
            .isJsonDecodable<InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailAnyOf2Xc48d18dd>()
    return InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailXa4f46e6fInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsEmailAnyOf2Xc48d18dd = matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsEmailAnyOf2Xc48d18dd,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsEmailAnyOf2Xc48d18dd) {
                    add(
                        "InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailAnyOf2Xc48d18dd: value does not match InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailAnyOf2Xc48d18dd",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
