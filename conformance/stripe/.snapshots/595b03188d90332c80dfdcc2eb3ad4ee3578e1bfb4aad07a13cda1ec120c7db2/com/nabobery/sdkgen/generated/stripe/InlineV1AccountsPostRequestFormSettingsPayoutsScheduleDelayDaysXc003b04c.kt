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

public enum class InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysXc003b04cBranch {
    InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1X8a5e306a,
    Branch2,
}

public sealed class InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysXc003b04cDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysXc003b04cNoMatchException(
    message: String,
) : InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysXc003b04cDecodingException(message)

internal data class InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysXc003b04cInspection(
    public val matchesInlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1X8a5e306a: Boolean,
    public val matchesBranch2: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1X8a5e306a,
                matchesBranch2,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/settings/properties/payouts/properties/schedule/properties/delay_days.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/settings/properties/payouts/properties/schedule/properties/delay_days
 */
@Serializable(with = InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysXc003b04c.Serializer::class)
public class InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysXc003b04c internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysXc003b04cInspection,
) {
    public val inlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1X8a5e306a:
        InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1X8a5e306a? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1X8a5e306a) {
                json
                    .decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1X8a5e306a>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val branch2: Int? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

    public val matchedBranches:
        Set<InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysXc003b04cBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1X8a5e306a) {
                    add(
                        InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysXc003b04cBranch.InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1X8a5e306a,
                    )
                }
                if (inspection.matchesBranch2) {
                    add(
                        InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysXc003b04cBranch.Branch2,
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
        ): InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysXc003b04c {
            val inspection = inspectInlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysXc003b04c(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysXc003b04cNoMatchException(
                    "InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysXc003b04c matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysXc003b04c(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysXc003b04c> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysXc003b04c {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysXc003b04c",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysXc003b04c,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysXc003b04c",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysXc003b04c(
    element: JsonElement,
): InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysXc003b04cInspection {
    val matchesInlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1X8a5e306a =
        element
            .isJsonDecodable<InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1X8a5e306a>()
    val matchesBranch2 = element.isJsonDecodable<Int>()
    return InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysXc003b04cInspection(
        matchesInlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1X8a5e306a = matchesInlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1X8a5e306a,
        matchesBranch2 = matchesBranch2,
        failures =
            buildList {
                if (!matchesInlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1X8a5e306a) {
                    add(
                        "InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1X8a5e306a: value does not match InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1X8a5e306a",
                    )
                }
                if (!matchesBranch2) add("Branch2: value does not match Int")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
