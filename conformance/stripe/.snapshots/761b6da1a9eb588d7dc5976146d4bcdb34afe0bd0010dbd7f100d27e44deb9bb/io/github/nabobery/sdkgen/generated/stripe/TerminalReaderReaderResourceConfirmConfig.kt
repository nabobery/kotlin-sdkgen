package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
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
import kotlinx.serialization.json.put

/**
 * Represents a per-transaction override of a reader configuration
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_confirm_config
 */
@Serializable(with = TerminalReaderReaderResourceConfirmConfig.Serializer::class)
public class TerminalReaderReaderResourceConfirmConfig(
  /**
   * If the customer doesn't abandon authenticating the payment, they're redirected to this URL after completion.
   */
  public val returnUrl: String? = null,
) {
  public class Builder {
    /**
     * If the customer doesn't abandon authenticating the payment, they're redirected to this URL after completion.
     */
    public var returnUrl: String? = null

    public fun build(): TerminalReaderReaderResourceConfirmConfig = TerminalReaderReaderResourceConfirmConfig(
      returnUrl = returnUrl,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TerminalReaderReaderResourceConfirmConfig = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TerminalReaderReaderResourceConfirmConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TerminalReaderReaderResourceConfirmConfig {
      val jsonDecoder = decoder.requireJsonDecoder("TerminalReaderReaderResourceConfirmConfig")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TerminalReaderReaderResourceConfirmConfig must be a JSON object")
      return TerminalReaderReaderResourceConfirmConfig(
        returnUrl = rawObject["return_url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TerminalReaderReaderResourceConfirmConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("TerminalReaderReaderResourceConfirmConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.returnUrl?.let { put("return_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun terminalReaderReaderResourceConfirmConfig(block: TerminalReaderReaderResourceConfirmConfig.Builder.() -> Unit): TerminalReaderReaderResourceConfirmConfig = TerminalReaderReaderResourceConfirmConfig.build(block)
