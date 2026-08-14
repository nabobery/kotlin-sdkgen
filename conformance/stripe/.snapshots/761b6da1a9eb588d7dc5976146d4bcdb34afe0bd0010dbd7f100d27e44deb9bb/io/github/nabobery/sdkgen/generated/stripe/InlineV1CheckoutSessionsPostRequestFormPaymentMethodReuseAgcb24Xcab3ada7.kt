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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/consent_collection/properties/payment_method_reuse_agreement.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/consent_collection/properties/payment_method_reuse_agreement
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodReuseAgcb24Xcab3ada7.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormPaymentMethodReuseAgcb24Xcab3ada7(
  public val position: InlineV1CheckoutSessionsPostRequestFormConsentCollectionPositionX93ad55d9,
) {
  public class Builder {
    private var positionValue:
        InlineV1CheckoutSessionsPostRequestFormConsentCollectionPositionX93ad55d9? = null

    public var position: InlineV1CheckoutSessionsPostRequestFormConsentCollectionPositionX93ad55d9
      get() = requireNotNull(positionValue) { "position is required" }
      set(`value`) {
        positionValue = value
      }

    public fun build(): InlineV1CheckoutSessionsPostRequestFormPaymentMethodReuseAgcb24Xcab3ada7 {
      check(positionValue != null) { "position is required" }
      return InlineV1CheckoutSessionsPostRequestFormPaymentMethodReuseAgcb24Xcab3ada7(
        position = position,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodReuseAgcb24Xcab3ada7 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodReuseAgcb24Xcab3ada7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormPaymentMethodReuseAgcb24Xcab3ada7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodReuseAgcb24Xcab3ada7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormPaymentMethodReuseAgcb24Xcab3ada7 must be a JSON object")
      val position = json.decodeRequired<InlineV1CheckoutSessionsPostRequestFormConsentCollectionPositionX93ad55d9>(rawObject, "position")
      return InlineV1CheckoutSessionsPostRequestFormPaymentMethodReuseAgcb24Xcab3ada7(
        position = position,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodReuseAgcb24Xcab3ada7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodReuseAgcb24Xcab3ada7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("position", json.encodeToJsonElement(value.position))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormPaymentMethodReuseAgcb24Xcab3ada7(block: InlineV1CheckoutSessionsPostRequestFormPaymentMethodReuseAgcb24Xcab3ada7.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodReuseAgcb24Xcab3ada7 = InlineV1CheckoutSessionsPostRequestFormPaymentMethodReuseAgcb24Xcab3ada7.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormPaymentMethodReuseAgcb24Xcab3ada7 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
