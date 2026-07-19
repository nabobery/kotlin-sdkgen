package com.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Request-level prompt-cache controls. `mode: "explicit"` disables OpenAI-managed breakpoints so only blocks marked
 * with `prompt_cache_breakpoint` are cached. Only supported by OpenAI GPT-5.6 and newer.
 */
@Serializable(with = PromptCacheOptions.Serializer::class)
public class PromptCacheOptions(
  public val mode: InlineComponentsSchemasPromptCacheOptionsPropertiesMode,
  public val ttl: String? = null,
) {
  public class Builder {
    private var modeValue: InlineComponentsSchemasPromptCacheOptionsPropertiesMode? = null

    public var mode: InlineComponentsSchemasPromptCacheOptionsPropertiesMode
      get() = requireNotNull(modeValue) { "mode is required" }
      set(`value`) {
        modeValue = value
      }

    public var ttl: String? = null

    public fun build(): PromptCacheOptions {
      check(modeValue != null) { "mode is required" }
      return PromptCacheOptions(
        mode = mode,
        ttl = ttl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PromptCacheOptions = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PromptCacheOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PromptCacheOptions {
      val jsonDecoder = decoder.requireJsonDecoder("PromptCacheOptions")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("PromptCacheOptions must be a JSON object")
      val mode = json.decodeRequired<InlineComponentsSchemasPromptCacheOptionsPropertiesMode>(raw, "mode")
      return PromptCacheOptions(
        mode = mode,
        ttl = raw["ttl"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PromptCacheOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("PromptCacheOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("mode", json.encodeToJsonElement(value.mode))
        value.ttl?.let { put("ttl", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun promptCacheOptions(block: PromptCacheOptions.Builder.() -> Unit): PromptCacheOptions = PromptCacheOptions
  .build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PromptCacheOptions is missing required property '" + name +
    "'")
  return decodeFromJsonElement(element)
}
