package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class SetupIntentNextActionView(
  @SerialName("blik_authorize")
  public val blikAuthorize: JsonObject? = null,
  @SerialName("cashapp_handle_redirect_or_display_qr_code")
  public val cashappHandleRedirectOrDisplayQrCode:
      PaymentIntentNextActionCashappHandleRedirectOrDisplayQrCode? = null,
  @SerialName("pix_display_qr_code")
  public val pixDisplayQrCode: SetupIntentNextActionPixDisplayQrCode? = null,
  @SerialName("redirect_to_url")
  public val redirectToUrl: SetupIntentNextActionRedirectToUrl? = null,
  public val type: String,
  @SerialName("upi_handle_redirect_or_display_qr_code")
  public val upiHandleRedirectOrDisplayQrCode:
      PaymentIntentNextActionUpiHandleRedirectOrDisplayQrCode? = null,
  @SerialName("use_stripe_sdk")
  public val useStripeSdk: JsonObject? = null,
  @SerialName("verify_with_microdeposits")
  public val verifyWithMicrodeposits: SetupIntentNextActionVerifyWithMicrodeposits? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent_next_action
 */
@Serializable(with = SetupIntentNextAction.Serializer::class)
public class SetupIntentNextAction(
  /**
   * Type of the next action to perform. Refer to the other child attributes under `next_action` for available values.
   * Examples include: `redirect_to_url`, `use_stripe_sdk`, `alipay_handle_redirect`, `oxxo_display_details`, or
   * `verify_with_microdeposits`.
   */
  public val type: String,
  public val blikAuthorize: JsonObject? = null,
  public val cashappHandleRedirectOrDisplayQrCode:
      PaymentIntentNextActionCashappHandleRedirectOrDisplayQrCode? = null,
  public val pixDisplayQrCode: SetupIntentNextActionPixDisplayQrCode? = null,
  public val redirectToUrl: SetupIntentNextActionRedirectToUrl? = null,
  public val upiHandleRedirectOrDisplayQrCode:
      PaymentIntentNextActionUpiHandleRedirectOrDisplayQrCode? = null,
  /**
   * When confirming a SetupIntent with Stripe.js, Stripe.js depends on the contents of this dictionary to invoke
   * authentication flows. The shape of the contents is subject to change and is only intended to be used by Stripe.js.
   */
  public val useStripeSdk: JsonObject? = null,
  public val verifyWithMicrodeposits: SetupIntentNextActionVerifyWithMicrodeposits? = null,
) {
  public class Builder {
    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var blikAuthorize: JsonObject? = null

    public var cashappHandleRedirectOrDisplayQrCode:
        PaymentIntentNextActionCashappHandleRedirectOrDisplayQrCode? = null

    public var pixDisplayQrCode: SetupIntentNextActionPixDisplayQrCode? = null

    public var redirectToUrl: SetupIntentNextActionRedirectToUrl? = null

    public var upiHandleRedirectOrDisplayQrCode:
        PaymentIntentNextActionUpiHandleRedirectOrDisplayQrCode? = null

    /**
     * When confirming a SetupIntent with Stripe.js, Stripe.js depends on the contents of this dictionary to invoke
     * authentication flows. The shape of the contents is subject to change and is only intended to be used by
     * Stripe.js.
     */
    public var useStripeSdk: JsonObject? = null

    public var verifyWithMicrodeposits: SetupIntentNextActionVerifyWithMicrodeposits? = null

    public fun build(): SetupIntentNextAction {
      check(typeValue != null) { "type is required" }
      return SetupIntentNextAction(
        type = type,
        blikAuthorize = blikAuthorize,
        cashappHandleRedirectOrDisplayQrCode = cashappHandleRedirectOrDisplayQrCode,
        pixDisplayQrCode = pixDisplayQrCode,
        redirectToUrl = redirectToUrl,
        upiHandleRedirectOrDisplayQrCode = upiHandleRedirectOrDisplayQrCode,
        useStripeSdk = useStripeSdk,
        verifyWithMicrodeposits = verifyWithMicrodeposits,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SetupIntentNextAction = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SetupIntentNextAction> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SetupIntentNextAction {
      val jsonDecoder = decoder.requireJsonDecoder("SetupIntentNextAction")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SetupIntentNextAction must be a JSON object")
      val type = json.decodeRequired<String>(rawObject, "type")
      return SetupIntentNextAction(
        type = type,
        blikAuthorize = rawObject["blik_authorize"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        cashappHandleRedirectOrDisplayQrCode = rawObject["cashapp_handle_redirect_or_display_qr_code"]?.let { json.decodeFromJsonElement<PaymentIntentNextActionCashappHandleRedirectOrDisplayQrCode>(it) },
        pixDisplayQrCode = rawObject["pix_display_qr_code"]?.let { json.decodeFromJsonElement<SetupIntentNextActionPixDisplayQrCode>(it) },
        redirectToUrl = rawObject["redirect_to_url"]?.let { json.decodeFromJsonElement<SetupIntentNextActionRedirectToUrl>(it) },
        upiHandleRedirectOrDisplayQrCode = rawObject["upi_handle_redirect_or_display_qr_code"]?.let { json.decodeFromJsonElement<PaymentIntentNextActionUpiHandleRedirectOrDisplayQrCode>(it) },
        useStripeSdk = rawObject["use_stripe_sdk"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        verifyWithMicrodeposits = rawObject["verify_with_microdeposits"]?.let { json.decodeFromJsonElement<SetupIntentNextActionVerifyWithMicrodeposits>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SetupIntentNextAction) {
      val jsonEncoder = encoder.requireJsonEncoder("SetupIntentNextAction")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", value.type)
        value.blikAuthorize?.let { put("blik_authorize", json.encodeToJsonElement(it)) }
        value.cashappHandleRedirectOrDisplayQrCode?.let { put("cashapp_handle_redirect_or_display_qr_code", json.encodeToJsonElement(it)) }
        value.pixDisplayQrCode?.let { put("pix_display_qr_code", json.encodeToJsonElement(it)) }
        value.redirectToUrl?.let { put("redirect_to_url", json.encodeToJsonElement(it)) }
        value.upiHandleRedirectOrDisplayQrCode?.let { put("upi_handle_redirect_or_display_qr_code", json.encodeToJsonElement(it)) }
        value.useStripeSdk?.let { put("use_stripe_sdk", json.encodeToJsonElement(it)) }
        value.verifyWithMicrodeposits?.let { put("verify_with_microdeposits", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun setupIntentNextAction(block: SetupIntentNextAction.Builder.() -> Unit): SetupIntentNextAction = SetupIntentNextAction.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SetupIntentNextAction is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
