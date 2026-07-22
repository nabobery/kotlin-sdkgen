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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1comments~1{comment_id}~1reactions/post/requestBody/cont
 * ent/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1comments~1{comment_id}~1reactions/post/requestBody/cont
 * ent/application~1json/schema
 */
@Serializable(with = InlineReposCommentsReactionsPostRequestJsonX6ceb60a7.Serializer::class)
public class InlineReposCommentsReactionsPostRequestJsonX6ceb60a7(
  /**
   * The [reaction type](https://docs.github.com/rest/reactions/reactions#about-reactions) to add to the commit comment.
   */
  public val content: InlineReposCommentsReactionsPostRequestJsonContentX21102703,
) {
  public class Builder {
    private var contentValue: InlineReposCommentsReactionsPostRequestJsonContentX21102703? = null

    public var content: InlineReposCommentsReactionsPostRequestJsonContentX21102703
      get() = requireNotNull(contentValue) { "content is required" }
      set(`value`) {
        contentValue = value
      }

    public fun build(): InlineReposCommentsReactionsPostRequestJsonX6ceb60a7 {
      check(contentValue != null) { "content is required" }
      return InlineReposCommentsReactionsPostRequestJsonX6ceb60a7(
        content = content,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposCommentsReactionsPostRequestJsonX6ceb60a7 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposCommentsReactionsPostRequestJsonX6ceb60a7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposCommentsReactionsPostRequestJsonX6ceb60a7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposCommentsReactionsPostRequestJsonX6ceb60a7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposCommentsReactionsPostRequestJsonX6ceb60a7 must be a JSON object")
      val content = json.decodeRequired<InlineReposCommentsReactionsPostRequestJsonContentX21102703>(rawObject, "content")
      return InlineReposCommentsReactionsPostRequestJsonX6ceb60a7(
        content = content,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposCommentsReactionsPostRequestJsonX6ceb60a7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposCommentsReactionsPostRequestJsonX6ceb60a7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content", json.encodeToJsonElement(value.content))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposCommentsReactionsPostRequestJsonX6ceb60a7(block: InlineReposCommentsReactionsPostRequestJsonX6ceb60a7.Builder.() -> Unit): InlineReposCommentsReactionsPostRequestJsonX6ceb60a7 = InlineReposCommentsReactionsPostRequestJsonX6ceb60a7.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposCommentsReactionsPostRequestJsonX6ceb60a7 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
