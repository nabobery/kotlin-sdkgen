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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks/get/responses/200/content/application~1js
 * on/schema/properties/tasks/items/properties/artifacts/items/properties/data/oneOf/0
 */
@Serializable(with = InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf1X7bd5b051.Serializer::class)
public class InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf1X7bd5b051(
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

    public fun build(): InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf1X7bd5b051 {
      check(idValue != null) { "id is required" }
      return InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf1X7bd5b051(
        id = id,
        globalId = globalId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf1X7bd5b051 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf1X7bd5b051> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf1X7bd5b051 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf1X7bd5b051")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf1X7bd5b051 must be a JSON object")
      val id = json.decodeRequired<Long>(rawObject, "id")
      return InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf1X7bd5b051(
        id = id,
        globalId = rawObject["global_id"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf1X7bd5b051) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf1X7bd5b051")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        value.globalId?.let { put("global_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf1X7bd5b051(block: InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf1X7bd5b051.Builder.() -> Unit): InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf1X7bd5b051 = InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf1X7bd5b051.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentsReposTasksGetResponse200JsonTasksItemArtifactsItemOneOf1X7bd5b051 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
