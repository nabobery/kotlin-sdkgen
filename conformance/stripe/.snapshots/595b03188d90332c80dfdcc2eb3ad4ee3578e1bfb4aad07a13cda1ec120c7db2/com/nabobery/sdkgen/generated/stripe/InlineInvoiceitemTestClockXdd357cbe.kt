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

public enum class InlineInvoiceitemTestClockXdd357cbeBranch {
    Branch1,
    TestHelpersTestClock,
}

public sealed class InlineInvoiceitemTestClockXdd357cbeDecodingException(
    message: String,
) : SerializationException(message)

public class InlineInvoiceitemTestClockXdd357cbeNoMatchException(
    message: String,
) : InlineInvoiceitemTestClockXdd357cbeDecodingException(message)

internal data class InlineInvoiceitemTestClockXdd357cbeInspection(
    public val matchesBranch1: Boolean,
    public val matchesTestHelpersTestClock: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesTestHelpersTestClock).count { it }
}

/**
 * ID of the test clock this invoice item belongs to.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoiceitem/properties/test_clock
 */
@Serializable(with = InlineInvoiceitemTestClockXdd357cbe.Serializer::class)
public class InlineInvoiceitemTestClockXdd357cbe internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineInvoiceitemTestClockXdd357cbeInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val testHelpersTestClock: TestHelpersTestClock? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesTestHelpersTestClock) json.decodeFromJsonElement<TestHelpersTestClock>(raw) else null
        }

    public val matchedBranches: Set<InlineInvoiceitemTestClockXdd357cbeBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineInvoiceitemTestClockXdd357cbeBranch.Branch1)
                if (inspection.matchesTestHelpersTestClock) {
                    add(
                        InlineInvoiceitemTestClockXdd357cbeBranch.TestHelpersTestClock,
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
        ): InlineInvoiceitemTestClockXdd357cbe {
            val inspection = inspectInlineInvoiceitemTestClockXdd357cbe(raw)
            if (inspection.matchCount == 0) {
                throw InlineInvoiceitemTestClockXdd357cbeNoMatchException(
                    "InlineInvoiceitemTestClockXdd357cbe matched 0 branches: " + inspection.failures.joinToString("; "),
                )
            }
            return InlineInvoiceitemTestClockXdd357cbe(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineInvoiceitemTestClockXdd357cbe> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineInvoiceitemTestClockXdd357cbe {
            val jsonDecoder = decoder.requireJsonDecoder("InlineInvoiceitemTestClockXdd357cbe")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineInvoiceitemTestClockXdd357cbe,
        ) {
            encoder.requireJsonEncoder("InlineInvoiceitemTestClockXdd357cbe").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineInvoiceitemTestClockXdd357cbe(
    element: JsonElement,
): InlineInvoiceitemTestClockXdd357cbeInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesTestHelpersTestClock = element.isJsonDecodable<TestHelpersTestClock>()
    return InlineInvoiceitemTestClockXdd357cbeInspection(
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
