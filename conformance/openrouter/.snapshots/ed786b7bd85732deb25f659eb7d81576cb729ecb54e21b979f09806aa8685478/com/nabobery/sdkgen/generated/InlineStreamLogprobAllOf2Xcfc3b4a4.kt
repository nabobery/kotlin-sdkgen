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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/StreamLogprob/allOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/StreamLogprob/allOf/1
 */
@Serializable(with = InlineStreamLogprobAllOf2Xcfc3b4a4.Serializer::class)
public class InlineStreamLogprobAllOf2Xcfc3b4a4(
  topLogprobs: List<StreamLogprobTopLogprob>? = null,
) {
  public val topLogprobs: List<StreamLogprobTopLogprob>? =
      topLogprobs?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var topLogprobsValue: List<StreamLogprobTopLogprob>? = null

    public var topLogprobs: List<StreamLogprobTopLogprob>?
      get() = topLogprobsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        topLogprobsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineStreamLogprobAllOf2Xcfc3b4a4 = InlineStreamLogprobAllOf2Xcfc3b4a4(
      topLogprobs = topLogprobs,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineStreamLogprobAllOf2Xcfc3b4a4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineStreamLogprobAllOf2Xcfc3b4a4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineStreamLogprobAllOf2Xcfc3b4a4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineStreamLogprobAllOf2Xcfc3b4a4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineStreamLogprobAllOf2Xcfc3b4a4 must be a JSON object")
      return InlineStreamLogprobAllOf2Xcfc3b4a4(
        topLogprobs = rawObject["top_logprobs"]?.let { json.decodeFromJsonElement<List<StreamLogprobTopLogprob>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineStreamLogprobAllOf2Xcfc3b4a4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineStreamLogprobAllOf2Xcfc3b4a4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.topLogprobs?.let { put("top_logprobs", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineStreamLogprobAllOf2Xcfc3b4a4(block: InlineStreamLogprobAllOf2Xcfc3b4a4.Builder.() -> Unit): InlineStreamLogprobAllOf2Xcfc3b4a4 = InlineStreamLogprobAllOf2Xcfc3b4a4.build(block)
