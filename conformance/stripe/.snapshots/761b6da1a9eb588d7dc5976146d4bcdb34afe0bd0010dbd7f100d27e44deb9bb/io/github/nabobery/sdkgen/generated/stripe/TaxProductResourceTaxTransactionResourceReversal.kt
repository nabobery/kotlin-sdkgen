package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class TaxProductResourceTaxTransactionResourceReversalView(
  @SerialName("original_transaction")
  public val originalTransaction: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_product_resource_tax_transaction_resource_reversal
 */
@Serializable(with = TaxProductResourceTaxTransactionResourceReversal.Serializer::class)
public class TaxProductResourceTaxTransactionResourceReversal(
  /**
   * The `id` of the reversed `Transaction` object.
   */
  public val originalTransaction: String? = null,
) {
  public class Builder {
    /**
     * The `id` of the reversed `Transaction` object.
     */
    public var originalTransaction: String? = null

    public fun build(): TaxProductResourceTaxTransactionResourceReversal = TaxProductResourceTaxTransactionResourceReversal(
      originalTransaction = originalTransaction,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaxProductResourceTaxTransactionResourceReversal = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TaxProductResourceTaxTransactionResourceReversal> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaxProductResourceTaxTransactionResourceReversal {
      val jsonDecoder = decoder.requireJsonDecoder("TaxProductResourceTaxTransactionResourceReversal")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaxProductResourceTaxTransactionResourceReversal must be a JSON object")
      return TaxProductResourceTaxTransactionResourceReversal(
        originalTransaction = rawObject["original_transaction"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaxProductResourceTaxTransactionResourceReversal) {
      val jsonEncoder = encoder.requireJsonEncoder("TaxProductResourceTaxTransactionResourceReversal")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.originalTransaction?.let { put("original_transaction", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taxProductResourceTaxTransactionResourceReversal(block: TaxProductResourceTaxTransactionResourceReversal.Builder.() -> Unit): TaxProductResourceTaxTransactionResourceReversal = TaxProductResourceTaxTransactionResourceReversal.build(block)
