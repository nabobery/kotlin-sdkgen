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

public enum class InlineFeeRefundFeeX229a86d0Branch {
    Branch1,
    ApplicationFee,
}

public sealed class InlineFeeRefundFeeX229a86d0DecodingException(
    message: String,
) : SerializationException(message)

public class InlineFeeRefundFeeX229a86d0NoMatchException(
    message: String,
) : InlineFeeRefundFeeX229a86d0DecodingException(message)

internal data class InlineFeeRefundFeeX229a86d0Inspection(
    public val matchesBranch1: Boolean,
    public val matchesApplicationFee: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesApplicationFee).count { it }
}

/**
 * ID of the application fee that was refunded.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/fee_refund/properties/fee
 */
@Serializable(with = InlineFeeRefundFeeX229a86d0.Serializer::class)
public class InlineFeeRefundFeeX229a86d0 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineFeeRefundFeeX229a86d0Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val applicationFee: ApplicationFee? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesApplicationFee) json.decodeFromJsonElement<ApplicationFee>(raw) else null
        }

    public val matchedBranches: Set<InlineFeeRefundFeeX229a86d0Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineFeeRefundFeeX229a86d0Branch.Branch1)
                if (inspection.matchesApplicationFee) add(InlineFeeRefundFeeX229a86d0Branch.ApplicationFee)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineFeeRefundFeeX229a86d0 {
            val inspection = inspectInlineFeeRefundFeeX229a86d0(raw)
            if (inspection.matchCount == 0) {
                throw InlineFeeRefundFeeX229a86d0NoMatchException(
                    "InlineFeeRefundFeeX229a86d0 matched 0 branches: " + inspection.failures.joinToString("; "),
                )
            }
            return InlineFeeRefundFeeX229a86d0(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineFeeRefundFeeX229a86d0> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineFeeRefundFeeX229a86d0 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineFeeRefundFeeX229a86d0")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineFeeRefundFeeX229a86d0,
        ) {
            encoder.requireJsonEncoder("InlineFeeRefundFeeX229a86d0").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineFeeRefundFeeX229a86d0(element: JsonElement): InlineFeeRefundFeeX229a86d0Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesApplicationFee = element.isJsonDecodable<ApplicationFee>()
    return InlineFeeRefundFeeX229a86d0Inspection(
        matchesBranch1 = matchesBranch1,
        matchesApplicationFee = matchesApplicationFee,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesApplicationFee) add("ApplicationFee: value does not match ApplicationFee")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
