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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks/post/responses/201/content/application~1j
 * son/schema/properties/artifacts/items/properties/data/oneOf/0
 */
@Serializable(with = InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf1X4727faa8.Serializer::class)
public class InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf1X4727faa8(
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

    public fun build(): InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf1X4727faa8 {
      check(idValue != null) { "id is required" }
      return InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf1X4727faa8(
        id = id,
        globalId = globalId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf1X4727faa8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf1X4727faa8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf1X4727faa8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf1X4727faa8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf1X4727faa8 must be a JSON object")
      val id = json.decodeRequired<Long>(rawObject, "id")
      return InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf1X4727faa8(
        id = id,
        globalId = rawObject["global_id"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf1X4727faa8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf1X4727faa8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        value.globalId?.let { put("global_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf1X4727faa8(block: InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf1X4727faa8.Builder.() -> Unit): InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf1X4727faa8 = InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf1X4727faa8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAgentsReposTasksPostResponse201JsonArtifactsItemDataOneOf1X4727faa8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
