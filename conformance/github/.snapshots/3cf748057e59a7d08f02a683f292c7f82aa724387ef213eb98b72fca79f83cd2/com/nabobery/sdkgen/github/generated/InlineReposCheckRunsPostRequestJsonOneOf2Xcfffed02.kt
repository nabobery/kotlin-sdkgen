package com.nabobery.sdkgen.github.generated

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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-runs/post/requestBody/content/application~1json/s
 * chema/oneOf/1.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-runs/post/requestBody/content/application~1json/s
 * chema/oneOf/1
 */
@Serializable(with = InlineReposCheckRunsPostRequestJsonOneOf2Xcfffed02.Serializer::class)
public class InlineReposCheckRunsPostRequestJsonOneOf2Xcfffed02(
  public val status: InlineReposCheckRunsPostRequestJsonOneOf2StatusX79a22967? = null,
) {
  public class Builder {
    public var status: InlineReposCheckRunsPostRequestJsonOneOf2StatusX79a22967? = null

    public fun build(): InlineReposCheckRunsPostRequestJsonOneOf2Xcfffed02 = InlineReposCheckRunsPostRequestJsonOneOf2Xcfffed02(
      status = status,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposCheckRunsPostRequestJsonOneOf2Xcfffed02 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposCheckRunsPostRequestJsonOneOf2Xcfffed02> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposCheckRunsPostRequestJsonOneOf2Xcfffed02 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposCheckRunsPostRequestJsonOneOf2Xcfffed02")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposCheckRunsPostRequestJsonOneOf2Xcfffed02 must be a JSON object")
      return InlineReposCheckRunsPostRequestJsonOneOf2Xcfffed02(
        status = rawObject["status"]?.let { json.decodeFromJsonElement<InlineReposCheckRunsPostRequestJsonOneOf2StatusX79a22967>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposCheckRunsPostRequestJsonOneOf2Xcfffed02) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposCheckRunsPostRequestJsonOneOf2Xcfffed02")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.status?.let { put("status", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposCheckRunsPostRequestJsonOneOf2Xcfffed02(block: InlineReposCheckRunsPostRequestJsonOneOf2Xcfffed02.Builder.() -> Unit): InlineReposCheckRunsPostRequestJsonOneOf2Xcfffed02 = InlineReposCheckRunsPostRequestJsonOneOf2Xcfffed02.build(block)
