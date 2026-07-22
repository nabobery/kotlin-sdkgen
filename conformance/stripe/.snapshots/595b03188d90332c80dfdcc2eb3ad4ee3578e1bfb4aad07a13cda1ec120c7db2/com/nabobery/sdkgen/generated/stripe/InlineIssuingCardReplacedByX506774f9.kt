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

public enum class InlineIssuingCardReplacedByX506774f9Branch {
    Branch1,
    IssuingCard,
}

public sealed class InlineIssuingCardReplacedByX506774f9DecodingException(
    message: String,
) : SerializationException(message)

public class InlineIssuingCardReplacedByX506774f9NoMatchException(
    message: String,
) : InlineIssuingCardReplacedByX506774f9DecodingException(message)

internal data class InlineIssuingCardReplacedByX506774f9Inspection(
    public val matchesBranch1: Boolean,
    public val matchesIssuingCard: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesIssuingCard).count { it }
}

/**
 * The latest card that replaces this card, if any.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.card/properties/replaced_by
 */
@Serializable(with = InlineIssuingCardReplacedByX506774f9.Serializer::class)
public class InlineIssuingCardReplacedByX506774f9 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineIssuingCardReplacedByX506774f9Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val issuingCard: IssuingCard? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesIssuingCard) json.decodeFromJsonElement<IssuingCard>(raw) else null
        }

    public val matchedBranches: Set<InlineIssuingCardReplacedByX506774f9Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineIssuingCardReplacedByX506774f9Branch.Branch1)
                if (inspection.matchesIssuingCard) add(InlineIssuingCardReplacedByX506774f9Branch.IssuingCard)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineIssuingCardReplacedByX506774f9 {
            val inspection = inspectInlineIssuingCardReplacedByX506774f9(raw)
            if (inspection.matchCount == 0) {
                throw InlineIssuingCardReplacedByX506774f9NoMatchException(
                    "InlineIssuingCardReplacedByX506774f9 matched 0 branches: " +
                        inspection.failures.joinToString(
                            "; ",
                        ),
                )
            }
            return InlineIssuingCardReplacedByX506774f9(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineIssuingCardReplacedByX506774f9> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineIssuingCardReplacedByX506774f9 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingCardReplacedByX506774f9")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineIssuingCardReplacedByX506774f9,
        ) {
            encoder.requireJsonEncoder("InlineIssuingCardReplacedByX506774f9").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineIssuingCardReplacedByX506774f9(
    element: JsonElement,
): InlineIssuingCardReplacedByX506774f9Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesIssuingCard = element.isJsonDecodable<IssuingCard>()
    return InlineIssuingCardReplacedByX506774f9Inspection(
        matchesBranch1 = matchesBranch1,
        matchesIssuingCard = matchesIssuingCard,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesIssuingCard) add("IssuingCard: value does not match IssuingCard")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
