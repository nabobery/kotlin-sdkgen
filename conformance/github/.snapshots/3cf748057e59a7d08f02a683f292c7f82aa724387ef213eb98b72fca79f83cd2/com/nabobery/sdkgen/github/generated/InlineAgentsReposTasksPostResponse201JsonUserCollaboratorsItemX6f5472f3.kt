package com.nabobery.sdkgen.github.generated

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
 * A GitHub user
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks/post/responses/201/content/application~1j
 * son/schema/properties/user_collaborators/items
 */
@Serializable(with = InlineAgentsReposTasksPostResponse201JsonUserCollaboratorsItemX6f5472f3.Serializer::class)
public class InlineAgentsReposTasksPostResponse201JsonUserCollaboratorsItemX6f5472f3(
  /**
   * The unique identifier of the user
   */
  public val id: Long? = null,
) {
  public class Builder {
    /**
     * The unique identifier of the user
     */
    public var id: Long? = null

    public fun build(): InlineAgentsReposTasksPostResponse201JsonUserCollaboratorsItemX6f5472f3 = InlineAgentsReposTasksPostResponse201JsonUserCollaboratorsItemX6f5472f3(
      id = id,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsReposTasksPostResponse201JsonUserCollaboratorsItemX6f5472f3 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineAgentsReposTasksPostResponse201JsonUserCollaboratorsItemX6f5472f3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksPostResponse201JsonUserCollaboratorsItemX6f5472f3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsReposTasksPostResponse201JsonUserCollaboratorsItemX6f5472f3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsReposTasksPostResponse201JsonUserCollaboratorsItemX6f5472f3 must be a JSON object")
      return InlineAgentsReposTasksPostResponse201JsonUserCollaboratorsItemX6f5472f3(
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Long>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksPostResponse201JsonUserCollaboratorsItemX6f5472f3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsReposTasksPostResponse201JsonUserCollaboratorsItemX6f5472f3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsReposTasksPostResponse201JsonUserCollaboratorsItemX6f5472f3(block: InlineAgentsReposTasksPostResponse201JsonUserCollaboratorsItemX6f5472f3.Builder.() -> Unit): InlineAgentsReposTasksPostResponse201JsonUserCollaboratorsItemX6f5472f3 = InlineAgentsReposTasksPostResponse201JsonUserCollaboratorsItemX6f5472f3.build(block)
