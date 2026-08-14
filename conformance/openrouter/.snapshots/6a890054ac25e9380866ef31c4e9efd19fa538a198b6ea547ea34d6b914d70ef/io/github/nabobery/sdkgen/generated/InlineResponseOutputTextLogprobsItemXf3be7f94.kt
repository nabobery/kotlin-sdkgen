package io.github.nabobery.sdkgen.generated

import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ResponseOutputText/properties/logprobs/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ResponseOutputText/properties/logprobs/items
 */
@Serializable(with = InlineResponseOutputTextLogprobsItemXf3be7f94.Serializer::class)
public class InlineResponseOutputTextLogprobsItemXf3be7f94(
  bytes: List<Int>,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val logprob: Double,
  public val token: String,
  topLogprobs: List<InlineResponseOutputTextLogprobsItemTopLogprobsItemX0da0b6f3>,
) {
  public val bytes: List<Int> = bytes.toList()

  public val topLogprobs: List<InlineResponseOutputTextLogprobsItemTopLogprobsItemX0da0b6f3> =
      topLogprobs.toList()

  public class Builder {
    private var bytesValue: List<Int>? = null

    public var bytes: List<Int>
      get() = requireNotNull(bytesValue) { "bytes is required" }.toList()
      set(`value`) {
        bytesValue = value.toList()
      }

    private var logprobValue: Double? = null

    public var logprob: Double
      get() = requireNotNull(logprobValue) { "logprob is required" }
      set(`value`) {
        logprobValue = value
      }

    private var tokenValue: String? = null

    public var token: String
      get() = requireNotNull(tokenValue) { "token is required" }
      set(`value`) {
        tokenValue = value
      }

    private var topLogprobsValue:
        List<InlineResponseOutputTextLogprobsItemTopLogprobsItemX0da0b6f3>? = null

    public var topLogprobs: List<InlineResponseOutputTextLogprobsItemTopLogprobsItemX0da0b6f3>
      get() = requireNotNull(topLogprobsValue) { "topLogprobs is required" }.toList()
      set(`value`) {
        topLogprobsValue = value.toList()
      }

    public fun build(): InlineResponseOutputTextLogprobsItemXf3be7f94 {
      check(bytesValue != null) { "bytes is required" }
      check(logprobValue != null) { "logprob is required" }
      check(tokenValue != null) { "token is required" }
      check(topLogprobsValue != null) { "topLogprobs is required" }
      return InlineResponseOutputTextLogprobsItemXf3be7f94(
        bytes = bytes,
        logprob = logprob,
        token = token,
        topLogprobs = topLogprobs,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineResponseOutputTextLogprobsItemXf3be7f94 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineResponseOutputTextLogprobsItemXf3be7f94> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineResponseOutputTextLogprobsItemXf3be7f94 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineResponseOutputTextLogprobsItemXf3be7f94")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineResponseOutputTextLogprobsItemXf3be7f94 must be a JSON object")
      val bytes = json.decodeRequired<List<Int>>(rawObject, "bytes")
      val logprob = json.decodeRequired<Double>(rawObject, "logprob")
      val token = json.decodeRequired<String>(rawObject, "token")
      val topLogprobs = json.decodeRequired<List<InlineResponseOutputTextLogprobsItemTopLogprobsItemX0da0b6f3>>(rawObject, "top_logprobs")
      return InlineResponseOutputTextLogprobsItemXf3be7f94(
        bytes = bytes,
        logprob = logprob,
        token = token,
        topLogprobs = topLogprobs,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineResponseOutputTextLogprobsItemXf3be7f94) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineResponseOutputTextLogprobsItemXf3be7f94")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("bytes", json.encodeToJsonElement(value.bytes))
        put("logprob", json.encodeToJsonElement(value.logprob))
        put("token", value.token)
        put("top_logprobs", json.encodeToJsonElement(value.topLogprobs))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineResponseOutputTextLogprobsItemXf3be7f94(block: InlineResponseOutputTextLogprobsItemXf3be7f94.Builder.() -> Unit): InlineResponseOutputTextLogprobsItemXf3be7f94 = InlineResponseOutputTextLogprobsItemXf3be7f94.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineResponseOutputTextLogprobsItemXf3be7f94 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
