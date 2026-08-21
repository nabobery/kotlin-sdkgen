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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1comments~1{comment_id}~1reactions/post/requestB
 * ody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1comments~1{comment_id}~1reactions/post/requestB
 * ody/content/application~1json/schema
 */
@Serializable(with = InlineReposIssuesCommentsReactionsPostRequestJsonX147276e2.Serializer::class)
public class InlineReposIssuesCommentsReactionsPostRequestJsonX147276e2(
  /**
   * The [reaction type](https://docs.github.com/rest/reactions/reactions#about-reactions) to add to the issue comment.
   */
  public val content: InlineReposIssuesCommentsReactionsPostRequestJsonContentX0653f44a,
) {
  public class Builder {
    private var contentValue: InlineReposIssuesCommentsReactionsPostRequestJsonContentX0653f44a? =
        null

    public var content: InlineReposIssuesCommentsReactionsPostRequestJsonContentX0653f44a
      get() = requireNotNull(contentValue) { "content is required" }
      set(`value`) {
        contentValue = value
      }

    public fun build(): InlineReposIssuesCommentsReactionsPostRequestJsonX147276e2 {
      check(contentValue != null) { "content is required" }
      return InlineReposIssuesCommentsReactionsPostRequestJsonX147276e2(
        content = content,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposIssuesCommentsReactionsPostRequestJsonX147276e2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposIssuesCommentsReactionsPostRequestJsonX147276e2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposIssuesCommentsReactionsPostRequestJsonX147276e2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposIssuesCommentsReactionsPostRequestJsonX147276e2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposIssuesCommentsReactionsPostRequestJsonX147276e2 must be a JSON object")
      val content = json.decodeRequired<InlineReposIssuesCommentsReactionsPostRequestJsonContentX0653f44a>(rawObject, "content")
      return InlineReposIssuesCommentsReactionsPostRequestJsonX147276e2(
        content = content,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposIssuesCommentsReactionsPostRequestJsonX147276e2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposIssuesCommentsReactionsPostRequestJsonX147276e2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content", json.encodeToJsonElement(value.content))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposIssuesCommentsReactionsPostRequestJsonX147276e2(block: InlineReposIssuesCommentsReactionsPostRequestJsonX147276e2.Builder.() -> Unit): InlineReposIssuesCommentsReactionsPostRequestJsonX147276e2 = InlineReposIssuesCommentsReactionsPostRequestJsonX147276e2.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposIssuesCommentsReactionsPostRequestJsonX147276e2 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
