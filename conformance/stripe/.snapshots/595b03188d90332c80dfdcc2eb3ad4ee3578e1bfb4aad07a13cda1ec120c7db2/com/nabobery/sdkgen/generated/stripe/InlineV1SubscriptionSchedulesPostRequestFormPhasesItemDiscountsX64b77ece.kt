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
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX64b77eceBranch {
    Branch1,
    InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsAnyOf2Xd325d1f0,
}

public sealed class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX64b77eceDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX64b77eceNoMatchException(
    message: String,
) : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX64b77eceDecodingException(message)

internal data class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX64b77eceInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsAnyOf2Xd325d1f0: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsAnyOf2Xd325d1f0,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/discounts.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/discounts
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX64b77ece.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX64b77ece internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX64b77eceInspection,
) {
    public val branch1:
        List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsItemXaee47625>? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBranch1) {
                json
                    .decodeFromJsonElement<List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsItemXaee47625>>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsAnyOf2Xd325d1f0:
        InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsAnyOf2Xd325d1f0? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsAnyOf2Xd325d1f0) {
                json
                    .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsAnyOf2Xd325d1f0>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX64b77eceBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX64b77eceBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsAnyOf2Xd325d1f0) {
                    add(
                        InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX64b77eceBranch.InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsAnyOf2Xd325d1f0,
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
        ): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX64b77ece {
            val inspection = inspectInlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX64b77ece(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX64b77eceNoMatchException(
                    "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX64b77ece matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX64b77ece(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX64b77ece> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX64b77ece {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX64b77ece",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX64b77ece,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX64b77ece",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX64b77ece(
    element: JsonElement,
): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX64b77eceInspection {
    val matchesBranch1 =
        element.isJsonDecodable<List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsItemXaee47625>>() &&
            (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
    val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsAnyOf2Xd325d1f0 =
        element
            .isJsonDecodable<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsAnyOf2Xd325d1f0>()
    return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX64b77eceInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsAnyOf2Xd325d1f0 = matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsAnyOf2Xd325d1f0,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match List")
                if (!matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsAnyOf2Xd325d1f0) {
                    add(
                        "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsAnyOf2Xd325d1f0: value does not match InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsAnyOf2Xd325d1f0",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
