package com.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/TextDoneEvent/allOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/TextDoneEvent/allOf/1
 */
@Serializable(with = InlineTextDoneEventAllOf2Xfb1c7928.Serializer::class)
public class InlineTextDoneEventAllOf2Xfb1c7928(
  logprobs: List<StreamLogprob>? = null,
) {
  public val logprobs: List<StreamLogprob>? = logprobs?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var logprobsValue: List<StreamLogprob>? = null

    public var logprobs: List<StreamLogprob>?
      get() = logprobsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        logprobsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineTextDoneEventAllOf2Xfb1c7928 = InlineTextDoneEventAllOf2Xfb1c7928(
      logprobs = logprobs,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineTextDoneEventAllOf2Xfb1c7928 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineTextDoneEventAllOf2Xfb1c7928> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTextDoneEventAllOf2Xfb1c7928 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTextDoneEventAllOf2Xfb1c7928")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineTextDoneEventAllOf2Xfb1c7928 must be a JSON object")
      return InlineTextDoneEventAllOf2Xfb1c7928(
        logprobs = rawObject["logprobs"]?.let { json.decodeFromJsonElement<List<StreamLogprob>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineTextDoneEventAllOf2Xfb1c7928) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineTextDoneEventAllOf2Xfb1c7928")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.logprobs?.let { put("logprobs", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineTextDoneEventAllOf2Xfb1c7928(block: InlineTextDoneEventAllOf2Xfb1c7928.Builder.() -> Unit): InlineTextDoneEventAllOf2Xfb1c7928 = InlineTextDoneEventAllOf2Xfb1c7928.build(block)
