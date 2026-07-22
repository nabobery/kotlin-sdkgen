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

public enum class InlinePaymentLinksResourceConsentCollectionPaymentMethodReuseAgreementX67a103a5Branch {
    PaymentLinksResourcePaymentMethodReuseAgreement,
}

public sealed class InlinePaymentLinksResourceConsentCollectionPaymentMethodReuseAgreementX67a103a5DecodingException(
    message: String,
) : SerializationException(message)

public class InlinePaymentLinksResourceConsentCollectionPaymentMethodReuseAgreementX67a103a5NoMatchException(
    message: String,
) : InlinePaymentLinksResourceConsentCollectionPaymentMethodReuseAgreementX67a103a5DecodingException(message)

internal data class InlinePaymentLinksResourceConsentCollectionPaymentMethodReuseAgreementX67a103a5Inspection(
    public val matchesPaymentLinksResourcePaymentMethodReuseAgreement: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesPaymentLinksResourcePaymentMethodReuseAgreement).count { it }
}

/**
 * Settings related to the payment method reuse text shown in the Checkout UI.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_links_resource_consent_collection/properties/payment_method_
 * reuse_agreement
 */
@Serializable(with = InlinePaymentLinksResourceConsentCollectionPaymentMethodReuseAgreementX67a103a5.Serializer::class)
public class InlinePaymentLinksResourceConsentCollectionPaymentMethodReuseAgreementX67a103a5 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePaymentLinksResourceConsentCollectionPaymentMethodReuseAgreementX67a103a5Inspection,
) {
    public val paymentLinksResourcePaymentMethodReuseAgreement:
        PaymentLinksResourcePaymentMethodReuseAgreementView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPaymentLinksResourcePaymentMethodReuseAgreement) {
                json
                    .decodeFromJsonElement<PaymentLinksResourcePaymentMethodReuseAgreementView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlinePaymentLinksResourceConsentCollectionPaymentMethodReuseAgreementX67a103a5Branch>
        get() =
            buildSet {
                if (inspection.matchesPaymentLinksResourcePaymentMethodReuseAgreement) {
                    add(
                        InlinePaymentLinksResourceConsentCollectionPaymentMethodReuseAgreementX67a103a5Branch.PaymentLinksResourcePaymentMethodReuseAgreement,
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
        ): InlinePaymentLinksResourceConsentCollectionPaymentMethodReuseAgreementX67a103a5 {
            val inspection = inspectInlinePaymentLinksResourceConsentCollectionPaymentMethodReuseAgreementX67a103a5(raw)
            if (inspection.matchCount == 0) {
                throw InlinePaymentLinksResourceConsentCollectionPaymentMethodReuseAgreementX67a103a5NoMatchException(
                    "InlinePaymentLinksResourceConsentCollectionPaymentMethodReuseAgreementX67a103a5 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePaymentLinksResourceConsentCollectionPaymentMethodReuseAgreementX67a103a5(
                raw,
                json,
                inspection,
            )
        }
    }

    public object Serializer : KSerializer<InlinePaymentLinksResourceConsentCollectionPaymentMethodReuseAgreementX67a103a5> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlinePaymentLinksResourceConsentCollectionPaymentMethodReuseAgreementX67a103a5 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlinePaymentLinksResourceConsentCollectionPaymentMethodReuseAgreementX67a103a5",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentLinksResourceConsentCollectionPaymentMethodReuseAgreementX67a103a5,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlinePaymentLinksResourceConsentCollectionPaymentMethodReuseAgreementX67a103a5",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePaymentLinksResourceConsentCollectionPaymentMethodReuseAgreementX67a103a5(
    element: JsonElement,
): InlinePaymentLinksResourceConsentCollectionPaymentMethodReuseAgreementX67a103a5Inspection {
    val raw =
        element as? JsonObject
            ?: return InlinePaymentLinksResourceConsentCollectionPaymentMethodReuseAgreementX67a103a5Inspection(
                matchesPaymentLinksResourcePaymentMethodReuseAgreement = false,
                failures = listOf("PaymentLinksResourcePaymentMethodReuseAgreement: expected JSON object"),
            )
    val matchesPaymentLinksResourcePaymentMethodReuseAgreement = raw["position"] != null
    return InlinePaymentLinksResourceConsentCollectionPaymentMethodReuseAgreementX67a103a5Inspection(
        matchesPaymentLinksResourcePaymentMethodReuseAgreement = matchesPaymentLinksResourcePaymentMethodReuseAgreement,
        failures =
            buildList {
                if (!matchesPaymentLinksResourcePaymentMethodReuseAgreement) {
                    add(
                        "PaymentLinksResourcePaymentMethodReuseAgreement: required properties 'position' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
