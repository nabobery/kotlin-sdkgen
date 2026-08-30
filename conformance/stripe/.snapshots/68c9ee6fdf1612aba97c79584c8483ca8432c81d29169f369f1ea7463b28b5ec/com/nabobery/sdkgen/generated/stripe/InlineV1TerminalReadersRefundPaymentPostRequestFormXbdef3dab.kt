package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1refund_payment/post/requestBody/content/applic
 * ation~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1refund_payment/post/requestBody/content/applic
 * ation~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1TerminalReadersRefundPaymentPostRequestFormXbdef3dab.Serializer::class)
public class InlineV1TerminalReadersRefundPaymentPostRequestFormXbdef3dab(
  /**
   * A positive integer in __cents__ representing how much of this charge to refund.
   */
  public val amount: Int? = null,
  /**
   * ID of the Charge to refund.
   */
  public val charge: String? = null,
  expand: List<String>? = null,
  metadata: Map<String, String>? = null,
  /**
   * ID of the PaymentIntent to refund.
   */
  public val paymentIntent: String? = null,
  /**
   * Boolean indicating whether the application fee should be refunded when refunding this charge. If a full charge
   * refund is given, the full application fee will be refunded. Otherwise, the application fee will be refunded in an
   * amount proportional to the amount of the charge refunded. An application fee can be refunded only by the
   * application that created the charge.
   */
  public val refundApplicationFee: Boolean? = null,
  /**
   * Configuration overrides for this refund, such as customer cancellation settings.
   */
  public val refundPaymentConfig:
      InlineV1TerminalReadersRefundPaymentPostRequestFormRefundPaymentConfigX03b8b741? = null,
  /**
   * Boolean indicating whether the transfer should be reversed when refunding this charge. The transfer will be
   * reversed proportionally to the amount being refunded (either the entire or partial amount). A transfer can be
   * reversed only by the application that created the charge.
   */
  public val reverseTransfer: Boolean? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    /**
     * A positive integer in __cents__ representing how much of this charge to refund.
     */
    public var amount: Int? = null

    /**
     * ID of the Charge to refund.
     */
    public var charge: String? = null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * ID of the PaymentIntent to refund.
     */
    public var paymentIntent: String? = null

    /**
     * Boolean indicating whether the application fee should be refunded when refunding this charge. If a full charge
     * refund is given, the full application fee will be refunded. Otherwise, the application fee will be refunded in an
     * amount proportional to the amount of the charge refunded. An application fee can be refunded only by the
     * application that created the charge.
     */
    public var refundApplicationFee: Boolean? = null

    /**
     * Configuration overrides for this refund, such as customer cancellation settings.
     */
    public var refundPaymentConfig:
        InlineV1TerminalReadersRefundPaymentPostRequestFormRefundPaymentConfigX03b8b741? = null

    /**
     * Boolean indicating whether the transfer should be reversed when refunding this charge. The transfer will be
     * reversed proportionally to the amount being refunded (either the entire or partial amount). A transfer can be
     * reversed only by the application that created the charge.
     */
    public var reverseTransfer: Boolean? = null

    public fun build(): InlineV1TerminalReadersRefundPaymentPostRequestFormXbdef3dab = InlineV1TerminalReadersRefundPaymentPostRequestFormXbdef3dab(
      amount = amount,
      charge = charge,
      expand = expand,
      metadata = metadata,
      paymentIntent = paymentIntent,
      refundApplicationFee = refundApplicationFee,
      refundPaymentConfig = refundPaymentConfig,
      reverseTransfer = reverseTransfer,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalReadersRefundPaymentPostRequestFormXbdef3dab = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TerminalReadersRefundPaymentPostRequestFormXbdef3dab> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalReadersRefundPaymentPostRequestFormXbdef3dab {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalReadersRefundPaymentPostRequestFormXbdef3dab")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalReadersRefundPaymentPostRequestFormXbdef3dab must be a JSON object")
      return InlineV1TerminalReadersRefundPaymentPostRequestFormXbdef3dab(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        charge = rawObject["charge"]?.let { json.decodeFromJsonElement<String>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        paymentIntent = rawObject["payment_intent"]?.let { json.decodeFromJsonElement<String>(it) },
        refundApplicationFee = rawObject["refund_application_fee"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        refundPaymentConfig = rawObject["refund_payment_config"]?.let { json.decodeFromJsonElement<InlineV1TerminalReadersRefundPaymentPostRequestFormRefundPaymentConfigX03b8b741>(it) },
        reverseTransfer = rawObject["reverse_transfer"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalReadersRefundPaymentPostRequestFormXbdef3dab) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalReadersRefundPaymentPostRequestFormXbdef3dab")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.charge?.let { put("charge", it) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.paymentIntent?.let { put("payment_intent", it) }
        value.refundApplicationFee?.let { put("refund_application_fee", json.encodeToJsonElement(it)) }
        value.refundPaymentConfig?.let { put("refund_payment_config", json.encodeToJsonElement(it)) }
        value.reverseTransfer?.let { put("reverse_transfer", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TerminalReadersRefundPaymentPostRequestFormXbdef3dab(block: InlineV1TerminalReadersRefundPaymentPostRequestFormXbdef3dab.Builder.() -> Unit): InlineV1TerminalReadersRefundPaymentPostRequestFormXbdef3dab = InlineV1TerminalReadersRefundPaymentPostRequestFormXbdef3dab.build(block)
