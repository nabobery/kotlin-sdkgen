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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineV1CustomersSourcesGetResponse200JsonDataItemXcc70a76cBranch {
    BankAccount,
    Card,
    Source,
}

public sealed class InlineV1CustomersSourcesGetResponse200JsonDataItemXcc70a76cDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1CustomersSourcesGetResponse200JsonDataItemXcc70a76cNoMatchException(
    message: String,
) : InlineV1CustomersSourcesGetResponse200JsonDataItemXcc70a76cDecodingException(message)

internal data class InlineV1CustomersSourcesGetResponse200JsonDataItemXcc70a76cInspection(
    public val matchesBankAccount: Boolean,
    public val matchesCard: Boolean,
    public val matchesSource: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBankAccount, matchesCard, matchesSource).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1sources/get/responses/200/content/application~1json/
 * schema/properties/data/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1sources/get/responses/200/content/application~1json/
 * schema/properties/data/items
 */
@Serializable(with = InlineV1CustomersSourcesGetResponse200JsonDataItemXcc70a76c.Serializer::class)
public class InlineV1CustomersSourcesGetResponse200JsonDataItemXcc70a76c internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1CustomersSourcesGetResponse200JsonDataItemXcc70a76cInspection,
) {
    public val bankAccount: BankAccountView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBankAccount) json.decodeFromJsonElement<BankAccountView>(raw) else null
        }

    public val card: CardView? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesCard) json.decodeFromJsonElement<CardView>(raw) else null }

    public val source: SourceView? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesSource) json.decodeFromJsonElement<SourceView>(raw) else null }

    public val matchedBranches: Set<InlineV1CustomersSourcesGetResponse200JsonDataItemXcc70a76cBranch>
        get() =
            buildSet {
                if (inspection.matchesBankAccount) {
                    add(
                        InlineV1CustomersSourcesGetResponse200JsonDataItemXcc70a76cBranch.BankAccount,
                    )
                }
                if (inspection.matchesCard) add(InlineV1CustomersSourcesGetResponse200JsonDataItemXcc70a76cBranch.Card)
                if (inspection.matchesSource) {
                    add(
                        InlineV1CustomersSourcesGetResponse200JsonDataItemXcc70a76cBranch.Source,
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
        ): InlineV1CustomersSourcesGetResponse200JsonDataItemXcc70a76c {
            val inspection = inspectInlineV1CustomersSourcesGetResponse200JsonDataItemXcc70a76c(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1CustomersSourcesGetResponse200JsonDataItemXcc70a76cNoMatchException(
                    "InlineV1CustomersSourcesGetResponse200JsonDataItemXcc70a76c matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1CustomersSourcesGetResponse200JsonDataItemXcc70a76c(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1CustomersSourcesGetResponse200JsonDataItemXcc70a76c> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1CustomersSourcesGetResponse200JsonDataItemXcc70a76c {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSourcesGetResponse200JsonDataItemXcc70a76c")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSourcesGetResponse200JsonDataItemXcc70a76c,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1CustomersSourcesGetResponse200JsonDataItemXcc70a76c",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1CustomersSourcesGetResponse200JsonDataItemXcc70a76c(
    element: JsonElement,
): InlineV1CustomersSourcesGetResponse200JsonDataItemXcc70a76cInspection {
    val raw =
        element as? JsonObject ?: return InlineV1CustomersSourcesGetResponse200JsonDataItemXcc70a76cInspection(
            matchesBankAccount = false,
            matchesCard = false,
            matchesSource = false,
            failures =
                listOf(
                    "BankAccount: expected JSON object",
                    "Card: expected JSON object",
                    "Source: expected JSON object",
                ),
        )
    val matchesBankAccount =
        raw["country"].isString() && raw["currency"].isString() && raw["id"].isString() && raw["last4"].isString() &&
            raw["object"] != null &&
            raw["status"].isString()
    val matchesCard =
        raw["brand"].isString() && raw["exp_month"] != null && raw["exp_year"] != null && raw["funding"].isString() &&
            raw["id"].isString() &&
            raw["last4"].isString() &&
            raw["object"] != null
    val matchesSource =
        raw["client_secret"].isString() && raw["created"] != null && raw["flow"].isString() && raw["id"].isString() &&
            raw["livemode"] != null &&
            raw["object"] != null &&
            raw["status"].isString() &&
            raw["type"] != null
    return InlineV1CustomersSourcesGetResponse200JsonDataItemXcc70a76cInspection(
        matchesBankAccount = matchesBankAccount,
        matchesCard = matchesCard,
        matchesSource = matchesSource,
        failures =
            buildList {
                if (!matchesBankAccount) {
                    add(
                        "BankAccount: required properties 'country', 'currency', 'id', 'last4', 'object', 'status' do not match their declared types",
                    )
                }
                if (!matchesCard) {
                    add(
                        "Card: required properties 'brand', 'exp_month', 'exp_year', 'funding', 'id', 'last4', 'object' do not match their declared types",
                    )
                }
                if (!matchesSource) {
                    add(
                        "Source: required properties 'client_secret', 'created', 'flow', 'id', 'livemode', 'object', 'status', 'type' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
