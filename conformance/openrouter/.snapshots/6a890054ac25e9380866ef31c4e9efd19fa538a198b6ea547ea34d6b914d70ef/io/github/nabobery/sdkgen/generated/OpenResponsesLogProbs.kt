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
 * Log probability information for a token
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenResponsesLogProbs
 */
@Serializable(with = OpenResponsesLogProbs.Serializer::class)
public class OpenResponsesLogProbs(
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val logprob: Double,
  public val token: String,
  bytes: List<Int>? = null,
  topLogprobs: List<OpenResponsesTopLogprobs>? = null,
) {
  public val bytes: List<Int>? = bytes?.let { collection0 -> collection0.toList() }

  public val topLogprobs: List<OpenResponsesTopLogprobs>? =
      topLogprobs?.let { collection0 -> collection0.toList() }

  public class Builder {
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

    private var bytesValue: List<Int>? = null

    public var bytes: List<Int>?
      get() = bytesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        bytesValue = value?.let { collection0 -> collection0.toList() }
      }

    private var topLogprobsValue: List<OpenResponsesTopLogprobs>? = null

    public var topLogprobs: List<OpenResponsesTopLogprobs>?
      get() = topLogprobsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        topLogprobsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): OpenResponsesLogProbs {
      check(logprobValue != null) { "logprob is required" }
      check(tokenValue != null) { "token is required" }
      return OpenResponsesLogProbs(
        logprob = logprob,
        token = token,
        bytes = bytes,
        topLogprobs = topLogprobs,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OpenResponsesLogProbs = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OpenResponsesLogProbs> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OpenResponsesLogProbs {
      val jsonDecoder = decoder.requireJsonDecoder("OpenResponsesLogProbs")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OpenResponsesLogProbs must be a JSON object")
      val logprob = json.decodeRequired<Double>(rawObject, "logprob")
      val token = json.decodeRequired<String>(rawObject, "token")
      return OpenResponsesLogProbs(
        logprob = logprob,
        token = token,
        bytes = rawObject["bytes"]?.let { json.decodeFromJsonElement<List<Int>>(it) },
        topLogprobs = rawObject["top_logprobs"]?.let { json.decodeFromJsonElement<List<OpenResponsesTopLogprobs>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OpenResponsesLogProbs) {
      val jsonEncoder = encoder.requireJsonEncoder("OpenResponsesLogProbs")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("logprob", json.encodeToJsonElement(value.logprob))
        put("token", value.token)
        value.bytes?.let { put("bytes", json.encodeToJsonElement(it)) }
        value.topLogprobs?.let { put("top_logprobs", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun openResponsesLogProbs(block: OpenResponsesLogProbs.Builder.() -> Unit): OpenResponsesLogProbs = OpenResponsesLogProbs.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OpenResponsesLogProbs is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
