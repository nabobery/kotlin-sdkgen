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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal_configuration_configuration_resource_offline_config
 */
@Serializable(with = TerminalConfigurationConfigurationResourceOfflineConfig.Serializer::class)
public class TerminalConfigurationConfigurationResourceOfflineConfig(
  /**
   * Determines whether to allow transactions to be collected while reader is offline. Defaults to false.
   */
  public val enabled: Boolean? = null,
) {
  public class Builder {
    /**
     * Determines whether to allow transactions to be collected while reader is offline. Defaults to false.
     */
    public var enabled: Boolean? = null

    public fun build(): TerminalConfigurationConfigurationResourceOfflineConfig = TerminalConfigurationConfigurationResourceOfflineConfig(
      enabled = enabled,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TerminalConfigurationConfigurationResourceOfflineConfig = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TerminalConfigurationConfigurationResourceOfflineConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TerminalConfigurationConfigurationResourceOfflineConfig {
      val jsonDecoder = decoder.requireJsonDecoder("TerminalConfigurationConfigurationResourceOfflineConfig")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TerminalConfigurationConfigurationResourceOfflineConfig must be a JSON object")
      return TerminalConfigurationConfigurationResourceOfflineConfig(
        enabled = rawObject["enabled"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TerminalConfigurationConfigurationResourceOfflineConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("TerminalConfigurationConfigurationResourceOfflineConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.enabled?.let { put("enabled", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun terminalConfigurationConfigurationResourceOfflineConfig(block: TerminalConfigurationConfigurationResourceOfflineConfig.Builder.() -> Unit): TerminalConfigurationConfigurationResourceOfflineConfig = TerminalConfigurationConfigurationResourceOfflineConfig.build(block)
