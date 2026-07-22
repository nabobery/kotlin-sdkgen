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

public enum class InlineForwardingRequestRequestContextXbafbd94fBranch {
    ForwardedRequestContext,
}

public sealed class InlineForwardingRequestRequestContextXbafbd94fDecodingException(
    message: String,
) : SerializationException(message)

public class InlineForwardingRequestRequestContextXbafbd94fNoMatchException(
    message: String,
) : InlineForwardingRequestRequestContextXbafbd94fDecodingException(message)

internal data class InlineForwardingRequestRequestContextXbafbd94fInspection(
    public val matchesForwardedRequestContext: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesForwardedRequestContext).count { it }
}

/**
 * Context about the request from Stripe's servers to the destination endpoint.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/forwarding.request/properties/request_context
 */
@Serializable(with = InlineForwardingRequestRequestContextXbafbd94f.Serializer::class)
public class InlineForwardingRequestRequestContextXbafbd94f internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineForwardingRequestRequestContextXbafbd94fInspection,
) {
    public val forwardedRequestContext: ForwardedRequestContextView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesForwardedRequestContext) {
                json.decodeFromJsonElement<ForwardedRequestContextView>(
                    raw,
                )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineForwardingRequestRequestContextXbafbd94fBranch>
        get() =
            buildSet {
                if (inspection.matchesForwardedRequestContext) {
                    add(
                        InlineForwardingRequestRequestContextXbafbd94fBranch.ForwardedRequestContext,
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
        ): InlineForwardingRequestRequestContextXbafbd94f {
            val inspection = inspectInlineForwardingRequestRequestContextXbafbd94f(raw)
            if (inspection.matchCount == 0) {
                throw InlineForwardingRequestRequestContextXbafbd94fNoMatchException(
                    "InlineForwardingRequestRequestContextXbafbd94f matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineForwardingRequestRequestContextXbafbd94f(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineForwardingRequestRequestContextXbafbd94f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineForwardingRequestRequestContextXbafbd94f {
            val jsonDecoder = decoder.requireJsonDecoder("InlineForwardingRequestRequestContextXbafbd94f")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineForwardingRequestRequestContextXbafbd94f,
        ) {
            encoder.requireJsonEncoder("InlineForwardingRequestRequestContextXbafbd94f").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineForwardingRequestRequestContextXbafbd94f(
    element: JsonElement,
): InlineForwardingRequestRequestContextXbafbd94fInspection {
    val raw =
        element as? JsonObject ?: return InlineForwardingRequestRequestContextXbafbd94fInspection(
            matchesForwardedRequestContext = false,
            failures = listOf("ForwardedRequestContext: expected JSON object"),
        )
    val matchesForwardedRequestContext = raw["destination_duration"] != null && raw["destination_ip_address"].isString()
    return InlineForwardingRequestRequestContextXbafbd94fInspection(
        matchesForwardedRequestContext = matchesForwardedRequestContext,
        failures =
            buildList {
                if (!matchesForwardedRequestContext) {
                    add(
                        "ForwardedRequestContext: required properties 'destination_duration', 'destination_ip_address' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
