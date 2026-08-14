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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1releases~1{release_id}~1reactions/post/requestBody/cont
 * ent/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1releases~1{release_id}~1reactions/post/requestBody/cont
 * ent/application~1json/schema
 */
@Serializable(with = InlineReposReleasesReactionsPostRequestJsonX6b169b78.Serializer::class)
public class InlineReposReleasesReactionsPostRequestJsonX6b169b78(
  /**
   * The [reaction type](https://docs.github.com/rest/reactions/reactions#about-reactions) to add to the release.
   */
  public val content: InlineReposReleasesReactionsPostRequestJsonContentXdd4fc9d0,
) {
  public class Builder {
    private var contentValue: InlineReposReleasesReactionsPostRequestJsonContentXdd4fc9d0? = null

    public var content: InlineReposReleasesReactionsPostRequestJsonContentXdd4fc9d0
      get() = requireNotNull(contentValue) { "content is required" }
      set(`value`) {
        contentValue = value
      }

    public fun build(): InlineReposReleasesReactionsPostRequestJsonX6b169b78 {
      check(contentValue != null) { "content is required" }
      return InlineReposReleasesReactionsPostRequestJsonX6b169b78(
        content = content,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposReleasesReactionsPostRequestJsonX6b169b78 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposReleasesReactionsPostRequestJsonX6b169b78> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposReleasesReactionsPostRequestJsonX6b169b78 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposReleasesReactionsPostRequestJsonX6b169b78")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposReleasesReactionsPostRequestJsonX6b169b78 must be a JSON object")
      val content = json.decodeRequired<InlineReposReleasesReactionsPostRequestJsonContentXdd4fc9d0>(rawObject, "content")
      return InlineReposReleasesReactionsPostRequestJsonX6b169b78(
        content = content,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposReleasesReactionsPostRequestJsonX6b169b78) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposReleasesReactionsPostRequestJsonX6b169b78")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content", json.encodeToJsonElement(value.content))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposReleasesReactionsPostRequestJsonX6b169b78(block: InlineReposReleasesReactionsPostRequestJsonX6b169b78.Builder.() -> Unit): InlineReposReleasesReactionsPostRequestJsonX6b169b78 = InlineReposReleasesReactionsPostRequestJsonX6b169b78.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposReleasesReactionsPostRequestJsonX6b169b78 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
