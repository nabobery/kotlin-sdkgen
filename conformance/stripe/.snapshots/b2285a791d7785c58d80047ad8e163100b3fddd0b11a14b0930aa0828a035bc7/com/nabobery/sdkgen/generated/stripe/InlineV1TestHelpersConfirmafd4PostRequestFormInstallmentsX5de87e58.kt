package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_options/properties/card/properties/installments.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_options/properties/card/properties/installments
 */
@Serializable(with = InlineV1TestHelpersConfirmafd4PostRequestFormInstallmentsX5de87e58.Serializer::class)
public class InlineV1TestHelpersConfirmafd4PostRequestFormInstallmentsX5de87e58(
  public val plan: InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsPlanX9f7a4417,
) {
  public class Builder {
    private var planValue:
        InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsPlanX9f7a4417? = null

    public var plan: InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsPlanX9f7a4417
      get() = requireNotNull(planValue) { "plan is required" }
      set(`value`) {
        planValue = value
      }

    public fun build(): InlineV1TestHelpersConfirmafd4PostRequestFormInstallmentsX5de87e58 {
      check(planValue != null) { "plan is required" }
      return InlineV1TestHelpersConfirmafd4PostRequestFormInstallmentsX5de87e58(
        plan = plan,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersConfirmafd4PostRequestFormInstallmentsX5de87e58 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TestHelpersConfirmafd4PostRequestFormInstallmentsX5de87e58> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersConfirmafd4PostRequestFormInstallmentsX5de87e58 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersConfirmafd4PostRequestFormInstallmentsX5de87e58")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersConfirmafd4PostRequestFormInstallmentsX5de87e58 must be a JSON object")
      val plan = json.decodeRequired<InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsPlanX9f7a4417>(rawObject, "plan")
      return InlineV1TestHelpersConfirmafd4PostRequestFormInstallmentsX5de87e58(
        plan = plan,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersConfirmafd4PostRequestFormInstallmentsX5de87e58) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersConfirmafd4PostRequestFormInstallmentsX5de87e58")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("plan", json.encodeToJsonElement(value.plan))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersConfirmafd4PostRequestFormInstallmentsX5de87e58(block: InlineV1TestHelpersConfirmafd4PostRequestFormInstallmentsX5de87e58.Builder.() -> Unit): InlineV1TestHelpersConfirmafd4PostRequestFormInstallmentsX5de87e58 = InlineV1TestHelpersConfirmafd4PostRequestFormInstallmentsX5de87e58.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TestHelpersConfirmafd4PostRequestFormInstallmentsX5de87e58 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
