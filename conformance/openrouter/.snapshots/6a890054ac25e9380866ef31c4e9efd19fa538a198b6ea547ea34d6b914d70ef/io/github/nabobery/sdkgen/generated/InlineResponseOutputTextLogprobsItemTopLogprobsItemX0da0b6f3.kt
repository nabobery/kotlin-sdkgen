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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/ResponseOutputText/properties/logprobs/items/properties/top_logprobs
 * /items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/ResponseOutputText/properties/logprobs/items/properties/top_logprobs
 * /items
 */
@Serializable(with = InlineResponseOutputTextLogprobsItemTopLogprobsItemX0da0b6f3.Serializer::class)
public class InlineResponseOutputTextLogprobsItemTopLogprobsItemX0da0b6f3(
  bytes: List<Int>,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val logprob: Double,
  public val token: String,
) {
  public val bytes: List<Int> = bytes.toList()

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

    public fun build(): InlineResponseOutputTextLogprobsItemTopLogprobsItemX0da0b6f3 {
      check(bytesValue != null) { "bytes is required" }
      check(logprobValue != null) { "logprob is required" }
      check(tokenValue != null) { "token is required" }
      return InlineResponseOutputTextLogprobsItemTopLogprobsItemX0da0b6f3(
        bytes = bytes,
        logprob = logprob,
        token = token,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineResponseOutputTextLogprobsItemTopLogprobsItemX0da0b6f3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineResponseOutputTextLogprobsItemTopLogprobsItemX0da0b6f3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineResponseOutputTextLogprobsItemTopLogprobsItemX0da0b6f3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineResponseOutputTextLogprobsItemTopLogprobsItemX0da0b6f3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineResponseOutputTextLogprobsItemTopLogprobsItemX0da0b6f3 must be a JSON object")
      val bytes = json.decodeRequired<List<Int>>(rawObject, "bytes")
      val logprob = json.decodeRequired<Double>(rawObject, "logprob")
      val token = json.decodeRequired<String>(rawObject, "token")
      return InlineResponseOutputTextLogprobsItemTopLogprobsItemX0da0b6f3(
        bytes = bytes,
        logprob = logprob,
        token = token,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineResponseOutputTextLogprobsItemTopLogprobsItemX0da0b6f3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineResponseOutputTextLogprobsItemTopLogprobsItemX0da0b6f3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("bytes", json.encodeToJsonElement(value.bytes))
        put("logprob", json.encodeToJsonElement(value.logprob))
        put("token", value.token)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineResponseOutputTextLogprobsItemTopLogprobsItemX0da0b6f3(block: InlineResponseOutputTextLogprobsItemTopLogprobsItemX0da0b6f3.Builder.() -> Unit): InlineResponseOutputTextLogprobsItemTopLogprobsItemX0da0b6f3 = InlineResponseOutputTextLogprobsItemTopLogprobsItemX0da0b6f3.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineResponseOutputTextLogprobsItemTopLogprobsItemX0da0b6f3 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
