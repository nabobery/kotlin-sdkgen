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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/mandate_data/anyOf/2/properties/customer_acceptance.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/mandate_data/anyOf/2/properties/customer_acceptance
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceXe7c2e6ff.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceXe7c2e6ff(
  public val online: InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3OnlineX216eccb1,
  public val type: InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3TypeX61de4ad5,
) {
  public class Builder {
    private var onlineValue:
        InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3OnlineX216eccb1? = null

    public var online: InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3OnlineX216eccb1
      get() = requireNotNull(onlineValue) { "online is required" }
      set(`value`) {
        onlineValue = value
      }

    private var typeValue:
        InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3TypeX61de4ad5? = null

    public var type: InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3TypeX61de4ad5
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceXe7c2e6ff {
      check(onlineValue != null) { "online is required" }
      check(typeValue != null) { "type is required" }
      return InlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceXe7c2e6ff(
        online = online,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceXe7c2e6ff = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceXe7c2e6ff> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceXe7c2e6ff {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceXe7c2e6ff")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceXe7c2e6ff must be a JSON object")
      val online = json.decodeRequired<InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3OnlineX216eccb1>(rawObject, "online")
      val type = json.decodeRequired<InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3TypeX61de4ad5>(rawObject, "type")
      return InlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceXe7c2e6ff(
        online = online,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceXe7c2e6ff) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceXe7c2e6ff")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("online", json.encodeToJsonElement(value.online))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceXe7c2e6ff(block: InlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceXe7c2e6ff.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceXe7c2e6ff = InlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceXe7c2e6ff.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceXe7c2e6ff is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
