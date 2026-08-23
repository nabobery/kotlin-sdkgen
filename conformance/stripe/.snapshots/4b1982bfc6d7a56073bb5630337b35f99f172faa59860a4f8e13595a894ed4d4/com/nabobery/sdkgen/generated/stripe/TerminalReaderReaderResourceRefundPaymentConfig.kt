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
 * Represents a per-transaction override of a reader configuration
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_refund_payment_config
 */
@Serializable(with = TerminalReaderReaderResourceRefundPaymentConfig.Serializer::class)
public class TerminalReaderReaderResourceRefundPaymentConfig(
  /**
   * Enable customer-initiated cancellation when refunding this payment.
   */
  public val enableCustomerCancellation: Boolean? = null,
) {
  public class Builder {
    /**
     * Enable customer-initiated cancellation when refunding this payment.
     */
    public var enableCustomerCancellation: Boolean? = null

    public fun build(): TerminalReaderReaderResourceRefundPaymentConfig = TerminalReaderReaderResourceRefundPaymentConfig(
      enableCustomerCancellation = enableCustomerCancellation,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TerminalReaderReaderResourceRefundPaymentConfig = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TerminalReaderReaderResourceRefundPaymentConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TerminalReaderReaderResourceRefundPaymentConfig {
      val jsonDecoder = decoder.requireJsonDecoder("TerminalReaderReaderResourceRefundPaymentConfig")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TerminalReaderReaderResourceRefundPaymentConfig must be a JSON object")
      return TerminalReaderReaderResourceRefundPaymentConfig(
        enableCustomerCancellation = rawObject["enable_customer_cancellation"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TerminalReaderReaderResourceRefundPaymentConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("TerminalReaderReaderResourceRefundPaymentConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.enableCustomerCancellation?.let { put("enable_customer_cancellation", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun terminalReaderReaderResourceRefundPaymentConfig(block: TerminalReaderReaderResourceRefundPaymentConfig.Builder.() -> Unit): TerminalReaderReaderResourceRefundPaymentConfig = TerminalReaderReaderResourceRefundPaymentConfig.build(block)
