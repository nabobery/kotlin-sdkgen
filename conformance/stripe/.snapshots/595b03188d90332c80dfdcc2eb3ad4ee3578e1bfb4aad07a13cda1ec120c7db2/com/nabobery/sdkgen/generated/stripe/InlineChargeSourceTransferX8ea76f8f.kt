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

public enum class InlineChargeSourceTransferX8ea76f8fBranch {
    Branch1,
    Transfer,
}

public sealed class InlineChargeSourceTransferX8ea76f8fDecodingException(
    message: String,
) : SerializationException(message)

public class InlineChargeSourceTransferX8ea76f8fNoMatchException(
    message: String,
) : InlineChargeSourceTransferX8ea76f8fDecodingException(message)

internal data class InlineChargeSourceTransferX8ea76f8fInspection(
    public val matchesBranch1: Boolean,
    public val matchesTransfer: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesTransfer).count { it }
}

/**
 * The transfer ID which created this charge. Only present if the charge came from another Stripe account. [See the
 * Connect documentation](https://docs.stripe.com/connect/destination-charges) for details.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/charge/properties/source_transfer
 */
@Serializable(with = InlineChargeSourceTransferX8ea76f8f.Serializer::class)
public class InlineChargeSourceTransferX8ea76f8f internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineChargeSourceTransferX8ea76f8fInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val transfer: Transfer? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesTransfer) json.decodeFromJsonElement<Transfer>(raw) else null }

    public val matchedBranches: Set<InlineChargeSourceTransferX8ea76f8fBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineChargeSourceTransferX8ea76f8fBranch.Branch1)
                if (inspection.matchesTransfer) add(InlineChargeSourceTransferX8ea76f8fBranch.Transfer)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineChargeSourceTransferX8ea76f8f {
            val inspection = inspectInlineChargeSourceTransferX8ea76f8f(raw)
            if (inspection.matchCount == 0) {
                throw InlineChargeSourceTransferX8ea76f8fNoMatchException(
                    "InlineChargeSourceTransferX8ea76f8f matched 0 branches: " + inspection.failures.joinToString("; "),
                )
            }
            return InlineChargeSourceTransferX8ea76f8f(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineChargeSourceTransferX8ea76f8f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineChargeSourceTransferX8ea76f8f {
            val jsonDecoder = decoder.requireJsonDecoder("InlineChargeSourceTransferX8ea76f8f")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineChargeSourceTransferX8ea76f8f,
        ) {
            encoder.requireJsonEncoder("InlineChargeSourceTransferX8ea76f8f").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineChargeSourceTransferX8ea76f8f(
    element: JsonElement,
): InlineChargeSourceTransferX8ea76f8fInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesTransfer = element.isJsonDecodable<Transfer>()
    return InlineChargeSourceTransferX8ea76f8fInspection(
        matchesBranch1 = matchesBranch1,
        matchesTransfer = matchesTransfer,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesTransfer) add("Transfer: value does not match Transfer")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
