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
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/thread/properties/subject.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/thread/properties/subject
 */
@Serializable(with = InlineThreadSubjectX3ce14fbf.Serializer::class)
public class InlineThreadSubjectX3ce14fbf(
  public val latestCommentUrl: String,
  public val title: String,
  public val type: String,
  public val url: String,
) {
  public class Builder {
    private var latestCommentUrlValue: String? = null

    public var latestCommentUrl: String
      get() = requireNotNull(latestCommentUrlValue) { "latestCommentUrl is required" }
      set(`value`) {
        latestCommentUrlValue = value
      }

    private var titleValue: String? = null

    public var title: String
      get() = requireNotNull(titleValue) { "title is required" }
      set(`value`) {
        titleValue = value
      }

    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): InlineThreadSubjectX3ce14fbf {
      check(latestCommentUrlValue != null) { "latestCommentUrl is required" }
      check(titleValue != null) { "title is required" }
      check(typeValue != null) { "type is required" }
      check(urlValue != null) { "url is required" }
      return InlineThreadSubjectX3ce14fbf(
        latestCommentUrl = latestCommentUrl,
        title = title,
        type = type,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineThreadSubjectX3ce14fbf = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineThreadSubjectX3ce14fbf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineThreadSubjectX3ce14fbf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineThreadSubjectX3ce14fbf")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineThreadSubjectX3ce14fbf must be a JSON object")
      val latestCommentUrl = json.decodeRequired<String>(rawObject, "latest_comment_url")
      val title = json.decodeRequired<String>(rawObject, "title")
      val type = json.decodeRequired<String>(rawObject, "type")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineThreadSubjectX3ce14fbf(
        latestCommentUrl = latestCommentUrl,
        title = title,
        type = type,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineThreadSubjectX3ce14fbf) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineThreadSubjectX3ce14fbf")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("latest_comment_url", value.latestCommentUrl)
        put("title", value.title)
        put("type", value.type)
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineThreadSubjectX3ce14fbf(block: InlineThreadSubjectX3ce14fbf.Builder.() -> Unit): InlineThreadSubjectX3ce14fbf = InlineThreadSubjectX3ce14fbf.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineThreadSubjectX3ce14fbf is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
