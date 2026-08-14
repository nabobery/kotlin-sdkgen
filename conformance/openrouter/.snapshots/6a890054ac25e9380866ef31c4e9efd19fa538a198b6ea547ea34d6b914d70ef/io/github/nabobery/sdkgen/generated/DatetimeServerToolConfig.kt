package io.github.nabobery.sdkgen.generated

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
 * Configuration for the openrouter:datetime server tool
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/DatetimeServerToolConfig
 */
@Serializable(with = DatetimeServerToolConfig.Serializer::class)
public class DatetimeServerToolConfig(
  /**
   * IANA timezone name (e.g. "America/New_York"). Defaults to UTC.
   */
  public val timezone: String? = null,
) {
  public class Builder {
    /**
     * IANA timezone name (e.g. "America/New_York"). Defaults to UTC.
     */
    public var timezone: String? = null

    public fun build(): DatetimeServerToolConfig = DatetimeServerToolConfig(
      timezone = timezone,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DatetimeServerToolConfig = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<DatetimeServerToolConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DatetimeServerToolConfig {
      val jsonDecoder = decoder.requireJsonDecoder("DatetimeServerToolConfig")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DatetimeServerToolConfig must be a JSON object")
      return DatetimeServerToolConfig(
        timezone = rawObject["timezone"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: DatetimeServerToolConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("DatetimeServerToolConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.timezone?.let { put("timezone", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun datetimeServerToolConfig(block: DatetimeServerToolConfig.Builder.() -> Unit): DatetimeServerToolConfig = DatetimeServerToolConfig.build(block)
