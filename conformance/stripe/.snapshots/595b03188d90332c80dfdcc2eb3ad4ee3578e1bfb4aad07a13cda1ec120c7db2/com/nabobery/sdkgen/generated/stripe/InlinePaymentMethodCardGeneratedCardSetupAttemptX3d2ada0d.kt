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

public enum class InlinePaymentMethodCardGeneratedCardSetupAttemptX3d2ada0dBranch {
    Branch1,
    SetupAttempt,
}

public sealed class InlinePaymentMethodCardGeneratedCardSetupAttemptX3d2ada0dDecodingException(
    message: String,
) : SerializationException(message)

public class InlinePaymentMethodCardGeneratedCardSetupAttemptX3d2ada0dNoMatchException(
    message: String,
) : InlinePaymentMethodCardGeneratedCardSetupAttemptX3d2ada0dDecodingException(message)

internal data class InlinePaymentMethodCardGeneratedCardSetupAttemptX3d2ada0dInspection(
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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_card_generated_card/properties/setup_attempt
 */
@Serializable(with = InlinePaymentMethodCardGeneratedCardSetupAttemptX3d2ada0d.Serializer::class)
public class InlinePaymentMethodCardGeneratedCardSetupAttemptX3d2ada0d internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePaymentMethodCardGeneratedCardSetupAttemptX3d2ada0dInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val setupAttempt: SetupAttempt? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesSetupAttempt) json.decodeFromJsonElement<SetupAttempt>(raw) else null
        }

    public val matchedBranches: Set<InlinePaymentMethodCardGeneratedCardSetupAttemptX3d2ada0dBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlinePaymentMethodCardGeneratedCardSetupAttemptX3d2ada0dBranch.Branch1,
                    )
                }
                if (inspection.matchesSetupAttempt) {
                    add(
                        InlinePaymentMethodCardGeneratedCardSetupAttemptX3d2ada0dBranch.SetupAttempt,
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
        ): InlinePaymentMethodCardGeneratedCardSetupAttemptX3d2ada0d {
            val inspection = inspectInlinePaymentMethodCardGeneratedCardSetupAttemptX3d2ada0d(raw)
            if (inspection.matchCount == 0) {
                throw InlinePaymentMethodCardGeneratedCardSetupAttemptX3d2ada0dNoMatchException(
                    "InlinePaymentMethodCardGeneratedCardSetupAttemptX3d2ada0d matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePaymentMethodCardGeneratedCardSetupAttemptX3d2ada0d(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePaymentMethodCardGeneratedCardSetupAttemptX3d2ada0d> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePaymentMethodCardGeneratedCardSetupAttemptX3d2ada0d {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodCardGeneratedCardSetupAttemptX3d2ada0d")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentMethodCardGeneratedCardSetupAttemptX3d2ada0d,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlinePaymentMethodCardGeneratedCardSetupAttemptX3d2ada0d",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePaymentMethodCardGeneratedCardSetupAttemptX3d2ada0d(
    element: JsonElement,
): InlinePaymentMethodCardGeneratedCardSetupAttemptX3d2ada0dInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesSetupAttempt = element.isJsonDecodable<SetupAttempt>()
    return InlinePaymentMethodCardGeneratedCardSetupAttemptX3d2ada0dInspection(
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
