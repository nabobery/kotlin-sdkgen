package io.github.nabobery.sdkgen.generated

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
 * Configuration for the openrouter:shell server tool
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ShellServerToolConfig
 */
@Serializable(with = ShellServerToolConfig.Serializer::class)
public class ShellServerToolConfig(
  public val engine: ShellServerToolEngine? = null,
  public val environment: ShellServerToolEnvironment? = null,
  public val sleepAfterSeconds: Int? = null,
) {
  public class Builder {
    public var engine: ShellServerToolEngine? = null

    public var environment: ShellServerToolEnvironment? = null

    public var sleepAfterSeconds: Int? = null

    public fun build(): ShellServerToolConfig = ShellServerToolConfig(
      engine = engine,
      environment = environment,
      sleepAfterSeconds = sleepAfterSeconds,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ShellServerToolConfig = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ShellServerToolConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ShellServerToolConfig {
      val jsonDecoder = decoder.requireJsonDecoder("ShellServerToolConfig")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ShellServerToolConfig must be a JSON object")
      return ShellServerToolConfig(
        engine = rawObject["engine"]?.let { json.decodeFromJsonElement<ShellServerToolEngine>(it) },
        environment = rawObject["environment"]?.let { json.decodeFromJsonElement<ShellServerToolEnvironment>(it) },
        sleepAfterSeconds = rawObject["sleep_after_seconds"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ShellServerToolConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("ShellServerToolConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.engine?.let { put("engine", json.encodeToJsonElement(it)) }
        value.environment?.let { put("environment", json.encodeToJsonElement(it)) }
        value.sleepAfterSeconds?.let { put("sleep_after_seconds", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun shellServerToolConfig(block: ShellServerToolConfig.Builder.() -> Unit): ShellServerToolConfig = ShellServerToolConfig.build(block)
