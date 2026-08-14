package io.github.nabobery.sdkgen.github.generated

import kotlin.Long
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * The repository this task belongs to
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks/get/responses/200/content/application~1js
 * on/schema/properties/tasks/items/properties/repository
 */
@Serializable(with = InlineAgentsReposTasksGetResponse200JsonTasksItemRepositoryX5af15754.Serializer::class)
public class InlineAgentsReposTasksGetResponse200JsonTasksItemRepositoryX5af15754(
  /**
   * The unique identifier of the repository
   */
  public val id: Long? = null,
) {
  public class Builder {
    /**
     * The unique identifier of the repository
     */
    public var id: Long? = null

    public fun build(): InlineAgentsReposTasksGetResponse200JsonTasksItemRepositoryX5af15754 = InlineAgentsReposTasksGetResponse200JsonTasksItemRepositoryX5af15754(
      id = id,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsReposTasksGetResponse200JsonTasksItemRepositoryX5af15754 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAgentsReposTasksGetResponse200JsonTasksItemRepositoryX5af15754> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksGetResponse200JsonTasksItemRepositoryX5af15754 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsReposTasksGetResponse200JsonTasksItemRepositoryX5af15754")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsReposTasksGetResponse200JsonTasksItemRepositoryX5af15754 must be a JSON object")
      return InlineAgentsReposTasksGetResponse200JsonTasksItemRepositoryX5af15754(
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Long>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksGetResponse200JsonTasksItemRepositoryX5af15754) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsReposTasksGetResponse200JsonTasksItemRepositoryX5af15754")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsReposTasksGetResponse200JsonTasksItemRepositoryX5af15754(block: InlineAgentsReposTasksGetResponse200JsonTasksItemRepositoryX5af15754.Builder.() -> Unit): InlineAgentsReposTasksGetResponse200JsonTasksItemRepositoryX5af15754 = InlineAgentsReposTasksGetResponse200JsonTasksItemRepositoryX5af15754.build(block)
