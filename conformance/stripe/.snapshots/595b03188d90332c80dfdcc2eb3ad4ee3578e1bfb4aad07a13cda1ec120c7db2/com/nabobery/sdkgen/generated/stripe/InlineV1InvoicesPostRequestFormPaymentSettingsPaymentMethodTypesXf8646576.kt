package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesXf8646576Branch {
    Branch1,
    InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesAnyOf2Xf8dee414,
}

public sealed class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesXf8646576DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesXf8646576NoMatchException(
    message: String,
) : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesXf8646576DecodingException(message)

internal data class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesXf8646576Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesAnyOf2Xf8dee414: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesAnyOf2Xf8dee414,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_types.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_types
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesXf8646576.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesXf8646576 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesXf8646576Inspection,
) {
    public val branch1:
        List<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5>? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBranch1) {
                json
                    .decodeFromJsonElement<List<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5>>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesAnyOf2Xf8dee414:
        InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesAnyOf2Xf8dee414? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesAnyOf2Xf8dee414) {
                json
                    .decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesAnyOf2Xf8dee414>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesXf8646576Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesXf8646576Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesAnyOf2Xf8dee414) {
                    add(
                        InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesXf8646576Branch.InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesAnyOf2Xf8dee414,
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
        ): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesXf8646576 {
            val inspection = inspectInlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesXf8646576(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesXf8646576NoMatchException(
                    "InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesXf8646576 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesXf8646576(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesXf8646576> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesXf8646576 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesXf8646576",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesXf8646576,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesXf8646576",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesXf8646576(
    element: JsonElement,
): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesXf8646576Inspection {
    val matchesBranch1 =
        element.isJsonDecodable<List<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5>>() &&
            (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
    val matchesInlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesAnyOf2Xf8dee414 =
        element
            .isJsonDecodable<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesAnyOf2Xf8dee414>()
    return InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesXf8646576Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesAnyOf2Xf8dee414 = matchesInlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesAnyOf2Xf8dee414,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match List")
                if (!matchesInlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesAnyOf2Xf8dee414) {
                    add(
                        "InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesAnyOf2Xf8dee414: value does not match InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesAnyOf2Xf8dee414",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
