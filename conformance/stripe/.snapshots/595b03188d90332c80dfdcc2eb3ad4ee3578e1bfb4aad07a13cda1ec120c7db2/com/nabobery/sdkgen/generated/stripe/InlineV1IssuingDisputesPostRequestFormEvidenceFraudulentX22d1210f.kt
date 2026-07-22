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

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentX22d1210fBranch {
    InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X2216e780,
    InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf2X8556b646,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentX22d1210fDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentX22d1210fNoMatchException(
    message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentX22d1210fDecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentX22d1210fInspection(
    public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X2216e780: Boolean,
    public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf2X8556b646: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X2216e780,
                matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf2X8556b646,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/fraudulent.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/fraudulent
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentX22d1210f.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentX22d1210f internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentX22d1210fInspection,
) {
    public val inlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X2216e780:
        InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X2216e780? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X2216e780) {
                json
                    .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X2216e780>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf2X8556b646:
        InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf2X8556b646? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf2X8556b646) {
                json
                    .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf2X8556b646>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentX22d1210fBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X2216e780) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentX22d1210fBranch.InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X2216e780,
                    )
                }
                if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf2X8556b646) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentX22d1210fBranch.InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf2X8556b646,
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
        ): InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentX22d1210f {
            val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentX22d1210f(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentX22d1210fNoMatchException(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentX22d1210f matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentX22d1210f(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentX22d1210f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentX22d1210f {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentX22d1210f",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentX22d1210f,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentX22d1210f",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentX22d1210f(
    element: JsonElement,
): InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentX22d1210fInspection {
    val matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X2216e780 =
        element
            .isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X2216e780>()
    val matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf2X8556b646 =
        element
            .isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf2X8556b646>()
    return InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentX22d1210fInspection(
        matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X2216e780 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X2216e780,
        matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf2X8556b646 = matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf2X8556b646,
        failures =
            buildList {
                if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X2216e780) {
                    add(
                        "InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X2216e780: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf1X2216e780",
                    )
                }
                if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf2X8556b646) {
                    add(
                        "InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf2X8556b646: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceFraudulentAnyOf2X8556b646",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
