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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1projectsV2~1{project_number}~1drafts/post/requestBody/content/appl
 * ication~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1projectsV2~1{project_number}~1drafts/post/requestBody/content/appl
 * ication~1json/schema
 */
@Serializable(with = InlineOrgsProjectsV2DraftsPostRequestJsonXd63e55b0.Serializer::class)
public class InlineOrgsProjectsV2DraftsPostRequestJsonXd63e55b0(
  /**
   * The title of the draft issue item to create in the project.
   */
  public val title: String,
  /**
   * The body content of the draft issue item to create in the project.
   */
  public val body: String? = null,
) {
  public class Builder {
    private var titleValue: String? = null

    public var title: String
      get() = requireNotNull(titleValue) { "title is required" }
      set(`value`) {
        titleValue = value
      }

    /**
     * The body content of the draft issue item to create in the project.
     */
    public var body: String? = null

    public fun build(): InlineOrgsProjectsV2DraftsPostRequestJsonXd63e55b0 {
      check(titleValue != null) { "title is required" }
      return InlineOrgsProjectsV2DraftsPostRequestJsonXd63e55b0(
        title = title,
        body = body,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsProjectsV2DraftsPostRequestJsonXd63e55b0 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsProjectsV2DraftsPostRequestJsonXd63e55b0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsProjectsV2DraftsPostRequestJsonXd63e55b0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsProjectsV2DraftsPostRequestJsonXd63e55b0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsProjectsV2DraftsPostRequestJsonXd63e55b0 must be a JSON object")
      val title = json.decodeRequired<String>(rawObject, "title")
      return InlineOrgsProjectsV2DraftsPostRequestJsonXd63e55b0(
        title = title,
        body = rawObject["body"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsProjectsV2DraftsPostRequestJsonXd63e55b0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsProjectsV2DraftsPostRequestJsonXd63e55b0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("title", value.title)
        value.body?.let { put("body", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsProjectsV2DraftsPostRequestJsonXd63e55b0(block: InlineOrgsProjectsV2DraftsPostRequestJsonXd63e55b0.Builder.() -> Unit): InlineOrgsProjectsV2DraftsPostRequestJsonXd63e55b0 = InlineOrgsProjectsV2DraftsPostRequestJsonXd63e55b0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsProjectsV2DraftsPostRequestJsonXd63e55b0 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
