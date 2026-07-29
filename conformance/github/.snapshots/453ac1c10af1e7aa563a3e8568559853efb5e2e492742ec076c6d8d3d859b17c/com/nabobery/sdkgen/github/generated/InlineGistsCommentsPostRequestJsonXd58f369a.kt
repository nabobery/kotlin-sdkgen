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
 * sdkgen://source/openapi.yaml#/paths/~1gists~1{gist_id}~1comments/post/requestBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1gists~1{gist_id}~1comments/post/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineGistsCommentsPostRequestJsonXd58f369a.Serializer::class)
public class InlineGistsCommentsPostRequestJsonXd58f369a(
  /**
   * The comment text.
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

    public fun build(): InlineGistsCommentsPostRequestJsonXd58f369a {
      check(bodyValue != null) { "body is required" }
      return InlineGistsCommentsPostRequestJsonXd58f369a(
        body = body,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineGistsCommentsPostRequestJsonXd58f369a = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineGistsCommentsPostRequestJsonXd58f369a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGistsCommentsPostRequestJsonXd58f369a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGistsCommentsPostRequestJsonXd58f369a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineGistsCommentsPostRequestJsonXd58f369a must be a JSON object")
      val body = json.decodeRequired<String>(rawObject, "body")
      return InlineGistsCommentsPostRequestJsonXd58f369a(
        body = body,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineGistsCommentsPostRequestJsonXd58f369a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineGistsCommentsPostRequestJsonXd58f369a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("body", value.body)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineGistsCommentsPostRequestJsonXd58f369a(block: InlineGistsCommentsPostRequestJsonXd58f369a.Builder.() -> Unit): InlineGistsCommentsPostRequestJsonXd58f369a = InlineGistsCommentsPostRequestJsonXd58f369a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineGistsCommentsPostRequestJsonXd58f369a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
