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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlinePaymentMethodCustomLogoX97938b2eBranch {
    CustomLogo,
}

public sealed class InlinePaymentMethodCustomLogoX97938b2eDecodingException(
    message: String,
) : SerializationException(message)

public class InlinePaymentMethodCustomLogoX97938b2eNoMatchException(
    message: String,
) : InlinePaymentMethodCustomLogoX97938b2eDecodingException(message)

internal data class InlinePaymentMethodCustomLogoX97938b2eInspection(
    public val matchesCustomLogo: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesCustomLogo).count { it }
}

/**
 * Contains information about the Dashboard-only CustomPaymentMethodType logo.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_custom/properties/logo
 */
@Serializable(with = InlinePaymentMethodCustomLogoX97938b2e.Serializer::class)
public class InlinePaymentMethodCustomLogoX97938b2e internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePaymentMethodCustomLogoX97938b2eInspection,
) {
    public val customLogo: CustomLogoView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesCustomLogo) json.decodeFromJsonElement<CustomLogoView>(raw) else null
        }

    public val matchedBranches: Set<InlinePaymentMethodCustomLogoX97938b2eBranch>
        get() =
            buildSet {
                if (inspection.matchesCustomLogo) add(InlinePaymentMethodCustomLogoX97938b2eBranch.CustomLogo)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlinePaymentMethodCustomLogoX97938b2e {
            val inspection = inspectInlinePaymentMethodCustomLogoX97938b2e(raw)
            if (inspection.matchCount == 0) {
                throw InlinePaymentMethodCustomLogoX97938b2eNoMatchException(
                    "InlinePaymentMethodCustomLogoX97938b2e matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePaymentMethodCustomLogoX97938b2e(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePaymentMethodCustomLogoX97938b2e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePaymentMethodCustomLogoX97938b2e {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodCustomLogoX97938b2e")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentMethodCustomLogoX97938b2e,
        ) {
            encoder.requireJsonEncoder("InlinePaymentMethodCustomLogoX97938b2e").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePaymentMethodCustomLogoX97938b2e(
    element: JsonElement,
): InlinePaymentMethodCustomLogoX97938b2eInspection {
    val raw =
        element as? JsonObject ?: return InlinePaymentMethodCustomLogoX97938b2eInspection(
            matchesCustomLogo = false,
            failures = listOf("CustomLogo: expected JSON object"),
        )
    val matchesCustomLogo = raw["url"].isString()
    return InlinePaymentMethodCustomLogoX97938b2eInspection(
        matchesCustomLogo = matchesCustomLogo,
        failures =
            buildList {
                if (!matchesCustomLogo) add("CustomLogo: required properties 'url' do not match their declared types")
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
