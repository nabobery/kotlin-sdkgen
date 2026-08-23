package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/terminal_configuration_configuration_resource_cellular_config
 */
@Serializable(with = TerminalConfigurationConfigurationResourceCellularConfig.Serializer::class)
public class TerminalConfigurationConfigurationResourceCellularConfig(
  /**
   * Whether a cellular-capable reader can connect to the internet over cellular.
   */
  public val enabled: Boolean,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public fun build(): TerminalConfigurationConfigurationResourceCellularConfig {
      check(enabledValue != null) { "enabled is required" }
      return TerminalConfigurationConfigurationResourceCellularConfig(
        enabled = enabled,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TerminalConfigurationConfigurationResourceCellularConfig = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TerminalConfigurationConfigurationResourceCellularConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TerminalConfigurationConfigurationResourceCellularConfig {
      val jsonDecoder = decoder.requireJsonDecoder("TerminalConfigurationConfigurationResourceCellularConfig")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TerminalConfigurationConfigurationResourceCellularConfig must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return TerminalConfigurationConfigurationResourceCellularConfig(
        enabled = enabled,
      )
    }

    override fun serialize(encoder: Encoder, `value`: TerminalConfigurationConfigurationResourceCellularConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("TerminalConfigurationConfigurationResourceCellularConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun terminalConfigurationConfigurationResourceCellularConfig(block: TerminalConfigurationConfigurationResourceCellularConfig.Builder.() -> Unit): TerminalConfigurationConfigurationResourceCellularConfig = TerminalConfigurationConfigurationResourceCellularConfig.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TerminalConfigurationConfigurationResourceCellularConfig is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
