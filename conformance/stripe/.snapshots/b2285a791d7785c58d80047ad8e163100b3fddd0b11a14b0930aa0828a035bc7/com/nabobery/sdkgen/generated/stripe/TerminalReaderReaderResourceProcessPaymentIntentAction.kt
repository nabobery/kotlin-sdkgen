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
 * Represents a reader action to process a payment intent
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_process_payment_intent_action
 */
@Serializable(with = TerminalReaderReaderResourceProcessPaymentIntentAction.Serializer::class)
public class TerminalReaderReaderResourceProcessPaymentIntentAction(
  /**
   * Most recent PaymentIntent processed by the reader.
   */
  public val paymentIntent: InlineTerminalReaderReaderc999PaymentIntentX21e1acb3,
  public val processConfig: TerminalReaderReaderResourceProcessConfig? = null,
) {
  public class Builder {
    private var paymentIntentValue: InlineTerminalReaderReaderc999PaymentIntentX21e1acb3? = null

    public var paymentIntent: InlineTerminalReaderReaderc999PaymentIntentX21e1acb3
      get() = requireNotNull(paymentIntentValue) { "paymentIntent is required" }
      set(`value`) {
        paymentIntentValue = value
      }

    public var processConfig: TerminalReaderReaderResourceProcessConfig? = null

    public fun build(): TerminalReaderReaderResourceProcessPaymentIntentAction {
      check(paymentIntentValue != null) { "paymentIntent is required" }
      return TerminalReaderReaderResourceProcessPaymentIntentAction(
        paymentIntent = paymentIntent,
        processConfig = processConfig,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TerminalReaderReaderResourceProcessPaymentIntentAction = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TerminalReaderReaderResourceProcessPaymentIntentAction> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TerminalReaderReaderResourceProcessPaymentIntentAction {
      val jsonDecoder = decoder.requireJsonDecoder("TerminalReaderReaderResourceProcessPaymentIntentAction")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TerminalReaderReaderResourceProcessPaymentIntentAction must be a JSON object")
      val paymentIntent = json.decodeRequired<InlineTerminalReaderReaderc999PaymentIntentX21e1acb3>(rawObject, "payment_intent")
      return TerminalReaderReaderResourceProcessPaymentIntentAction(
        paymentIntent = paymentIntent,
        processConfig = rawObject["process_config"]?.let { json.decodeFromJsonElement<TerminalReaderReaderResourceProcessConfig>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TerminalReaderReaderResourceProcessPaymentIntentAction) {
      val jsonEncoder = encoder.requireJsonEncoder("TerminalReaderReaderResourceProcessPaymentIntentAction")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("payment_intent", json.encodeToJsonElement(value.paymentIntent))
        value.processConfig?.let { put("process_config", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun terminalReaderReaderResourceProcessPaymentIntentAction(block: TerminalReaderReaderResourceProcessPaymentIntentAction.Builder.() -> Unit): TerminalReaderReaderResourceProcessPaymentIntentAction = TerminalReaderReaderResourceProcessPaymentIntentAction.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TerminalReaderReaderResourceProcessPaymentIntentAction is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
