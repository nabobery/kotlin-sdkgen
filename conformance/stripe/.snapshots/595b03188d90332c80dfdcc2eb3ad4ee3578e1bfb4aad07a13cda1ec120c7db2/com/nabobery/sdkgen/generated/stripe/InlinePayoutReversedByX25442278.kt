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

public enum class InlinePayoutReversedByX25442278Branch {
    Branch1,
    Payout,
}

public sealed class InlinePayoutReversedByX25442278DecodingException(
    message: String,
) : SerializationException(message)

public class InlinePayoutReversedByX25442278NoMatchException(
    message: String,
) : InlinePayoutReversedByX25442278DecodingException(message)

internal data class InlinePayoutReversedByX25442278Inspection(
    public val matchesBranch1: Boolean,
    public val matchesPayout: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesPayout).count { it }
}

/**
 * If the payout reverses, this is the ID of the payout that reverses this payout.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payout/properties/reversed_by
 */
@Serializable(with = InlinePayoutReversedByX25442278.Serializer::class)
public class InlinePayoutReversedByX25442278 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePayoutReversedByX25442278Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val payout: Payout? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesPayout) json.decodeFromJsonElement<Payout>(raw) else null }

    public val matchedBranches: Set<InlinePayoutReversedByX25442278Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlinePayoutReversedByX25442278Branch.Branch1)
                if (inspection.matchesPayout) add(InlinePayoutReversedByX25442278Branch.Payout)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlinePayoutReversedByX25442278 {
            val inspection = inspectInlinePayoutReversedByX25442278(raw)
            if (inspection.matchCount == 0) {
                throw InlinePayoutReversedByX25442278NoMatchException(
                    "InlinePayoutReversedByX25442278 matched 0 branches: " + inspection.failures.joinToString("; "),
                )
            }
            return InlinePayoutReversedByX25442278(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePayoutReversedByX25442278> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePayoutReversedByX25442278 {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePayoutReversedByX25442278")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePayoutReversedByX25442278,
        ) {
            encoder.requireJsonEncoder("InlinePayoutReversedByX25442278").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePayoutReversedByX25442278(element: JsonElement): InlinePayoutReversedByX25442278Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesPayout = element.isJsonDecodable<Payout>()
    return InlinePayoutReversedByX25442278Inspection(
        matchesBranch1 = matchesBranch1,
        matchesPayout = matchesPayout,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesPayout) add("Payout: value does not match Payout")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
