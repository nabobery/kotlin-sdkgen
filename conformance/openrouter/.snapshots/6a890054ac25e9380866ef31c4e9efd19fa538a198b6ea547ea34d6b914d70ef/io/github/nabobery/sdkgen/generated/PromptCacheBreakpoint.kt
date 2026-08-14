package io.github.nabobery.sdkgen.generated

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
 * Marks an explicit prompt-cache boundary on this content block (OpenAI-style). Everything through the block carrying
 * this marker is part of the candidate cached prefix. Supported natively by OpenAI GPT-5.6 and newer; on providers that
 * use Anthropic-style `cache_control`, OpenRouter converts the marker to that format automatically.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/PromptCacheBreakpoint
 */
@Serializable(with = PromptCacheBreakpoint.Serializer::class)
public class PromptCacheBreakpoint(
  public val mode: InlinePromptCacheBreakpointModeX7348b3f4,
) {
  public class Builder {
    private var modeValue: InlinePromptCacheBreakpointModeX7348b3f4? = null

    public var mode: InlinePromptCacheBreakpointModeX7348b3f4
      get() = requireNotNull(modeValue) { "mode is required" }
      set(`value`) {
        modeValue = value
      }

    public fun build(): PromptCacheBreakpoint {
      check(modeValue != null) { "mode is required" }
      return PromptCacheBreakpoint(
        mode = mode,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PromptCacheBreakpoint = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PromptCacheBreakpoint> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PromptCacheBreakpoint {
      val jsonDecoder = decoder.requireJsonDecoder("PromptCacheBreakpoint")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PromptCacheBreakpoint must be a JSON object")
      val mode = json.decodeRequired<InlinePromptCacheBreakpointModeX7348b3f4>(rawObject, "mode")
      return PromptCacheBreakpoint(
        mode = mode,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PromptCacheBreakpoint) {
      val jsonEncoder = encoder.requireJsonEncoder("PromptCacheBreakpoint")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("mode", json.encodeToJsonElement(value.mode))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun promptCacheBreakpoint(block: PromptCacheBreakpoint.Builder.() -> Unit): PromptCacheBreakpoint = PromptCacheBreakpoint.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PromptCacheBreakpoint is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
