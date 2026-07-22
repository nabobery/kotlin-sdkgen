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

public enum class InlineDisputeChargeX166bce05Branch {
    Branch1,
    Charge,
}

public sealed class InlineDisputeChargeX166bce05DecodingException(
    message: String,
) : SerializationException(message)

public class InlineDisputeChargeX166bce05NoMatchException(
    message: String,
) : InlineDisputeChargeX166bce05DecodingException(message)

internal data class InlineDisputeChargeX166bce05Inspection(
    public val matchesBranch1: Boolean,
    public val matchesCharge: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesCharge).count { it }
}

/**
 * ID of the charge that's disputed.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/dispute/properties/charge
 */
@Serializable(with = InlineDisputeChargeX166bce05.Serializer::class)
public class InlineDisputeChargeX166bce05 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineDisputeChargeX166bce05Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val charge: Charge? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesCharge) json.decodeFromJsonElement<Charge>(raw) else null }

    public val matchedBranches: Set<InlineDisputeChargeX166bce05Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineDisputeChargeX166bce05Branch.Branch1)
                if (inspection.matchesCharge) add(InlineDisputeChargeX166bce05Branch.Charge)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineDisputeChargeX166bce05 {
            val inspection = inspectInlineDisputeChargeX166bce05(raw)
            if (inspection.matchCount == 0) {
                throw InlineDisputeChargeX166bce05NoMatchException(
                    "InlineDisputeChargeX166bce05 matched 0 branches: " + inspection.failures.joinToString("; "),
                )
            }
            return InlineDisputeChargeX166bce05(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineDisputeChargeX166bce05> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineDisputeChargeX166bce05 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineDisputeChargeX166bce05")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineDisputeChargeX166bce05,
        ) {
            encoder.requireJsonEncoder("InlineDisputeChargeX166bce05").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineDisputeChargeX166bce05(element: JsonElement): InlineDisputeChargeX166bce05Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesCharge = element.isJsonDecodable<Charge>()
    return InlineDisputeChargeX166bce05Inspection(
        matchesBranch1 = matchesBranch1,
        matchesCharge = matchesCharge,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesCharge) add("Charge: value does not match Charge")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
