package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1tasks/get/responses/200/content/application~1json/schema/properties/tas
 * ks/items/properties/artifacts/items/properties/data/oneOf/0
 */
@Serializable(with = InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf1Xef04c46d.Serializer::class)
public class InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf1Xef04c46d(
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

    public fun build(): InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf1Xef04c46d {
      check(idValue != null) { "id is required" }
      return InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf1Xef04c46d(
        id = id,
        globalId = globalId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf1Xef04c46d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf1Xef04c46d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf1Xef04c46d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf1Xef04c46d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf1Xef04c46d must be a JSON object")
      val id = json.decodeRequired<Long>(rawObject, "id")
      return InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf1Xef04c46d(
        id = id,
        globalId = rawObject["global_id"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf1Xef04c46d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf1Xef04c46d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        value.globalId?.let { put("global_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf1Xef04c46d(block: InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf1Xef04c46d.Builder.() -> Unit): InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf1Xef04c46d = InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf1Xef04c46d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentsTasksGetResponse200JsonTasksItemArtifactsItemDataOneOf1Xef04c46d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
