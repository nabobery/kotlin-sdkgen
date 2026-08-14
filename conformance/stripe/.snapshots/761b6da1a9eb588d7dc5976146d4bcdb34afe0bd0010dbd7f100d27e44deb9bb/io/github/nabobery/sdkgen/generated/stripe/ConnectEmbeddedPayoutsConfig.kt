package io.github.nabobery.sdkgen.generated.stripe

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
 * Source: sdkgen://source/openapi.json#/components/schemas/connect_embedded_payouts_config
 */
@Serializable(with = ConnectEmbeddedPayoutsConfig.Serializer::class)
public class ConnectEmbeddedPayoutsConfig(
  /**
   * Whether the embedded component is enabled.
   */
  public val enabled: Boolean,
  public val features: ConnectEmbeddedPayoutsFeatures,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    private var featuresValue: ConnectEmbeddedPayoutsFeatures? = null

    public var features: ConnectEmbeddedPayoutsFeatures
      get() = requireNotNull(featuresValue) { "features is required" }
      set(`value`) {
        featuresValue = value
      }

    public fun build(): ConnectEmbeddedPayoutsConfig {
      check(enabledValue != null) { "enabled is required" }
      check(featuresValue != null) { "features is required" }
      return ConnectEmbeddedPayoutsConfig(
        enabled = enabled,
        features = features,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ConnectEmbeddedPayoutsConfig = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ConnectEmbeddedPayoutsConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ConnectEmbeddedPayoutsConfig {
      val jsonDecoder = decoder.requireJsonDecoder("ConnectEmbeddedPayoutsConfig")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ConnectEmbeddedPayoutsConfig must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      val features = json.decodeRequired<ConnectEmbeddedPayoutsFeatures>(rawObject, "features")
      return ConnectEmbeddedPayoutsConfig(
        enabled = enabled,
        features = features,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ConnectEmbeddedPayoutsConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("ConnectEmbeddedPayoutsConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        put("features", json.encodeToJsonElement(value.features))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun connectEmbeddedPayoutsConfig(block: ConnectEmbeddedPayoutsConfig.Builder.() -> Unit): ConnectEmbeddedPayoutsConfig = ConnectEmbeddedPayoutsConfig.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ConnectEmbeddedPayoutsConfig is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
