package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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

/**
 * A Tax Association exposes the Tax Transactions that Stripe attempted to create on your behalf based on the
 * PaymentIntent input
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax.association
 */
@Serializable(with = TaxAssociation.Serializer::class)
public class TaxAssociation(
  /**
   * The [Tax Calculation](https://docs.stripe.com/api/tax/calculations/object) that was included in PaymentIntent.
   */
  public val calculation: String,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineTaxAssociationObjectValueXa90d02b6,
  /**
   * The [PaymentIntent](https://docs.stripe.com/api/payment_intents/object) that this Tax Association is tracking.
   */
  public val paymentIntent: String,
  taxTransactionAttempts: List<TaxProductResourceTaxAssociationTransactionAttempts>? = null,
) {
  /**
   * Information about the tax transactions linked to this payment intent
   */
  public val taxTransactionAttempts: List<TaxProductResourceTaxAssociationTransactionAttempts>? =
      taxTransactionAttempts?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var calculationValue: String? = null

    public var calculation: String
      get() = requireNotNull(calculationValue) { "calculation is required" }
      set(`value`) {
        calculationValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var objectValueValue: InlineTaxAssociationObjectValueXa90d02b6? = null

    public var objectValue: InlineTaxAssociationObjectValueXa90d02b6
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var paymentIntentValue: String? = null

    public var paymentIntent: String
      get() = requireNotNull(paymentIntentValue) { "paymentIntent is required" }
      set(`value`) {
        paymentIntentValue = value
      }

    private var taxTransactionAttemptsValue:
        List<TaxProductResourceTaxAssociationTransactionAttempts>? = null

    /**
     * Information about the tax transactions linked to this payment intent
     */
    public var taxTransactionAttempts: List<TaxProductResourceTaxAssociationTransactionAttempts>?
      get() = taxTransactionAttemptsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        taxTransactionAttemptsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): TaxAssociation {
      check(calculationValue != null) { "calculation is required" }
      check(idValue != null) { "id is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(paymentIntentValue != null) { "paymentIntent is required" }
      return TaxAssociation(
        calculation = calculation,
        id = id,
        objectValue = objectValue,
        paymentIntent = paymentIntent,
        taxTransactionAttempts = taxTransactionAttempts,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaxAssociation = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TaxAssociation> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaxAssociation {
      val jsonDecoder = decoder.requireJsonDecoder("TaxAssociation")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaxAssociation must be a JSON object")
      val calculation = json.decodeRequired<String>(rawObject, "calculation")
      val id = json.decodeRequired<String>(rawObject, "id")
      val objectValue = json.decodeRequired<InlineTaxAssociationObjectValueXa90d02b6>(rawObject, "object")
      val paymentIntent = json.decodeRequired<String>(rawObject, "payment_intent")
      return TaxAssociation(
        calculation = calculation,
        id = id,
        objectValue = objectValue,
        paymentIntent = paymentIntent,
        taxTransactionAttempts = rawObject["tax_transaction_attempts"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<TaxProductResourceTaxAssociationTransactionAttempts>?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaxAssociation) {
      val jsonEncoder = encoder.requireJsonEncoder("TaxAssociation")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("calculation", value.calculation)
        put("id", value.id)
        put("object", json.encodeToJsonElement(value.objectValue))
        put("payment_intent", value.paymentIntent)
        value.taxTransactionAttempts?.let { put("tax_transaction_attempts", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taxAssociation(block: TaxAssociation.Builder.() -> Unit): TaxAssociation = TaxAssociation.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TaxAssociation is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
