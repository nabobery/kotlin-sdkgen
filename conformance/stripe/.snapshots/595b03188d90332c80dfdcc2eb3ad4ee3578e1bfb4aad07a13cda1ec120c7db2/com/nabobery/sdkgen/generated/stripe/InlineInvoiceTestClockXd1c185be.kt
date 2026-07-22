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

public enum class InlineInvoiceTestClockXd1c185beBranch {
    Branch1,
    TestHelpersTestClock,
}

public sealed class InlineInvoiceTestClockXd1c185beDecodingException(
    message: String,
) : SerializationException(message)

public class InlineInvoiceTestClockXd1c185beNoMatchException(
    message: String,
) : InlineInvoiceTestClockXd1c185beDecodingException(message)

internal data class InlineInvoiceTestClockXd1c185beInspection(
    public val matchesBranch1: Boolean,
    public val matchesTestHelpersTestClock: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesTestHelpersTestClock).count { it }
}

/**
 * ID of the test clock this invoice belongs to.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice/properties/test_clock
 */
@Serializable(with = InlineInvoiceTestClockXd1c185be.Serializer::class)
public class InlineInvoiceTestClockXd1c185be internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineInvoiceTestClockXd1c185beInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val testHelpersTestClock: TestHelpersTestClock? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesTestHelpersTestClock) json.decodeFromJsonElement<TestHelpersTestClock>(raw) else null
        }

    public val matchedBranches: Set<InlineInvoiceTestClockXd1c185beBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineInvoiceTestClockXd1c185beBranch.Branch1)
                if (inspection.matchesTestHelpersTestClock) {
                    add(
                        InlineInvoiceTestClockXd1c185beBranch.TestHelpersTestClock,
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
        ): InlineInvoiceTestClockXd1c185be {
            val inspection = inspectInlineInvoiceTestClockXd1c185be(raw)
            if (inspection.matchCount == 0) {
                throw InlineInvoiceTestClockXd1c185beNoMatchException(
                    "InlineInvoiceTestClockXd1c185be matched 0 branches: " + inspection.failures.joinToString("; "),
                )
            }
            return InlineInvoiceTestClockXd1c185be(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineInvoiceTestClockXd1c185be> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineInvoiceTestClockXd1c185be {
            val jsonDecoder = decoder.requireJsonDecoder("InlineInvoiceTestClockXd1c185be")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineInvoiceTestClockXd1c185be,
        ) {
            encoder.requireJsonEncoder("InlineInvoiceTestClockXd1c185be").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineInvoiceTestClockXd1c185be(element: JsonElement): InlineInvoiceTestClockXd1c185beInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesTestHelpersTestClock = element.isJsonDecodable<TestHelpersTestClock>()
    return InlineInvoiceTestClockXd1c185beInspection(
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
