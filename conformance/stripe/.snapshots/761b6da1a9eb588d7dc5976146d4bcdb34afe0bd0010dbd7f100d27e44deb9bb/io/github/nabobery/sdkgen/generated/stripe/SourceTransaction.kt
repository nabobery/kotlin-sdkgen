package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
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
 * Some payment methods have no required amount that a customer must send.
 * Customers can be instructed to send any amount, and it can be made up of
 * multiple transactions. As such, sources can have multiple associated
 * transactions.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/source_transaction
 */
@Serializable(with = SourceTransaction.Serializer::class)
public class SourceTransaction(
  /**
   * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1, Japanese Yen being a
   * zero-decimal currency) representing the amount your customer has pushed to the receiver.
   */
  public val amount: Int,
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies).
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
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
  public val objectValue: InlineSourceTransactionObjectValueXddda49ad,
  /**
   * The ID of the source this transaction is attached to.
   */
  public val source: String,
  /**
   * The status of the transaction, one of `succeeded`, `pending`, or `failed`.
   */
  public val status: String,
  /**
   * The type of source this transaction is attached to.
   */
  public val type: InlineSourceTransactionTypeX56896a84,
  public val achCreditTransfer: SourceTransactionAchCreditTransferData? = null,
  public val chfCreditTransfer: SourceTransactionChfCreditTransferData? = null,
  public val gbpCreditTransfer: SourceTransactionGbpCreditTransferData? = null,
  public val paperCheck: SourceTransactionPaperCheckData? = null,
  public val sepaCreditTransfer: SourceTransactionSepaCreditTransferData? = null,
) {
  public class Builder {
    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var currencyValue: String? = null

    public var currency: String
      get() = requireNotNull(currencyValue) { "currency is required" }
      set(`value`) {
        currencyValue = value
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

    private var objectValueValue: InlineSourceTransactionObjectValueXddda49ad? = null

    public var objectValue: InlineSourceTransactionObjectValueXddda49ad
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

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

    private var typeValue: InlineSourceTransactionTypeX56896a84? = null

    public var type: InlineSourceTransactionTypeX56896a84
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var achCreditTransfer: SourceTransactionAchCreditTransferData? = null

    public var chfCreditTransfer: SourceTransactionChfCreditTransferData? = null

    public var gbpCreditTransfer: SourceTransactionGbpCreditTransferData? = null

    public var paperCheck: SourceTransactionPaperCheckData? = null

    public var sepaCreditTransfer: SourceTransactionSepaCreditTransferData? = null

    public fun build(): SourceTransaction {
      check(amountValue != null) { "amount is required" }
      check(createdValue != null) { "created is required" }
      check(currencyValue != null) { "currency is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(sourceValue != null) { "source is required" }
      check(statusValue != null) { "status is required" }
      check(typeValue != null) { "type is required" }
      return SourceTransaction(
        amount = amount,
        created = created,
        currency = currency,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        source = source,
        status = status,
        type = type,
        achCreditTransfer = achCreditTransfer,
        chfCreditTransfer = chfCreditTransfer,
        gbpCreditTransfer = gbpCreditTransfer,
        paperCheck = paperCheck,
        sepaCreditTransfer = sepaCreditTransfer,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SourceTransaction = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SourceTransaction> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SourceTransaction {
      val jsonDecoder = decoder.requireJsonDecoder("SourceTransaction")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SourceTransaction must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineSourceTransactionObjectValueXddda49ad>(rawObject, "object")
      val source = json.decodeRequired<String>(rawObject, "source")
      val status = json.decodeRequired<String>(rawObject, "status")
      val type = json.decodeRequired<InlineSourceTransactionTypeX56896a84>(rawObject, "type")
      return SourceTransaction(
        amount = amount,
        created = created,
        currency = currency,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        source = source,
        status = status,
        type = type,
        achCreditTransfer = rawObject["ach_credit_transfer"]?.let { json.decodeFromJsonElement<SourceTransactionAchCreditTransferData>(it) },
        chfCreditTransfer = rawObject["chf_credit_transfer"]?.let { json.decodeFromJsonElement<SourceTransactionChfCreditTransferData>(it) },
        gbpCreditTransfer = rawObject["gbp_credit_transfer"]?.let { json.decodeFromJsonElement<SourceTransactionGbpCreditTransferData>(it) },
        paperCheck = rawObject["paper_check"]?.let { json.decodeFromJsonElement<SourceTransactionPaperCheckData>(it) },
        sepaCreditTransfer = rawObject["sepa_credit_transfer"]?.let { json.decodeFromJsonElement<SourceTransactionSepaCreditTransferData>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SourceTransaction) {
      val jsonEncoder = encoder.requireJsonEncoder("SourceTransaction")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("created", json.encodeToJsonElement(value.created))
        put("currency", value.currency)
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("source", value.source)
        put("status", value.status)
        put("type", json.encodeToJsonElement(value.type))
        value.achCreditTransfer?.let { put("ach_credit_transfer", json.encodeToJsonElement(it)) }
        value.chfCreditTransfer?.let { put("chf_credit_transfer", json.encodeToJsonElement(it)) }
        value.gbpCreditTransfer?.let { put("gbp_credit_transfer", json.encodeToJsonElement(it)) }
        value.paperCheck?.let { put("paper_check", json.encodeToJsonElement(it)) }
        value.sepaCreditTransfer?.let { put("sepa_credit_transfer", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun sourceTransaction(block: SourceTransaction.Builder.() -> Unit): SourceTransaction = SourceTransaction.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SourceTransaction is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
