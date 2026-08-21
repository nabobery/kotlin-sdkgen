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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Represents a reader action to collect a payment method
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_collect_payment_method_action
 */
@Serializable(with = TerminalReaderReaderResourceCollectPaymentMethodAction.Serializer::class)
public class TerminalReaderReaderResourceCollectPaymentMethodAction(
  /**
   * Most recent PaymentIntent processed by the reader.
   */
  public val paymentIntent: InlineTerminalReaderReaderd071PaymentIntentX8b0bb902,
  public val collectConfig: TerminalReaderReaderResourceCollectConfig? = null,
  public val paymentMethod: PaymentMethod? = null,
) {
  public class Builder {
    private var paymentIntentValue: InlineTerminalReaderReaderd071PaymentIntentX8b0bb902? = null

    public var paymentIntent: InlineTerminalReaderReaderd071PaymentIntentX8b0bb902
      get() = requireNotNull(paymentIntentValue) { "paymentIntent is required" }
      set(`value`) {
        paymentIntentValue = value
      }

    public var collectConfig: TerminalReaderReaderResourceCollectConfig? = null

    public var paymentMethod: PaymentMethod? = null

    public fun build(): TerminalReaderReaderResourceCollectPaymentMethodAction {
      check(paymentIntentValue != null) { "paymentIntent is required" }
      return TerminalReaderReaderResourceCollectPaymentMethodAction(
        paymentIntent = paymentIntent,
        collectConfig = collectConfig,
        paymentMethod = paymentMethod,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TerminalReaderReaderResourceCollectPaymentMethodAction = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TerminalReaderReaderResourceCollectPaymentMethodAction> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TerminalReaderReaderResourceCollectPaymentMethodAction {
      val jsonDecoder = decoder.requireJsonDecoder("TerminalReaderReaderResourceCollectPaymentMethodAction")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TerminalReaderReaderResourceCollectPaymentMethodAction must be a JSON object")
      val paymentIntent = json.decodeRequired<InlineTerminalReaderReaderd071PaymentIntentX8b0bb902>(rawObject, "payment_intent")
      return TerminalReaderReaderResourceCollectPaymentMethodAction(
        paymentIntent = paymentIntent,
        collectConfig = rawObject["collect_config"]?.let { json.decodeFromJsonElement<TerminalReaderReaderResourceCollectConfig>(it) },
        paymentMethod = rawObject["payment_method"]?.let { json.decodeFromJsonElement<PaymentMethod>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TerminalReaderReaderResourceCollectPaymentMethodAction) {
      val jsonEncoder = encoder.requireJsonEncoder("TerminalReaderReaderResourceCollectPaymentMethodAction")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("payment_intent", json.encodeToJsonElement(value.paymentIntent))
        value.collectConfig?.let { put("collect_config", json.encodeToJsonElement(it)) }
        value.paymentMethod?.let { put("payment_method", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun terminalReaderReaderResourceCollectPaymentMethodAction(block: TerminalReaderReaderResourceCollectPaymentMethodAction.Builder.() -> Unit): TerminalReaderReaderResourceCollectPaymentMethodAction = TerminalReaderReaderResourceCollectPaymentMethodAction.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TerminalReaderReaderResourceCollectPaymentMethodAction is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
