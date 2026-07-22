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

public enum class InlineSourceOwnerXc08c428dBranch {
    SourceOwner,
}

public sealed class InlineSourceOwnerXc08c428dDecodingException(
    message: String,
) : SerializationException(message)

public class InlineSourceOwnerXc08c428dNoMatchException(
    message: String,
) : InlineSourceOwnerXc08c428dDecodingException(message)

internal data class InlineSourceOwnerXc08c428dInspection(
    public val matchesSourceOwner: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesSourceOwner).count { it }
}

/**
 * Information about the owner of the payment instrument that may be used or required by particular source types.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/source/properties/owner
 */
@Serializable(with = InlineSourceOwnerXc08c428d.Serializer::class)
public class InlineSourceOwnerXc08c428d internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineSourceOwnerXc08c428dInspection,
) {
    public val sourceOwner: SourceOwnerView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesSourceOwner) json.decodeFromJsonElement<SourceOwnerView>(raw) else null
        }

    public val matchedBranches: Set<InlineSourceOwnerXc08c428dBranch>
        get() =
            buildSet {
                if (inspection.matchesSourceOwner) add(InlineSourceOwnerXc08c428dBranch.SourceOwner)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineSourceOwnerXc08c428d {
            val inspection = inspectInlineSourceOwnerXc08c428d(raw)
            if (inspection.matchCount == 0) {
                throw InlineSourceOwnerXc08c428dNoMatchException(
                    "InlineSourceOwnerXc08c428d matched 0 branches: " + inspection.failures.joinToString("; "),
                )
            }
            return InlineSourceOwnerXc08c428d(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineSourceOwnerXc08c428d> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineSourceOwnerXc08c428d {
            val jsonDecoder = decoder.requireJsonDecoder("InlineSourceOwnerXc08c428d")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSourceOwnerXc08c428d,
        ) {
            encoder.requireJsonEncoder("InlineSourceOwnerXc08c428d").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineSourceOwnerXc08c428d(element: JsonElement): InlineSourceOwnerXc08c428dInspection {
    val raw =
        element as? JsonObject ?: return InlineSourceOwnerXc08c428dInspection(
            matchesSourceOwner = false,
            failures = listOf("SourceOwner: expected JSON object"),
        )
    val matchesSourceOwner = true
    return InlineSourceOwnerXc08c428dInspection(
        matchesSourceOwner = matchesSourceOwner,
        failures =
            buildList {
                if (!matchesSourceOwner) add("SourceOwner: required properties  do not match their declared types")
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
