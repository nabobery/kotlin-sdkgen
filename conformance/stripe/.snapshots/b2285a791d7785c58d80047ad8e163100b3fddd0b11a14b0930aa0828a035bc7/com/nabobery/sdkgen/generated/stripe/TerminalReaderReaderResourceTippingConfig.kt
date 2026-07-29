package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
 * Represents a per-transaction tipping configuration
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_tipping_config
 */
@Serializable(with = TerminalReaderReaderResourceTippingConfig.Serializer::class)
public class TerminalReaderReaderResourceTippingConfig(
  /**
   * Amount used to calculate tip suggestions on tipping selection screen for this transaction. Must be a positive
   * integer in the smallest currency unit (e.g., 100 cents to represent $1.00 or 100 to represent ¥100, a zero-decimal
   * currency).
   */
  public val amountEligible: Int? = null,
) {
  public class Builder {
    /**
     * Amount used to calculate tip suggestions on tipping selection screen for this transaction. Must be a positive
     * integer in the smallest currency unit (e.g., 100 cents to represent $1.00 or 100 to represent ¥100, a
     * zero-decimal currency).
     */
    public var amountEligible: Int? = null

    public fun build(): TerminalReaderReaderResourceTippingConfig = TerminalReaderReaderResourceTippingConfig(
      amountEligible = amountEligible,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TerminalReaderReaderResourceTippingConfig = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TerminalReaderReaderResourceTippingConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TerminalReaderReaderResourceTippingConfig {
      val jsonDecoder = decoder.requireJsonDecoder("TerminalReaderReaderResourceTippingConfig")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TerminalReaderReaderResourceTippingConfig must be a JSON object")
      return TerminalReaderReaderResourceTippingConfig(
        amountEligible = rawObject["amount_eligible"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TerminalReaderReaderResourceTippingConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("TerminalReaderReaderResourceTippingConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amountEligible?.let { put("amount_eligible", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun terminalReaderReaderResourceTippingConfig(block: TerminalReaderReaderResourceTippingConfig.Builder.() -> Unit): TerminalReaderReaderResourceTippingConfig = TerminalReaderReaderResourceTippingConfig.build(block)
