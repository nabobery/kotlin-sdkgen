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

public enum class InlinePayoutApplicationFeeX54ffd315Branch {
    Branch1,
    ApplicationFee,
}

public sealed class InlinePayoutApplicationFeeX54ffd315DecodingException(
    message: String,
) : SerializationException(message)

public class InlinePayoutApplicationFeeX54ffd315NoMatchException(
    message: String,
) : InlinePayoutApplicationFeeX54ffd315DecodingException(message)

internal data class InlinePayoutApplicationFeeX54ffd315Inspection(
    public val matchesBranch1: Boolean,
    public val matchesApplicationFee: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesApplicationFee).count { it }
}

/**
 * The application fee (if any) for the payout. [See the Connect
 * documentation](https://docs.stripe.com/connect/instant-payouts#monetization-and-fees) for details.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payout/properties/application_fee
 */
@Serializable(with = InlinePayoutApplicationFeeX54ffd315.Serializer::class)
public class InlinePayoutApplicationFeeX54ffd315 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePayoutApplicationFeeX54ffd315Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val applicationFee: ApplicationFee? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesApplicationFee) json.decodeFromJsonElement<ApplicationFee>(raw) else null
        }

    public val matchedBranches: Set<InlinePayoutApplicationFeeX54ffd315Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlinePayoutApplicationFeeX54ffd315Branch.Branch1)
                if (inspection.matchesApplicationFee) add(InlinePayoutApplicationFeeX54ffd315Branch.ApplicationFee)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlinePayoutApplicationFeeX54ffd315 {
            val inspection = inspectInlinePayoutApplicationFeeX54ffd315(raw)
            if (inspection.matchCount == 0) {
                throw InlinePayoutApplicationFeeX54ffd315NoMatchException(
                    "InlinePayoutApplicationFeeX54ffd315 matched 0 branches: " + inspection.failures.joinToString("; "),
                )
            }
            return InlinePayoutApplicationFeeX54ffd315(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePayoutApplicationFeeX54ffd315> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePayoutApplicationFeeX54ffd315 {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePayoutApplicationFeeX54ffd315")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePayoutApplicationFeeX54ffd315,
        ) {
            encoder.requireJsonEncoder("InlinePayoutApplicationFeeX54ffd315").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePayoutApplicationFeeX54ffd315(
    element: JsonElement,
): InlinePayoutApplicationFeeX54ffd315Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesApplicationFee = element.isJsonDecodable<ApplicationFee>()
    return InlinePayoutApplicationFeeX54ffd315Inspection(
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
