package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}~1reactions/post/requestBody/cont
 * ent/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}~1reactions/post/requestBody/cont
 * ent/application~1json/schema
 */
@Serializable(with = InlineReposIssuesReactionsPostRequestJsonXf44d88e2.Serializer::class)
public class InlineReposIssuesReactionsPostRequestJsonXf44d88e2(
  /**
   * The [reaction type](https://docs.github.com/rest/reactions/reactions#about-reactions) to add to the issue.
   */
  public val content: InlineReposIssuesReactionsPostRequestJsonContentXf9df98c8,
) {
  public class Builder {
    private var contentValue: InlineReposIssuesReactionsPostRequestJsonContentXf9df98c8? = null

    public var content: InlineReposIssuesReactionsPostRequestJsonContentXf9df98c8
      get() = requireNotNull(contentValue) { "content is required" }
      set(`value`) {
        contentValue = value
      }

    public fun build(): InlineReposIssuesReactionsPostRequestJsonXf44d88e2 {
      check(contentValue != null) { "content is required" }
      return InlineReposIssuesReactionsPostRequestJsonXf44d88e2(
        content = content,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposIssuesReactionsPostRequestJsonXf44d88e2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposIssuesReactionsPostRequestJsonXf44d88e2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposIssuesReactionsPostRequestJsonXf44d88e2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposIssuesReactionsPostRequestJsonXf44d88e2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposIssuesReactionsPostRequestJsonXf44d88e2 must be a JSON object")
      val content = json.decodeRequired<InlineReposIssuesReactionsPostRequestJsonContentXf9df98c8>(rawObject, "content")
      return InlineReposIssuesReactionsPostRequestJsonXf44d88e2(
        content = content,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposIssuesReactionsPostRequestJsonXf44d88e2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposIssuesReactionsPostRequestJsonXf44d88e2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content", json.encodeToJsonElement(value.content))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposIssuesReactionsPostRequestJsonXf44d88e2(block: InlineReposIssuesReactionsPostRequestJsonXf44d88e2.Builder.() -> Unit): InlineReposIssuesReactionsPostRequestJsonXf44d88e2 = InlineReposIssuesReactionsPostRequestJsonXf44d88e2.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposIssuesReactionsPostRequestJsonXf44d88e2 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
