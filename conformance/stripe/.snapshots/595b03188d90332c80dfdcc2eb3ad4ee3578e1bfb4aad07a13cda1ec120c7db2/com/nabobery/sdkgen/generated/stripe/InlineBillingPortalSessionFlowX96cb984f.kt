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

public enum class InlineBillingPortalSessionFlowX96cb984fBranch {
    PortalFlowsFlow,
}

public sealed class InlineBillingPortalSessionFlowX96cb984fDecodingException(
    message: String,
) : SerializationException(message)

public class InlineBillingPortalSessionFlowX96cb984fNoMatchException(
    message: String,
) : InlineBillingPortalSessionFlowX96cb984fDecodingException(message)

internal data class InlineBillingPortalSessionFlowX96cb984fInspection(
    public val matchesPortalFlowsFlow: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesPortalFlowsFlow).count { it }
}

/**
 * Information about a specific flow for the customer to go through. See the
 * [docs](https://docs.stripe.com/customer-management/portal-deep-links) to learn more about using customer portal deep
 * links and flows.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing_portal.session/properties/flow
 */
@Serializable(with = InlineBillingPortalSessionFlowX96cb984f.Serializer::class)
public class InlineBillingPortalSessionFlowX96cb984f internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineBillingPortalSessionFlowX96cb984fInspection,
) {
    public val portalFlowsFlow: PortalFlowsFlowView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPortalFlowsFlow) json.decodeFromJsonElement<PortalFlowsFlowView>(raw) else null
        }

    public val matchedBranches: Set<InlineBillingPortalSessionFlowX96cb984fBranch>
        get() =
            buildSet {
                if (inspection.matchesPortalFlowsFlow) {
                    add(
                        InlineBillingPortalSessionFlowX96cb984fBranch.PortalFlowsFlow,
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
        ): InlineBillingPortalSessionFlowX96cb984f {
            val inspection = inspectInlineBillingPortalSessionFlowX96cb984f(raw)
            if (inspection.matchCount == 0) {
                throw InlineBillingPortalSessionFlowX96cb984fNoMatchException(
                    "InlineBillingPortalSessionFlowX96cb984f matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineBillingPortalSessionFlowX96cb984f(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineBillingPortalSessionFlowX96cb984f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineBillingPortalSessionFlowX96cb984f {
            val jsonDecoder = decoder.requireJsonDecoder("InlineBillingPortalSessionFlowX96cb984f")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineBillingPortalSessionFlowX96cb984f,
        ) {
            encoder.requireJsonEncoder("InlineBillingPortalSessionFlowX96cb984f").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineBillingPortalSessionFlowX96cb984f(
    element: JsonElement,
): InlineBillingPortalSessionFlowX96cb984fInspection {
    val raw =
        element as? JsonObject ?: return InlineBillingPortalSessionFlowX96cb984fInspection(
            matchesPortalFlowsFlow = false,
            failures = listOf("PortalFlowsFlow: expected JSON object"),
        )
    val matchesPortalFlowsFlow = raw["after_completion"] != null && raw["type"] != null
    return InlineBillingPortalSessionFlowX96cb984fInspection(
        matchesPortalFlowsFlow = matchesPortalFlowsFlow,
        failures =
            buildList {
                if (!matchesPortalFlowsFlow) {
                    add(
                        "PortalFlowsFlow: required properties 'after_completion', 'type' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
