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

public enum class InlineSepaDebitGeneratedFromSetupAttemptX62691f64Branch {
    Branch1,
    SetupAttempt,
}

public sealed class InlineSepaDebitGeneratedFromSetupAttemptX62691f64DecodingException(
    message: String,
) : SerializationException(message)

public class InlineSepaDebitGeneratedFromSetupAttemptX62691f64NoMatchException(
    message: String,
) : InlineSepaDebitGeneratedFromSetupAttemptX62691f64DecodingException(message)

internal data class InlineSepaDebitGeneratedFromSetupAttemptX62691f64Inspection(
    public val matchesBranch1: Boolean,
    public val matchesSetupAttempt: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesSetupAttempt).count { it }
}

/**
 * The ID of the SetupAttempt that generated this PaymentMethod, if any.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/sepa_debit_generated_from/properties/setup_attempt
 */
@Serializable(with = InlineSepaDebitGeneratedFromSetupAttemptX62691f64.Serializer::class)
public class InlineSepaDebitGeneratedFromSetupAttemptX62691f64 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineSepaDebitGeneratedFromSetupAttemptX62691f64Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val setupAttempt: SetupAttempt? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesSetupAttempt) json.decodeFromJsonElement<SetupAttempt>(raw) else null
        }

    public val matchedBranches: Set<InlineSepaDebitGeneratedFromSetupAttemptX62691f64Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineSepaDebitGeneratedFromSetupAttemptX62691f64Branch.Branch1)
                if (inspection.matchesSetupAttempt) {
                    add(
                        InlineSepaDebitGeneratedFromSetupAttemptX62691f64Branch.SetupAttempt,
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
        ): InlineSepaDebitGeneratedFromSetupAttemptX62691f64 {
            val inspection = inspectInlineSepaDebitGeneratedFromSetupAttemptX62691f64(raw)
            if (inspection.matchCount == 0) {
                throw InlineSepaDebitGeneratedFromSetupAttemptX62691f64NoMatchException(
                    "InlineSepaDebitGeneratedFromSetupAttemptX62691f64 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineSepaDebitGeneratedFromSetupAttemptX62691f64(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineSepaDebitGeneratedFromSetupAttemptX62691f64> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineSepaDebitGeneratedFromSetupAttemptX62691f64 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineSepaDebitGeneratedFromSetupAttemptX62691f64")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSepaDebitGeneratedFromSetupAttemptX62691f64,
        ) {
            encoder.requireJsonEncoder("InlineSepaDebitGeneratedFromSetupAttemptX62691f64").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineSepaDebitGeneratedFromSetupAttemptX62691f64(
    element: JsonElement,
): InlineSepaDebitGeneratedFromSetupAttemptX62691f64Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesSetupAttempt = element.isJsonDecodable<SetupAttempt>()
    return InlineSepaDebitGeneratedFromSetupAttemptX62691f64Inspection(
        matchesBranch1 = matchesBranch1,
        matchesSetupAttempt = matchesSetupAttempt,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesSetupAttempt) add("SetupAttempt: value does not match SetupAttempt")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
