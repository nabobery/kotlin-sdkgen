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

public enum class InlineSetupIntentPaymentMethodOptionsXca95335aBranch {
    SetupIntentPaymentMethodOptions,
}

public sealed class InlineSetupIntentPaymentMethodOptionsXca95335aDecodingException(
    message: String,
) : SerializationException(message)

public class InlineSetupIntentPaymentMethodOptionsXca95335aNoMatchException(
    message: String,
) : InlineSetupIntentPaymentMethodOptionsXca95335aDecodingException(message)

internal data class InlineSetupIntentPaymentMethodOptionsXca95335aInspection(
    public val matchesSetupIntentPaymentMethodOptions: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesSetupIntentPaymentMethodOptions).count { it }
}

/**
 * Payment method-specific configuration for this SetupIntent.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent/properties/payment_method_options
 */
@Serializable(with = InlineSetupIntentPaymentMethodOptionsXca95335a.Serializer::class)
public class InlineSetupIntentPaymentMethodOptionsXca95335a internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineSetupIntentPaymentMethodOptionsXca95335aInspection,
) {
    public val setupIntentPaymentMethodOptions: SetupIntentPaymentMethodOptionsView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesSetupIntentPaymentMethodOptions) {
                json
                    .decodeFromJsonElement<SetupIntentPaymentMethodOptionsView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineSetupIntentPaymentMethodOptionsXca95335aBranch>
        get() =
            buildSet {
                if (inspection.matchesSetupIntentPaymentMethodOptions) {
                    add(
                        InlineSetupIntentPaymentMethodOptionsXca95335aBranch.SetupIntentPaymentMethodOptions,
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
        ): InlineSetupIntentPaymentMethodOptionsXca95335a {
            val inspection = inspectInlineSetupIntentPaymentMethodOptionsXca95335a(raw)
            if (inspection.matchCount == 0) {
                throw InlineSetupIntentPaymentMethodOptionsXca95335aNoMatchException(
                    "InlineSetupIntentPaymentMethodOptionsXca95335a matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineSetupIntentPaymentMethodOptionsXca95335a(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineSetupIntentPaymentMethodOptionsXca95335a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineSetupIntentPaymentMethodOptionsXca95335a {
            val jsonDecoder = decoder.requireJsonDecoder("InlineSetupIntentPaymentMethodOptionsXca95335a")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSetupIntentPaymentMethodOptionsXca95335a,
        ) {
            encoder.requireJsonEncoder("InlineSetupIntentPaymentMethodOptionsXca95335a").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineSetupIntentPaymentMethodOptionsXca95335a(
    element: JsonElement,
): InlineSetupIntentPaymentMethodOptionsXca95335aInspection {
    val raw =
        element as? JsonObject ?: return InlineSetupIntentPaymentMethodOptionsXca95335aInspection(
            matchesSetupIntentPaymentMethodOptions = false,
            failures = listOf("SetupIntentPaymentMethodOptions: expected JSON object"),
        )
    val matchesSetupIntentPaymentMethodOptions = true
    return InlineSetupIntentPaymentMethodOptionsXca95335aInspection(
        matchesSetupIntentPaymentMethodOptions = matchesSetupIntentPaymentMethodOptions,
        failures =
            buildList {
                if (!matchesSetupIntentPaymentMethodOptions) {
                    add(
                        "SetupIntentPaymentMethodOptions: required properties  do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
