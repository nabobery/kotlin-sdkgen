package com.nabobery.sdkgen.generated.stripe

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
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/terminal_configuration_configuration_resource_device_type_specific_c
 * onfig
 */
@Serializable(with = TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig.Serializer::class)
public class TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig(
  /**
   * A File ID representing an image to display on the reader
   */
  public val splashscreen: InlineTerminalConfiguratioda89SplashscreenXf7f69cf8? = null,
) {
  public class Builder {
    /**
     * A File ID representing an image to display on the reader
     */
    public var splashscreen: InlineTerminalConfiguratioda89SplashscreenXf7f69cf8? = null

    public fun build(): TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig = TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig(
      splashscreen = splashscreen,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig {
      val jsonDecoder = decoder.requireJsonDecoder("TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig must be a JSON object")
      return TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig(
        splashscreen = rawObject["splashscreen"]?.let { json.decodeFromJsonElement<InlineTerminalConfiguratioda89SplashscreenXf7f69cf8>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.splashscreen?.let { put("splashscreen", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun terminalConfigurationConfigurationResourceDeviceTypeSpecificConfig(block: TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig.Builder.() -> Unit): TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig = TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig.build(block)
