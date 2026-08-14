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
 * Configuration for the openrouter:bash server tool
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BashServerToolConfig
 */
@Serializable(with = BashServerToolConfig.Serializer::class)
public class BashServerToolConfig(
  public val engine: BashServerToolEngine? = null,
  public val environment: BashServerToolEnvironment? = null,
  public val sleepAfterSeconds: Int? = null,
) {
  public class Builder {
    public var engine: BashServerToolEngine? = null

    public var environment: BashServerToolEnvironment? = null

    public var sleepAfterSeconds: Int? = null

    public fun build(): BashServerToolConfig = BashServerToolConfig(
      engine = engine,
      environment = environment,
      sleepAfterSeconds = sleepAfterSeconds,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BashServerToolConfig = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BashServerToolConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BashServerToolConfig {
      val jsonDecoder = decoder.requireJsonDecoder("BashServerToolConfig")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BashServerToolConfig must be a JSON object")
      return BashServerToolConfig(
        engine = rawObject["engine"]?.let { json.decodeFromJsonElement<BashServerToolEngine>(it) },
        environment = rawObject["environment"]?.let { json.decodeFromJsonElement<BashServerToolEnvironment>(it) },
        sleepAfterSeconds = rawObject["sleep_after_seconds"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BashServerToolConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("BashServerToolConfig")
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

public fun bashServerToolConfig(block: BashServerToolConfig.Builder.() -> Unit): BashServerToolConfig = BashServerToolConfig.build(block)
