package com.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Alternative token with its log probability
 */
@Serializable(with = OpenResponsesTopLogprobs.Serializer::class)
public class OpenResponsesTopLogprobs(
  public val bytes: List<Int>? = null,
  public val logprob: Double? = null,
  public val token: String? = null,
) {
  public class Builder {
    public var bytes: List<Int>? = null

    public var logprob: Double? = null

    public var token: String? = null

    public fun build(): OpenResponsesTopLogprobs = OpenResponsesTopLogprobs(
      bytes = bytes,
      logprob = logprob,
      token = token,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OpenResponsesTopLogprobs = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<OpenResponsesTopLogprobs> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OpenResponsesTopLogprobs {
      val jsonDecoder = decoder.requireJsonDecoder("OpenResponsesTopLogprobs")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("OpenResponsesTopLogprobs must be a JSON object")
      return OpenResponsesTopLogprobs(
        bytes = raw["bytes"]?.let { json.decodeFromJsonElement<List<Int>>(it) },
        logprob = raw["logprob"]?.let { json.decodeFromJsonElement<Double>(it) },
        token = raw["token"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OpenResponsesTopLogprobs) {
      val jsonEncoder = encoder.requireJsonEncoder("OpenResponsesTopLogprobs")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bytes?.let { put("bytes", json.encodeToJsonElement(it)) }
        value.logprob?.let { put("logprob", json.encodeToJsonElement(it)) }
        value.token?.let { put("token", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun openResponsesTopLogprobs(block: OpenResponsesTopLogprobs.Builder.() -> Unit): OpenResponsesTopLogprobs =
  OpenResponsesTopLogprobs.build(block)
