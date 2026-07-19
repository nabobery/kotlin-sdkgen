package com.nabobery.sdkgen.generated

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
 * Configuration for the openrouter:apply_patch server tool
 */
@Serializable(with = ApplyPatchServerToolConfig.Serializer::class)
public class ApplyPatchServerToolConfig(
  public val engine: ApplyPatchEngineEnum? = null,
) {
  public class Builder {
    public var engine: ApplyPatchEngineEnum? = null

    public fun build(): ApplyPatchServerToolConfig = ApplyPatchServerToolConfig(
      engine = engine,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ApplyPatchServerToolConfig = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ApplyPatchServerToolConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ApplyPatchServerToolConfig {
      val jsonDecoder = decoder.requireJsonDecoder("ApplyPatchServerToolConfig")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ApplyPatchServerToolConfig must be a JSON object")
      return ApplyPatchServerToolConfig(
        engine = raw["engine"]?.let { json.decodeFromJsonElement<ApplyPatchEngineEnum>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ApplyPatchServerToolConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("ApplyPatchServerToolConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.engine?.let { put("engine", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun applyPatchServerToolConfig(block: ApplyPatchServerToolConfig.Builder.() ->
  Unit): ApplyPatchServerToolConfig = ApplyPatchServerToolConfig.build(block)
