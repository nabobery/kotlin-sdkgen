package io.github.nabobery.sdkgen.generated.stripe

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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/customer_acceptance
 */
@Serializable(with = CustomerAcceptance.Serializer::class)
public class CustomerAcceptance(
  /**
   * The mandate includes the type of customer acceptance information, such as: `online` or `offline`.
   */
  public val type: InlineCustomerAcceptanceTypeXb3496c9f,
  /**
   * The time that the customer accepts the mandate.
   */
  public val acceptedAt: Int? = null,
  public val offline: JsonObject? = null,
  public val online: OnlineAcceptance? = null,
) {
  public class Builder {
    private var typeValue: InlineCustomerAcceptanceTypeXb3496c9f? = null

    public var type: InlineCustomerAcceptanceTypeXb3496c9f
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * The time that the customer accepts the mandate.
     */
    public var acceptedAt: Int? = null

    public var offline: JsonObject? = null

    public var online: OnlineAcceptance? = null

    public fun build(): CustomerAcceptance {
      check(typeValue != null) { "type is required" }
      return CustomerAcceptance(
        type = type,
        acceptedAt = acceptedAt,
        offline = offline,
        online = online,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CustomerAcceptance = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CustomerAcceptance> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CustomerAcceptance {
      val jsonDecoder = decoder.requireJsonDecoder("CustomerAcceptance")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CustomerAcceptance must be a JSON object")
      val type = json.decodeRequired<InlineCustomerAcceptanceTypeXb3496c9f>(rawObject, "type")
      return CustomerAcceptance(
        type = type,
        acceptedAt = rawObject["accepted_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        offline = rawObject["offline"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        online = rawObject["online"]?.let { json.decodeFromJsonElement<OnlineAcceptance>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CustomerAcceptance) {
      val jsonEncoder = encoder.requireJsonEncoder("CustomerAcceptance")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.acceptedAt?.let { put("accepted_at", json.encodeToJsonElement(it)) }
        value.offline?.let { put("offline", json.encodeToJsonElement(it)) }
        value.online?.let { put("online", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun customerAcceptance(block: CustomerAcceptance.Builder.() -> Unit): CustomerAcceptance = CustomerAcceptance.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CustomerAcceptance is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
