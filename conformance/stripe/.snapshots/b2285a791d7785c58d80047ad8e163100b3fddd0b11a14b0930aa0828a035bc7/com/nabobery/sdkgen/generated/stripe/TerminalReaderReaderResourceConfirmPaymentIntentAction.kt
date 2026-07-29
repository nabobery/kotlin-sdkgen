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
 * Represents a reader action to confirm a payment
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_confirm_payment_intent_action
 */
@Serializable(with = TerminalReaderReaderResourceConfirmPaymentIntentAction.Serializer::class)
public class TerminalReaderReaderResourceConfirmPaymentIntentAction(
  /**
   * Most recent PaymentIntent processed by the reader.
   */
  public val paymentIntent: InlineTerminalReaderReaderb89cPaymentIntentX02f1bde6,
  public val confirmConfig: TerminalReaderReaderResourceConfirmConfig? = null,
) {
  public class Builder {
    private var paymentIntentValue: InlineTerminalReaderReaderb89cPaymentIntentX02f1bde6? = null

    public var paymentIntent: InlineTerminalReaderReaderb89cPaymentIntentX02f1bde6
      get() = requireNotNull(paymentIntentValue) { "paymentIntent is required" }
      set(`value`) {
        paymentIntentValue = value
      }

    public var confirmConfig: TerminalReaderReaderResourceConfirmConfig? = null

    public fun build(): TerminalReaderReaderResourceConfirmPaymentIntentAction {
      check(paymentIntentValue != null) { "paymentIntent is required" }
      return TerminalReaderReaderResourceConfirmPaymentIntentAction(
        paymentIntent = paymentIntent,
        confirmConfig = confirmConfig,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TerminalReaderReaderResourceConfirmPaymentIntentAction = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TerminalReaderReaderResourceConfirmPaymentIntentAction> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TerminalReaderReaderResourceConfirmPaymentIntentAction {
      val jsonDecoder = decoder.requireJsonDecoder("TerminalReaderReaderResourceConfirmPaymentIntentAction")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TerminalReaderReaderResourceConfirmPaymentIntentAction must be a JSON object")
      val paymentIntent = json.decodeRequired<InlineTerminalReaderReaderb89cPaymentIntentX02f1bde6>(rawObject, "payment_intent")
      return TerminalReaderReaderResourceConfirmPaymentIntentAction(
        paymentIntent = paymentIntent,
        confirmConfig = rawObject["confirm_config"]?.let { json.decodeFromJsonElement<TerminalReaderReaderResourceConfirmConfig>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TerminalReaderReaderResourceConfirmPaymentIntentAction) {
      val jsonEncoder = encoder.requireJsonEncoder("TerminalReaderReaderResourceConfirmPaymentIntentAction")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("payment_intent", json.encodeToJsonElement(value.paymentIntent))
        value.confirmConfig?.let { put("confirm_config", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun terminalReaderReaderResourceConfirmPaymentIntentAction(block: TerminalReaderReaderResourceConfirmPaymentIntentAction.Builder.() -> Unit): TerminalReaderReaderResourceConfirmPaymentIntentAction = TerminalReaderReaderResourceConfirmPaymentIntentAction.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TerminalReaderReaderResourceConfirmPaymentIntentAction is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
