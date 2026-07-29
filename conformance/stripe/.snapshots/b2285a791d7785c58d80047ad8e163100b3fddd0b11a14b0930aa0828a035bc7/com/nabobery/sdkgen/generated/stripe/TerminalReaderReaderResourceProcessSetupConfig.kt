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
 * Represents a per-setup override of a reader configuration
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_process_setup_config
 */
@Serializable(with = TerminalReaderReaderResourceProcessSetupConfig.Serializer::class)
public class TerminalReaderReaderResourceProcessSetupConfig(
  /**
   * Enable customer-initiated cancellation when processing this SetupIntent.
   */
  public val enableCustomerCancellation: Boolean? = null,
) {
  public class Builder {
    /**
     * Enable customer-initiated cancellation when processing this SetupIntent.
     */
    public var enableCustomerCancellation: Boolean? = null

    public fun build(): TerminalReaderReaderResourceProcessSetupConfig = TerminalReaderReaderResourceProcessSetupConfig(
      enableCustomerCancellation = enableCustomerCancellation,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TerminalReaderReaderResourceProcessSetupConfig = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TerminalReaderReaderResourceProcessSetupConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TerminalReaderReaderResourceProcessSetupConfig {
      val jsonDecoder = decoder.requireJsonDecoder("TerminalReaderReaderResourceProcessSetupConfig")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TerminalReaderReaderResourceProcessSetupConfig must be a JSON object")
      return TerminalReaderReaderResourceProcessSetupConfig(
        enableCustomerCancellation = rawObject["enable_customer_cancellation"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TerminalReaderReaderResourceProcessSetupConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("TerminalReaderReaderResourceProcessSetupConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.enableCustomerCancellation?.let { put("enable_customer_cancellation", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun terminalReaderReaderResourceProcessSetupConfig(block: TerminalReaderReaderResourceProcessSetupConfig.Builder.() -> Unit): TerminalReaderReaderResourceProcessSetupConfig = TerminalReaderReaderResourceProcessSetupConfig.build(block)
