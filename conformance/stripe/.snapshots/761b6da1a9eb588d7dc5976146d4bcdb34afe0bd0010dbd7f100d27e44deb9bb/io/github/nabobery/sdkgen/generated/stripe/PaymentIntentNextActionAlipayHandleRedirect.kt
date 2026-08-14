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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_next_action_alipay_handle_redirect
 */
@Serializable(with = PaymentIntentNextActionAlipayHandleRedirect.Serializer::class)
public class PaymentIntentNextActionAlipayHandleRedirect(
  /**
   * The native data to be used with Alipay SDK you must redirect your customer to in order to authenticate the payment
   * in an Android App.
   */
  public val nativeData: String? = null,
  /**
   * The native URL you must redirect your customer to in order to authenticate the payment in an iOS App.
   */
  public val nativeUrl: String? = null,
  /**
   * If the customer does not exit their browser while authenticating, they will be redirected to this specified URL
   * after completion.
   */
  public val returnUrl: String? = null,
  /**
   * The URL you must redirect your customer to in order to authenticate the payment.
   */
  public val url: String? = null,
) {
  public class Builder {
    /**
     * The native data to be used with Alipay SDK you must redirect your customer to in order to authenticate the
     * payment in an Android App.
     */
    public var nativeData: String? = null

    /**
     * The native URL you must redirect your customer to in order to authenticate the payment in an iOS App.
     */
    public var nativeUrl: String? = null

    /**
     * If the customer does not exit their browser while authenticating, they will be redirected to this specified URL
     * after completion.
     */
    public var returnUrl: String? = null

    /**
     * The URL you must redirect your customer to in order to authenticate the payment.
     */
    public var url: String? = null

    public fun build(): PaymentIntentNextActionAlipayHandleRedirect = PaymentIntentNextActionAlipayHandleRedirect(
      nativeData = nativeData,
      nativeUrl = nativeUrl,
      returnUrl = returnUrl,
      url = url,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentIntentNextActionAlipayHandleRedirect = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentIntentNextActionAlipayHandleRedirect> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentIntentNextActionAlipayHandleRedirect {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentIntentNextActionAlipayHandleRedirect")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentIntentNextActionAlipayHandleRedirect must be a JSON object")
      return PaymentIntentNextActionAlipayHandleRedirect(
        nativeData = rawObject["native_data"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        nativeUrl = rawObject["native_url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        returnUrl = rawObject["return_url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        url = rawObject["url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentIntentNextActionAlipayHandleRedirect) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentIntentNextActionAlipayHandleRedirect")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.nativeData?.let { put("native_data", it) }
        value.nativeUrl?.let { put("native_url", it) }
        value.returnUrl?.let { put("return_url", it) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentIntentNextActionAlipayHandleRedirect(block: PaymentIntentNextActionAlipayHandleRedirect.Builder.() -> Unit): PaymentIntentNextActionAlipayHandleRedirect = PaymentIntentNextActionAlipayHandleRedirect.build(block)
