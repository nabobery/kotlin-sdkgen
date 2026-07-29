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
import kotlinx.serialization.json.put

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_next_action_wechat_pay_redirect_to_android_app
 */
@Serializable(with = PaymentIntentNextActionWechatPayRedirectToAndroidApp.Serializer::class)
public class PaymentIntentNextActionWechatPayRedirectToAndroidApp(
  /**
   * app_id is the APP ID registered on WeChat open platform
   */
  public val appId: String,
  /**
   * nonce_str is a random string
   */
  public val nonceStr: String,
  /**
   * package is static value
   */
  public val packageValue: String,
  /**
   * an unique merchant ID assigned by WeChat Pay
   */
  public val partnerId: String,
  /**
   * an unique trading ID assigned by WeChat Pay
   */
  public val prepayId: String,
  /**
   * A signature
   */
  public val sign: String,
  /**
   * Specifies the current time in epoch format
   */
  public val timestamp: String,
) {
  public class Builder {
    private var appIdValue: String? = null

    public var appId: String
      get() = requireNotNull(appIdValue) { "appId is required" }
      set(`value`) {
        appIdValue = value
      }

    private var nonceStrValue: String? = null

    public var nonceStr: String
      get() = requireNotNull(nonceStrValue) { "nonceStr is required" }
      set(`value`) {
        nonceStrValue = value
      }

    private var packageValueValue: String? = null

    public var packageValue: String
      get() = requireNotNull(packageValueValue) { "packageValue is required" }
      set(`value`) {
        packageValueValue = value
      }

    private var partnerIdValue: String? = null

    public var partnerId: String
      get() = requireNotNull(partnerIdValue) { "partnerId is required" }
      set(`value`) {
        partnerIdValue = value
      }

    private var prepayIdValue: String? = null

    public var prepayId: String
      get() = requireNotNull(prepayIdValue) { "prepayId is required" }
      set(`value`) {
        prepayIdValue = value
      }

    private var signValue: String? = null

    public var sign: String
      get() = requireNotNull(signValue) { "sign is required" }
      set(`value`) {
        signValue = value
      }

    private var timestampValue: String? = null

    public var timestamp: String
      get() = requireNotNull(timestampValue) { "timestamp is required" }
      set(`value`) {
        timestampValue = value
      }

    public fun build(): PaymentIntentNextActionWechatPayRedirectToAndroidApp {
      check(appIdValue != null) { "appId is required" }
      check(nonceStrValue != null) { "nonceStr is required" }
      check(packageValueValue != null) { "packageValue is required" }
      check(partnerIdValue != null) { "partnerId is required" }
      check(prepayIdValue != null) { "prepayId is required" }
      check(signValue != null) { "sign is required" }
      check(timestampValue != null) { "timestamp is required" }
      return PaymentIntentNextActionWechatPayRedirectToAndroidApp(
        appId = appId,
        nonceStr = nonceStr,
        packageValue = packageValue,
        partnerId = partnerId,
        prepayId = prepayId,
        sign = sign,
        timestamp = timestamp,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentIntentNextActionWechatPayRedirectToAndroidApp = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentIntentNextActionWechatPayRedirectToAndroidApp> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentIntentNextActionWechatPayRedirectToAndroidApp {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentIntentNextActionWechatPayRedirectToAndroidApp")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentIntentNextActionWechatPayRedirectToAndroidApp must be a JSON object")
      val appId = json.decodeRequired<String>(rawObject, "app_id")
      val nonceStr = json.decodeRequired<String>(rawObject, "nonce_str")
      val packageValue = json.decodeRequired<String>(rawObject, "package")
      val partnerId = json.decodeRequired<String>(rawObject, "partner_id")
      val prepayId = json.decodeRequired<String>(rawObject, "prepay_id")
      val sign = json.decodeRequired<String>(rawObject, "sign")
      val timestamp = json.decodeRequired<String>(rawObject, "timestamp")
      return PaymentIntentNextActionWechatPayRedirectToAndroidApp(
        appId = appId,
        nonceStr = nonceStr,
        packageValue = packageValue,
        partnerId = partnerId,
        prepayId = prepayId,
        sign = sign,
        timestamp = timestamp,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentIntentNextActionWechatPayRedirectToAndroidApp) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentIntentNextActionWechatPayRedirectToAndroidApp")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("app_id", value.appId)
        put("nonce_str", value.nonceStr)
        put("package", value.packageValue)
        put("partner_id", value.partnerId)
        put("prepay_id", value.prepayId)
        put("sign", value.sign)
        put("timestamp", value.timestamp)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentIntentNextActionWechatPayRedirectToAndroidApp(block: PaymentIntentNextActionWechatPayRedirectToAndroidApp.Builder.() -> Unit): PaymentIntentNextActionWechatPayRedirectToAndroidApp = PaymentIntentNextActionWechatPayRedirectToAndroidApp.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentIntentNextActionWechatPayRedirectToAndroidApp is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
