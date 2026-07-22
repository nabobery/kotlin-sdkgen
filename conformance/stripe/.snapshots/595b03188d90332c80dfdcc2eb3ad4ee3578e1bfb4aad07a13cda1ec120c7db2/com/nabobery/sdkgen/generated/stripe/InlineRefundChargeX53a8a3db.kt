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

public enum class InlineRefundChargeX53a8a3dbBranch {
    Branch1,
    Charge,
}

public sealed class InlineRefundChargeX53a8a3dbDecodingException(
    message: String,
) : SerializationException(message)

public class InlineRefundChargeX53a8a3dbNoMatchException(
    message: String,
) : InlineRefundChargeX53a8a3dbDecodingException(message)

internal data class InlineRefundChargeX53a8a3dbInspection(
    public val matchesBranch1: Boolean,
    public val matchesCharge: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesCharge).count { it }
}

/**
 * ID of the charge that's refunded.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/refund/properties/charge
 */
@Serializable(with = InlineRefundChargeX53a8a3db.Serializer::class)
public class InlineRefundChargeX53a8a3db internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineRefundChargeX53a8a3dbInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val charge: Charge? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesCharge) json.decodeFromJsonElement<Charge>(raw) else null }

    public val matchedBranches: Set<InlineRefundChargeX53a8a3dbBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineRefundChargeX53a8a3dbBranch.Branch1)
                if (inspection.matchesCharge) add(InlineRefundChargeX53a8a3dbBranch.Charge)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineRefundChargeX53a8a3db {
            val inspection = inspectInlineRefundChargeX53a8a3db(raw)
            if (inspection.matchCount == 0) {
                throw InlineRefundChargeX53a8a3dbNoMatchException(
                    "InlineRefundChargeX53a8a3db matched 0 branches: " + inspection.failures.joinToString("; "),
                )
            }
            return InlineRefundChargeX53a8a3db(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineRefundChargeX53a8a3db> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineRefundChargeX53a8a3db {
            val jsonDecoder = decoder.requireJsonDecoder("InlineRefundChargeX53a8a3db")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineRefundChargeX53a8a3db,
        ) {
            encoder.requireJsonEncoder("InlineRefundChargeX53a8a3db").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineRefundChargeX53a8a3db(element: JsonElement): InlineRefundChargeX53a8a3dbInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesCharge = element.isJsonDecodable<Charge>()
    return InlineRefundChargeX53a8a3dbInspection(
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
