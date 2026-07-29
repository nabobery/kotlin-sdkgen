package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
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
import kotlinx.serialization.json.put

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/tax_product_resource_tax_association_transaction_attempts_resource_c
 * ommitted
 */
@Serializable(with = TaxProductResourceTaxAssociationTransactionAttemptsResourceCommitted.Serializer::class)
public class TaxProductResourceTaxAssociationTransactionAttemptsResourceCommitted(
  /**
   * The [Tax Transaction](https://docs.stripe.com/api/tax/transaction/object)
   */
  public val transaction: String,
) {
  public class Builder {
    private var transactionValue: String? = null

    public var transaction: String
      get() = requireNotNull(transactionValue) { "transaction is required" }
      set(`value`) {
        transactionValue = value
      }

    public fun build(): TaxProductResourceTaxAssociationTransactionAttemptsResourceCommitted {
      check(transactionValue != null) { "transaction is required" }
      return TaxProductResourceTaxAssociationTransactionAttemptsResourceCommitted(
        transaction = transaction,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaxProductResourceTaxAssociationTransactionAttemptsResourceCommitted = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TaxProductResourceTaxAssociationTransactionAttemptsResourceCommitted> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaxProductResourceTaxAssociationTransactionAttemptsResourceCommitted {
      val jsonDecoder = decoder.requireJsonDecoder("TaxProductResourceTaxAssociationTransactionAttemptsResourceCommitted")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaxProductResourceTaxAssociationTransactionAttemptsResourceCommitted must be a JSON object")
      val transaction = json.decodeRequired<String>(rawObject, "transaction")
      return TaxProductResourceTaxAssociationTransactionAttemptsResourceCommitted(
        transaction = transaction,
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaxProductResourceTaxAssociationTransactionAttemptsResourceCommitted) {
      val jsonEncoder = encoder.requireJsonEncoder("TaxProductResourceTaxAssociationTransactionAttemptsResourceCommitted")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("transaction", value.transaction)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taxProductResourceTaxAssociationTransactionAttemptsResourceCommitted(block: TaxProductResourceTaxAssociationTransactionAttemptsResourceCommitted.Builder.() -> Unit): TaxProductResourceTaxAssociationTransactionAttemptsResourceCommitted = TaxProductResourceTaxAssociationTransactionAttemptsResourceCommitted.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TaxProductResourceTaxAssociationTransactionAttemptsResourceCommitted is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
