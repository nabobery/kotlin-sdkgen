package com.nabobery.sdkgen.github.generated

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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-runs/post/requestBody/content/application~1json/s
 * chema/oneOf/0.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-runs/post/requestBody/content/application~1json/s
 * chema/oneOf/0
 */
@Serializable(with = InlineReposCheckRunsPostRequestJsonOneOf1Xae5460e0.Serializer::class)
public class InlineReposCheckRunsPostRequestJsonOneOf1Xae5460e0(
  public val status: InlineReposCheckRunsPostRequestJsonOneOf1StatusXf32f00a6,
) {
  public class Builder {
    private var statusValue: InlineReposCheckRunsPostRequestJsonOneOf1StatusXf32f00a6? = null

    public var status: InlineReposCheckRunsPostRequestJsonOneOf1StatusXf32f00a6
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    public fun build(): InlineReposCheckRunsPostRequestJsonOneOf1Xae5460e0 {
      check(statusValue != null) { "status is required" }
      return InlineReposCheckRunsPostRequestJsonOneOf1Xae5460e0(
        status = status,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposCheckRunsPostRequestJsonOneOf1Xae5460e0 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposCheckRunsPostRequestJsonOneOf1Xae5460e0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposCheckRunsPostRequestJsonOneOf1Xae5460e0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposCheckRunsPostRequestJsonOneOf1Xae5460e0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposCheckRunsPostRequestJsonOneOf1Xae5460e0 must be a JSON object")
      val status = json.decodeRequired<InlineReposCheckRunsPostRequestJsonOneOf1StatusXf32f00a6>(rawObject, "status")
      return InlineReposCheckRunsPostRequestJsonOneOf1Xae5460e0(
        status = status,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposCheckRunsPostRequestJsonOneOf1Xae5460e0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposCheckRunsPostRequestJsonOneOf1Xae5460e0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("status", json.encodeToJsonElement(value.status))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposCheckRunsPostRequestJsonOneOf1Xae5460e0(block: InlineReposCheckRunsPostRequestJsonOneOf1Xae5460e0.Builder.() -> Unit): InlineReposCheckRunsPostRequestJsonOneOf1Xae5460e0 = InlineReposCheckRunsPostRequestJsonOneOf1Xae5460e0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposCheckRunsPostRequestJsonOneOf1Xae5460e0 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
