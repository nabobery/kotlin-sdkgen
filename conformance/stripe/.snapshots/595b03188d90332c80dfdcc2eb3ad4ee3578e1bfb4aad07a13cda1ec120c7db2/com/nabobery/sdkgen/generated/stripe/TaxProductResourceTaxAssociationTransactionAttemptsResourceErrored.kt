package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/tax_product_resource_tax_association_transaction_attempts_resource_e
 * rrored
 */
@Serializable(with = TaxProductResourceTaxAssociationTransactionAttemptsResourceErrored.Serializer::class)
public class TaxProductResourceTaxAssociationTransactionAttemptsResourceErrored(
    /**
     * Details on why we couldn't commit the tax transaction.
     */
    public val reason: InlineTaxProductResourceTa8101ReasonXe5eabfa2,
) {
    public class Builder {
        private var reasonValue: InlineTaxProductResourceTa8101ReasonXe5eabfa2? = null

        public var reason: InlineTaxProductResourceTa8101ReasonXe5eabfa2
            get() = requireNotNull(reasonValue) { "reason is required" }
            set(`value`) {
                reasonValue = value
            }

        public fun build(): TaxProductResourceTaxAssociationTransactionAttemptsResourceErrored {
            check(reasonValue != null) { "reason is required" }
            return TaxProductResourceTaxAssociationTransactionAttemptsResourceErrored(
                reason = reason,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): TaxProductResourceTaxAssociationTransactionAttemptsResourceErrored = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<TaxProductResourceTaxAssociationTransactionAttemptsResourceErrored> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): TaxProductResourceTaxAssociationTransactionAttemptsResourceErrored {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "TaxProductResourceTaxAssociationTransactionAttemptsResourceErrored",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "TaxProductResourceTaxAssociationTransactionAttemptsResourceErrored must be a JSON object",
                    )
            val reason = json.decodeRequired<InlineTaxProductResourceTa8101ReasonXe5eabfa2>(rawObject, "reason")
            return TaxProductResourceTaxAssociationTransactionAttemptsResourceErrored(
                reason = reason,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: TaxProductResourceTaxAssociationTransactionAttemptsResourceErrored,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "TaxProductResourceTaxAssociationTransactionAttemptsResourceErrored",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("reason", json.encodeToJsonElement(value.reason))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun taxProductResourceTaxAssociationTransactionAttemptsResourceErrored(
    block: TaxProductResourceTaxAssociationTransactionAttemptsResourceErrored.Builder.() -> Unit,
): TaxProductResourceTaxAssociationTransactionAttemptsResourceErrored =
    TaxProductResourceTaxAssociationTransactionAttemptsResourceErrored.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "TaxProductResourceTaxAssociationTransactionAttemptsResourceErrored is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
