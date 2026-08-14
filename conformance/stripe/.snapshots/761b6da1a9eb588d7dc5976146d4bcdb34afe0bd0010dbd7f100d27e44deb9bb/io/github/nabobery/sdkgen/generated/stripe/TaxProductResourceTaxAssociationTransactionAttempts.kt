package io.github.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_product_resource_tax_association_transaction_attempts
 */
@Serializable(with = TaxProductResourceTaxAssociationTransactionAttempts.Serializer::class)
public class TaxProductResourceTaxAssociationTransactionAttempts(
  /**
   * The source of the tax transaction attempt. This is either a refund or a payment intent.
   */
  public val source: String,
  /**
   * The status of the transaction attempt. This can be `errored` or `committed`.
   */
  public val status: String,
  public val committed:
      TaxProductResourceTaxAssociationTransactionAttemptsResourceCommitted? = null,
  public val errored: TaxProductResourceTaxAssociationTransactionAttemptsResourceErrored? = null,
) {
  public class Builder {
    private var sourceValue: String? = null

    public var source: String
      get() = requireNotNull(sourceValue) { "source is required" }
      set(`value`) {
        sourceValue = value
      }

    private var statusValue: String? = null

    public var status: String
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    public var committed: TaxProductResourceTaxAssociationTransactionAttemptsResourceCommitted? =
        null

    public var errored: TaxProductResourceTaxAssociationTransactionAttemptsResourceErrored? = null

    public fun build(): TaxProductResourceTaxAssociationTransactionAttempts {
      check(sourceValue != null) { "source is required" }
      check(statusValue != null) { "status is required" }
      return TaxProductResourceTaxAssociationTransactionAttempts(
        source = source,
        status = status,
        committed = committed,
        errored = errored,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaxProductResourceTaxAssociationTransactionAttempts = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TaxProductResourceTaxAssociationTransactionAttempts> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaxProductResourceTaxAssociationTransactionAttempts {
      val jsonDecoder = decoder.requireJsonDecoder("TaxProductResourceTaxAssociationTransactionAttempts")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaxProductResourceTaxAssociationTransactionAttempts must be a JSON object")
      val source = json.decodeRequired<String>(rawObject, "source")
      val status = json.decodeRequired<String>(rawObject, "status")
      return TaxProductResourceTaxAssociationTransactionAttempts(
        source = source,
        status = status,
        committed = rawObject["committed"]?.let { json.decodeFromJsonElement<TaxProductResourceTaxAssociationTransactionAttemptsResourceCommitted>(it) },
        errored = rawObject["errored"]?.let { json.decodeFromJsonElement<TaxProductResourceTaxAssociationTransactionAttemptsResourceErrored>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaxProductResourceTaxAssociationTransactionAttempts) {
      val jsonEncoder = encoder.requireJsonEncoder("TaxProductResourceTaxAssociationTransactionAttempts")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("source", value.source)
        put("status", value.status)
        value.committed?.let { put("committed", json.encodeToJsonElement(it)) }
        value.errored?.let { put("errored", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taxProductResourceTaxAssociationTransactionAttempts(block: TaxProductResourceTaxAssociationTransactionAttempts.Builder.() -> Unit): TaxProductResourceTaxAssociationTransactionAttempts = TaxProductResourceTaxAssociationTransactionAttempts.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TaxProductResourceTaxAssociationTransactionAttempts is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
