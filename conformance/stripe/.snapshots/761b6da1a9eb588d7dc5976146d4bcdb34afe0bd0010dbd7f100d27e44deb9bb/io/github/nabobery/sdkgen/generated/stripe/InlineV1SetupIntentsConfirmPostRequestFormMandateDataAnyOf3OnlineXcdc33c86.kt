package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/mandate_data/anyOf/2/properties/customer_acceptance/properties/online.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/mandate_data/anyOf/2/properties/customer_acceptance/properties/online
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3OnlineXcdc33c86.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3OnlineXcdc33c86(
  public val ipAddress: String? = null,
  public val userAgent: String? = null,
) {
  public class Builder {
    public var ipAddress: String? = null

    public var userAgent: String? = null

    public fun build(): InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3OnlineXcdc33c86 = InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3OnlineXcdc33c86(
      ipAddress = ipAddress,
      userAgent = userAgent,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3OnlineXcdc33c86 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3OnlineXcdc33c86> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3OnlineXcdc33c86 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3OnlineXcdc33c86")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3OnlineXcdc33c86 must be a JSON object")
      return InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3OnlineXcdc33c86(
        ipAddress = rawObject["ip_address"]?.let { json.decodeFromJsonElement<String>(it) },
        userAgent = rawObject["user_agent"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3OnlineXcdc33c86) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3OnlineXcdc33c86")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.ipAddress?.let { put("ip_address", it) }
        value.userAgent?.let { put("user_agent", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3OnlineXcdc33c86(block: InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3OnlineXcdc33c86.Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3OnlineXcdc33c86 = InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3OnlineXcdc33c86.build(block)
