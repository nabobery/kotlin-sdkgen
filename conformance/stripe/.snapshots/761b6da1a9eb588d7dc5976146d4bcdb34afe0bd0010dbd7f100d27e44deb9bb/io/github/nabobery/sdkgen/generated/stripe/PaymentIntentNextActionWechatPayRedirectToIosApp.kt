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
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_next_action_wechat_pay_redirect_to_ios_app
 */
@Serializable(with = PaymentIntentNextActionWechatPayRedirectToIosApp.Serializer::class)
public class PaymentIntentNextActionWechatPayRedirectToIosApp(
  /**
   * An universal link that redirect to WeChat Pay app
   */
  public val nativeUrl: String,
) {
  public class Builder {
    private var nativeUrlValue: String? = null

    public var nativeUrl: String
      get() = requireNotNull(nativeUrlValue) { "nativeUrl is required" }
      set(`value`) {
        nativeUrlValue = value
      }

    public fun build(): PaymentIntentNextActionWechatPayRedirectToIosApp {
      check(nativeUrlValue != null) { "nativeUrl is required" }
      return PaymentIntentNextActionWechatPayRedirectToIosApp(
        nativeUrl = nativeUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentIntentNextActionWechatPayRedirectToIosApp = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentIntentNextActionWechatPayRedirectToIosApp> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentIntentNextActionWechatPayRedirectToIosApp {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentIntentNextActionWechatPayRedirectToIosApp")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentIntentNextActionWechatPayRedirectToIosApp must be a JSON object")
      val nativeUrl = json.decodeRequired<String>(rawObject, "native_url")
      return PaymentIntentNextActionWechatPayRedirectToIosApp(
        nativeUrl = nativeUrl,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentIntentNextActionWechatPayRedirectToIosApp) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentIntentNextActionWechatPayRedirectToIosApp")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("native_url", value.nativeUrl)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentIntentNextActionWechatPayRedirectToIosApp(block: PaymentIntentNextActionWechatPayRedirectToIosApp.Builder.() -> Unit): PaymentIntentNextActionWechatPayRedirectToIosApp = PaymentIntentNextActionWechatPayRedirectToIosApp.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentIntentNextActionWechatPayRedirectToIosApp is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
