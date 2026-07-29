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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}~1comments/post/requestBody/conte
 * nt/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}~1comments/post/requestBody/conte
 * nt/application~1json/schema
 */
@Serializable(with = InlineReposIssuesCommentsPostRequestJsonX796b40f6.Serializer::class)
public class InlineReposIssuesCommentsPostRequestJsonX796b40f6(
  /**
   * The contents of the comment.
   */
  public val body: String,
) {
  public class Builder {
    private var bodyValue: String? = null

    public var body: String
      get() = requireNotNull(bodyValue) { "body is required" }
      set(`value`) {
        bodyValue = value
      }

    public fun build(): InlineReposIssuesCommentsPostRequestJsonX796b40f6 {
      check(bodyValue != null) { "body is required" }
      return InlineReposIssuesCommentsPostRequestJsonX796b40f6(
        body = body,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposIssuesCommentsPostRequestJsonX796b40f6 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposIssuesCommentsPostRequestJsonX796b40f6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposIssuesCommentsPostRequestJsonX796b40f6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposIssuesCommentsPostRequestJsonX796b40f6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposIssuesCommentsPostRequestJsonX796b40f6 must be a JSON object")
      val body = json.decodeRequired<String>(rawObject, "body")
      return InlineReposIssuesCommentsPostRequestJsonX796b40f6(
        body = body,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposIssuesCommentsPostRequestJsonX796b40f6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposIssuesCommentsPostRequestJsonX796b40f6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("body", value.body)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposIssuesCommentsPostRequestJsonX796b40f6(block: InlineReposIssuesCommentsPostRequestJsonX796b40f6.Builder.() -> Unit): InlineReposIssuesCommentsPostRequestJsonX796b40f6 = InlineReposIssuesCommentsPostRequestJsonX796b40f6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposIssuesCommentsPostRequestJsonX796b40f6 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
