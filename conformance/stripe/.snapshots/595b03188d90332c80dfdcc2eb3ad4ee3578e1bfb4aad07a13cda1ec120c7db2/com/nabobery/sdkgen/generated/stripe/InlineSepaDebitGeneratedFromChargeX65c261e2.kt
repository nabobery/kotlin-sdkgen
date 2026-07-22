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

public enum class InlineSepaDebitGeneratedFromChargeX65c261e2Branch {
    Branch1,
    Charge,
}

public sealed class InlineSepaDebitGeneratedFromChargeX65c261e2DecodingException(
    message: String,
) : SerializationException(message)

public class InlineSepaDebitGeneratedFromChargeX65c261e2NoMatchException(
    message: String,
) : InlineSepaDebitGeneratedFromChargeX65c261e2DecodingException(message)

internal data class InlineSepaDebitGeneratedFromChargeX65c261e2Inspection(
    public val matchesBranch1: Boolean,
    public val matchesCharge: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesCharge).count { it }
}

/**
 * The ID of the Charge that generated this PaymentMethod, if any.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/sepa_debit_generated_from/properties/charge
 */
@Serializable(with = InlineSepaDebitGeneratedFromChargeX65c261e2.Serializer::class)
public class InlineSepaDebitGeneratedFromChargeX65c261e2 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineSepaDebitGeneratedFromChargeX65c261e2Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val charge: Charge? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesCharge) json.decodeFromJsonElement<Charge>(raw) else null }

    public val matchedBranches: Set<InlineSepaDebitGeneratedFromChargeX65c261e2Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineSepaDebitGeneratedFromChargeX65c261e2Branch.Branch1)
                if (inspection.matchesCharge) add(InlineSepaDebitGeneratedFromChargeX65c261e2Branch.Charge)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineSepaDebitGeneratedFromChargeX65c261e2 {
            val inspection = inspectInlineSepaDebitGeneratedFromChargeX65c261e2(raw)
            if (inspection.matchCount == 0) {
                throw InlineSepaDebitGeneratedFromChargeX65c261e2NoMatchException(
                    "InlineSepaDebitGeneratedFromChargeX65c261e2 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineSepaDebitGeneratedFromChargeX65c261e2(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineSepaDebitGeneratedFromChargeX65c261e2> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineSepaDebitGeneratedFromChargeX65c261e2 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineSepaDebitGeneratedFromChargeX65c261e2")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSepaDebitGeneratedFromChargeX65c261e2,
        ) {
            encoder.requireJsonEncoder("InlineSepaDebitGeneratedFromChargeX65c261e2").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineSepaDebitGeneratedFromChargeX65c261e2(
    element: JsonElement,
): InlineSepaDebitGeneratedFromChargeX65c261e2Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesCharge = element.isJsonDecodable<Charge>()
    return InlineSepaDebitGeneratedFromChargeX65c261e2Inspection(
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
