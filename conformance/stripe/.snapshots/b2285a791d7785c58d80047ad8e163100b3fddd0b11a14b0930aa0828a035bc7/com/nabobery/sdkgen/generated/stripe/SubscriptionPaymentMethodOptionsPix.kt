package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class SubscriptionPaymentMethodOptionsPixView(
  @SerialName("expires_after_seconds")
  public val expiresAfterSeconds: Int? = null,
  @SerialName("mandate_options")
  public val mandateOptions: SubscriptionPaymentMethodOptionsMandateOptionsPix? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription_payment_method_options_pix
 */
@Serializable(with = SubscriptionPaymentMethodOptionsPix.Serializer::class)
public class SubscriptionPaymentMethodOptionsPix(
  /**
   * The number of seconds (between 10 and 1209600) after which Pix payment will expire. Defaults to 86400 seconds.
   */
  public val expiresAfterSeconds: Int? = null,
  public val mandateOptions: SubscriptionPaymentMethodOptionsMandateOptionsPix? = null,
) {
  public class Builder {
    /**
     * The number of seconds (between 10 and 1209600) after which Pix payment will expire. Defaults to 86400 seconds.
     */
    public var expiresAfterSeconds: Int? = null

    public var mandateOptions: SubscriptionPaymentMethodOptionsMandateOptionsPix? = null

    public fun build(): SubscriptionPaymentMethodOptionsPix = SubscriptionPaymentMethodOptionsPix(
      expiresAfterSeconds = expiresAfterSeconds,
      mandateOptions = mandateOptions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SubscriptionPaymentMethodOptionsPix = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SubscriptionPaymentMethodOptionsPix> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SubscriptionPaymentMethodOptionsPix {
      val jsonDecoder = decoder.requireJsonDecoder("SubscriptionPaymentMethodOptionsPix")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SubscriptionPaymentMethodOptionsPix must be a JSON object")
      return SubscriptionPaymentMethodOptionsPix(
        expiresAfterSeconds = rawObject["expires_after_seconds"]?.let { json.decodeFromJsonElement<Int>(it) },
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<SubscriptionPaymentMethodOptionsMandateOptionsPix>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SubscriptionPaymentMethodOptionsPix) {
      val jsonEncoder = encoder.requireJsonEncoder("SubscriptionPaymentMethodOptionsPix")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.expiresAfterSeconds?.let { put("expires_after_seconds", json.encodeToJsonElement(it)) }
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun subscriptionPaymentMethodOptionsPix(block: SubscriptionPaymentMethodOptionsPix.Builder.() -> Unit): SubscriptionPaymentMethodOptionsPix = SubscriptionPaymentMethodOptionsPix.build(block)
