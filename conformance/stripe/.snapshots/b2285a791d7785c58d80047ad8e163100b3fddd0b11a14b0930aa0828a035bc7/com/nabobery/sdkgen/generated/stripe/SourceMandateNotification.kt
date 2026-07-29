package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Source mandate notifications should be created when a notification related to
 * a source mandate must be sent to the payer. They will trigger a webhook or
 * deliver an email to the customer.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/source_mandate_notification
 */
@Serializable(with = SourceMandateNotification.Serializer::class)
public class SourceMandateNotification(
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
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
  public val objectValue: InlineSourceMandateNotificationObjectValueXf8a847b1,
  /**
   * The reason of the mandate notification. Valid reasons are `mandate_confirmed` or `debit_initiated`.
   */
  public val reason: String,
  public val source: Source,
  /**
   * The status of the mandate notification. Valid statuses are `pending` or `submitted`.
   */
  public val status: String,
  /**
   * The type of source this mandate notification is attached to. Should be the source type identifier code for the
   * payment method, such as `three_d_secure`.
   */
  public val type: String,
  public val acssDebit: SourceMandateNotificationAcssDebitData? = null,
  /**
   * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1, Japanese Yen being a
   * zero-decimal currency) representing the amount associated with the mandate notification. The amount is expressed in
   * the currency of the underlying source. Required if the notification type is `debit_initiated`.
   */
  public val amount: Int? = null,
  public val bacsDebit: SourceMandateNotificationBacsDebitData? = null,
  public val sepaDebit: SourceMandateNotificationSepaDebitData? = null,
) {
  public class Builder {
    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
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

    private var objectValueValue: InlineSourceMandateNotificationObjectValueXf8a847b1? = null

    public var objectValue: InlineSourceMandateNotificationObjectValueXf8a847b1
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var reasonValue: String? = null

    public var reason: String
      get() = requireNotNull(reasonValue) { "reason is required" }
      set(`value`) {
        reasonValue = value
      }

    private var sourceValue: Source? = null

    public var source: Source
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

    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var acssDebit: SourceMandateNotificationAcssDebitData? = null

    /**
     * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1, Japanese Yen being a
     * zero-decimal currency) representing the amount associated with the mandate notification. The amount is expressed
     * in the currency of the underlying source. Required if the notification type is `debit_initiated`.
     */
    public var amount: Int? = null

    public var bacsDebit: SourceMandateNotificationBacsDebitData? = null

    public var sepaDebit: SourceMandateNotificationSepaDebitData? = null

    public fun build(): SourceMandateNotification {
      check(createdValue != null) { "created is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(reasonValue != null) { "reason is required" }
      check(sourceValue != null) { "source is required" }
      check(statusValue != null) { "status is required" }
      check(typeValue != null) { "type is required" }
      return SourceMandateNotification(
        created = created,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        reason = reason,
        source = source,
        status = status,
        type = type,
        acssDebit = acssDebit,
        amount = amount,
        bacsDebit = bacsDebit,
        sepaDebit = sepaDebit,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SourceMandateNotification = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SourceMandateNotification> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SourceMandateNotification {
      val jsonDecoder = decoder.requireJsonDecoder("SourceMandateNotification")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SourceMandateNotification must be a JSON object")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineSourceMandateNotificationObjectValueXf8a847b1>(rawObject, "object")
      val reason = json.decodeRequired<String>(rawObject, "reason")
      val source = json.decodeRequired<Source>(rawObject, "source")
      val status = json.decodeRequired<String>(rawObject, "status")
      val type = json.decodeRequired<String>(rawObject, "type")
      return SourceMandateNotification(
        created = created,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        reason = reason,
        source = source,
        status = status,
        type = type,
        acssDebit = rawObject["acss_debit"]?.let { json.decodeFromJsonElement<SourceMandateNotificationAcssDebitData>(it) },
        amount = rawObject["amount"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        bacsDebit = rawObject["bacs_debit"]?.let { json.decodeFromJsonElement<SourceMandateNotificationBacsDebitData>(it) },
        sepaDebit = rawObject["sepa_debit"]?.let { json.decodeFromJsonElement<SourceMandateNotificationSepaDebitData>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SourceMandateNotification) {
      val jsonEncoder = encoder.requireJsonEncoder("SourceMandateNotification")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created", json.encodeToJsonElement(value.created))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("reason", value.reason)
        put("source", json.encodeToJsonElement(value.source))
        put("status", value.status)
        put("type", value.type)
        value.acssDebit?.let { put("acss_debit", json.encodeToJsonElement(it)) }
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.bacsDebit?.let { put("bacs_debit", json.encodeToJsonElement(it)) }
        value.sepaDebit?.let { put("sepa_debit", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun sourceMandateNotification(block: SourceMandateNotification.Builder.() -> Unit): SourceMandateNotification = SourceMandateNotification.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SourceMandateNotification is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
