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

public enum class InlineSubscriptionTestClockXbc391647Branch {
    Branch1,
    TestHelpersTestClock,
}

public sealed class InlineSubscriptionTestClockXbc391647DecodingException(
    message: String,
) : SerializationException(message)

public class InlineSubscriptionTestClockXbc391647NoMatchException(
    message: String,
) : InlineSubscriptionTestClockXbc391647DecodingException(message)

internal data class InlineSubscriptionTestClockXbc391647Inspection(
    public val matchesBranch1: Boolean,
    public val matchesTestHelpersTestClock: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesTestHelpersTestClock).count { it }
}

/**
 * ID of the test clock this subscription belongs to.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription/properties/test_clock
 */
@Serializable(with = InlineSubscriptionTestClockXbc391647.Serializer::class)
public class InlineSubscriptionTestClockXbc391647 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineSubscriptionTestClockXbc391647Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val testHelpersTestClock: TestHelpersTestClock? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesTestHelpersTestClock) json.decodeFromJsonElement<TestHelpersTestClock>(raw) else null
        }

    public val matchedBranches: Set<InlineSubscriptionTestClockXbc391647Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineSubscriptionTestClockXbc391647Branch.Branch1)
                if (inspection.matchesTestHelpersTestClock) {
                    add(
                        InlineSubscriptionTestClockXbc391647Branch.TestHelpersTestClock,
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
        ): InlineSubscriptionTestClockXbc391647 {
            val inspection = inspectInlineSubscriptionTestClockXbc391647(raw)
            if (inspection.matchCount == 0) {
                throw InlineSubscriptionTestClockXbc391647NoMatchException(
                    "InlineSubscriptionTestClockXbc391647 matched 0 branches: " +
                        inspection.failures.joinToString(
                            "; ",
                        ),
                )
            }
            return InlineSubscriptionTestClockXbc391647(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineSubscriptionTestClockXbc391647> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineSubscriptionTestClockXbc391647 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionTestClockXbc391647")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSubscriptionTestClockXbc391647,
        ) {
            encoder.requireJsonEncoder("InlineSubscriptionTestClockXbc391647").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineSubscriptionTestClockXbc391647(
    element: JsonElement,
): InlineSubscriptionTestClockXbc391647Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesTestHelpersTestClock = element.isJsonDecodable<TestHelpersTestClock>()
    return InlineSubscriptionTestClockXbc391647Inspection(
        matchesBranch1 = matchesBranch1,
        matchesTestHelpersTestClock = matchesTestHelpersTestClock,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesTestHelpersTestClock) add("TestHelpersTestClock: value does not match TestHelpersTestClock")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
