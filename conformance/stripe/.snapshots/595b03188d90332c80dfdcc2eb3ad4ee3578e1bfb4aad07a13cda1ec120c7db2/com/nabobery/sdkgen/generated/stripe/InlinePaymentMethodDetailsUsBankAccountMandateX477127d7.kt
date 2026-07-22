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

public enum class InlinePaymentMethodDetailsUsBankAccountMandateX477127d7Branch {
    Branch1,
    Mandate,
}

public sealed class InlinePaymentMethodDetailsUsBankAccountMandateX477127d7DecodingException(
    message: String,
) : SerializationException(message)

public class InlinePaymentMethodDetailsUsBankAccountMandateX477127d7NoMatchException(
    message: String,
) : InlinePaymentMethodDetailsUsBankAccountMandateX477127d7DecodingException(message)

internal data class InlinePaymentMethodDetailsUsBankAccountMandateX477127d7Inspection(
    public val matchesBranch1: Boolean,
    public val matchesMandate: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesMandate).count { it }
}

/**
 * ID of the mandate used to make this payment.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_us_bank_account/properties/mandate
 */
@Serializable(with = InlinePaymentMethodDetailsUsBankAccountMandateX477127d7.Serializer::class)
public class InlinePaymentMethodDetailsUsBankAccountMandateX477127d7 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePaymentMethodDetailsUsBankAccountMandateX477127d7Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val mandate: Mandate? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesMandate) json.decodeFromJsonElement<Mandate>(raw) else null }

    public val matchedBranches: Set<InlinePaymentMethodDetailsUsBankAccountMandateX477127d7Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlinePaymentMethodDetailsUsBankAccountMandateX477127d7Branch.Branch1,
                    )
                }
                if (inspection.matchesMandate) {
                    add(
                        InlinePaymentMethodDetailsUsBankAccountMandateX477127d7Branch.Mandate,
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
        ): InlinePaymentMethodDetailsUsBankAccountMandateX477127d7 {
            val inspection = inspectInlinePaymentMethodDetailsUsBankAccountMandateX477127d7(raw)
            if (inspection.matchCount == 0) {
                throw InlinePaymentMethodDetailsUsBankAccountMandateX477127d7NoMatchException(
                    "InlinePaymentMethodDetailsUsBankAccountMandateX477127d7 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePaymentMethodDetailsUsBankAccountMandateX477127d7(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePaymentMethodDetailsUsBankAccountMandateX477127d7> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsUsBankAccountMandateX477127d7 {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodDetailsUsBankAccountMandateX477127d7")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentMethodDetailsUsBankAccountMandateX477127d7,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlinePaymentMethodDetailsUsBankAccountMandateX477127d7",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePaymentMethodDetailsUsBankAccountMandateX477127d7(
    element: JsonElement,
): InlinePaymentMethodDetailsUsBankAccountMandateX477127d7Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesMandate = element.isJsonDecodable<Mandate>()
    return InlinePaymentMethodDetailsUsBankAccountMandateX477127d7Inspection(
        matchesBranch1 = matchesBranch1,
        matchesMandate = matchesMandate,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesMandate) add("Mandate: value does not match Mandate")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
