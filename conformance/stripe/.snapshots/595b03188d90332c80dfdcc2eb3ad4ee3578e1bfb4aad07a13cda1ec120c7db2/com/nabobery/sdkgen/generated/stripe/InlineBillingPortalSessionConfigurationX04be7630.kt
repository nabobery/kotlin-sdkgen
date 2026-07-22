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

public enum class InlineBillingPortalSessionConfigurationX04be7630Branch {
    Branch1,
    BillingPortalConfiguration,
}

public sealed class InlineBillingPortalSessionConfigurationX04be7630DecodingException(
    message: String,
) : SerializationException(message)

public class InlineBillingPortalSessionConfigurationX04be7630NoMatchException(
    message: String,
) : InlineBillingPortalSessionConfigurationX04be7630DecodingException(message)

internal data class InlineBillingPortalSessionConfigurationX04be7630Inspection(
    public val matchesBranch1: Boolean,
    public val matchesBillingPortalConfiguration: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesBillingPortalConfiguration).count { it }
}

/**
 * The configuration used by this session, describing the features available.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing_portal.session/properties/configuration
 */
@Serializable(with = InlineBillingPortalSessionConfigurationX04be7630.Serializer::class)
public class InlineBillingPortalSessionConfigurationX04be7630 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineBillingPortalSessionConfigurationX04be7630Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val billingPortalConfiguration: BillingPortalConfiguration? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBillingPortalConfiguration) {
                json.decodeFromJsonElement<BillingPortalConfiguration>(
                    raw,
                )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineBillingPortalSessionConfigurationX04be7630Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineBillingPortalSessionConfigurationX04be7630Branch.Branch1)
                if (inspection.matchesBillingPortalConfiguration) {
                    add(
                        InlineBillingPortalSessionConfigurationX04be7630Branch.BillingPortalConfiguration,
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
        ): InlineBillingPortalSessionConfigurationX04be7630 {
            val inspection = inspectInlineBillingPortalSessionConfigurationX04be7630(raw)
            if (inspection.matchCount == 0) {
                throw InlineBillingPortalSessionConfigurationX04be7630NoMatchException(
                    "InlineBillingPortalSessionConfigurationX04be7630 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineBillingPortalSessionConfigurationX04be7630(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineBillingPortalSessionConfigurationX04be7630> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineBillingPortalSessionConfigurationX04be7630 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineBillingPortalSessionConfigurationX04be7630")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineBillingPortalSessionConfigurationX04be7630,
        ) {
            encoder.requireJsonEncoder("InlineBillingPortalSessionConfigurationX04be7630").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineBillingPortalSessionConfigurationX04be7630(
    element: JsonElement,
): InlineBillingPortalSessionConfigurationX04be7630Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesBillingPortalConfiguration = element.isJsonDecodable<BillingPortalConfiguration>()
    return InlineBillingPortalSessionConfigurationX04be7630Inspection(
        matchesBranch1 = matchesBranch1,
        matchesBillingPortalConfiguration = matchesBillingPortalConfiguration,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesBillingPortalConfiguration) {
                    add(
                        "BillingPortalConfiguration: value does not match BillingPortalConfiguration",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
