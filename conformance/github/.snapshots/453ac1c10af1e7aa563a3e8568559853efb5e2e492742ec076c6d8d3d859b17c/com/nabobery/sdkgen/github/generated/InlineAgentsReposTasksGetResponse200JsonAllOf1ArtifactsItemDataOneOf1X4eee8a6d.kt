package com.nabobery.sdkgen.github.generated

import kotlin.Long
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
 * A GitHub resource (pull request, issue, etc.)
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks~1{task_id}/get/responses/200/content/appl
 * ication~1json/schema/allOf/0/properties/artifacts/items/properties/data/oneOf/0
 */
@Serializable(with = InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1X4eee8a6d.Serializer::class)
public class InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1X4eee8a6d(
  /**
   * GitHub resource ID
   */
  public val id: Long,
  /**
   * GraphQL global ID
   */
  public val globalId: String? = null,
) {
  public class Builder {
    private var idValue: Long? = null

    public var id: Long
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    /**
     * GraphQL global ID
     */
    public var globalId: String? = null

    public fun build(): InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1X4eee8a6d {
      check(idValue != null) { "id is required" }
      return InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1X4eee8a6d(
        id = id,
        globalId = globalId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1X4eee8a6d = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1X4eee8a6d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1X4eee8a6d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1X4eee8a6d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1X4eee8a6d must be a JSON object")
      val id = json.decodeRequired<Long>(rawObject, "id")
      return InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1X4eee8a6d(
        id = id,
        globalId = rawObject["global_id"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1X4eee8a6d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1X4eee8a6d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        value.globalId?.let { put("global_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1X4eee8a6d(block: InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1X4eee8a6d.Builder.() -> Unit): InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1X4eee8a6d = InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1X4eee8a6d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentsReposTasksGetResponse200JsonAllOf1ArtifactsItemDataOneOf1X4eee8a6d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
