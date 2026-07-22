package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax.transaction_line_item
 */
@Serializable(with = TaxTransactionLineItem.Serializer::class)
public class TaxTransactionLineItem(
    /**
     * The line item amount in the [smallest currency unit](https://docs.stripe.com/currencies#minor-units). If
     * `tax_behavior=inclusive`, then this amount includes taxes. Otherwise, taxes were calculated on top of this amount.
     */
    public val amount: Int,
    /**
     * The amount of tax calculated for this line item, in the [smallest currency
     * unit](https://docs.stripe.com/currencies#minor-units).
     */
    public val amountTax: Int,
    /**
     * Unique identifier for the object.
     */
    public val id: String,
    /**
     * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
     */
    public val livemode: Boolean,
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    public val objectValue: InlineTaxTransactionLineItemObjectValueX3f2f1ba5,
    /**
     * The number of units of the item being purchased. For reversals, this is the quantity reversed.
     */
    public val quantity: Int,
    /**
     * A custom identifier for this line item in the transaction.
     */
    public val reference: String,
    /**
     * Specifies whether the `amount` includes taxes. If `tax_behavior=inclusive`, then the amount includes taxes.
     */
    public val taxBehavior: InlineTaxTransactionLineItemTaxBehaviorXe0d015ed,
    /**
     * The [tax code](https://docs.stripe.com/tax/tax-categories) ID used for this resource.
     */
    public val taxCode: String,
    /**
     * If `reversal`, this line item reverses an earlier transaction.
     */
    public val type: InlineTaxTransactionLineItemTypeX1a97aa4a,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format.
     */
    public val metadata: Map<String, String>? = null,
    /**
     * The ID of an existing [Product](https://docs.stripe.com/api/products/object).
     */
    public val product: String? = null,
    /**
     * If `type=reversal`, contains information about what was reversed.
     */
    public val reversal: InlineTaxTransactionLineItemReversalX4c9abeca? = null,
) {
    public class Builder {
        private var amountValue: Int? = null

        public var amount: Int
            get() = requireNotNull(amountValue) { "amount is required" }
            set(`value`) {
                amountValue = value
            }

        private var amountTaxValue: Int? = null

        public var amountTax: Int
            get() = requireNotNull(amountTaxValue) { "amountTax is required" }
            set(`value`) {
                amountTaxValue = value
            }

        private var idValue: String? = null

        public var id: String
            get() = requireNotNull(idValue) { "id is required" }
            set(`value`) {
                idValue = value
            }

        private var livemodeValue: Boolean? = null

        public var livemode: Boolean
            get() = requireNotNull(livemodeValue) { "livemode is required" }
            set(`value`) {
                livemodeValue = value
            }

        private var objectValueValue: InlineTaxTransactionLineItemObjectValueX3f2f1ba5? = null

        public var objectValue: InlineTaxTransactionLineItemObjectValueX3f2f1ba5
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        private var quantityValue: Int? = null

        public var quantity: Int
            get() = requireNotNull(quantityValue) { "quantity is required" }
            set(`value`) {
                quantityValue = value
            }

        private var referenceValue: String? = null

        public var reference: String
            get() = requireNotNull(referenceValue) { "reference is required" }
            set(`value`) {
                referenceValue = value
            }

        private var taxBehaviorValue: InlineTaxTransactionLineItemTaxBehaviorXe0d015ed? = null

        public var taxBehavior: InlineTaxTransactionLineItemTaxBehaviorXe0d015ed
            get() = requireNotNull(taxBehaviorValue) { "taxBehavior is required" }
            set(`value`) {
                taxBehaviorValue = value
            }

        private var taxCodeValue: String? = null

        public var taxCode: String
            get() = requireNotNull(taxCodeValue) { "taxCode is required" }
            set(`value`) {
                taxCodeValue = value
            }

        private var typeValue: InlineTaxTransactionLineItemTypeX1a97aa4a? = null

        public var type: InlineTaxTransactionLineItemTypeX1a97aa4a
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        /**
         * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
         * useful for storing additional information about the object in a structured format.
         */
        public var metadata: Map<String, String>? = null

        /**
         * The ID of an existing [Product](https://docs.stripe.com/api/products/object).
         */
        public var product: String? = null

        /**
         * If `type=reversal`, contains information about what was reversed.
         */
        public var reversal: InlineTaxTransactionLineItemReversalX4c9abeca? = null

        public fun build(): TaxTransactionLineItem {
            check(amountValue != null) { "amount is required" }
            check(amountTaxValue != null) { "amountTax is required" }
            check(idValue != null) { "id is required" }
            check(livemodeValue != null) { "livemode is required" }
            check(objectValueValue != null) { "objectValue is required" }
            check(quantityValue != null) { "quantity is required" }
            check(referenceValue != null) { "reference is required" }
            check(taxBehaviorValue != null) { "taxBehavior is required" }
            check(taxCodeValue != null) { "taxCode is required" }
            check(typeValue != null) { "type is required" }
            return TaxTransactionLineItem(
                amount = amount,
                amountTax = amountTax,
                id = id,
                livemode = livemode,
                objectValue = objectValue,
                quantity = quantity,
                reference = reference,
                taxBehavior = taxBehavior,
                taxCode = taxCode,
                type = type,
                metadata = metadata,
                product = product,
                reversal = reversal,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): TaxTransactionLineItem = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<TaxTransactionLineItem> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): TaxTransactionLineItem {
            val jsonDecoder = decoder.requireJsonDecoder("TaxTransactionLineItem")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("TaxTransactionLineItem must be a JSON object")
            val amount = json.decodeRequired<Int>(rawObject, "amount")
            val amountTax = json.decodeRequired<Int>(rawObject, "amount_tax")
            val id = json.decodeRequired<String>(rawObject, "id")
            val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
            val objectValue = json.decodeRequired<InlineTaxTransactionLineItemObjectValueX3f2f1ba5>(rawObject, "object")
            val quantity = json.decodeRequired<Int>(rawObject, "quantity")
            val reference = json.decodeRequired<String>(rawObject, "reference")
            val taxBehavior =
                json.decodeRequired<InlineTaxTransactionLineItemTaxBehaviorXe0d015ed>(
                    rawObject,
                    "tax_behavior",
                )
            val taxCode = json.decodeRequired<String>(rawObject, "tax_code")
            val type = json.decodeRequired<InlineTaxTransactionLineItemTypeX1a97aa4a>(rawObject, "type")
            return TaxTransactionLineItem(
                amount = amount,
                amountTax = amountTax,
                id = id,
                livemode = livemode,
                objectValue = objectValue,
                quantity = quantity,
                reference = reference,
                taxBehavior = taxBehavior,
                taxCode = taxCode,
                type = type,
                metadata =
                    rawObject["metadata"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Map<String, String>?>(element)
                        }
                    },
                product =
                    rawObject["product"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                reversal =
                    rawObject["reversal"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineTaxTransactionLineItemReversalX4c9abeca?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: TaxTransactionLineItem,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("TaxTransactionLineItem")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("amount", json.encodeToJsonElement(value.amount))
                    put("amount_tax", json.encodeToJsonElement(value.amountTax))
                    put("id", value.id)
                    put("livemode", json.encodeToJsonElement(value.livemode))
                    put("object", json.encodeToJsonElement(value.objectValue))
                    put("quantity", json.encodeToJsonElement(value.quantity))
                    put("reference", value.reference)
                    put("tax_behavior", json.encodeToJsonElement(value.taxBehavior))
                    put("tax_code", value.taxCode)
                    put("type", json.encodeToJsonElement(value.type))
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                    value.product?.let { put("product", it) }
                    value.reversal?.let { put("reversal", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun taxTransactionLineItem(block: TaxTransactionLineItem.Builder.() -> Unit): TaxTransactionLineItem =
    TaxTransactionLineItem.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name] ?: throw SerializationException("TaxTransactionLineItem is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
