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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-suites/post/requestBody/content/application~1json
 * /schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-suites/post/requestBody/content/application~1json
 * /schema
 */
@Serializable(with = InlineReposCheckSuitesPostRequestJsonXa1e94bbb.Serializer::class)
public class InlineReposCheckSuitesPostRequestJsonXa1e94bbb(
  /**
   * The sha of the head commit.
   */
  public val headSha: String,
) {
  public class Builder {
    private var headShaValue: String? = null

    public var headSha: String
      get() = requireNotNull(headShaValue) { "headSha is required" }
      set(`value`) {
        headShaValue = value
      }

    public fun build(): InlineReposCheckSuitesPostRequestJsonXa1e94bbb {
      check(headShaValue != null) { "headSha is required" }
      return InlineReposCheckSuitesPostRequestJsonXa1e94bbb(
        headSha = headSha,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposCheckSuitesPostRequestJsonXa1e94bbb = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposCheckSuitesPostRequestJsonXa1e94bbb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposCheckSuitesPostRequestJsonXa1e94bbb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposCheckSuitesPostRequestJsonXa1e94bbb")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposCheckSuitesPostRequestJsonXa1e94bbb must be a JSON object")
      val headSha = json.decodeRequired<String>(rawObject, "head_sha")
      return InlineReposCheckSuitesPostRequestJsonXa1e94bbb(
        headSha = headSha,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposCheckSuitesPostRequestJsonXa1e94bbb) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposCheckSuitesPostRequestJsonXa1e94bbb")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("head_sha", value.headSha)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposCheckSuitesPostRequestJsonXa1e94bbb(block: InlineReposCheckSuitesPostRequestJsonXa1e94bbb.Builder.() -> Unit): InlineReposCheckSuitesPostRequestJsonXa1e94bbb = InlineReposCheckSuitesPostRequestJsonXa1e94bbb.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposCheckSuitesPostRequestJsonXa1e94bbb is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
