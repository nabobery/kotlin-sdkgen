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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/TextDeltaEvent/allOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/TextDeltaEvent/allOf/1
 */
@Serializable(with = InlineTextDeltaEventAllOf2Xd5f76ec6.Serializer::class)
public class InlineTextDeltaEventAllOf2Xd5f76ec6(
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

    public fun build(): InlineTextDeltaEventAllOf2Xd5f76ec6 = InlineTextDeltaEventAllOf2Xd5f76ec6(
      logprobs = logprobs,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineTextDeltaEventAllOf2Xd5f76ec6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineTextDeltaEventAllOf2Xd5f76ec6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTextDeltaEventAllOf2Xd5f76ec6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTextDeltaEventAllOf2Xd5f76ec6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineTextDeltaEventAllOf2Xd5f76ec6 must be a JSON object")
      return InlineTextDeltaEventAllOf2Xd5f76ec6(
        logprobs = rawObject["logprobs"]?.let { json.decodeFromJsonElement<List<StreamLogprob>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineTextDeltaEventAllOf2Xd5f76ec6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineTextDeltaEventAllOf2Xd5f76ec6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.logprobs?.let { put("logprobs", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineTextDeltaEventAllOf2Xd5f76ec6(block: InlineTextDeltaEventAllOf2Xd5f76ec6.Builder.() -> Unit): InlineTextDeltaEventAllOf2Xd5f76ec6 = InlineTextDeltaEventAllOf2Xd5f76ec6.build(block)
