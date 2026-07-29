package com.nabobery.sdkgen.generated.stripe

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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_links_resource_completion_behavior_confirmation_page
 */
@Serializable(with = PaymentLinksResourceCompletionBehaviorConfirmationPage.Serializer::class)
public class PaymentLinksResourceCompletionBehaviorConfirmationPage(
  /**
   * The custom message that is displayed to the customer after the purchase is complete.
   */
  public val customMessage: String? = null,
) {
  public class Builder {
    /**
     * The custom message that is displayed to the customer after the purchase is complete.
     */
    public var customMessage: String? = null

    public fun build(): PaymentLinksResourceCompletionBehaviorConfirmationPage = PaymentLinksResourceCompletionBehaviorConfirmationPage(
      customMessage = customMessage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentLinksResourceCompletionBehaviorConfirmationPage = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentLinksResourceCompletionBehaviorConfirmationPage> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentLinksResourceCompletionBehaviorConfirmationPage {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentLinksResourceCompletionBehaviorConfirmationPage")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentLinksResourceCompletionBehaviorConfirmationPage must be a JSON object")
      return PaymentLinksResourceCompletionBehaviorConfirmationPage(
        customMessage = rawObject["custom_message"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentLinksResourceCompletionBehaviorConfirmationPage) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentLinksResourceCompletionBehaviorConfirmationPage")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.customMessage?.let { put("custom_message", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentLinksResourceCompletionBehaviorConfirmationPage(block: PaymentLinksResourceCompletionBehaviorConfirmationPage.Builder.() -> Unit): PaymentLinksResourceCompletionBehaviorConfirmationPage = PaymentLinksResourceCompletionBehaviorConfirmationPage.build(block)
