package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
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
 * Represents a reader action to refund a payment
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_refund_payment_action
 */
@Serializable(with = TerminalReaderReaderResourceRefundPaymentAction.Serializer::class)
public class TerminalReaderReaderResourceRefundPaymentAction(
  /**
   * The amount being refunded.
   */
  public val amount: Int? = null,
  /**
   * Charge that is being refunded.
   */
  public val charge: InlineTerminalReaderReaderResourceRefundPaymentActionChargeXfab6da75? = null,
  metadata: Map<String, String>? = null,
  /**
   * Payment intent that is being refunded.
   */
  public val paymentIntent:
      InlineTerminalReaderReaderResourceRefundPaymentActionPaymentIntentXff759917? = null,
  /**
   * The reason for the refund.
   */
  public val reason: InlineTerminalReaderReaderResourceRefundPaymentActionReasonXb6a79c1f? = null,
  /**
   * Unique identifier for the refund object.
   */
  public val refund: InlineTerminalReaderReaderResourceRefundPaymentActionRefundX0671899e? = null,
  /**
   * Boolean indicating whether the application fee should be refunded when refunding this charge. If a full charge
   * refund is given, the full application fee will be refunded. Otherwise, the application fee will be refunded in an
   * amount proportional to the amount of the charge refunded. An application fee can be refunded only by the
   * application that created the charge.
   */
  public val refundApplicationFee: Boolean? = null,
  public val refundPaymentConfig: TerminalReaderReaderResourceRefundPaymentConfig? = null,
  /**
   * Boolean indicating whether the transfer should be reversed when refunding this charge. The transfer will be
   * reversed proportionally to the amount being refunded (either the entire or partial amount). A transfer can be
   * reversed only by the application that created the charge.
   */
  public val reverseTransfer: Boolean? = null,
) {
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    /**
     * The amount being refunded.
     */
    public var amount: Int? = null

    /**
     * Charge that is being refunded.
     */
    public var charge: InlineTerminalReaderReaderResourceRefundPaymentActionChargeXfab6da75? = null

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format.
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * Payment intent that is being refunded.
     */
    public var paymentIntent:
        InlineTerminalReaderReaderResourceRefundPaymentActionPaymentIntentXff759917? = null

    /**
     * The reason for the refund.
     */
    public var reason: InlineTerminalReaderReaderResourceRefundPaymentActionReasonXb6a79c1f? = null

    /**
     * Unique identifier for the refund object.
     */
    public var refund: InlineTerminalReaderReaderResourceRefundPaymentActionRefundX0671899e? = null

    /**
     * Boolean indicating whether the application fee should be refunded when refunding this charge. If a full charge
     * refund is given, the full application fee will be refunded. Otherwise, the application fee will be refunded in an
     * amount proportional to the amount of the charge refunded. An application fee can be refunded only by the
     * application that created the charge.
     */
    public var refundApplicationFee: Boolean? = null

    public var refundPaymentConfig: TerminalReaderReaderResourceRefundPaymentConfig? = null

    /**
     * Boolean indicating whether the transfer should be reversed when refunding this charge. The transfer will be
     * reversed proportionally to the amount being refunded (either the entire or partial amount). A transfer can be
     * reversed only by the application that created the charge.
     */
    public var reverseTransfer: Boolean? = null

    public fun build(): TerminalReaderReaderResourceRefundPaymentAction = TerminalReaderReaderResourceRefundPaymentAction(
      amount = amount,
      charge = charge,
      metadata = metadata,
      paymentIntent = paymentIntent,
      reason = reason,
      refund = refund,
      refundApplicationFee = refundApplicationFee,
      refundPaymentConfig = refundPaymentConfig,
      reverseTransfer = reverseTransfer,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TerminalReaderReaderResourceRefundPaymentAction = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TerminalReaderReaderResourceRefundPaymentAction> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TerminalReaderReaderResourceRefundPaymentAction {
      val jsonDecoder = decoder.requireJsonDecoder("TerminalReaderReaderResourceRefundPaymentAction")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TerminalReaderReaderResourceRefundPaymentAction must be a JSON object")
      return TerminalReaderReaderResourceRefundPaymentAction(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        charge = rawObject["charge"]?.let { json.decodeFromJsonElement<InlineTerminalReaderReaderResourceRefundPaymentActionChargeXfab6da75>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        paymentIntent = rawObject["payment_intent"]?.let { json.decodeFromJsonElement<InlineTerminalReaderReaderResourceRefundPaymentActionPaymentIntentXff759917>(it) },
        reason = rawObject["reason"]?.let { json.decodeFromJsonElement<InlineTerminalReaderReaderResourceRefundPaymentActionReasonXb6a79c1f>(it) },
        refund = rawObject["refund"]?.let { json.decodeFromJsonElement<InlineTerminalReaderReaderResourceRefundPaymentActionRefundX0671899e>(it) },
        refundApplicationFee = rawObject["refund_application_fee"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        refundPaymentConfig = rawObject["refund_payment_config"]?.let { json.decodeFromJsonElement<TerminalReaderReaderResourceRefundPaymentConfig>(it) },
        reverseTransfer = rawObject["reverse_transfer"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TerminalReaderReaderResourceRefundPaymentAction) {
      val jsonEncoder = encoder.requireJsonEncoder("TerminalReaderReaderResourceRefundPaymentAction")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.charge?.let { put("charge", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.paymentIntent?.let { put("payment_intent", json.encodeToJsonElement(it)) }
        value.reason?.let { put("reason", json.encodeToJsonElement(it)) }
        value.refund?.let { put("refund", json.encodeToJsonElement(it)) }
        value.refundApplicationFee?.let { put("refund_application_fee", json.encodeToJsonElement(it)) }
        value.refundPaymentConfig?.let { put("refund_payment_config", json.encodeToJsonElement(it)) }
        value.reverseTransfer?.let { put("reverse_transfer", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun terminalReaderReaderResourceRefundPaymentAction(block: TerminalReaderReaderResourceRefundPaymentAction.Builder.() -> Unit): TerminalReaderReaderResourceRefundPaymentAction = TerminalReaderReaderResourceRefundPaymentAction.build(block)
