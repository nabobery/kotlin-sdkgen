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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/lifecycle_controls/properties/cancel_after.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/lifecycle_controls/properties/cancel_after
 */
@Serializable(with = InlineV1IssuingCardsPostRequestFormLifecycleControlsCancelAfterX06e34d41.Serializer::class)
public class InlineV1IssuingCardsPostRequestFormLifecycleControlsCancelAfterX06e34d41(
  public val paymentCount: Int,
) {
  public class Builder {
    private var paymentCountValue: Int? = null

    public var paymentCount: Int
      get() = requireNotNull(paymentCountValue) { "paymentCount is required" }
      set(`value`) {
        paymentCountValue = value
      }

    public fun build(): InlineV1IssuingCardsPostRequestFormLifecycleControlsCancelAfterX06e34d41 {
      check(paymentCountValue != null) { "paymentCount is required" }
      return InlineV1IssuingCardsPostRequestFormLifecycleControlsCancelAfterX06e34d41(
        paymentCount = paymentCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IssuingCardsPostRequestFormLifecycleControlsCancelAfterX06e34d41 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1IssuingCardsPostRequestFormLifecycleControlsCancelAfterX06e34d41> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardsPostRequestFormLifecycleControlsCancelAfterX06e34d41 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingCardsPostRequestFormLifecycleControlsCancelAfterX06e34d41")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingCardsPostRequestFormLifecycleControlsCancelAfterX06e34d41 must be a JSON object")
      val paymentCount = json.decodeRequired<Int>(rawObject, "payment_count")
      return InlineV1IssuingCardsPostRequestFormLifecycleControlsCancelAfterX06e34d41(
        paymentCount = paymentCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardsPostRequestFormLifecycleControlsCancelAfterX06e34d41) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingCardsPostRequestFormLifecycleControlsCancelAfterX06e34d41")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("payment_count", json.encodeToJsonElement(value.paymentCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IssuingCardsPostRequestFormLifecycleControlsCancelAfterX06e34d41(block: InlineV1IssuingCardsPostRequestFormLifecycleControlsCancelAfterX06e34d41.Builder.() -> Unit): InlineV1IssuingCardsPostRequestFormLifecycleControlsCancelAfterX06e34d41 = InlineV1IssuingCardsPostRequestFormLifecycleControlsCancelAfterX06e34d41.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1IssuingCardsPostRequestFormLifecycleControlsCancelAfterX06e34d41 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
