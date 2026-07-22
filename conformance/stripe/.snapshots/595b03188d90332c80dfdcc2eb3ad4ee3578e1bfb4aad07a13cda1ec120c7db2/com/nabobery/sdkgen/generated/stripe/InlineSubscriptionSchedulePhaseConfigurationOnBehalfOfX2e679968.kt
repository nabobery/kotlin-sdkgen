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

public enum class InlineSubscriptionSchedulePhaseConfigurationOnBehalfOfX2e679968Branch {
    Branch1,
    Account,
}

public sealed class InlineSubscriptionSchedulePhaseConfigurationOnBehalfOfX2e679968DecodingException(
    message: String,
) : SerializationException(message)

public class InlineSubscriptionSchedulePhaseConfigurationOnBehalfOfX2e679968NoMatchException(
    message: String,
) : InlineSubscriptionSchedulePhaseConfigurationOnBehalfOfX2e679968DecodingException(message)

internal data class InlineSubscriptionSchedulePhaseConfigurationOnBehalfOfX2e679968Inspection(
    public val matchesBranch1: Boolean,
    public val matchesAccount: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesAccount).count { it }
}

/**
 * The account (if any) the charge was made on behalf of for charges associated with the schedule's subscription. See
 * the Connect documentation for details.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscription_schedule_phase_configuration/properties/on_behalf_of
 */
@Serializable(with = InlineSubscriptionSchedulePhaseConfigurationOnBehalfOfX2e679968.Serializer::class)
public class InlineSubscriptionSchedulePhaseConfigurationOnBehalfOfX2e679968 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineSubscriptionSchedulePhaseConfigurationOnBehalfOfX2e679968Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val account: Account? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesAccount) json.decodeFromJsonElement<Account>(raw) else null }

    public val matchedBranches:
        Set<InlineSubscriptionSchedulePhaseConfigurationOnBehalfOfX2e679968Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineSubscriptionSchedulePhaseConfigurationOnBehalfOfX2e679968Branch.Branch1,
                    )
                }
                if (inspection.matchesAccount) {
                    add(
                        InlineSubscriptionSchedulePhaseConfigurationOnBehalfOfX2e679968Branch.Account,
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
        ): InlineSubscriptionSchedulePhaseConfigurationOnBehalfOfX2e679968 {
            val inspection = inspectInlineSubscriptionSchedulePhaseConfigurationOnBehalfOfX2e679968(raw)
            if (inspection.matchCount == 0) {
                throw InlineSubscriptionSchedulePhaseConfigurationOnBehalfOfX2e679968NoMatchException(
                    "InlineSubscriptionSchedulePhaseConfigurationOnBehalfOfX2e679968 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineSubscriptionSchedulePhaseConfigurationOnBehalfOfX2e679968(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineSubscriptionSchedulePhaseConfigurationOnBehalfOfX2e679968> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineSubscriptionSchedulePhaseConfigurationOnBehalfOfX2e679968 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineSubscriptionSchedulePhaseConfigurationOnBehalfOfX2e679968",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSubscriptionSchedulePhaseConfigurationOnBehalfOfX2e679968,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineSubscriptionSchedulePhaseConfigurationOnBehalfOfX2e679968",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineSubscriptionSchedulePhaseConfigurationOnBehalfOfX2e679968(
    element: JsonElement,
): InlineSubscriptionSchedulePhaseConfigurationOnBehalfOfX2e679968Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesAccount = element.isJsonDecodable<Account>()
    return InlineSubscriptionSchedulePhaseConfigurationOnBehalfOfX2e679968Inspection(
        matchesBranch1 = matchesBranch1,
        matchesAccount = matchesAccount,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesAccount) add("Account: value does not match Account")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
