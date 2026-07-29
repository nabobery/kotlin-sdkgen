package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Configuration overrides for this refund, such as customer cancellation settings.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1refund_payment/post/requestBody/content/applic
 * ation~1x-www-form-urlencoded/schema/properties/refund_payment_config
 */
@Serializable(with = InlineV1TerminalReadersRefundPaymentPostRequestFormRefundPaymentConfigX03b8b741.Serializer::class)
public class InlineV1TerminalReadersRefundPaymentPostRequestFormRefundPaymentConfigX03b8b741(
  public val enableCustomerCancellation: Boolean? = null,
) {
  public class Builder {
    public var enableCustomerCancellation: Boolean? = null

    public fun build(): InlineV1TerminalReadersRefundPaymentPostRequestFormRefundPaymentConfigX03b8b741 = InlineV1TerminalReadersRefundPaymentPostRequestFormRefundPaymentConfigX03b8b741(
      enableCustomerCancellation = enableCustomerCancellation,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalReadersRefundPaymentPostRequestFormRefundPaymentConfigX03b8b741 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TerminalReadersRefundPaymentPostRequestFormRefundPaymentConfigX03b8b741> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalReadersRefundPaymentPostRequestFormRefundPaymentConfigX03b8b741 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalReadersRefundPaymentPostRequestFormRefundPaymentConfigX03b8b741")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalReadersRefundPaymentPostRequestFormRefundPaymentConfigX03b8b741 must be a JSON object")
      return InlineV1TerminalReadersRefundPaymentPostRequestFormRefundPaymentConfigX03b8b741(
        enableCustomerCancellation = rawObject["enable_customer_cancellation"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalReadersRefundPaymentPostRequestFormRefundPaymentConfigX03b8b741) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalReadersRefundPaymentPostRequestFormRefundPaymentConfigX03b8b741")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.enableCustomerCancellation?.let { put("enable_customer_cancellation", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TerminalReadersRefundPaymentPostRequestFormRefundPaymentConfigX03b8b741(block: InlineV1TerminalReadersRefundPaymentPostRequestFormRefundPaymentConfigX03b8b741.Builder.() -> Unit): InlineV1TerminalReadersRefundPaymentPostRequestFormRefundPaymentConfigX03b8b741 = InlineV1TerminalReadersRefundPaymentPostRequestFormRefundPaymentConfigX03b8b741.build(block)
