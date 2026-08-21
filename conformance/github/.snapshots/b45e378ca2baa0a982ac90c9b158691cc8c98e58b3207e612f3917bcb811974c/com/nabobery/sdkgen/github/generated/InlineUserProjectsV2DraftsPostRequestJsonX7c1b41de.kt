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
 * sdkgen://source/openapi.yaml#/paths/~1user~1{user_id}~1projectsV2~1{project_number}~1drafts/post/requestBody/content/
 * application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1user~1{user_id}~1projectsV2~1{project_number}~1drafts/post/requestBody/content/
 * application~1json/schema
 */
@Serializable(with = InlineUserProjectsV2DraftsPostRequestJsonX7c1b41de.Serializer::class)
public class InlineUserProjectsV2DraftsPostRequestJsonX7c1b41de(
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

    public fun build(): InlineUserProjectsV2DraftsPostRequestJsonX7c1b41de {
      check(titleValue != null) { "title is required" }
      return InlineUserProjectsV2DraftsPostRequestJsonX7c1b41de(
        title = title,
        body = body,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUserProjectsV2DraftsPostRequestJsonX7c1b41de = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineUserProjectsV2DraftsPostRequestJsonX7c1b41de> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUserProjectsV2DraftsPostRequestJsonX7c1b41de {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUserProjectsV2DraftsPostRequestJsonX7c1b41de")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUserProjectsV2DraftsPostRequestJsonX7c1b41de must be a JSON object")
      val title = json.decodeRequired<String>(rawObject, "title")
      return InlineUserProjectsV2DraftsPostRequestJsonX7c1b41de(
        title = title,
        body = rawObject["body"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUserProjectsV2DraftsPostRequestJsonX7c1b41de) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUserProjectsV2DraftsPostRequestJsonX7c1b41de")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("title", value.title)
        value.body?.let { put("body", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUserProjectsV2DraftsPostRequestJsonX7c1b41de(block: InlineUserProjectsV2DraftsPostRequestJsonX7c1b41de.Builder.() -> Unit): InlineUserProjectsV2DraftsPostRequestJsonX7c1b41de = InlineUserProjectsV2DraftsPostRequestJsonX7c1b41de.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineUserProjectsV2DraftsPostRequestJsonX7c1b41de is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
