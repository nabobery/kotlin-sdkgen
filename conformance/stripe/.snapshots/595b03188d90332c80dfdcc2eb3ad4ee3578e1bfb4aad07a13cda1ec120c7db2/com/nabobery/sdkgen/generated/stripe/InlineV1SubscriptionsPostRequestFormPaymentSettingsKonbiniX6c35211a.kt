package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniX6c35211aBranch {
    Branch1,
    InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xab9dd78f,
}

public sealed class InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniX6c35211aDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniX6c35211aNoMatchException(
    message: String,
) : InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniX6c35211aDecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniX6c35211aInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xab9dd78f: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xab9dd78f,
            ).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/konbini.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/konbini
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniX6c35211a.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniX6c35211a internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniX6c35211aInspection,
) {
    public val branch1: JsonObject? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

    public val inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xab9dd78f:
        InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xab9dd78f? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xab9dd78f) {
                json
                    .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xab9dd78f>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniX6c35211aBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniX6c35211aBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xab9dd78f) {
                    add(
                        InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniX6c35211aBranch.InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xab9dd78f,
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
        ): InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniX6c35211a {
            val inspection = inspectInlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniX6c35211a(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniX6c35211aNoMatchException(
                    "InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniX6c35211a matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniX6c35211a(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniX6c35211a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniX6c35211a {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniX6c35211a",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniX6c35211a,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniX6c35211a",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniX6c35211a(
    element: JsonElement,
): InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniX6c35211aInspection {
    val matchesBranch1 = element.isJsonDecodable<JsonObject>()
    val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xab9dd78f =
        element
            .isJsonDecodable<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xab9dd78f>()
    return InlineV1SubscriptionsPostRequestFormPaymentSettingsKonbiniX6c35211aInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xab9dd78f = matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xab9dd78f,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match JsonObject")
                if (!matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xab9dd78f) {
                    add(
                        "InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xab9dd78f: value does not match InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xab9dd78f",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
