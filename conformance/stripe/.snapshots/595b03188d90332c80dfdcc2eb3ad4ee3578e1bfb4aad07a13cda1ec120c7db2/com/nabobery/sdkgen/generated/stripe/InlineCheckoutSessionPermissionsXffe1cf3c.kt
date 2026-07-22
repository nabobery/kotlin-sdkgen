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

public enum class InlineCheckoutSessionPermissionsXffe1cf3cBranch {
    PaymentPagesCheckoutSessionPermissions,
}

public sealed class InlineCheckoutSessionPermissionsXffe1cf3cDecodingException(
    message: String,
) : SerializationException(message)

public class InlineCheckoutSessionPermissionsXffe1cf3cNoMatchException(
    message: String,
) : InlineCheckoutSessionPermissionsXffe1cf3cDecodingException(message)

internal data class InlineCheckoutSessionPermissionsXffe1cf3cInspection(
    public val matchesPaymentPagesCheckoutSessionPermissions: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesPaymentPagesCheckoutSessionPermissions).count { it }
}

/**
 * This property is used to set up permissions for various actions (e.g., update) on the CheckoutSession object.
 *
 * For specific permissions, please refer to their dedicated subsections, such as `permissions.update_shipping_details`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout.session/properties/permissions
 */
@Serializable(with = InlineCheckoutSessionPermissionsXffe1cf3c.Serializer::class)
public class InlineCheckoutSessionPermissionsXffe1cf3c internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineCheckoutSessionPermissionsXffe1cf3cInspection,
) {
    public val paymentPagesCheckoutSessionPermissions: PaymentPagesCheckoutSessionPermissionsView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPaymentPagesCheckoutSessionPermissions) {
                json
                    .decodeFromJsonElement<PaymentPagesCheckoutSessionPermissionsView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineCheckoutSessionPermissionsXffe1cf3cBranch>
        get() =
            buildSet {
                if (inspection.matchesPaymentPagesCheckoutSessionPermissions) {
                    add(
                        InlineCheckoutSessionPermissionsXffe1cf3cBranch.PaymentPagesCheckoutSessionPermissions,
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
        ): InlineCheckoutSessionPermissionsXffe1cf3c {
            val inspection = inspectInlineCheckoutSessionPermissionsXffe1cf3c(raw)
            if (inspection.matchCount == 0) {
                throw InlineCheckoutSessionPermissionsXffe1cf3cNoMatchException(
                    "InlineCheckoutSessionPermissionsXffe1cf3c matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineCheckoutSessionPermissionsXffe1cf3c(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineCheckoutSessionPermissionsXffe1cf3c> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineCheckoutSessionPermissionsXffe1cf3c {
            val jsonDecoder = decoder.requireJsonDecoder("InlineCheckoutSessionPermissionsXffe1cf3c")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineCheckoutSessionPermissionsXffe1cf3c,
        ) {
            encoder.requireJsonEncoder("InlineCheckoutSessionPermissionsXffe1cf3c").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineCheckoutSessionPermissionsXffe1cf3c(
    element: JsonElement,
): InlineCheckoutSessionPermissionsXffe1cf3cInspection {
    val raw =
        element as? JsonObject ?: return InlineCheckoutSessionPermissionsXffe1cf3cInspection(
            matchesPaymentPagesCheckoutSessionPermissions = false,
            failures = listOf("PaymentPagesCheckoutSessionPermissions: expected JSON object"),
        )
    val matchesPaymentPagesCheckoutSessionPermissions = true
    return InlineCheckoutSessionPermissionsXffe1cf3cInspection(
        matchesPaymentPagesCheckoutSessionPermissions = matchesPaymentPagesCheckoutSessionPermissions,
        failures =
            buildList {
                if (!matchesPaymentPagesCheckoutSessionPermissions) {
                    add(
                        "PaymentPagesCheckoutSessionPermissions: required properties  do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
